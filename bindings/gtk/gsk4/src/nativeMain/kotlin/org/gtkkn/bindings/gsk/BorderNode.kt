// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.RGBA
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskBorderNode
import org.gtkkn.native.gsk.gsk_border_node_get_colors
import org.gtkkn.native.gsk.gsk_border_node_get_outline
import org.gtkkn.native.gsk.gsk_border_node_get_type

/**
 * A render node for a border.
 *
 * ## Skipped during bindings generation
 *
 * - method `get_widths`: Array parameter of type gfloat is not supported
 * - parameter `border_width`: Array parameter of type gfloat is not supported
 */
public open class BorderNode(pointer: CPointer<GskBorderNode>) :
    RenderNode(pointer.reinterpret()),
    KGTyped {
    public val gskBorderNodePointer: CPointer<GskBorderNode>
        get() = gPointer.reinterpret()

    /**
     * Retrieves the colors of the border.
     *
     * @return an array of 4 `GdkRGBA` structs
     *     for the top, right, bottom and left color of the border
     */
    public open fun getColors(): RGBA = gsk_border_node_get_colors(gskBorderNodePointer.reinterpret())!!.run {
        RGBA(reinterpret())
    }

    /**
     * Retrieves the outline of the border.
     *
     * @return the outline of the border
     */
    public open fun getOutline(): RoundedRect = gsk_border_node_get_outline(gskBorderNodePointer.reinterpret())!!.run {
        RoundedRect(reinterpret())
    }

    public companion object : TypeCompanion<BorderNode> {
        override val type: GeneratedClassKGType<BorderNode> =
            GeneratedClassKGType(gsk_border_node_get_type()) { BorderNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of BorderNode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_border_node_get_type()
    }
}
