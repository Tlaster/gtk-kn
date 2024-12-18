// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkDeleteEvent
import org.gtkkn.native.gdk.gdk_delete_event_get_type
import org.gtkkn.native.gobject.GType

/**
 * An event related to closing a top-level surface.
 */
public open class DeleteEvent(pointer: CPointer<GdkDeleteEvent>) :
    Event(pointer.reinterpret()),
    KGTyped {
    public val gdkDeleteEventPointer: CPointer<GdkDeleteEvent>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<DeleteEvent> {
        override val type: GeneratedClassKGType<DeleteEvent> =
            GeneratedClassKGType(gdk_delete_event_get_type()) { DeleteEvent(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of DeleteEvent
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_delete_event_get_type()
    }
}
