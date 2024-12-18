// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkDNDEvent
import org.gtkkn.native.gdk.gdk_dnd_event_get_drop
import org.gtkkn.native.gdk.gdk_dnd_event_get_type
import org.gtkkn.native.gobject.GType

/**
 * An event related to drag and drop operations.
 */
public open class DNDEvent(pointer: CPointer<GdkDNDEvent>) :
    Event(pointer.reinterpret()),
    KGTyped {
    public val gdkDNDEventPointer: CPointer<GdkDNDEvent>
        get() = gPointer.reinterpret()

    /**
     * Gets the `GdkDrop` object from a DND event.
     *
     * @return the drop
     */
    public open fun getDrop(): Drop? = gdk_dnd_event_get_drop(gdkDNDEventPointer.reinterpret())?.run {
        Drop(reinterpret())
    }

    public companion object : TypeCompanion<DNDEvent> {
        override val type: GeneratedClassKGType<DNDEvent> =
            GeneratedClassKGType(gdk_dnd_event_get_type()) { DNDEvent(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of DNDEvent
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_dnd_event_get_type()
    }
}
