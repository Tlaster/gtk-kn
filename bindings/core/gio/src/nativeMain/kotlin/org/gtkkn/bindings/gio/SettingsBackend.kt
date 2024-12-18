// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.bindings.gio.annotations.GioVersion2_28
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GSettingsBackend
import org.gtkkn.native.gio.g_settings_backend_get_default
import org.gtkkn.native.gio.g_settings_backend_get_type
import org.gtkkn.native.gio.g_settings_backend_path_writable_changed
import org.gtkkn.native.gio.g_settings_backend_writable_changed
import org.gtkkn.native.gobject.GType
import kotlin.String
import kotlin.Unit

/**
 * The `GSettingsBackend` interface defines a generic interface for
 * non-strictly-typed data that is stored in a hierarchy. To implement
 * an alternative storage backend for [class@Gio.Settings], you need to
 * implement the `GSettingsBackend` interface and then make it implement the
 * extension point `G_SETTINGS_BACKEND_EXTENSION_POINT_NAME`.
 *
 * The interface defines methods for reading and writing values, a
 * method for determining if writing of certain values will fail
 * (lockdown) and a change notification mechanism.
 *
 * The semantics of the interface are very precisely defined and
 * implementations must carefully adhere to the expectations of
 * callers that are documented on each of the interface methods.
 *
 * Some of the `GSettingsBackend` functions accept or return a
 * [struct@GLib.Tree]. These trees always have strings as keys and
 * [struct@GLib.Variant] as values.
 *
 * The `GSettingsBackend` API is exported to allow third-party
 * implementations, but does not carry the same stability guarantees
 * as the public GIO API. For this reason, you have to define the
 * C preprocessor symbol `G_SETTINGS_ENABLE_BACKEND` before including
 * `gio/gsettingsbackend.h`.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `origin_tag`: gpointer
 * - parameter `origin_tag`: gpointer
 * - parameter `origin_tag`: gpointer
 * - parameter `origin_tag`: gpointer
 * - parameter `path`: path: Out parameter is not supported
 */
public open class SettingsBackend(pointer: CPointer<GSettingsBackend>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val gioSettingsBackendPointer: CPointer<GSettingsBackend>
        get() = gPointer.reinterpret()

    /**
     * Signals that the writability of all keys below a given path may have
     * changed.
     *
     * Since GSettings performs no locking operations for itself, this call
     * will always be made in response to external events.
     *
     * @param path the name of the path
     * @since 2.26
     */
    @GioVersion2_26
    public open fun pathWritableChanged(path: String): Unit =
        g_settings_backend_path_writable_changed(gioSettingsBackendPointer.reinterpret(), path)

    /**
     * Signals that the writability of a single key has possibly changed.
     *
     * Since GSettings performs no locking operations for itself, this call
     * will always be made in response to external events.
     *
     * @param key the name of the key
     * @since 2.26
     */
    @GioVersion2_26
    public open fun writableChanged(key: String): Unit =
        g_settings_backend_writable_changed(gioSettingsBackendPointer.reinterpret(), key)

    public companion object : TypeCompanion<SettingsBackend> {
        override val type: GeneratedClassKGType<SettingsBackend> =
            GeneratedClassKGType(g_settings_backend_get_type()) { SettingsBackend(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Returns the default #GSettingsBackend. It is possible to override
         * the default by setting the `GSETTINGS_BACKEND` environment variable
         * to the name of a settings backend.
         *
         * The user gets a reference to the backend.
         *
         * @return the default #GSettingsBackend,
         *     which will be a dummy (memory) settings backend if no other settings
         *     backend is available.
         * @since 2.28
         */
        @GioVersion2_28
        public fun getDefault(): SettingsBackend = g_settings_backend_get_default()!!.run {
            SettingsBackend(reinterpret())
        }

        /**
         * Get the GType of SettingsBackend
         *
         * @return the GType
         */
        public fun getType(): GType = g_settings_backend_get_type()
    }
}
