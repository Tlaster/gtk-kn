/*
 * Copyright (c) 2024 gtk-kn
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.gtkkn.samples.webkit.browser

import org.gtkkn.bindings.adw.Bin
import org.gtkkn.bindings.glib.Glib
import org.gtkkn.bindings.glib.Uri
import org.gtkkn.bindings.gobject.BindingFlags
import org.gtkkn.bindings.gtk.Box
import org.gtkkn.bindings.gtk.Button
import org.gtkkn.bindings.gtk.Entry
import org.gtkkn.bindings.gtk.InputPurpose
import org.gtkkn.bindings.gtk.Orientation
import org.gtkkn.bindings.webkit.LoadEvent
import org.gtkkn.bindings.webkit.LoadEvent.COMMITTED
import org.gtkkn.bindings.webkit.LoadEvent.FINISHED
import org.gtkkn.bindings.webkit.LoadEvent.REDIRECTED
import org.gtkkn.bindings.webkit.LoadEvent.STARTED
import org.gtkkn.bindings.webkit.WebView

// --8<-- [start:doc]
@Suppress("LongMethod")
fun main() = Application {
    var loading = false
    // set up a HeaderBar since adw windows don't have any by default
    val headerBar = org.gtkkn.bindings.adw.HeaderBar()

    // setup window layout
    val layout = Box(Orientation.VERTICAL, 0)

    // this is where any playground code can run to set up widgets
    val webView = WebView()

    val back = Button.newFromIconName("go-previous-symbolic").apply {
        setTooltipText("Back")
        connectClicked {
            logger.debug { "Back clicked" }
            webView.goBack()
        }
    }

    val forward = Button.newFromIconName("go-next-symbolic").apply {
        setTooltipText("Forward")
        connectClicked {
            logger.debug { "Forward clicked" }
            webView.goForward()
        }
    }

    val stopOrReload = Button.newFromIconName("process-stop-symbolic").apply {
        setTooltipText("Stop")
        connectClicked {
            logger.debug { "Stop clicked" }
            if (loading) webView.stopLoading() else webView.reload()
        }
    }

    val home = Button.newFromIconName("go-home-symbolic").apply {
        setTooltipText("Home")
        connectClicked {
            logger.debug { "Home clicked" }
            webView.loadUri(HOME_PAGE)
        }
    }

    val urlBar = Entry().apply {
        setInputPurpose(InputPurpose.URL)
        hexpand = true
    }

    // Container for the webview
    val webViewContainer = Bin().apply {
        vexpand = true
        hexpand = true
        setChild(webView)
    }

    // When navigating to another page, update the URL bar
    webView.bindProperty("uri", urlBar.getBuffer(), "text", BindingFlags.DEFAULT)

    webView.connectLoadChanged { loadEvent: LoadEvent ->
        when (loadEvent) {
            STARTED -> {
                logger.debug { "loadEvent = Started" }
                loading = true
                stopOrReload.setIconName("process-stop-symbolic")
                stopOrReload.setTooltipText("Stop")
            }

            REDIRECTED -> logger.debug { "loadEvent = Redirected" }
            COMMITTED -> logger.debug { "loadEvent = Committed" }
            FINISHED -> {
                logger.debug { "loadEvent = Finished" }
                loading = false
                stopOrReload.setIconName("view-refresh-symbolic")
                stopOrReload.setTooltipText("Reload")
            }
        }
    }

    urlBar.connectActivate {
        var url = urlBar.getBuffer().getText()
        val scheme = Uri.peekScheme(url)
        if (scheme == null) {
            url = "https://$url"
        }
        logger.debug { "load url $url" }
        webView.loadUri(url)
    }

    webView.connectNotify { pspecs ->
        logger.debug { "pspecs = ${pspecs.getName()}" }
        if (pspecs.getName() == "estimated-load-progress") {
            urlBar.setProgressFraction(webView.getEstimatedLoadProgress())
            if (urlBar.getProgressFraction() == 1.0) {
                logger.debug { "Glib.timeoutAdd" }
                Glib.timeoutAdd(0, 500.toUInt()) {
                    logger.debug { "setProgressFraction(0.0)" }
                    urlBar.setProgressFraction(0.0)
                    false
                }
            }
        }
    }

    webView.loadUri(HOME_PAGE)

    headerBar.apply {
        packStart(back)
        packStart(forward)
        packStart(stopOrReload)
        packStart(home)
        setTitleWidget(urlBar)
    }

    // and add your widget to the layout to display it
    layout.apply {
        append(headerBar)
        append(webViewContainer)
    }
    setContent(layout)
}

private const val HOME_PAGE = "https://www.gnome.org/"
// --8<-- [end:doc]
