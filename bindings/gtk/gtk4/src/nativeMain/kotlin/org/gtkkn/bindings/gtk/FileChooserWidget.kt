// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkFileChooser
import org.gtkkn.native.gtk.GtkFileChooserWidget
import org.gtkkn.native.gtk.gtk_file_chooser_widget_get_type
import org.gtkkn.native.gtk.gtk_file_chooser_widget_new
import kotlin.Int
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkFileChooserWidget` is a widget for choosing files.
 *
 * It exposes the [iface@Gtk.FileChooser] interface, and you should
 * use the methods of this interface to interact with the
 * widget.
 *
 * # CSS nodes
 *
 * `GtkFileChooserWidget` has a single CSS node with name filechooser.
 *
 * ## Skipped during bindings generation
 *
 * - method `search-mode`: Property has no getter nor setter
 * - method `show-time`: Property has no getter nor setter
 * - method `subtitle`: Property has no getter nor setter
 */
public open class FileChooserWidget(
    pointer: CPointer<GtkFileChooserWidget>,
) : Widget(pointer.reinterpret()),
    FileChooser,
    KGTyped {
    public val gtkFileChooserWidgetPointer: CPointer<GtkFileChooserWidget>
        get() = gPointer.reinterpret()

    override val gtkFileChooserPointer: CPointer<GtkFileChooser>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * Creates a new `GtkFileChooserWidget`.
     *
     * This is a file chooser widget that can be embedded in custom
     * windows, and it is the same widget that is used by
     * `GtkFileChooserDialog`.
     *
     * @param action Open or save mode for the widget
     * @return a new `GtkFileChooserWidget`
     */
    public constructor(
        action: FileChooserAction,
    ) : this(gtk_file_chooser_widget_new(action.nativeValue)!!.reinterpret())

    /**
     * Emitted when the user asks for it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * This is used to make the file chooser show the user's Desktop
     * folder in the file list.
     *
     * The default binding for this signal is <kbd>Alt</kbd>-<kbd>D</kbd>.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectDesktopFolder(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "desktop-folder",
            connectDesktopFolderFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the user asks for it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * This is used to make the file chooser go to a child of the
     * current folder in the file hierarchy. The subfolder that will
     * be used is displayed in the path bar widget of the file chooser.
     * For example, if the path bar is showing "/foo/bar/baz", with bar
     * currently displayed, then this will cause the file chooser to
     * switch to the "baz" subfolder.
     *
     * The default binding for this signal is <kbd>Alt</kbd>-<kbd>Down</kbd>.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectDownFolder(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "down-folder",
            connectDownFolderFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the user asks for it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * This is used to make the file chooser show the user's home
     * folder in the file list.
     *
     * The default binding for this signal is <kbd>Alt</kbd>-<kbd>Home</kbd>.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectHomeFolder(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "home-folder",
            connectHomeFolderFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the user asks for it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * This is used to make the file chooser show a "Location" prompt which
     * the user can use to manually type the name of the file he wishes to select.
     *
     * The default bindings for this signal are <kbd>Control</kbd>-<kbd>L</kbd>
     * with a @path string of "" (the empty string). It is also bound to
     * <kbd>/</kbd> with a @path string of "`/`" (a slash):  this lets you
     * type `/` and immediately type a path name. On Unix systems, this is
     * bound to <kbd>~</kbd> (tilde) with a @path string of "~" itself for
     * access to home directories.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `path` a string that gets put in the text entry for the file name
     */
    public fun connectLocationPopup(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (path: String) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "location-popup",
            connectLocationPopupFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the user asks for it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * This is used to make the file chooser show a "Location" prompt
     * when the user pastes into a `GtkFileChooserWidget`.
     *
     * The default binding for this signal is <kbd>Control</kbd>-<kbd>V</kbd>.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectLocationPopupOnPaste(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "location-popup-on-paste",
            connectLocationPopupOnPasteFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the user asks for it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * This is used to toggle the visibility of a "Location" prompt
     * which the user can use to manually type the name of the file
     * he wishes to select.
     *
     * The default binding for this signal is <kbd>Control</kbd>-<kbd>L</kbd>.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectLocationTogglePopup(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "location-toggle-popup",
            connectLocationTogglePopupFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the user asks for it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * This is used to move the focus to the places sidebar.
     *
     * The default binding for this signal is <kbd>Alt</kbd>-<kbd>P</kbd>.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectPlacesShortcut(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "places-shortcut",
            connectPlacesShortcutFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the user asks for it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * This is used to make the file chooser switch to the bookmark
     * specified in the @bookmark_index parameter. For example, if
     * you have three bookmarks, you can pass 0, 1, 2 to this signal
     * to switch to each of them, respectively.
     *
     * The default binding for this signal is <kbd>Alt</kbd>-<kbd>1</kbd>,
     * <kbd>Alt</kbd>-<kbd>2</kbd>, etc. until <kbd>Alt</kbd>-<kbd>0</kbd>.
     * Note that in the default binding, that <kbd>Alt</kbd>-<kbd>1</kbd> is
     * actually defined to switch to the bookmark at index 0, and so on
     * successively.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `bookmarkIndex` the number of the bookmark to switch to
     */
    public fun connectQuickBookmark(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (bookmarkIndex: Int) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "quick-bookmark",
            connectQuickBookmarkFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the user asks for it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * This is used to make the file chooser show the Recent location.
     *
     * The default binding for this signal is <kbd>Alt</kbd>-<kbd>R</kbd>.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectRecentShortcut(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "recent-shortcut",
            connectRecentShortcutFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the user asks for it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * This is used to make the file chooser show the search entry.
     *
     * The default binding for this signal is <kbd>Alt</kbd>-<kbd>S</kbd>.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectSearchShortcut(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "search-shortcut",
            connectSearchShortcutFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the user asks for it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * This is used to make the file chooser display hidden files.
     *
     * The default binding for this signal is <kbd>Control</kbd>-<kbd>H</kbd>.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectShowHidden(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "show-hidden",
            connectShowHiddenFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the user asks for it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * This is used to make the file chooser go to the parent
     * of the current folder in the file hierarchy.
     *
     * The default binding for this signal is <kbd>Alt</kbd>-<kbd>Up</kbd>.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectUpFolder(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "up-folder",
            connectUpFolderFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<FileChooserWidget> {
        override val type: GeneratedClassKGType<FileChooserWidget> =
            GeneratedClassKGType(gtk_file_chooser_widget_get_type()) { FileChooserWidget(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectDesktopFolderFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectDownFolderFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectHomeFolderFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectLocationPopupFunc: CPointer<CFunction<(CPointer<ByteVar>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            path: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    path: String,
                ) -> Unit
            >()
            .get()
            .invoke(path?.toKString() ?: error("Expected not null string"))
    }.reinterpret()

private val connectLocationPopupOnPasteFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectLocationTogglePopupFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectPlacesShortcutFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectQuickBookmarkFunc: CPointer<CFunction<(Int) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            bookmarkIndex: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(bookmarkIndex: Int) -> Unit>().get().invoke(bookmarkIndex)
    }.reinterpret()

private val connectRecentShortcutFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectSearchShortcutFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectShowHiddenFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectUpFolderFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()