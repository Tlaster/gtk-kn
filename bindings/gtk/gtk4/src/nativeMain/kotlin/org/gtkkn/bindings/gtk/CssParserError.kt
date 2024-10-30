// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.glib.Error
import org.gtkkn.native.glib.g_quark_from_string
import org.gtkkn.native.gtk.GtkCssParserError
import org.gtkkn.native.gtk.GtkCssParserError.GTK_CSS_PARSER_ERROR_FAILED
import org.gtkkn.native.gtk.GtkCssParserError.GTK_CSS_PARSER_ERROR_IMPORT
import org.gtkkn.native.gtk.GtkCssParserError.GTK_CSS_PARSER_ERROR_NAME
import org.gtkkn.native.gtk.GtkCssParserError.GTK_CSS_PARSER_ERROR_SYNTAX
import org.gtkkn.native.gtk.GtkCssParserError.GTK_CSS_PARSER_ERROR_UNKNOWN_VALUE
import kotlin.UInt

/**
 * Errors that can occur while parsing CSS.
 *
 * These errors are unexpected and will cause parts of the given CSS
 * to be ignored.
 */
public enum class CssParserError(
    public val nativeValue: GtkCssParserError,
) {
    /**
     * Unknown failure.
     */
    FAILED(GTK_CSS_PARSER_ERROR_FAILED),

    /**
     * The given text does not form valid syntax
     */
    SYNTAX(GTK_CSS_PARSER_ERROR_SYNTAX),

    /**
     * Failed to import a resource
     */
    IMPORT(GTK_CSS_PARSER_ERROR_IMPORT),

    /**
     * The given name has not been defined
     */
    NAME(GTK_CSS_PARSER_ERROR_NAME),

    /**
     * The given value is not correct
     */
    UNKNOWN_VALUE(GTK_CSS_PARSER_ERROR_UNKNOWN_VALUE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkCssParserError): CssParserError =
            when (nativeValue) {
                GTK_CSS_PARSER_ERROR_FAILED -> FAILED
                GTK_CSS_PARSER_ERROR_SYNTAX -> SYNTAX
                GTK_CSS_PARSER_ERROR_IMPORT -> IMPORT
                GTK_CSS_PARSER_ERROR_NAME -> NAME
                GTK_CSS_PARSER_ERROR_UNKNOWN_VALUE -> UNKNOWN_VALUE
                else -> error("invalid nativeValue")
            }

        public fun quark(): UInt = g_quark_from_string("gtk-css-parser-error-quark")

        public fun fromErrorOrNull(error: Error): CssParserError? =
            if (error.domain != quark()) {
                null
            } else {
                CssParserError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}