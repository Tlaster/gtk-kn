// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GNumberParserError
import org.gtkkn.native.glib.GNumberParserError.G_NUMBER_PARSER_ERROR_INVALID
import org.gtkkn.native.glib.GNumberParserError.G_NUMBER_PARSER_ERROR_OUT_OF_BOUNDS
import org.gtkkn.native.glib.g_quark_from_string
import kotlin.UInt

/**
 * Error codes returned by functions converting a string to a number.
 * @since 2.54
 */
public enum class NumberParserError(
    public val nativeValue: GNumberParserError,
) {
    /**
     * string was not a valid number
     */
    INVALID(G_NUMBER_PARSER_ERROR_INVALID),

    /**
     * string was a number, but out of bounds
     */
    OUT_OF_BOUNDS(G_NUMBER_PARSER_ERROR_OUT_OF_BOUNDS),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GNumberParserError): NumberParserError =
            when (nativeValue) {
                G_NUMBER_PARSER_ERROR_INVALID -> INVALID
                G_NUMBER_PARSER_ERROR_OUT_OF_BOUNDS -> OUT_OF_BOUNDS
                else -> error("invalid nativeValue")
            }

        public fun quark(): UInt = g_quark_from_string("g-number-parser-error-quark")

        public fun fromErrorOrNull(error: Error): NumberParserError? =
            if (error.domain != quark()) {
                null
            } else {
                NumberParserError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}