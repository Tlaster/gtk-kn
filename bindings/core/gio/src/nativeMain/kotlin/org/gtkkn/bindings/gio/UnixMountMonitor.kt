// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GUnixMountMonitor
import org.gtkkn.native.gio.g_unix_mount_monitor_get
import org.gtkkn.native.gio.g_unix_mount_monitor_get_type
import org.gtkkn.native.gio.g_unix_mount_monitor_new
import org.gtkkn.native.gio.g_unix_mount_monitor_set_rate_limit
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Int
import kotlin.ULong
import kotlin.Unit

/**
 * Watches #GUnixMounts for changes.
 */
public open class UnixMountMonitor(
    pointer: CPointer<GUnixMountMonitor>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gioUnixMountMonitorPointer: CPointer<GUnixMountMonitor>
        get() = gPointer.reinterpret()

    /**
     * Deprecated alias for g_unix_mount_monitor_get().
     *
     * This function was never a true constructor, which is why it was
     * renamed.
     *
     * @return a #GUnixMountMonitor.
     */
    public constructor() : this(g_unix_mount_monitor_new()!!.reinterpret())

    /**
     * This function does nothing.
     *
     * Before 2.44, this was a partially-effective way of controlling the
     * rate at which events would be reported under some uncommon
     * circumstances.  Since @mount_monitor is a singleton, it also meant
     * that calling this function would have side effects for other users of
     * the monitor.
     *
     * @param limitMsec a integer with the limit in milliseconds to
     *     poll for changes.
     * @since 2.18
     */
    public open fun setRateLimit(limitMsec: Int): Unit =
        g_unix_mount_monitor_set_rate_limit(gioUnixMountMonitorPointer.reinterpret(), limitMsec)

    /**
     * Emitted when the unix mount points have changed.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectMountpointsChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "mountpoints-changed",
            connectMountpointsChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the unix mounts have changed.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectMountsChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "mounts-changed",
            connectMountsChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<UnixMountMonitor> {
        override val type: GeneratedClassKGType<UnixMountMonitor> =
            GeneratedClassKGType(g_unix_mount_monitor_get_type()) { UnixMountMonitor(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Gets the #GUnixMountMonitor for the current thread-default main
         * context.
         *
         * The mount monitor can be used to monitor for changes to the list of
         * mounted filesystems as well as the list of mount points (ie: fstab
         * entries).
         *
         * You must only call g_object_unref() on the return value from under
         * the same main context as you called this function.
         *
         * @return the #GUnixMountMonitor.
         * @since 2.44
         */
        public fun `get`(): UnixMountMonitor =
            g_unix_mount_monitor_get()!!.run {
                UnixMountMonitor(reinterpret())
            }
    }
}

private val connectMountpointsChangedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectMountsChangedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()