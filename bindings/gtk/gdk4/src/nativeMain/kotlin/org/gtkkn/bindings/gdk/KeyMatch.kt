// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkKeyMatch

/**
 * Describes how well an event matches a given keyval and modifiers.
 *
 * `GdkKeyMatch` values are returned by [method@Gdk.KeyEvent.matches].
 */
public enum class KeyMatch(
    public val nativeValue: GdkKeyMatch,
) {
    /**
     * The key event does not match
     */
    NONE(GdkKeyMatch.GDK_KEY_MATCH_NONE),

    /**
     * The key event matches if keyboard state
     *   (specifically, the currently active group) is ignored
     */
    PARTIAL(GdkKeyMatch.GDK_KEY_MATCH_PARTIAL),

    /**
     * The key event matches
     */
    EXACT(GdkKeyMatch.GDK_KEY_MATCH_EXACT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkKeyMatch): KeyMatch =
            when (nativeValue) {
                GdkKeyMatch.GDK_KEY_MATCH_NONE -> NONE
                GdkKeyMatch.GDK_KEY_MATCH_PARTIAL -> PARTIAL
                GdkKeyMatch.GDK_KEY_MATCH_EXACT -> EXACT
                else -> error("invalid nativeValue")
            }
    }
}
