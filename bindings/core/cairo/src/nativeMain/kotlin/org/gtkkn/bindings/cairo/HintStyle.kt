// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_hint_style_t

public enum class HintStyle(
    public val nativeValue: cairo_hint_style_t,
) {
    DEFAULT(cairo_hint_style_t.CAIRO_HINT_STYLE_DEFAULT),
    NONE(cairo_hint_style_t.CAIRO_HINT_STYLE_NONE),
    SLIGHT(cairo_hint_style_t.CAIRO_HINT_STYLE_SLIGHT),
    MEDIUM(cairo_hint_style_t.CAIRO_HINT_STYLE_MEDIUM),
    FULL(cairo_hint_style_t.CAIRO_HINT_STYLE_FULL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_hint_style_t): HintStyle =
            when (nativeValue) {
                cairo_hint_style_t.CAIRO_HINT_STYLE_DEFAULT -> DEFAULT
                cairo_hint_style_t.CAIRO_HINT_STYLE_NONE -> NONE
                cairo_hint_style_t.CAIRO_HINT_STYLE_SLIGHT -> SLIGHT
                cairo_hint_style_t.CAIRO_HINT_STYLE_MEDIUM -> MEDIUM
                cairo_hint_style_t.CAIRO_HINT_STYLE_FULL -> FULL
                else -> error("invalid nativeValue")
            }
    }
}
