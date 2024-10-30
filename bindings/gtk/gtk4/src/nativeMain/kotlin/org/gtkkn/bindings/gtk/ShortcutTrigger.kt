// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdk.Display
import org.gtkkn.bindings.gdk.Event
import org.gtkkn.bindings.gdk.KeyMatch
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkShortcutTrigger
import org.gtkkn.native.gtk.gtk_shortcut_trigger_compare
import org.gtkkn.native.gtk.gtk_shortcut_trigger_equal
import org.gtkkn.native.gtk.gtk_shortcut_trigger_get_type
import org.gtkkn.native.gtk.gtk_shortcut_trigger_hash
import org.gtkkn.native.gtk.gtk_shortcut_trigger_parse_string
import org.gtkkn.native.gtk.gtk_shortcut_trigger_print
import org.gtkkn.native.gtk.gtk_shortcut_trigger_print_label
import org.gtkkn.native.gtk.gtk_shortcut_trigger_to_label
import org.gtkkn.native.gtk.gtk_shortcut_trigger_trigger
import kotlin.Boolean
import kotlin.Int
import kotlin.UInt
import kotlin.Unit
import kotlin.String as KotlinString
import org.gtkkn.bindings.glib.String as GlibString

/**
 * `GtkShortcutTrigger` tracks how a `GtkShortcut` should be activated.
 *
 * To find out if a `GtkShortcutTrigger` triggers, you can call
 * [method@Gtk.ShortcutTrigger.trigger] on a `GdkEvent`.
 *
 * `GtkShortcutTriggers` contain functions that allow easy presentation
 * to end users as well as being printed for debugging.
 *
 * All `GtkShortcutTriggers` are immutable, you can only specify their
 * properties during construction. If you want to change a trigger, you
 * have to replace it with a new one.
 *
 * ## Skipped during bindings generation
 *
 * - method `to_string`: C function gtk_shortcut_trigger_to_string is ignored
 */
public open class ShortcutTrigger(
    pointer: CPointer<GtkShortcutTrigger>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gtkShortcutTriggerPointer: CPointer<GtkShortcutTrigger>
        get() = gPointer.reinterpret()

    /**
     * Tries to parse the given string into a trigger.
     *
     * On success, the parsed trigger is returned.
     * When parsing failed, null is returned.
     *
     * The accepted strings are:
     *
     *   - `never`, for `GtkNeverTrigger`
     *   - a string parsed by gtk_accelerator_parse(), for a `GtkKeyvalTrigger`, e.g. `<Control>C`
     *   - underscore, followed by a single character, for `GtkMnemonicTrigger`, e.g. `_l`
     *   - two valid trigger strings, separated by a `|` character, for a
     *     `GtkAlternativeTrigger`: `<Control>q|<Control>w`
     *
     * Note that you will have to escape the `<` and `>` characters when specifying
     * triggers in XML files, such as GtkBuilder ui files. Use ``&lt;`` instead of
     * `<` and ``&gt;`` instead of `>`.
     *
     * @param string the string to parse
     * @return a new `GtkShortcutTrigger`
     */
    public constructor(string: KotlinString) : this(gtk_shortcut_trigger_parse_string(string)!!.reinterpret())

    /**
     * The types of @trigger1 and @trigger2 are `gconstpointer` only to allow
     * use of this function as a `GCompareFunc`.
     *
     * They must each be a `GtkShortcutTrigger`.
     *
     * @param trigger2 a `GtkShortcutTrigger`
     * @return An integer less than, equal to, or greater than zero if
     *   @trigger1 is found, respectively, to be less than, to match,
     *   or be greater than @trigger2.
     */
    public open fun compare(trigger2: ShortcutTrigger): Int =
        gtk_shortcut_trigger_compare(
            gtkShortcutTriggerPointer.reinterpret(),
            trigger2.gtkShortcutTriggerPointer.reinterpret()
        )

    /**
     * Checks if @trigger1 and @trigger2 trigger under the same conditions.
     *
     * The types of @one and @two are `gconstpointer` only to allow use of this
     * function with `GHashTable`. They must each be a `GtkShortcutTrigger`.
     *
     * @param trigger2 a `GtkShortcutTrigger`
     * @return true if @trigger1 and @trigger2 are equal
     */
    public open fun equal(trigger2: ShortcutTrigger): Boolean =
        gtk_shortcut_trigger_equal(
            gtkShortcutTriggerPointer.reinterpret(),
            trigger2.gtkShortcutTriggerPointer.reinterpret()
        ).asBoolean()

    /**
     * Generates a hash value for a `GtkShortcutTrigger`.
     *
     * The output of this function is guaranteed to be the same for a given
     * value only per-process. It may change between different processor
     * architectures or even different versions of GTK. Do not use this
     * function as a basis for building protocols or file formats.
     *
     * The types of @trigger is `gconstpointer` only to allow use of this
     * function with `GHashTable`. They must each be a `GtkShortcutTrigger`.
     *
     * @return a hash value corresponding to @trigger
     */
    public open fun hash(): UInt = gtk_shortcut_trigger_hash(gtkShortcutTriggerPointer.reinterpret())

    /**
     * Prints the given trigger into a string for the developer.
     * This is meant for debugging and logging.
     *
     * The form of the representation may change at any time
     * and is not guaranteed to stay identical.
     *
     * @param string a `GString` to print into
     */
    public open fun print(string: GlibString): Unit =
        gtk_shortcut_trigger_print(gtkShortcutTriggerPointer.reinterpret(), string.glibStringPointer)

    /**
     * Prints the given trigger into a string.
     *
     * This function is returning a translated string for presentation
     * to end users for example in menu items or in help texts.
     *
     * The @display in use may influence the resulting string in
     * various forms, such as resolving hardware keycodes or by
     * causing display-specific modifier names.
     *
     * The form of the representation may change at any time and is
     * not guaranteed to stay identical.
     *
     * @param display `GdkDisplay` to print for
     * @param string a `GString` to print into
     * @return true if something was printed or false if the
     *   trigger did not have a textual representation suitable
     *   for end users.
     */
    public open fun printLabel(
        display: Display,
        string: GlibString,
    ): Boolean =
        gtk_shortcut_trigger_print_label(
            gtkShortcutTriggerPointer.reinterpret(),
            display.gdkDisplayPointer.reinterpret(),
            string.glibStringPointer
        ).asBoolean()

    /**
     * Gets textual representation for the given trigger.
     *
     * This function is returning a translated string for
     * presentation to end users for example in menu items
     * or in help texts.
     *
     * The @display in use may influence the resulting string in
     * various forms, such as resolving hardware keycodes or by
     * causing display-specific modifier names.
     *
     * The form of the representation may change at any time and is
     * not guaranteed to stay identical.
     *
     * @param display `GdkDisplay` to print for
     * @return a new string
     */
    public open fun toLabel(display: Display): KotlinString =
        gtk_shortcut_trigger_to_label(
            gtkShortcutTriggerPointer.reinterpret(),
            display.gdkDisplayPointer.reinterpret()
        )?.toKString()
            ?: error("Expected not null string")

    /**
     * Checks if the given @event triggers @self.
     *
     * @param event the event to check
     * @param enableMnemonics true if mnemonics should trigger. Usually the
     *   value of this property is determined by checking that the passed
     *   in @event is a Key event and has the right modifiers set.
     * @return Whether the event triggered the shortcut
     */
    public open fun trigger(
        event: Event,
        enableMnemonics: Boolean,
    ): KeyMatch =
        gtk_shortcut_trigger_trigger(
            gtkShortcutTriggerPointer.reinterpret(),
            event.gPointer.reinterpret(),
            enableMnemonics.asGBoolean()
        ).run {
            KeyMatch.fromNativeValue(this)
        }

    public companion object : TypeCompanion<ShortcutTrigger> {
        override val type: GeneratedClassKGType<ShortcutTrigger> =
            GeneratedClassKGType(gtk_shortcut_trigger_get_type()) { ShortcutTrigger(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}