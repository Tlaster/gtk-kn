// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkTreeExpander
import org.gtkkn.native.gtk.gtk_tree_expander_get_child
import org.gtkkn.native.gtk.gtk_tree_expander_get_hide_expander
import org.gtkkn.native.gtk.gtk_tree_expander_get_indent_for_depth
import org.gtkkn.native.gtk.gtk_tree_expander_get_indent_for_icon
import org.gtkkn.native.gtk.gtk_tree_expander_get_item
import org.gtkkn.native.gtk.gtk_tree_expander_get_list_row
import org.gtkkn.native.gtk.gtk_tree_expander_get_type
import org.gtkkn.native.gtk.gtk_tree_expander_new
import org.gtkkn.native.gtk.gtk_tree_expander_set_child
import org.gtkkn.native.gtk.gtk_tree_expander_set_hide_expander
import org.gtkkn.native.gtk.gtk_tree_expander_set_indent_for_depth
import org.gtkkn.native.gtk.gtk_tree_expander_set_indent_for_icon
import org.gtkkn.native.gtk.gtk_tree_expander_set_list_row
import kotlin.Boolean
import kotlin.Unit

/**
 * `GtkTreeExpander` is a widget that provides an expander for a list.
 *
 * It is typically placed as a bottommost child into a `GtkListView`
 * to allow users to expand and collapse children in a list with a
 * [class@Gtk.TreeListModel]. `GtkTreeExpander` provides the common UI
 * elements, gestures and keybindings for this purpose.
 *
 * On top of this, the "listitem.expand", "listitem.collapse" and
 * "listitem.toggle-expand" actions are provided to allow adding custom
 * UI for managing expanded state.
 *
 * It is important to mention that you want to set the
 * [property@Gtk.ListItem:focusable] property to FALSE when using this
 * widget, as you want the keyboard focus to be in the treexpander, and not
 * inside the list to make use of the keybindings.
 *
 * The `GtkTreeListModel` must be set to not be passthrough. Then it
 * will provide [class@Gtk.TreeListRow] items which can be set via
 * [method@Gtk.TreeExpander.set_list_row] on the expander.
 * The expander will then watch that row item automatically.
 * [method@Gtk.TreeExpander.set_child] sets the widget that displays
 * the actual row contents.
 *
 * `GtkTreeExpander` can be modified with properties such as
 * [property@Gtk.TreeExpander:indent-for-icon],
 * [property@Gtk.TreeExpander:indent-for-depth], and
 * [property@Gtk.TreeExpander:hide-expander] to achieve a different appearance.
 * This can even be done to influence individual rows, for example by binding
 * the [property@Gtk.TreeExpander:hide-expander] property to the item count of
 * the model of the treelistrow, to hide the expander for rows without children,
 * even if the row is expandable.
 *
 * ## CSS nodes
 *
 * ```
 * treeexpander
 * ├── [indent]*
 * ├── [expander]
 * ╰── <child>
 * ```
 *
 * `GtkTreeExpander` has zero or one CSS nodes with the name "expander" that
 * should display the expander icon. The node will be `:checked` when it
 * is expanded. If the node is not expandable, an "indent" node will be
 * displayed instead.
 *
 * For every level of depth, another "indent" node is prepended.
 *
 * ## Accessibility
 *
 * Until GTK 4.10, `GtkTreeExpander` used the `GTK_ACCESSIBLE_ROLE_GROUP` role.
 *
 * Since GTK 4.12, `GtkTreeExpander` uses the `GTK_ACCESSIBLE_ROLE_BUTTON` role.
 * Toggling it will change the `GTK_ACCESSIBLE_STATE_EXPANDED` state.
 */
public open class TreeExpander(
    pointer: CPointer<GtkTreeExpander>,
) : Widget(pointer.reinterpret()),
    KGTyped {
    public val gtkTreeExpanderPointer: CPointer<GtkTreeExpander>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The child widget with the actual contents.
     */
    public open var child: Widget?
        /**
         * Gets the child widget displayed by @self.
         *
         * @return The child displayed by @self
         */
        get() =
            gtk_tree_expander_get_child(gtkTreeExpanderPointer.reinterpret())?.run {
                Widget(reinterpret())
            }

        /**
         * Sets the content widget to display.
         *
         * @param child a `GtkWidget`
         */
        set(
            child
        ) = gtk_tree_expander_set_child(gtkTreeExpanderPointer.reinterpret(), child?.gtkWidgetPointer?.reinterpret())

    /**
     * Whether the expander icon should be hidden in a GtkTreeListRow.
     * Note that this property simply hides the icon.  The actions and keybinding
     * (i.e. collapse and expand) are not affected by this property.
     *
     * A common use for this property would be to bind to the number of children in a
     * GtkTreeListRow's model in order to hide the expander when a row has no children.
     *
     * @since 4.10
     */
    public open var hideExpander: Boolean
        /**
         * Gets whether the TreeExpander should be hidden in a GtkTreeListRow.
         *
         * @return TRUE if the expander icon should be hidden. Otherwise FALSE.
         * @since 4.10
         */
        get() = gtk_tree_expander_get_hide_expander(gtkTreeExpanderPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the expander icon should be visible in a GtkTreeListRow.
         *
         * @param hideExpander TRUE if the expander should be hidden. Otherwise FALSE.
         * @since 4.10
         */
        set(
            hideExpander
        ) = gtk_tree_expander_set_hide_expander(gtkTreeExpanderPointer.reinterpret(), hideExpander.asGBoolean())

    /**
     * TreeExpander indents the child according to its depth.
     *
     * @since 4.10
     */
    public open var indentForDepth: Boolean
        /**
         * TreeExpander indents each level of depth with an additional indent.
         *
         * @return TRUE if the child should be indented . Otherwise FALSE.
         * @since 4.10
         */
        get() = gtk_tree_expander_get_indent_for_depth(gtkTreeExpanderPointer.reinterpret()).asBoolean()

        /**
         * Sets if the TreeExpander should indent the child according to its depth.
         *
         * @param indentForDepth TRUE if the child should be indented. Otherwise FALSE.
         * @since 4.10
         */
        set(
            indentForDepth
        ) = gtk_tree_expander_set_indent_for_depth(gtkTreeExpanderPointer.reinterpret(), indentForDepth.asGBoolean())

    /**
     * TreeExpander indents the child by the width of an expander-icon if it is not expandable.
     *
     * @since 4.6
     */
    public open var indentForIcon: Boolean
        /**
         * TreeExpander indents the child by the width of an expander-icon if it is not expandable.
         *
         * @return TRUE if the child should be indented when not expandable. Otherwise FALSE.
         * @since 4.6
         */
        get() = gtk_tree_expander_get_indent_for_icon(gtkTreeExpanderPointer.reinterpret()).asBoolean()

        /**
         * Sets if the TreeExpander should indent the child by the width of an expander-icon when it is not expandable.
         *
         * @param indentForIcon TRUE if the child should be indented without expander. Otherwise FALSE.
         * @since 4.6
         */
        set(
            indentForIcon
        ) = gtk_tree_expander_set_indent_for_icon(gtkTreeExpanderPointer.reinterpret(), indentForIcon.asGBoolean())

    /**
     * The item held by this expander's row.
     */
    public open val item: Object?
        /**
         * Forwards the item set on the `GtkTreeListRow` that @self is managing.
         *
         * This call is essentially equivalent to calling:
         *
         * ```c
         * gtk_tree_list_row_get_item (gtk_tree_expander_get_list_row (@self));
         * ```
         *
         * @return The item of the row
         */
        get() =
            gtk_tree_expander_get_item(gtkTreeExpanderPointer.reinterpret())?.run {
                Object(reinterpret())
            }

    /**
     * The list row to track for expander state.
     */
    public open var listRow: TreeListRow?
        /**
         * Gets the list row managed by @self.
         *
         * @return The list row displayed by @self
         */
        get() =
            gtk_tree_expander_get_list_row(gtkTreeExpanderPointer.reinterpret())?.run {
                TreeListRow(reinterpret())
            }

        /**
         * Sets the tree list row that this expander should manage.
         *
         * @param listRow a `GtkTreeListRow`
         */
        set(
            listRow
        ) =
            gtk_tree_expander_set_list_row(
                gtkTreeExpanderPointer.reinterpret(),
                listRow?.gtkTreeListRowPointer?.reinterpret()
            )

    /**
     * Creates a new `GtkTreeExpander`
     *
     * @return a new `GtkTreeExpander`
     */
    public constructor() : this(gtk_tree_expander_new()!!.reinterpret())

    /**
     * Gets the child widget displayed by @self.
     *
     * @return The child displayed by @self
     */
    public open fun getChild(): Widget? =
        gtk_tree_expander_get_child(gtkTreeExpanderPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Gets whether the TreeExpander should be hidden in a GtkTreeListRow.
     *
     * @return TRUE if the expander icon should be hidden. Otherwise FALSE.
     * @since 4.10
     */
    public open fun getHideExpander(): Boolean =
        gtk_tree_expander_get_hide_expander(gtkTreeExpanderPointer.reinterpret()).asBoolean()

    /**
     * TreeExpander indents each level of depth with an additional indent.
     *
     * @return TRUE if the child should be indented . Otherwise FALSE.
     * @since 4.10
     */
    public open fun getIndentForDepth(): Boolean =
        gtk_tree_expander_get_indent_for_depth(gtkTreeExpanderPointer.reinterpret()).asBoolean()

    /**
     * TreeExpander indents the child by the width of an expander-icon if it is not expandable.
     *
     * @return TRUE if the child should be indented when not expandable. Otherwise FALSE.
     * @since 4.6
     */
    public open fun getIndentForIcon(): Boolean =
        gtk_tree_expander_get_indent_for_icon(gtkTreeExpanderPointer.reinterpret()).asBoolean()

    /**
     * Forwards the item set on the `GtkTreeListRow` that @self is managing.
     *
     * This call is essentially equivalent to calling:
     *
     * ```c
     * gtk_tree_list_row_get_item (gtk_tree_expander_get_list_row (@self));
     * ```
     *
     * @return The item of the row
     */
    public open fun getItem(): Object? =
        gtk_tree_expander_get_item(gtkTreeExpanderPointer.reinterpret())?.run {
            Object(reinterpret())
        }

    /**
     * Gets the list row managed by @self.
     *
     * @return The list row displayed by @self
     */
    public open fun getListRow(): TreeListRow? =
        gtk_tree_expander_get_list_row(gtkTreeExpanderPointer.reinterpret())?.run {
            TreeListRow(reinterpret())
        }

    /**
     * Sets the content widget to display.
     *
     * @param child a `GtkWidget`
     */
    public open fun setChild(child: Widget? = null): Unit =
        gtk_tree_expander_set_child(gtkTreeExpanderPointer.reinterpret(), child?.gtkWidgetPointer?.reinterpret())

    /**
     * Sets whether the expander icon should be visible in a GtkTreeListRow.
     *
     * @param hideExpander TRUE if the expander should be hidden. Otherwise FALSE.
     * @since 4.10
     */
    public open fun setHideExpander(hideExpander: Boolean): Unit =
        gtk_tree_expander_set_hide_expander(gtkTreeExpanderPointer.reinterpret(), hideExpander.asGBoolean())

    /**
     * Sets if the TreeExpander should indent the child according to its depth.
     *
     * @param indentForDepth TRUE if the child should be indented. Otherwise FALSE.
     * @since 4.10
     */
    public open fun setIndentForDepth(indentForDepth: Boolean): Unit =
        gtk_tree_expander_set_indent_for_depth(gtkTreeExpanderPointer.reinterpret(), indentForDepth.asGBoolean())

    /**
     * Sets if the TreeExpander should indent the child by the width of an expander-icon when it is not expandable.
     *
     * @param indentForIcon TRUE if the child should be indented without expander. Otherwise FALSE.
     * @since 4.6
     */
    public open fun setIndentForIcon(indentForIcon: Boolean): Unit =
        gtk_tree_expander_set_indent_for_icon(gtkTreeExpanderPointer.reinterpret(), indentForIcon.asGBoolean())

    /**
     * Sets the tree list row that this expander should manage.
     *
     * @param listRow a `GtkTreeListRow`
     */
    public open fun setListRow(listRow: TreeListRow? = null): Unit =
        gtk_tree_expander_set_list_row(
            gtkTreeExpanderPointer.reinterpret(),
            listRow?.gtkTreeListRowPointer?.reinterpret()
        )

    public companion object : TypeCompanion<TreeExpander> {
        override val type: GeneratedClassKGType<TreeExpander> =
            GeneratedClassKGType(gtk_tree_expander_get_type()) { TreeExpander(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}