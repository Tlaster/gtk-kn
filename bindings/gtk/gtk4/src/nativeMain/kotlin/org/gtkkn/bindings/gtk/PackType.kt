// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkPackType

/**
 * Represents the packing location of a children in its parent.
 *
 * See [class@WindowControls] for example.
 */
public enum class PackType(
    public val nativeValue: GtkPackType,
) {
    /**
     * The child is packed into the start of the widget
     */
    START(GtkPackType.GTK_PACK_START),

    /**
     * The child is packed into the end of the widget
     */
    END(GtkPackType.GTK_PACK_END),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkPackType): PackType =
            when (nativeValue) {
                GtkPackType.GTK_PACK_START -> START
                GtkPackType.GTK_PACK_END -> END
                else -> error("invalid nativeValue")
            }
    }
}
