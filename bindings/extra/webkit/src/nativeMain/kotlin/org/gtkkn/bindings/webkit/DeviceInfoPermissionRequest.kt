// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_24
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitDeviceInfoPermissionRequest
import org.gtkkn.native.webkit.WebKitPermissionRequest
import org.gtkkn.native.webkit.webkit_device_info_permission_request_get_type

/**
 * A permission request for accessing user's audio/video devices.
 *
 * WebKitUserMediaPermissionRequest represents a request for
 * permission to whether WebKit should be allowed to access the user's
 * devices information when requested through the enumerateDevices API.
 *
 * When a WebKitDeviceInfoPermissionRequest is not handled by the user,
 * it is denied by default.
 * @since 2.24
 */
@WebKitVersion2_24
public class DeviceInfoPermissionRequest(pointer: CPointer<WebKitDeviceInfoPermissionRequest>) :
    Object(pointer.reinterpret()),
    PermissionRequest,
    KGTyped {
    public val webkitDeviceInfoPermissionRequestPointer: CPointer<WebKitDeviceInfoPermissionRequest>
        get() = gPointer.reinterpret()

    override val webkitPermissionRequestPointer: CPointer<WebKitPermissionRequest>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<DeviceInfoPermissionRequest> {
        override val type: GeneratedClassKGType<DeviceInfoPermissionRequest> =
            GeneratedClassKGType(webkit_device_info_permission_request_get_type()) {
                DeviceInfoPermissionRequest(it.reinterpret())
            }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of DeviceInfoPermissionRequest
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_device_info_permission_request_get_type()
    }
}
