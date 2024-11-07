// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_font_type_t

public enum class FontType(
    public val nativeValue: cairo_font_type_t,
) {
    TOY(cairo_font_type_t.CAIRO_FONT_TYPE_TOY),
    FT(cairo_font_type_t.CAIRO_FONT_TYPE_FT),
    WIN32(cairo_font_type_t.CAIRO_FONT_TYPE_WIN32),
    QUARTZ(cairo_font_type_t.CAIRO_FONT_TYPE_QUARTZ),
    USER(cairo_font_type_t.CAIRO_FONT_TYPE_USER),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_font_type_t): FontType =
            when (nativeValue) {
                cairo_font_type_t.CAIRO_FONT_TYPE_TOY -> TOY
                cairo_font_type_t.CAIRO_FONT_TYPE_FT -> FT
                cairo_font_type_t.CAIRO_FONT_TYPE_WIN32 -> WIN32
                cairo_font_type_t.CAIRO_FONT_TYPE_QUARTZ -> QUARTZ
                cairo_font_type_t.CAIRO_FONT_TYPE_USER -> USER
                else -> error("invalid nativeValue")
            }
    }
}
