// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_6
import org.gtkkn.extensions.common.toCStringList
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.webkit.WebKitUserScript
import org.gtkkn.native.webkit.webkit_user_script_new
import org.gtkkn.native.webkit.webkit_user_script_new_for_world
import org.gtkkn.native.webkit.webkit_user_script_ref
import org.gtkkn.native.webkit.webkit_user_script_unref
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * A JavaScript snippet which can be injected in loaded pages.
 * @since 2.6
 */
@WebKitVersion2_6
public class UserScript(
    pointer: CPointer<WebKitUserScript>,
) : Record {
    public val webkitUserScriptPointer: CPointer<WebKitUserScript> = pointer

    /**
     * Atomically increments the reference count of @user_script by one.
     *
     * This function is MT-safe and may be called from any thread.
     *
     * @return The passed #WebKitUserScript
     * @since 2.6
     */
    @WebKitVersion2_6
    public fun ref(): UserScript =
        webkit_user_script_ref(webkitUserScriptPointer.reinterpret())!!.run {
            UserScript(reinterpret())
        }

    /**
     * Atomically decrements the reference count of @user_script by one.
     *
     * If the reference count drops to 0, all memory allocated by
     * #WebKitUserScript is released. This function is MT-safe and may be called
     * from any thread.
     *
     * @since 2.6
     */
    @WebKitVersion2_6
    public fun unref(): Unit = webkit_user_script_unref(webkitUserScriptPointer.reinterpret())

    public companion object : RecordCompanion<UserScript, WebKitUserScript> {
        /**
         * Creates a new user script.
         *
         * Scripts can be applied to some URIs
         * only by passing non-null values for @allow_list or @block_list. Passing a
         * null allow_list implies that all URIs are on the allow_list. The script
         * is applied if an URI matches the allow_list and not the block_list.
         * URI patterns must be of the form `[protocol]://[host]/[path]`, where the
         * *host* and *path* components can contain the wildcard character (`*`) to
         * represent zero or more other characters.
         *
         * @param source Source code of the user script.
         * @param injectedFrames A #WebKitUserContentInjectedFrames value
         * @param injectionTime A #WebKitUserScriptInjectionTime value
         * @param allowList An allow_list of URI patterns or null
         * @param blockList A block_list of URI patterns or null
         * @return A new #WebKitUserScript
         * @since 2.6
         */
        public fun new(
            source: String,
            injectedFrames: UserContentInjectedFrames,
            injectionTime: UserScriptInjectionTime,
            allowList: List<String>? = null,
            blockList: List<String>? = null,
        ): UserScript {
            memScoped {
                return UserScript(
                    webkit_user_script_new(
                        source,
                        injectedFrames.nativeValue,
                        injectionTime.nativeValue,
                        allowList?.toCStringList(this),
                        blockList?.toCStringList(this)
                    )!!.reinterpret()
                )
            }
        }

        /**
         * Creates a new user script for script world with name @world_name.
         *
         * See webkit_user_script_new() for a full description.
         *
         * @param source Source code of the user script.
         * @param injectedFrames A #WebKitUserContentInjectedFrames value
         * @param injectionTime A #WebKitUserScriptInjectionTime value
         * @param worldName the name of a #WebKitScriptWorld
         * @param allowList An allow_list of URI patterns or null
         * @param blockList A block_list of URI patterns or null
         * @return A new #WebKitUserScript
         * @since 2.22
         */
        public fun newForWorld(
            source: String,
            injectedFrames: UserContentInjectedFrames,
            injectionTime: UserScriptInjectionTime,
            worldName: String,
            allowList: List<String>? = null,
            blockList: List<String>? = null,
        ): UserScript {
            memScoped {
                return UserScript(
                    webkit_user_script_new_for_world(
                        source,
                        injectedFrames.nativeValue,
                        injectionTime.nativeValue,
                        worldName,
                        allowList?.toCStringList(this),
                        blockList?.toCStringList(this)
                    )!!.reinterpret()
                )
            }
        }

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): UserScript = UserScript(pointer.reinterpret())
    }
}