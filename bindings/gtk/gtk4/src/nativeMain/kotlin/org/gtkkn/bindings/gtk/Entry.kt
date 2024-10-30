// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdk.ContentProvider
import org.gtkkn.bindings.gdk.DragAction
import org.gtkkn.bindings.gdk.Paintable
import org.gtkkn.bindings.gdk.Rectangle
import org.gtkkn.bindings.gio.Icon
import org.gtkkn.bindings.gio.MenuModel
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.pango.AttrList
import org.gtkkn.bindings.pango.TabArray
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkCellEditable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkEditable
import org.gtkkn.native.gtk.GtkEntry
import org.gtkkn.native.gtk.GtkEntryIconPosition
import org.gtkkn.native.gtk.gtk_entry_get_activates_default
import org.gtkkn.native.gtk.gtk_entry_get_alignment
import org.gtkkn.native.gtk.gtk_entry_get_attributes
import org.gtkkn.native.gtk.gtk_entry_get_buffer
import org.gtkkn.native.gtk.gtk_entry_get_completion
import org.gtkkn.native.gtk.gtk_entry_get_current_icon_drag_source
import org.gtkkn.native.gtk.gtk_entry_get_extra_menu
import org.gtkkn.native.gtk.gtk_entry_get_has_frame
import org.gtkkn.native.gtk.gtk_entry_get_icon_activatable
import org.gtkkn.native.gtk.gtk_entry_get_icon_area
import org.gtkkn.native.gtk.gtk_entry_get_icon_at_pos
import org.gtkkn.native.gtk.gtk_entry_get_icon_gicon
import org.gtkkn.native.gtk.gtk_entry_get_icon_name
import org.gtkkn.native.gtk.gtk_entry_get_icon_paintable
import org.gtkkn.native.gtk.gtk_entry_get_icon_sensitive
import org.gtkkn.native.gtk.gtk_entry_get_icon_storage_type
import org.gtkkn.native.gtk.gtk_entry_get_icon_tooltip_markup
import org.gtkkn.native.gtk.gtk_entry_get_icon_tooltip_text
import org.gtkkn.native.gtk.gtk_entry_get_input_hints
import org.gtkkn.native.gtk.gtk_entry_get_input_purpose
import org.gtkkn.native.gtk.gtk_entry_get_invisible_char
import org.gtkkn.native.gtk.gtk_entry_get_max_length
import org.gtkkn.native.gtk.gtk_entry_get_overwrite_mode
import org.gtkkn.native.gtk.gtk_entry_get_placeholder_text
import org.gtkkn.native.gtk.gtk_entry_get_progress_fraction
import org.gtkkn.native.gtk.gtk_entry_get_progress_pulse_step
import org.gtkkn.native.gtk.gtk_entry_get_tabs
import org.gtkkn.native.gtk.gtk_entry_get_text_length
import org.gtkkn.native.gtk.gtk_entry_get_type
import org.gtkkn.native.gtk.gtk_entry_get_visibility
import org.gtkkn.native.gtk.gtk_entry_grab_focus_without_selecting
import org.gtkkn.native.gtk.gtk_entry_new
import org.gtkkn.native.gtk.gtk_entry_new_with_buffer
import org.gtkkn.native.gtk.gtk_entry_progress_pulse
import org.gtkkn.native.gtk.gtk_entry_reset_im_context
import org.gtkkn.native.gtk.gtk_entry_set_activates_default
import org.gtkkn.native.gtk.gtk_entry_set_alignment
import org.gtkkn.native.gtk.gtk_entry_set_attributes
import org.gtkkn.native.gtk.gtk_entry_set_buffer
import org.gtkkn.native.gtk.gtk_entry_set_completion
import org.gtkkn.native.gtk.gtk_entry_set_extra_menu
import org.gtkkn.native.gtk.gtk_entry_set_has_frame
import org.gtkkn.native.gtk.gtk_entry_set_icon_activatable
import org.gtkkn.native.gtk.gtk_entry_set_icon_drag_source
import org.gtkkn.native.gtk.gtk_entry_set_icon_from_gicon
import org.gtkkn.native.gtk.gtk_entry_set_icon_from_icon_name
import org.gtkkn.native.gtk.gtk_entry_set_icon_from_paintable
import org.gtkkn.native.gtk.gtk_entry_set_icon_sensitive
import org.gtkkn.native.gtk.gtk_entry_set_icon_tooltip_markup
import org.gtkkn.native.gtk.gtk_entry_set_icon_tooltip_text
import org.gtkkn.native.gtk.gtk_entry_set_input_hints
import org.gtkkn.native.gtk.gtk_entry_set_input_purpose
import org.gtkkn.native.gtk.gtk_entry_set_invisible_char
import org.gtkkn.native.gtk.gtk_entry_set_max_length
import org.gtkkn.native.gtk.gtk_entry_set_overwrite_mode
import org.gtkkn.native.gtk.gtk_entry_set_placeholder_text
import org.gtkkn.native.gtk.gtk_entry_set_progress_fraction
import org.gtkkn.native.gtk.gtk_entry_set_progress_pulse_step
import org.gtkkn.native.gtk.gtk_entry_set_tabs
import org.gtkkn.native.gtk.gtk_entry_set_visibility
import org.gtkkn.native.gtk.gtk_entry_unset_invisible_char
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.ULong
import kotlin.UShort
import kotlin.Unit

/**
 * `GtkEntry` is a single line text entry widget.
 *
 * ![An example GtkEntry](entry.png)
 *
 * A fairly large set of key bindings are supported by default. If the
 * entered text is longer than the allocation of the widget, the widget
 * will scroll so that the cursor position is visible.
 *
 * When using an entry for passwords and other sensitive information, it
 * can be put into “password mode” using [method@Gtk.Entry.set_visibility].
 * In this mode, entered text is displayed using a “invisible” character.
 * By default, GTK picks the best invisible character that is available
 * in the current font, but it can be changed with
 * [method@Gtk.Entry.set_invisible_char].
 *
 * `GtkEntry` has the ability to display progress or activity
 * information behind the text. To make an entry display such information,
 * use [method@Gtk.Entry.set_progress_fraction] or
 * [method@Gtk.Entry.set_progress_pulse_step].
 *
 * Additionally, `GtkEntry` can show icons at either side of the entry.
 * These icons can be activatable by clicking, can be set up as drag source
 * and can have tooltips. To add an icon, use
 * [method@Gtk.Entry.set_icon_from_gicon] or one of the various other functions
 * that set an icon from an icon name or a paintable. To trigger an action when
 * the user clicks an icon, connect to the [signal@Gtk.Entry::icon-press] signal.
 * To allow DND operations from an icon, use
 * [method@Gtk.Entry.set_icon_drag_source]. To set a tooltip on an icon, use
 * [method@Gtk.Entry.set_icon_tooltip_text] or the corresponding function
 * for markup.
 *
 * Note that functionality or information that is only available by clicking
 * on an icon in an entry may not be accessible at all to users which are not
 * able to use a mouse or other pointing device. It is therefore recommended
 * that any such functionality should also be available by other means, e.g.
 * via the context menu of the entry.
 *
 * # CSS nodes
 *
 * ```
 * entry[.flat][.warning][.error]
 * ├── text[.readonly]
 * ├── image.left
 * ├── image.right
 * ╰── [progress[.pulse]]
 * ```
 *
 * `GtkEntry` has a main node with the name entry. Depending on the properties
 * of the entry, the style classes .read-only and .flat may appear. The style
 * classes .warning and .error may also be used with entries.
 *
 * When the entry shows icons, it adds subnodes with the name image and the
 * style class .left or .right, depending on where the icon appears.
 *
 * When the entry shows progress, it adds a subnode with the name progress.
 * The node has the style class .pulse when the shown progress is pulsing.
 *
 * For all the subnodes added to the text node in various situations,
 * see [class@Gtk.Text].
 *
 * # GtkEntry as GtkBuildable
 *
 * The `GtkEntry` implementation of the `GtkBuildable` interface supports a
 * custom `<attributes>` element, which supports any number of `<attribute>`
 * elements. The `<attribute>` element has attributes named “name“, “value“,
 * “start“ and “end“ and allows you to specify `PangoAttribute` values for
 * this label.
 *
 * An example of a UI definition fragment specifying Pango attributes:
 * ```xml
 * <object class="GtkEntry">
 *   <attributes>
 *     <attribute name="weight" value="PANGO_WEIGHT_BOLD"/>
 *     <attribute name="background" value="red" start="5" end="10"/>
 *   </attributes>
 * </object>
 * ```
 *
 * The start and end attributes specify the range of characters to which the
 * Pango attribute applies. If start and end are not specified, the attribute
 * is applied to the whole text. Note that specifying ranges does not make much
 * sense with translatable attributes. Use markup embedded in the translatable
 * content instead.
 *
 * # Accessibility
 *
 * `GtkEntry` uses the %GTK_ACCESSIBLE_ROLE_TEXT_BOX role.
 *
 * ## Skipped during bindings generation
 *
 * - method `attributes`: Property TypeInfo of getter and setter do not match
 * - method `enable-emoji-completion`: Property has no getter nor setter
 * - method `im-module`: Property has no getter nor setter
 * - method `invisible-char-set`: Property has no getter nor setter
 * - method `primary-icon-activatable`: Property has no getter nor setter
 * - method `primary-icon-gicon`: Property has no getter nor setter
 * - method `primary-icon-name`: Property has no getter nor setter
 * - method `primary-icon-paintable`: Property has no getter nor setter
 * - method `primary-icon-sensitive`: Property has no getter nor setter
 * - method `primary-icon-storage-type`: Property has no getter nor setter
 * - method `primary-icon-tooltip-markup`: Property has no getter nor setter
 * - method `primary-icon-tooltip-text`: Property has no getter nor setter
 * - method `scroll-offset`: Property has no getter nor setter
 * - method `secondary-icon-activatable`: Property has no getter nor setter
 * - method `secondary-icon-gicon`: Property has no getter nor setter
 * - method `secondary-icon-name`: Property has no getter nor setter
 * - method `secondary-icon-paintable`: Property has no getter nor setter
 * - method `secondary-icon-sensitive`: Property has no getter nor setter
 * - method `secondary-icon-storage-type`: Property has no getter nor setter
 * - method `secondary-icon-tooltip-markup`: Property has no getter nor setter
 * - method `secondary-icon-tooltip-text`: Property has no getter nor setter
 * - method `show-emoji-icon`: Property has no getter nor setter
 * - method `truncate-multiline`: Property has no getter nor setter
 */
public open class Entry(
    pointer: CPointer<GtkEntry>,
) : Widget(pointer.reinterpret()),
    CellEditable,
    Editable,
    KGTyped {
    public val gtkEntryPointer: CPointer<GtkEntry>
        get() = gPointer.reinterpret()

    override val gtkCellEditablePointer: CPointer<GtkCellEditable>
        get() = gPointer.reinterpret()

    override val gtkEditablePointer: CPointer<GtkEditable>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * Whether to activate the default widget when Enter is pressed.
     */
    public open var activatesDefault: Boolean
        /**
         * Retrieves the value set by gtk_entry_set_activates_default().
         *
         * @return true if the entry will activate the default widget
         */
        get() = gtk_entry_get_activates_default(gtkEntryPointer.reinterpret()).asBoolean()

        /**
         * Sets whether pressing Enter in the @entry will activate the default
         * widget for the window containing the entry.
         *
         * This usually means that the dialog containing the entry will be closed,
         * since the default widget is usually one of the dialog buttons.
         *
         * @param setting true to activate window’s default widget on Enter keypress
         */
        set(setting) = gtk_entry_set_activates_default(gtkEntryPointer.reinterpret(), setting.asGBoolean())

    /**
     * The buffer object which actually stores the text.
     */
    public open var buffer: EntryBuffer
        /**
         * Get the `GtkEntryBuffer` object which holds the text for
         * this widget.
         *
         * @return A `GtkEntryBuffer` object.
         */
        get() =
            gtk_entry_get_buffer(gtkEntryPointer.reinterpret())!!.run {
                EntryBuffer(reinterpret())
            }

        /**
         * Set the `GtkEntryBuffer` object which holds the text for
         * this widget.
         *
         * @param buffer a `GtkEntryBuffer`
         */
        set(buffer) = gtk_entry_set_buffer(gtkEntryPointer.reinterpret(), buffer.gtkEntryBufferPointer.reinterpret())

    /**
     * The auxiliary completion object to use with the entry.
     */
    public open var completion: EntryCompletion?
        /**
         * Returns the auxiliary completion object currently
         * in use by @entry.
         *
         * @return The auxiliary
         *   completion object currently in use by @entry
         */
        get() =
            gtk_entry_get_completion(gtkEntryPointer.reinterpret())?.run {
                EntryCompletion(reinterpret())
            }

        /**
         * Sets @completion to be the auxiliary completion object
         * to use with @entry.
         *
         * All further configuration of the completion mechanism is
         * done on @completion using the `GtkEntryCompletion` API.
         * Completion is disabled if @completion is set to null.
         *
         * @param completion The `GtkEntryCompletion`
         */
        set(
            completion
        ) =
            gtk_entry_set_completion(
                gtkEntryPointer.reinterpret(),
                completion?.gtkEntryCompletionPointer?.reinterpret()
            )

    /**
     * A menu model whose contents will be appended to the context menu.
     */
    public open var extraMenu: MenuModel?
        /**
         * Gets the menu model set with gtk_entry_set_extra_menu().
         *
         * @return the menu model
         */
        get() =
            gtk_entry_get_extra_menu(gtkEntryPointer.reinterpret())?.run {
                MenuModel(reinterpret())
            }

        /**
         * Sets a menu model to add when constructing
         * the context menu for @entry.
         *
         * @param model a `GMenuModel`
         */
        set(model) = gtk_entry_set_extra_menu(gtkEntryPointer.reinterpret(), model?.gioMenuModelPointer?.reinterpret())

    /**
     * Whether the entry should draw a frame.
     */
    public open var hasFrame: Boolean
        /**
         * Gets the value set by gtk_entry_set_has_frame().
         *
         * @return whether the entry has a beveled frame
         */
        get() = gtk_entry_get_has_frame(gtkEntryPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the entry has a beveled frame around it.
         *
         * @param setting new value
         */
        set(setting) = gtk_entry_set_has_frame(gtkEntryPointer.reinterpret(), setting.asGBoolean())

    /**
     * Additional hints that allow input methods to fine-tune their behavior.
     *
     * Also see [property@Gtk.Entry:input-purpose]
     */
    public open var inputHints: InputHints
        /**
         * Gets the input hints of this `GtkEntry`.
         *
         * @return the input hints
         */
        get() =
            gtk_entry_get_input_hints(gtkEntryPointer.reinterpret()).run {
                InputHints(this)
            }

        /**
         * Set additional hints which allow input methods to
         * fine-tune their behavior.
         *
         * @param hints the hints
         */
        set(hints) = gtk_entry_set_input_hints(gtkEntryPointer.reinterpret(), hints.mask)

    /**
     * The purpose of this text field.
     *
     * This property can be used by on-screen keyboards and other input
     * methods to adjust their behaviour.
     *
     * Note that setting the purpose to %GTK_INPUT_PURPOSE_PASSWORD or
     * %GTK_INPUT_PURPOSE_PIN is independent from setting
     * [property@Gtk.Entry:visibility].
     */
    public open var inputPurpose: InputPurpose
        /**
         * Gets the input purpose of the `GtkEntry`.
         *
         * @return the input purpose
         */
        get() =
            gtk_entry_get_input_purpose(gtkEntryPointer.reinterpret()).run {
                InputPurpose.fromNativeValue(this)
            }

        /**
         * Sets the input purpose which can be used by input methods
         * to adjust their behavior.
         *
         * @param purpose the purpose
         */
        set(purpose) = gtk_entry_set_input_purpose(gtkEntryPointer.reinterpret(), purpose.nativeValue)

    /**
     * The character to use when masking entry contents (“password mode”).
     */
    public open var invisibleChar: UInt
        /**
         * Retrieves the character displayed in place of the actual text
         * in “password mode”.
         *
         * @return the current invisible char, or 0, if the entry does not
         *   show invisible text at all.
         */
        get() = gtk_entry_get_invisible_char(gtkEntryPointer.reinterpret())

        /**
         * Sets the character to use in place of the actual text
         * in “password mode”.
         *
         * See [method@Gtk.Entry.set_visibility] for how to enable
         * “password mode”.
         *
         * By default, GTK picks the best invisible char available in
         * the current font. If you set the invisible char to 0, then
         * the user will get no feedback at all; there will be no text
         * on the screen as they type.
         *
         * @param ch a Unicode character
         */
        set(ch) = gtk_entry_set_invisible_char(gtkEntryPointer.reinterpret(), ch)

    /**
     * Maximum number of characters for this entry.
     */
    public open var maxLength: Int
        /**
         * Retrieves the maximum allowed length of the text in @entry.
         *
         * See [method@Gtk.Entry.set_max_length].
         *
         * @return the maximum allowed number of characters
         *   in `GtkEntry`, or 0 if there is no maximum.
         */
        get() = gtk_entry_get_max_length(gtkEntryPointer.reinterpret())

        /**
         * Sets the maximum allowed length of the contents of the widget.
         *
         * If the current contents are longer than the given length, then
         * they will be truncated to fit. The length is in characters.
         *
         * This is equivalent to getting @entry's `GtkEntryBuffer` and
         * calling [method@Gtk.EntryBuffer.set_max_length] on it.
         *
         * @param max the maximum length of the entry, or 0 for no maximum.
         *   (other than the maximum length of entries.) The value passed in will
         *   be clamped to the range 0-65536.
         */
        set(max) = gtk_entry_set_max_length(gtkEntryPointer.reinterpret(), max)

    /**
     * If text is overwritten when typing in the `GtkEntry`.
     */
    public open var overwriteMode: Boolean
        /**
         * Gets whether the `GtkEntry` is in overwrite mode.
         *
         * @return whether the text is overwritten when typing.
         */
        get() = gtk_entry_get_overwrite_mode(gtkEntryPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the text is overwritten when typing in the `GtkEntry`.
         *
         * @param overwrite new value
         */
        set(overwrite) = gtk_entry_set_overwrite_mode(gtkEntryPointer.reinterpret(), overwrite.asGBoolean())

    /**
     * The text that will be displayed in the `GtkEntry` when it is empty
     * and unfocused.
     */
    public open var placeholderText: String?
        /**
         * Retrieves the text that will be displayed when @entry
         * is empty and unfocused
         *
         * @return a pointer to the
         *   placeholder text as a string. This string points to
         *   internally allocated storage in the widget and must
         *   not be freed, modified or stored. If no placeholder
         *   text has been set, null will be returned.
         */
        get() = gtk_entry_get_placeholder_text(gtkEntryPointer.reinterpret())?.toKString()

        /**
         * Sets text to be displayed in @entry when it is empty.
         *
         * This can be used to give a visual hint of the expected
         * contents of the `GtkEntry`.
         *
         * @param text a string to be displayed when @entry is empty and unfocused
         */
        set(text) = gtk_entry_set_placeholder_text(gtkEntryPointer.reinterpret(), text)

    /**
     * The current fraction of the task that's been completed.
     */
    public open var progressFraction: Double
        /**
         * Returns the current fraction of the task that’s been completed.
         *
         * See [method@Gtk.Entry.set_progress_fraction].
         *
         * @return a fraction from 0.0 to 1.0
         */
        get() = gtk_entry_get_progress_fraction(gtkEntryPointer.reinterpret())

        /**
         * Causes the entry’s progress indicator to “fill in” the given
         * fraction of the bar.
         *
         * The fraction should be between 0.0 and 1.0, inclusive.
         *
         * @param fraction fraction of the task that’s been completed
         */
        set(fraction) = gtk_entry_set_progress_fraction(gtkEntryPointer.reinterpret(), fraction)

    /**
     * The fraction of total entry width to move the progress
     * bouncing block for each pulse.
     *
     * See [method@Gtk.Entry.progress_pulse].
     */
    public open var progressPulseStep: Double
        /**
         * Retrieves the pulse step set with
         * gtk_entry_set_progress_pulse_step().
         *
         * @return a fraction from 0.0 to 1.0
         */
        get() = gtk_entry_get_progress_pulse_step(gtkEntryPointer.reinterpret())

        /**
         * Sets the fraction of total entry width to move the progress
         * bouncing block for each pulse.
         *
         * Use [method@Gtk.Entry.progress_pulse] to pulse
         * the progress.
         *
         * @param fraction fraction between 0.0 and 1.0
         */
        set(fraction) = gtk_entry_set_progress_pulse_step(gtkEntryPointer.reinterpret(), fraction)

    public open var tabs: TabArray?
        /**
         * Gets the tabstops of the `GtkEntry`.
         *
         * See [method@Gtk.Entry.set_tabs].
         *
         * @return the tabstops
         */
        get() =
            gtk_entry_get_tabs(gtkEntryPointer.reinterpret())?.run {
                TabArray(reinterpret())
            }

        /**
         * Sets a `PangoTabArray`.
         *
         * The tabstops in the array are applied to the entry text.
         *
         * @param tabs a `PangoTabArray`
         */
        set(tabs) = gtk_entry_set_tabs(gtkEntryPointer.reinterpret(), tabs?.pangoTabArrayPointer)

    /**
     * The length of the text in the `GtkEntry`.
     */
    public open val textLength: UShort
        /**
         * Retrieves the current length of the text in @entry.
         *
         * This is equivalent to getting @entry's `GtkEntryBuffer`
         * and calling [method@Gtk.EntryBuffer.get_length] on it.
         *
         * @return the current number of characters
         *   in `GtkEntry`, or 0 if there are none.
         */
        get() = gtk_entry_get_text_length(gtkEntryPointer.reinterpret())

    /**
     * Whether the entry should show the “invisible char” instead of the
     * actual text (“password mode”).
     */
    public open var visibility: Boolean
        /**
         * Retrieves whether the text in @entry is visible.
         *
         * See [method@Gtk.Entry.set_visibility].
         *
         * @return true if the text is currently visible
         */
        get() = gtk_entry_get_visibility(gtkEntryPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the contents of the entry are visible or not.
         *
         * When visibility is set to false, characters are displayed
         * as the invisible char, and will also appear that way when
         * the text in the entry widget is copied elsewhere.
         *
         * By default, GTK picks the best invisible character available
         * in the current font, but it can be changed with
         * [method@Gtk.Entry.set_invisible_char].
         *
         * Note that you probably want to set [property@Gtk.Entry:input-purpose]
         * to %GTK_INPUT_PURPOSE_PASSWORD or %GTK_INPUT_PURPOSE_PIN to
         * inform input methods about the purpose of this entry,
         * in addition to setting visibility to false.
         *
         * @param visible true if the contents of the entry are displayed as plaintext
         */
        set(visible) = gtk_entry_set_visibility(gtkEntryPointer.reinterpret(), visible.asGBoolean())

    /**
     * Creates a new entry.
     *
     * @return a new `GtkEntry`.
     */
    public constructor() : this(gtk_entry_new()!!.reinterpret())

    /**
     * Creates a new entry with the specified text buffer.
     *
     * @param buffer The buffer to use for the new `GtkEntry`.
     * @return a new `GtkEntry`
     */
    public constructor(
        buffer: EntryBuffer,
    ) : this(gtk_entry_new_with_buffer(buffer.gtkEntryBufferPointer.reinterpret())!!.reinterpret())

    /**
     * Retrieves the value set by gtk_entry_set_activates_default().
     *
     * @return true if the entry will activate the default widget
     */
    public open fun getActivatesDefault(): Boolean =
        gtk_entry_get_activates_default(gtkEntryPointer.reinterpret()).asBoolean()

    /**
     * Gets the value set by gtk_entry_set_alignment().
     *
     * See also: [property@Gtk.Editable:xalign]
     *
     * @return the alignment
     */
    open override fun getAlignment(): Float = gtk_entry_get_alignment(gtkEntryPointer.reinterpret())

    /**
     * Gets the attribute list of the `GtkEntry`.
     *
     * See [method@Gtk.Entry.set_attributes].
     *
     * @return the attribute list
     */
    public open fun getAttributes(): AttrList? =
        gtk_entry_get_attributes(gtkEntryPointer.reinterpret())?.run {
            AttrList(reinterpret())
        }

    /**
     * Get the `GtkEntryBuffer` object which holds the text for
     * this widget.
     *
     * @return A `GtkEntryBuffer` object.
     */
    public open fun getBuffer(): EntryBuffer =
        gtk_entry_get_buffer(gtkEntryPointer.reinterpret())!!.run {
            EntryBuffer(reinterpret())
        }

    /**
     * Returns the auxiliary completion object currently
     * in use by @entry.
     *
     * @return The auxiliary
     *   completion object currently in use by @entry
     */
    public open fun getCompletion(): EntryCompletion? =
        gtk_entry_get_completion(gtkEntryPointer.reinterpret())?.run {
            EntryCompletion(reinterpret())
        }

    /**
     * Returns the index of the icon which is the source of the
     * current  DND operation, or -1.
     *
     * @return index of the icon which is the source of the
     *   current DND operation, or -1.
     */
    public open fun getCurrentIconDragSource(): Int =
        gtk_entry_get_current_icon_drag_source(gtkEntryPointer.reinterpret())

    /**
     * Gets the menu model set with gtk_entry_set_extra_menu().
     *
     * @return the menu model
     */
    public open fun getExtraMenu(): MenuModel? =
        gtk_entry_get_extra_menu(gtkEntryPointer.reinterpret())?.run {
            MenuModel(reinterpret())
        }

    /**
     * Gets the value set by gtk_entry_set_has_frame().
     *
     * @return whether the entry has a beveled frame
     */
    public open fun getHasFrame(): Boolean = gtk_entry_get_has_frame(gtkEntryPointer.reinterpret()).asBoolean()

    /**
     * Returns whether the icon is activatable.
     *
     * @param iconPos Icon position
     * @return true if the icon is activatable.
     */
    public open fun getIconActivatable(iconPos: EntryIconPosition): Boolean =
        gtk_entry_get_icon_activatable(gtkEntryPointer.reinterpret(), iconPos.nativeValue).asBoolean()

    /**
     * Gets the area where entry’s icon at @icon_pos is drawn.
     *
     * This function is useful when drawing something to the
     * entry in a draw callback.
     *
     * If the entry is not realized or has no icon at the given
     * position, @icon_area is filled with zeros. Otherwise,
     * @icon_area will be filled with the icon's allocation,
     * relative to @entry's allocation.
     *
     * @param iconPos Icon position
     * @param iconArea Return location for the icon’s area
     */
    public open fun getIconArea(
        iconPos: EntryIconPosition,
        iconArea: Rectangle,
    ): Unit = gtk_entry_get_icon_area(gtkEntryPointer.reinterpret(), iconPos.nativeValue, iconArea.gdkRectanglePointer)

    /**
     * Finds the icon at the given position and return its index.
     *
     * The position’s coordinates are relative to the @entry’s
     * top left corner. If @x, @y doesn’t lie inside an icon,
     * -1 is returned. This function is intended for use in a
     *  [signal@Gtk.Widget::query-tooltip] signal handler.
     *
     * @param x the x coordinate of the position to find, relative to @entry
     * @param y the y coordinate of the position to find, relative to @entry
     * @return the index of the icon at the given position, or -1
     */
    public open fun getIconAtPos(
        x: Int,
        y: Int,
    ): Int = gtk_entry_get_icon_at_pos(gtkEntryPointer.reinterpret(), x, y)

    /**
     * Retrieves the `GIcon` used for the icon.
     *
     * null will be returned if there is no icon or if the icon was
     * set by some other method (e.g., by `GdkPaintable` or icon name).
     *
     * @param iconPos Icon position
     * @return A `GIcon`
     */
    public open fun getIconGicon(iconPos: EntryIconPosition): Icon? =
        gtk_entry_get_icon_gicon(gtkEntryPointer.reinterpret(), iconPos.nativeValue)?.run {
            Icon.wrap(reinterpret())
        }

    /**
     * Retrieves the icon name used for the icon.
     *
     * null is returned if there is no icon or if the icon was set
     * by some other method (e.g., by `GdkPaintable` or gicon).
     *
     * @param iconPos Icon position
     * @return An icon name
     */
    public open fun getIconName(iconPos: EntryIconPosition): String? =
        gtk_entry_get_icon_name(gtkEntryPointer.reinterpret(), iconPos.nativeValue)?.toKString()

    /**
     * Retrieves the `GdkPaintable` used for the icon.
     *
     * If no `GdkPaintable` was used for the icon, null is returned.
     *
     * @param iconPos Icon position
     * @return A `GdkPaintable`
     *   if no icon is set for this position or the icon set is not
     *   a `GdkPaintable`.
     */
    public open fun getIconPaintable(iconPos: EntryIconPosition): Paintable? =
        gtk_entry_get_icon_paintable(gtkEntryPointer.reinterpret(), iconPos.nativeValue)?.run {
            Paintable.wrap(reinterpret())
        }

    /**
     * Returns whether the icon appears sensitive or insensitive.
     *
     * @param iconPos Icon position
     * @return true if the icon is sensitive.
     */
    public open fun getIconSensitive(iconPos: EntryIconPosition): Boolean =
        gtk_entry_get_icon_sensitive(gtkEntryPointer.reinterpret(), iconPos.nativeValue).asBoolean()

    /**
     * Gets the type of representation being used by the icon
     * to store image data.
     *
     * If the icon has no image data, the return value will
     * be %GTK_IMAGE_EMPTY.
     *
     * @param iconPos Icon position
     * @return image representation being used
     */
    public open fun getIconStorageType(iconPos: EntryIconPosition): ImageType =
        gtk_entry_get_icon_storage_type(gtkEntryPointer.reinterpret(), iconPos.nativeValue).run {
            ImageType.fromNativeValue(this)
        }

    /**
     * Gets the contents of the tooltip on the icon at the specified
     * position in @entry.
     *
     * @param iconPos the icon position
     * @return the tooltip text
     */
    public open fun getIconTooltipMarkup(iconPos: EntryIconPosition): String? =
        gtk_entry_get_icon_tooltip_markup(gtkEntryPointer.reinterpret(), iconPos.nativeValue)?.toKString()

    /**
     * Gets the contents of the tooltip on the icon at the specified
     * position in @entry.
     *
     * @param iconPos the icon position
     * @return the tooltip text
     */
    public open fun getIconTooltipText(iconPos: EntryIconPosition): String? =
        gtk_entry_get_icon_tooltip_text(gtkEntryPointer.reinterpret(), iconPos.nativeValue)?.toKString()

    /**
     * Gets the input hints of this `GtkEntry`.
     *
     * @return the input hints
     */
    public open fun getInputHints(): InputHints =
        gtk_entry_get_input_hints(gtkEntryPointer.reinterpret()).run {
            InputHints(this)
        }

    /**
     * Gets the input purpose of the `GtkEntry`.
     *
     * @return the input purpose
     */
    public open fun getInputPurpose(): InputPurpose =
        gtk_entry_get_input_purpose(gtkEntryPointer.reinterpret()).run {
            InputPurpose.fromNativeValue(this)
        }

    /**
     * Retrieves the character displayed in place of the actual text
     * in “password mode”.
     *
     * @return the current invisible char, or 0, if the entry does not
     *   show invisible text at all.
     */
    public open fun getInvisibleChar(): UInt = gtk_entry_get_invisible_char(gtkEntryPointer.reinterpret())

    /**
     * Retrieves the maximum allowed length of the text in @entry.
     *
     * See [method@Gtk.Entry.set_max_length].
     *
     * @return the maximum allowed number of characters
     *   in `GtkEntry`, or 0 if there is no maximum.
     */
    public open fun getMaxLength(): Int = gtk_entry_get_max_length(gtkEntryPointer.reinterpret())

    /**
     * Gets whether the `GtkEntry` is in overwrite mode.
     *
     * @return whether the text is overwritten when typing.
     */
    public open fun getOverwriteMode(): Boolean =
        gtk_entry_get_overwrite_mode(gtkEntryPointer.reinterpret()).asBoolean()

    /**
     * Retrieves the text that will be displayed when @entry
     * is empty and unfocused
     *
     * @return a pointer to the
     *   placeholder text as a string. This string points to
     *   internally allocated storage in the widget and must
     *   not be freed, modified or stored. If no placeholder
     *   text has been set, null will be returned.
     */
    public open fun getPlaceholderText(): String? =
        gtk_entry_get_placeholder_text(gtkEntryPointer.reinterpret())?.toKString()

    /**
     * Returns the current fraction of the task that’s been completed.
     *
     * See [method@Gtk.Entry.set_progress_fraction].
     *
     * @return a fraction from 0.0 to 1.0
     */
    public open fun getProgressFraction(): Double = gtk_entry_get_progress_fraction(gtkEntryPointer.reinterpret())

    /**
     * Retrieves the pulse step set with
     * gtk_entry_set_progress_pulse_step().
     *
     * @return a fraction from 0.0 to 1.0
     */
    public open fun getProgressPulseStep(): Double = gtk_entry_get_progress_pulse_step(gtkEntryPointer.reinterpret())

    /**
     * Gets the tabstops of the `GtkEntry`.
     *
     * See [method@Gtk.Entry.set_tabs].
     *
     * @return the tabstops
     */
    public open fun getTabs(): TabArray? =
        gtk_entry_get_tabs(gtkEntryPointer.reinterpret())?.run {
            TabArray(reinterpret())
        }

    /**
     * Retrieves the current length of the text in @entry.
     *
     * This is equivalent to getting @entry's `GtkEntryBuffer`
     * and calling [method@Gtk.EntryBuffer.get_length] on it.
     *
     * @return the current number of characters
     *   in `GtkEntry`, or 0 if there are none.
     */
    public open fun getTextLength(): UShort = gtk_entry_get_text_length(gtkEntryPointer.reinterpret())

    /**
     * Retrieves whether the text in @entry is visible.
     *
     * See [method@Gtk.Entry.set_visibility].
     *
     * @return true if the text is currently visible
     */
    public open fun getVisibility(): Boolean = gtk_entry_get_visibility(gtkEntryPointer.reinterpret()).asBoolean()

    /**
     * Causes @entry to have keyboard focus.
     *
     * It behaves like [method@Gtk.Widget.grab_focus], except that it doesn't
     * select the contents of the entry. You only want to call this on some
     * special entries which the user usually doesn't want to replace all text
     * in, such as search-as-you-type entries.
     *
     * @return true if focus is now inside @self
     */
    public open fun grabFocusWithoutSelecting(): Boolean =
        gtk_entry_grab_focus_without_selecting(gtkEntryPointer.reinterpret()).asBoolean()

    /**
     * Indicates that some progress is made, but you don’t
     * know how much.
     *
     * Causes the entry’s progress indicator to enter “activity
     * mode”, where a block bounces back and forth. Each call to
     * gtk_entry_progress_pulse() causes the block to move by a
     * little bit (the amount of movement per pulse is determined
     * by [method@Gtk.Entry.set_progress_pulse_step]).
     */
    public open fun progressPulse(): Unit = gtk_entry_progress_pulse(gtkEntryPointer.reinterpret())

    /**
     * Reset the input method context of the entry if needed.
     *
     * This can be necessary in the case where modifying the buffer
     * would confuse on-going input method behavior.
     */
    public open fun resetImContext(): Unit = gtk_entry_reset_im_context(gtkEntryPointer.reinterpret())

    /**
     * Sets whether pressing Enter in the @entry will activate the default
     * widget for the window containing the entry.
     *
     * This usually means that the dialog containing the entry will be closed,
     * since the default widget is usually one of the dialog buttons.
     *
     * @param setting true to activate window’s default widget on Enter keypress
     */
    public open fun setActivatesDefault(setting: Boolean): Unit =
        gtk_entry_set_activates_default(gtkEntryPointer.reinterpret(), setting.asGBoolean())

    /**
     * Sets the alignment for the contents of the entry.
     *
     * This controls the horizontal positioning of the contents when
     * the displayed text is shorter than the width of the entry.
     *
     * See also: [property@Gtk.Editable:xalign]
     *
     * @param xalign The horizontal alignment, from 0 (left) to 1 (right).
     *   Reversed for RTL layouts
     */
    open override fun setAlignment(xalign: Float): Unit = gtk_entry_set_alignment(gtkEntryPointer.reinterpret(), xalign)

    /**
     * Sets a `PangoAttrList`.
     *
     * The attributes in the list are applied to the entry text.
     *
     * Since the attributes will be applied to text that changes
     * as the user types, it makes most sense to use attributes
     * with unlimited extent.
     *
     * @param attrs a `PangoAttrList`
     */
    public open fun setAttributes(attrs: AttrList): Unit =
        gtk_entry_set_attributes(gtkEntryPointer.reinterpret(), attrs.pangoAttrListPointer)

    /**
     * Set the `GtkEntryBuffer` object which holds the text for
     * this widget.
     *
     * @param buffer a `GtkEntryBuffer`
     */
    public open fun setBuffer(buffer: EntryBuffer): Unit =
        gtk_entry_set_buffer(gtkEntryPointer.reinterpret(), buffer.gtkEntryBufferPointer.reinterpret())

    /**
     * Sets @completion to be the auxiliary completion object
     * to use with @entry.
     *
     * All further configuration of the completion mechanism is
     * done on @completion using the `GtkEntryCompletion` API.
     * Completion is disabled if @completion is set to null.
     *
     * @param completion The `GtkEntryCompletion`
     */
    public open fun setCompletion(completion: EntryCompletion? = null): Unit =
        gtk_entry_set_completion(gtkEntryPointer.reinterpret(), completion?.gtkEntryCompletionPointer?.reinterpret())

    /**
     * Sets a menu model to add when constructing
     * the context menu for @entry.
     *
     * @param model a `GMenuModel`
     */
    public open fun setExtraMenu(model: MenuModel? = null): Unit =
        gtk_entry_set_extra_menu(gtkEntryPointer.reinterpret(), model?.gioMenuModelPointer?.reinterpret())

    /**
     * Sets whether the entry has a beveled frame around it.
     *
     * @param setting new value
     */
    public open fun setHasFrame(setting: Boolean): Unit =
        gtk_entry_set_has_frame(gtkEntryPointer.reinterpret(), setting.asGBoolean())

    /**
     * Sets whether the icon is activatable.
     *
     * @param iconPos Icon position
     * @param activatable true if the icon should be activatable
     */
    public open fun setIconActivatable(
        iconPos: EntryIconPosition,
        activatable: Boolean,
    ): Unit =
        gtk_entry_set_icon_activatable(gtkEntryPointer.reinterpret(), iconPos.nativeValue, activatable.asGBoolean())

    /**
     * Sets up the icon at the given position as drag source.
     *
     * This makes it so that GTK will start a drag
     * operation when the user clicks and drags the icon.
     *
     * @param iconPos icon position
     * @param provider a `GdkContentProvider`
     * @param actions a bitmask of the allowed drag actions
     */
    public open fun setIconDragSource(
        iconPos: EntryIconPosition,
        provider: ContentProvider,
        actions: DragAction,
    ): Unit =
        gtk_entry_set_icon_drag_source(
            gtkEntryPointer.reinterpret(),
            iconPos.nativeValue,
            provider.gdkContentProviderPointer.reinterpret(),
            actions.mask
        )

    /**
     * Sets the icon shown in the entry at the specified position
     * from the current icon theme.
     *
     * If the icon isn’t known, a “broken image” icon will be
     * displayed instead.
     *
     * If @icon is null, no icon will be shown in the
     * specified position.
     *
     * @param iconPos The position at which to set the icon
     * @param icon The icon to set
     */
    public open fun setIconFromGicon(
        iconPos: EntryIconPosition,
        icon: Icon? = null,
    ): Unit = gtk_entry_set_icon_from_gicon(gtkEntryPointer.reinterpret(), iconPos.nativeValue, icon?.gioIconPointer)

    /**
     * Sets the icon shown in the entry at the specified position
     * from the current icon theme.
     *
     * If the icon name isn’t known, a “broken image” icon will be
     * displayed instead.
     *
     * If @icon_name is null, no icon will be shown in the
     * specified position.
     *
     * @param iconPos The position at which to set the icon
     * @param iconName An icon name
     */
    public open fun setIconFromIconName(
        iconPos: EntryIconPosition,
        iconName: String? = null,
    ): Unit = gtk_entry_set_icon_from_icon_name(gtkEntryPointer.reinterpret(), iconPos.nativeValue, iconName)

    /**
     * Sets the icon shown in the specified position using a `GdkPaintable`.
     *
     * If @paintable is null, no icon will be shown in the specified position.
     *
     * @param iconPos Icon position
     * @param paintable A `GdkPaintable`
     */
    public open fun setIconFromPaintable(
        iconPos: EntryIconPosition,
        paintable: Paintable? = null,
    ): Unit =
        gtk_entry_set_icon_from_paintable(
            gtkEntryPointer.reinterpret(),
            iconPos.nativeValue,
            paintable?.gdkPaintablePointer
        )

    /**
     * Sets the sensitivity for the specified icon.
     *
     * @param iconPos Icon position
     * @param sensitive Specifies whether the icon should appear
     *   sensitive or insensitive
     */
    public open fun setIconSensitive(
        iconPos: EntryIconPosition,
        sensitive: Boolean,
    ): Unit = gtk_entry_set_icon_sensitive(gtkEntryPointer.reinterpret(), iconPos.nativeValue, sensitive.asGBoolean())

    /**
     * Sets @tooltip as the contents of the tooltip for the icon at
     * the specified position.
     *
     * @tooltip is assumed to be marked up with Pango Markup.
     *
     * Use null for @tooltip to remove an existing tooltip.
     *
     * See also [method@Gtk.Widget.set_tooltip_markup] and
     * [method@Gtk.Entry.set_icon_tooltip_text].
     *
     * @param iconPos the icon position
     * @param tooltip the contents of the tooltip for the icon
     */
    public open fun setIconTooltipMarkup(
        iconPos: EntryIconPosition,
        tooltip: String? = null,
    ): Unit = gtk_entry_set_icon_tooltip_markup(gtkEntryPointer.reinterpret(), iconPos.nativeValue, tooltip)

    /**
     * Sets @tooltip as the contents of the tooltip for the icon
     * at the specified position.
     *
     * Use null for @tooltip to remove an existing tooltip.
     *
     * See also [method@Gtk.Widget.set_tooltip_text] and
     * [method@Gtk.Entry.set_icon_tooltip_markup].
     *
     * If you unset the widget tooltip via
     * [method@Gtk.Widget.set_tooltip_text] or
     * [method@Gtk.Widget.set_tooltip_markup], this sets
     * [property@Gtk.Widget:has-tooltip] to false, which suppresses
     * icon tooltips too. You can resolve this by then calling
     * [method@Gtk.Widget.set_has_tooltip] to set
     * [property@Gtk.Widget:has-tooltip] back to true, or
     * setting at least one non-empty tooltip on any icon
     * achieves the same result.
     *
     * @param iconPos the icon position
     * @param tooltip the contents of the tooltip for the icon
     */
    public open fun setIconTooltipText(
        iconPos: EntryIconPosition,
        tooltip: String? = null,
    ): Unit = gtk_entry_set_icon_tooltip_text(gtkEntryPointer.reinterpret(), iconPos.nativeValue, tooltip)

    /**
     * Set additional hints which allow input methods to
     * fine-tune their behavior.
     *
     * @param hints the hints
     */
    public open fun setInputHints(hints: InputHints): Unit =
        gtk_entry_set_input_hints(gtkEntryPointer.reinterpret(), hints.mask)

    /**
     * Sets the input purpose which can be used by input methods
     * to adjust their behavior.
     *
     * @param purpose the purpose
     */
    public open fun setInputPurpose(purpose: InputPurpose): Unit =
        gtk_entry_set_input_purpose(gtkEntryPointer.reinterpret(), purpose.nativeValue)

    /**
     * Sets the character to use in place of the actual text
     * in “password mode”.
     *
     * See [method@Gtk.Entry.set_visibility] for how to enable
     * “password mode”.
     *
     * By default, GTK picks the best invisible char available in
     * the current font. If you set the invisible char to 0, then
     * the user will get no feedback at all; there will be no text
     * on the screen as they type.
     *
     * @param ch a Unicode character
     */
    public open fun setInvisibleChar(ch: UInt): Unit = gtk_entry_set_invisible_char(gtkEntryPointer.reinterpret(), ch)

    /**
     * Sets the maximum allowed length of the contents of the widget.
     *
     * If the current contents are longer than the given length, then
     * they will be truncated to fit. The length is in characters.
     *
     * This is equivalent to getting @entry's `GtkEntryBuffer` and
     * calling [method@Gtk.EntryBuffer.set_max_length] on it.
     *
     * @param max the maximum length of the entry, or 0 for no maximum.
     *   (other than the maximum length of entries.) The value passed in will
     *   be clamped to the range 0-65536.
     */
    public open fun setMaxLength(max: Int): Unit = gtk_entry_set_max_length(gtkEntryPointer.reinterpret(), max)

    /**
     * Sets whether the text is overwritten when typing in the `GtkEntry`.
     *
     * @param overwrite new value
     */
    public open fun setOverwriteMode(overwrite: Boolean): Unit =
        gtk_entry_set_overwrite_mode(gtkEntryPointer.reinterpret(), overwrite.asGBoolean())

    /**
     * Sets text to be displayed in @entry when it is empty.
     *
     * This can be used to give a visual hint of the expected
     * contents of the `GtkEntry`.
     *
     * @param text a string to be displayed when @entry is empty and unfocused
     */
    public open fun setPlaceholderText(text: String? = null): Unit =
        gtk_entry_set_placeholder_text(gtkEntryPointer.reinterpret(), text)

    /**
     * Causes the entry’s progress indicator to “fill in” the given
     * fraction of the bar.
     *
     * The fraction should be between 0.0 and 1.0, inclusive.
     *
     * @param fraction fraction of the task that’s been completed
     */
    public open fun setProgressFraction(fraction: Double): Unit =
        gtk_entry_set_progress_fraction(gtkEntryPointer.reinterpret(), fraction)

    /**
     * Sets the fraction of total entry width to move the progress
     * bouncing block for each pulse.
     *
     * Use [method@Gtk.Entry.progress_pulse] to pulse
     * the progress.
     *
     * @param fraction fraction between 0.0 and 1.0
     */
    public open fun setProgressPulseStep(fraction: Double): Unit =
        gtk_entry_set_progress_pulse_step(gtkEntryPointer.reinterpret(), fraction)

    /**
     * Sets a `PangoTabArray`.
     *
     * The tabstops in the array are applied to the entry text.
     *
     * @param tabs a `PangoTabArray`
     */
    public open fun setTabs(tabs: TabArray? = null): Unit =
        gtk_entry_set_tabs(gtkEntryPointer.reinterpret(), tabs?.pangoTabArrayPointer)

    /**
     * Sets whether the contents of the entry are visible or not.
     *
     * When visibility is set to false, characters are displayed
     * as the invisible char, and will also appear that way when
     * the text in the entry widget is copied elsewhere.
     *
     * By default, GTK picks the best invisible character available
     * in the current font, but it can be changed with
     * [method@Gtk.Entry.set_invisible_char].
     *
     * Note that you probably want to set [property@Gtk.Entry:input-purpose]
     * to %GTK_INPUT_PURPOSE_PASSWORD or %GTK_INPUT_PURPOSE_PIN to
     * inform input methods about the purpose of this entry,
     * in addition to setting visibility to false.
     *
     * @param visible true if the contents of the entry are displayed as plaintext
     */
    public open fun setVisibility(visible: Boolean): Unit =
        gtk_entry_set_visibility(gtkEntryPointer.reinterpret(), visible.asGBoolean())

    /**
     * Unsets the invisible char, so that the default invisible char
     * is used again. See [method@Gtk.Entry.set_invisible_char].
     */
    public open fun unsetInvisibleChar(): Unit = gtk_entry_unset_invisible_char(gtkEntryPointer.reinterpret())

    /**
     * Emitted when the entry is activated.
     *
     * The keybindings for this signal are all forms of the Enter key.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectActivate(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "activate",
            connectActivateFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when an activatable icon is clicked.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `iconPos` The position of the clicked icon
     */
    public fun connectIconPress(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (iconPos: EntryIconPosition) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "icon-press",
            connectIconPressFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted on the button release from a mouse click
     * over an activatable icon.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `iconPos` The position of the clicked icon
     */
    public fun connectIconRelease(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (iconPos: EntryIconPosition) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "icon-release",
            connectIconReleaseFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<Entry> {
        override val type: GeneratedClassKGType<Entry> =
            GeneratedClassKGType(gtk_entry_get_type()) { Entry(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectActivateFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectIconPressFunc: CPointer<CFunction<(GtkEntryIconPosition) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            iconPos: GtkEntryIconPosition,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(iconPos: EntryIconPosition) -> Unit>().get().invoke(
            iconPos.run {
                EntryIconPosition.fromNativeValue(this)
            }
        )
    }.reinterpret()

private val connectIconReleaseFunc: CPointer<CFunction<(GtkEntryIconPosition) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            iconPos: GtkEntryIconPosition,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(iconPos: EntryIconPosition) -> Unit>().get().invoke(
            iconPos.run {
                EntryIconPosition.fromNativeValue(this)
            }
        )
    }.reinterpret()