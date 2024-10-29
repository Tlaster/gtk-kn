// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkDirectionType
import org.gtkkn.native.gtk.GtkPositionType
import org.gtkkn.native.gtk.GtkScrollType
import org.gtkkn.native.gtk.GtkScrolledWindow
import org.gtkkn.native.gtk.gtk_scrolled_window_get_child
import org.gtkkn.native.gtk.gtk_scrolled_window_get_hadjustment
import org.gtkkn.native.gtk.gtk_scrolled_window_get_has_frame
import org.gtkkn.native.gtk.gtk_scrolled_window_get_hscrollbar
import org.gtkkn.native.gtk.gtk_scrolled_window_get_kinetic_scrolling
import org.gtkkn.native.gtk.gtk_scrolled_window_get_max_content_height
import org.gtkkn.native.gtk.gtk_scrolled_window_get_max_content_width
import org.gtkkn.native.gtk.gtk_scrolled_window_get_min_content_height
import org.gtkkn.native.gtk.gtk_scrolled_window_get_min_content_width
import org.gtkkn.native.gtk.gtk_scrolled_window_get_overlay_scrolling
import org.gtkkn.native.gtk.gtk_scrolled_window_get_placement
import org.gtkkn.native.gtk.gtk_scrolled_window_get_propagate_natural_height
import org.gtkkn.native.gtk.gtk_scrolled_window_get_propagate_natural_width
import org.gtkkn.native.gtk.gtk_scrolled_window_get_type
import org.gtkkn.native.gtk.gtk_scrolled_window_get_vadjustment
import org.gtkkn.native.gtk.gtk_scrolled_window_get_vscrollbar
import org.gtkkn.native.gtk.gtk_scrolled_window_new
import org.gtkkn.native.gtk.gtk_scrolled_window_set_child
import org.gtkkn.native.gtk.gtk_scrolled_window_set_hadjustment
import org.gtkkn.native.gtk.gtk_scrolled_window_set_has_frame
import org.gtkkn.native.gtk.gtk_scrolled_window_set_kinetic_scrolling
import org.gtkkn.native.gtk.gtk_scrolled_window_set_max_content_height
import org.gtkkn.native.gtk.gtk_scrolled_window_set_max_content_width
import org.gtkkn.native.gtk.gtk_scrolled_window_set_min_content_height
import org.gtkkn.native.gtk.gtk_scrolled_window_set_min_content_width
import org.gtkkn.native.gtk.gtk_scrolled_window_set_overlay_scrolling
import org.gtkkn.native.gtk.gtk_scrolled_window_set_placement
import org.gtkkn.native.gtk.gtk_scrolled_window_set_policy
import org.gtkkn.native.gtk.gtk_scrolled_window_set_propagate_natural_height
import org.gtkkn.native.gtk.gtk_scrolled_window_set_propagate_natural_width
import org.gtkkn.native.gtk.gtk_scrolled_window_set_vadjustment
import org.gtkkn.native.gtk.gtk_scrolled_window_unset_placement
import kotlin.Boolean
import kotlin.Int
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkScrolledWindow` is a container that makes its child scrollable.
 *
 * It does so using either internally added scrollbars or externally
 * associated adjustments, and optionally draws a frame around the child.
 *
 * Widgets with native scrolling support, i.e. those whose classes implement
 * the [iface@Gtk.Scrollable] interface, are added directly. For other types
 * of widget, the class [class@Gtk.Viewport] acts as an adaptor, giving
 * scrollability to other widgets. [method@Gtk.ScrolledWindow.set_child]
 * intelligently accounts for whether or not the added child is a `GtkScrollable`.
 * If it isn’t, then it wraps the child in a `GtkViewport`. Therefore, you can
 * just add any child widget and not worry about the details.
 *
 * If [method@Gtk.ScrolledWindow.set_child] has added a `GtkViewport` for you,
 * it will be automatically removed when you unset the child.
 * Unless [property@Gtk.ScrolledWindow:hscrollbar-policy] and
 * [property@Gtk.ScrolledWindow:vscrollbar-policy] are %GTK_POLICY_NEVER or
 * %GTK_POLICY_EXTERNAL, `GtkScrolledWindow` adds internal `GtkScrollbar` widgets
 * around its child. The scroll position of the child, and if applicable the
 * scrollbars, is controlled by the [property@Gtk.ScrolledWindow:hadjustment]
 * and [property@Gtk.ScrolledWindow:vadjustment] that are associated with the
 * `GtkScrolledWindow`. See the docs on [class@Gtk.Scrollbar] for the details,
 * but note that the “step_increment” and “page_increment” fields are only
 * effective if the policy causes scrollbars to be present.
 *
 * If a `GtkScrolledWindow` doesn’t behave quite as you would like, or
 * doesn’t have exactly the right layout, it’s very possible to set up
 * your own scrolling with `GtkScrollbar` and for example a `GtkGrid`.
 *
 * # Touch support
 *
 * `GtkScrolledWindow` has built-in support for touch devices. When a
 * touchscreen is used, swiping will move the scrolled window, and will
 * expose 'kinetic' behavior. This can be turned off with the
 * [property@Gtk.ScrolledWindow:kinetic-scrolling] property if it is undesired.
 *
 * `GtkScrolledWindow` also displays visual 'overshoot' indication when
 * the content is pulled beyond the end, and this situation can be
 * captured with the [signal@Gtk.ScrolledWindow::edge-overshot] signal.
 *
 * If no mouse device is present, the scrollbars will overlaid as
 * narrow, auto-hiding indicators over the content. If traditional
 * scrollbars are desired although no mouse is present, this behaviour
 * can be turned off with the [property@Gtk.ScrolledWindow:overlay-scrolling]
 * property.
 *
 * # CSS nodes
 *
 * `GtkScrolledWindow` has a main CSS node with name scrolledwindow.
 * It gets a .frame style class added when [property@Gtk.ScrolledWindow:has-frame]
 * is true.
 *
 * It uses subnodes with names overshoot and undershoot to draw the overflow
 * and underflow indications. These nodes get the .left, .right, .top or .bottom
 * style class added depending on where the indication is drawn.
 *
 * `GtkScrolledWindow` also sets the positional style classes (.left, .right,
 * .top, .bottom) and style classes related to overlay scrolling
 * (.overlay-indicator, .dragging, .hovering) on its scrollbars.
 *
 * If both scrollbars are visible, the area where they meet is drawn
 * with a subnode named junction.
 *
 * # Accessibility
 *
 * Until GTK 4.10, `GtkScrolledWindow` used the `GTK_ACCESSIBLE_ROLE_GROUP` role.
 *
 * Starting from GTK 4.12, `GtkScrolledWindow` uses the `GTK_ACCESSIBLE_ROLE_GENERIC` role.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `hscrollbar_policy`: hscrollbar_policy: Out parameter is not supported
 * - method `hadjustment`: Property TypeInfo of getter and setter do not match
 * - method `hscrollbar-policy`: Property has no getter nor setter
 * - method `vadjustment`: Property TypeInfo of getter and setter do not match
 * - method `vscrollbar-policy`: Property has no getter nor setter
 * - method `window-placement`: Property has no getter nor setter
 */
public open class ScrolledWindow(
    pointer: CPointer<GtkScrolledWindow>,
) : Widget(pointer.reinterpret()), KGTyped {
    public val gtkScrolledWindowPointer: CPointer<GtkScrolledWindow>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The child widget.
     *
     * When setting this property, if the child widget does not implement
     * [iface@Gtk.Scrollable], the scrolled window will add the child to
     * a [class@Gtk.Viewport] and then set the viewport as the child.
     */
    public open var child: Widget?
        /**
         * Gets the child widget of @scrolled_window.
         *
         * If the scrolled window automatically added a [class@Gtk.Viewport], this
         * function will return the viewport widget, and you can retrieve its child
         * using [method@Gtk.Viewport.get_child].
         *
         * @return the child widget of @scrolled_window
         */
        get() =
            gtk_scrolled_window_get_child(gtkScrolledWindowPointer.reinterpret())?.run {
                Widget(reinterpret())
            }

        /**
         * Sets the child widget of @scrolled_window.
         *
         * If @child does not implement the [iface@Gtk.Scrollable] interface,
         * the scrolled window will add @child to a [class@Gtk.Viewport] instance
         * and then add the viewport as its child widget.
         *
         * @param child the child widget
         */
        set(child) =
            gtk_scrolled_window_set_child(
                gtkScrolledWindowPointer.reinterpret(),
                child?.gtkWidgetPointer?.reinterpret()
            )

    /**
     * Whether to draw a frame around the contents.
     */
    public open var hasFrame: Boolean
        /**
         * Gets whether the scrolled window draws a frame.
         *
         * @return true if the @scrolled_window has a frame
         */
        get() =
            gtk_scrolled_window_get_has_frame(gtkScrolledWindowPointer.reinterpret()).asBoolean()

        /**
         * Changes the frame drawn around the contents of @scrolled_window.
         *
         * @param hasFrame whether to draw a frame around scrolled window contents
         */
        set(hasFrame) =
            gtk_scrolled_window_set_has_frame(
                gtkScrolledWindowPointer.reinterpret(),
                hasFrame.asGBoolean()
            )

    /**
     * Whether kinetic scrolling is enabled or not.
     *
     * Kinetic scrolling only applies to devices with source %GDK_SOURCE_TOUCHSCREEN.
     */
    public open var kineticScrolling: Boolean
        /**
         * Returns the specified kinetic scrolling behavior.
         *
         * @return the scrolling behavior flags.
         */
        get() =
            gtk_scrolled_window_get_kinetic_scrolling(gtkScrolledWindowPointer.reinterpret()).asBoolean()

        /**
         * Turns kinetic scrolling on or off.
         *
         * Kinetic scrolling only applies to devices with source
         * %GDK_SOURCE_TOUCHSCREEN.
         *
         * @param kineticScrolling true to enable kinetic scrolling
         */
        set(kineticScrolling) =
            gtk_scrolled_window_set_kinetic_scrolling(
                gtkScrolledWindowPointer.reinterpret(),
                kineticScrolling.asGBoolean()
            )

    /**
     * The maximum content height of @scrolled_window.
     */
    public open var maxContentHeight: Int
        /**
         * Returns the maximum content height set.
         *
         * @return the maximum content height, or -1
         */
        get() = gtk_scrolled_window_get_max_content_height(gtkScrolledWindowPointer.reinterpret())

        /**
         * Sets the maximum height that @scrolled_window should keep visible.
         *
         * The @scrolled_window will grow up to this height before it starts
         * scrolling the content.
         *
         * It is a programming error to set the maximum content height to a value
         * smaller than [property@Gtk.ScrolledWindow:min-content-height].
         *
         * @param height the maximum content height
         */
        set(height) =
            gtk_scrolled_window_set_max_content_height(
                gtkScrolledWindowPointer.reinterpret(),
                height
            )

    /**
     * The maximum content width of @scrolled_window.
     */
    public open var maxContentWidth: Int
        /**
         * Returns the maximum content width set.
         *
         * @return the maximum content width, or -1
         */
        get() = gtk_scrolled_window_get_max_content_width(gtkScrolledWindowPointer.reinterpret())

        /**
         * Sets the maximum width that @scrolled_window should keep visible.
         *
         * The @scrolled_window will grow up to this width before it starts
         * scrolling the content.
         *
         * It is a programming error to set the maximum content width to a
         * value smaller than [property@Gtk.ScrolledWindow:min-content-width].
         *
         * @param width the maximum content width
         */
        set(width) =
            gtk_scrolled_window_set_max_content_width(
                gtkScrolledWindowPointer.reinterpret(),
                width
            )

    /**
     * The minimum content height of @scrolled_window.
     */
    public open var minContentHeight: Int
        /**
         * Gets the minimal content height of @scrolled_window.
         *
         * @return the minimal content height
         */
        get() = gtk_scrolled_window_get_min_content_height(gtkScrolledWindowPointer.reinterpret())

        /**
         * Sets the minimum height that @scrolled_window should keep visible.
         *
         * Note that this can and (usually will) be smaller than the minimum
         * size of the content.
         *
         * It is a programming error to set the minimum content height to a
         * value greater than [property@Gtk.ScrolledWindow:max-content-height].
         *
         * @param height the minimal content height
         */
        set(height) =
            gtk_scrolled_window_set_min_content_height(
                gtkScrolledWindowPointer.reinterpret(),
                height
            )

    /**
     * The minimum content width of @scrolled_window.
     */
    public open var minContentWidth: Int
        /**
         * Gets the minimum content width of @scrolled_window.
         *
         * @return the minimum content width
         */
        get() = gtk_scrolled_window_get_min_content_width(gtkScrolledWindowPointer.reinterpret())

        /**
         * Sets the minimum width that @scrolled_window should keep visible.
         *
         * Note that this can and (usually will) be smaller than the minimum
         * size of the content.
         *
         * It is a programming error to set the minimum content width to a
         * value greater than [property@Gtk.ScrolledWindow:max-content-width].
         *
         * @param width the minimal content width
         */
        set(width) =
            gtk_scrolled_window_set_min_content_width(
                gtkScrolledWindowPointer.reinterpret(),
                width
            )

    /**
     * Whether overlay scrolling is enabled or not.
     *
     * If it is, the scrollbars are only added as traditional widgets
     * when a mouse is present. Otherwise, they are overlaid on top of
     * the content, as narrow indicators.
     *
     * Note that overlay scrolling can also be globally disabled, with
     * the [property@Gtk.Settings:gtk-overlay-scrolling] setting.
     */
    public open var overlayScrolling: Boolean
        /**
         * Returns whether overlay scrolling is enabled for this scrolled window.
         *
         * @return true if overlay scrolling is enabled
         */
        get() =
            gtk_scrolled_window_get_overlay_scrolling(gtkScrolledWindowPointer.reinterpret()).asBoolean()

        /**
         * Enables or disables overlay scrolling for this scrolled window.
         *
         * @param overlayScrolling whether to enable overlay scrolling
         */
        set(overlayScrolling) =
            gtk_scrolled_window_set_overlay_scrolling(
                gtkScrolledWindowPointer.reinterpret(),
                overlayScrolling.asGBoolean()
            )

    /**
     * Whether the natural height of the child should be calculated and propagated
     * through the scrolled window’s requested natural height.
     *
     * This is useful in cases where an attempt should be made to allocate exactly
     * enough space for the natural size of the child.
     */
    public open var propagateNaturalHeight: Boolean
        /**
         * Reports whether the natural height of the child will be calculated
         * and propagated through the scrolled window’s requested natural height.
         *
         * @return whether natural height propagation is enabled.
         */
        get() =
            gtk_scrolled_window_get_propagate_natural_height(gtkScrolledWindowPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the natural height of the child should be calculated
         * and propagated through the scrolled window’s requested natural height.
         *
         * @param propagate whether to propagate natural height
         */
        set(propagate) =
            gtk_scrolled_window_set_propagate_natural_height(
                gtkScrolledWindowPointer.reinterpret(),
                propagate.asGBoolean()
            )

    /**
     * Whether the natural width of the child should be calculated and propagated
     * through the scrolled window’s requested natural width.
     *
     * This is useful in cases where an attempt should be made to allocate exactly
     * enough space for the natural size of the child.
     */
    public open var propagateNaturalWidth: Boolean
        /**
         * Reports whether the natural width of the child will be calculated
         * and propagated through the scrolled window’s requested natural width.
         *
         * @return whether natural width propagation is enabled.
         */
        get() =
            gtk_scrolled_window_get_propagate_natural_width(gtkScrolledWindowPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the natural width of the child should be calculated
         * and propagated through the scrolled window’s requested natural width.
         *
         * @param propagate whether to propagate natural width
         */
        set(propagate) =
            gtk_scrolled_window_set_propagate_natural_width(
                gtkScrolledWindowPointer.reinterpret(),
                propagate.asGBoolean()
            )

    /**
     * Creates a new scrolled window.
     *
     * @return a new scrolled window
     */
    public constructor() : this(gtk_scrolled_window_new()!!.reinterpret())

    /**
     * Gets the child widget of @scrolled_window.
     *
     * If the scrolled window automatically added a [class@Gtk.Viewport], this
     * function will return the viewport widget, and you can retrieve its child
     * using [method@Gtk.Viewport.get_child].
     *
     * @return the child widget of @scrolled_window
     */
    public open fun getChild(): Widget? =
        gtk_scrolled_window_get_child(gtkScrolledWindowPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Returns the horizontal scrollbar’s adjustment.
     *
     * This is the adjustment used to connect the horizontal scrollbar
     * to the child widget’s horizontal scroll functionality.
     *
     * @return the horizontal `GtkAdjustment`
     */
    public open fun getHadjustment(): Adjustment =
        gtk_scrolled_window_get_hadjustment(gtkScrolledWindowPointer.reinterpret())!!.run {
            Adjustment(reinterpret())
        }

    /**
     * Gets whether the scrolled window draws a frame.
     *
     * @return true if the @scrolled_window has a frame
     */
    public open fun getHasFrame(): Boolean =
        gtk_scrolled_window_get_has_frame(gtkScrolledWindowPointer.reinterpret()).asBoolean()

    /**
     * Returns the horizontal scrollbar of @scrolled_window.
     *
     * @return the horizontal scrollbar of the scrolled window.
     */
    public open fun getHscrollbar(): Widget =
        gtk_scrolled_window_get_hscrollbar(gtkScrolledWindowPointer.reinterpret())!!.run {
            Widget(reinterpret())
        }

    /**
     * Returns the specified kinetic scrolling behavior.
     *
     * @return the scrolling behavior flags.
     */
    public open fun getKineticScrolling(): Boolean =
        gtk_scrolled_window_get_kinetic_scrolling(gtkScrolledWindowPointer.reinterpret()).asBoolean()

    /**
     * Returns the maximum content height set.
     *
     * @return the maximum content height, or -1
     */
    public open fun getMaxContentHeight(): Int =
        gtk_scrolled_window_get_max_content_height(gtkScrolledWindowPointer.reinterpret())

    /**
     * Returns the maximum content width set.
     *
     * @return the maximum content width, or -1
     */
    public open fun getMaxContentWidth(): Int =
        gtk_scrolled_window_get_max_content_width(gtkScrolledWindowPointer.reinterpret())

    /**
     * Gets the minimal content height of @scrolled_window.
     *
     * @return the minimal content height
     */
    public open fun getMinContentHeight(): Int =
        gtk_scrolled_window_get_min_content_height(gtkScrolledWindowPointer.reinterpret())

    /**
     * Gets the minimum content width of @scrolled_window.
     *
     * @return the minimum content width
     */
    public open fun getMinContentWidth(): Int =
        gtk_scrolled_window_get_min_content_width(gtkScrolledWindowPointer.reinterpret())

    /**
     * Returns whether overlay scrolling is enabled for this scrolled window.
     *
     * @return true if overlay scrolling is enabled
     */
    public open fun getOverlayScrolling(): Boolean =
        gtk_scrolled_window_get_overlay_scrolling(gtkScrolledWindowPointer.reinterpret()).asBoolean()

    /**
     * Gets the placement of the contents with respect to the scrollbars.
     *
     * @return the current placement value.
     */
    public open fun getPlacement(): CornerType =
        gtk_scrolled_window_get_placement(gtkScrolledWindowPointer.reinterpret()).run {
            CornerType.fromNativeValue(this)
        }

    /**
     * Reports whether the natural height of the child will be calculated
     * and propagated through the scrolled window’s requested natural height.
     *
     * @return whether natural height propagation is enabled.
     */
    public open fun getPropagateNaturalHeight(): Boolean =
        gtk_scrolled_window_get_propagate_natural_height(gtkScrolledWindowPointer.reinterpret()).asBoolean()

    /**
     * Reports whether the natural width of the child will be calculated
     * and propagated through the scrolled window’s requested natural width.
     *
     * @return whether natural width propagation is enabled.
     */
    public open fun getPropagateNaturalWidth(): Boolean =
        gtk_scrolled_window_get_propagate_natural_width(gtkScrolledWindowPointer.reinterpret()).asBoolean()

    /**
     * Returns the vertical scrollbar’s adjustment.
     *
     * This is the adjustment used to connect the vertical
     * scrollbar to the child widget’s vertical scroll functionality.
     *
     * @return the vertical `GtkAdjustment`
     */
    public open fun getVadjustment(): Adjustment =
        gtk_scrolled_window_get_vadjustment(gtkScrolledWindowPointer.reinterpret())!!.run {
            Adjustment(reinterpret())
        }

    /**
     * Returns the vertical scrollbar of @scrolled_window.
     *
     * @return the vertical scrollbar of the scrolled window.
     */
    public open fun getVscrollbar(): Widget =
        gtk_scrolled_window_get_vscrollbar(gtkScrolledWindowPointer.reinterpret())!!.run {
            Widget(reinterpret())
        }

    /**
     * Sets the child widget of @scrolled_window.
     *
     * If @child does not implement the [iface@Gtk.Scrollable] interface,
     * the scrolled window will add @child to a [class@Gtk.Viewport] instance
     * and then add the viewport as its child widget.
     *
     * @param child the child widget
     */
    public open fun setChild(child: Widget? = null): Unit =
        gtk_scrolled_window_set_child(
            gtkScrolledWindowPointer.reinterpret(),
            child?.gtkWidgetPointer?.reinterpret()
        )

    /**
     * Sets the `GtkAdjustment` for the horizontal scrollbar.
     *
     * @param hadjustment the `GtkAdjustment` to use, or null to create a new one
     */
    public open fun setHadjustment(hadjustment: Adjustment? = null): Unit =
        gtk_scrolled_window_set_hadjustment(
            gtkScrolledWindowPointer.reinterpret(),
            hadjustment?.gtkAdjustmentPointer?.reinterpret()
        )

    /**
     * Changes the frame drawn around the contents of @scrolled_window.
     *
     * @param hasFrame whether to draw a frame around scrolled window contents
     */
    public open fun setHasFrame(hasFrame: Boolean): Unit =
        gtk_scrolled_window_set_has_frame(
            gtkScrolledWindowPointer.reinterpret(),
            hasFrame.asGBoolean()
        )

    /**
     * Turns kinetic scrolling on or off.
     *
     * Kinetic scrolling only applies to devices with source
     * %GDK_SOURCE_TOUCHSCREEN.
     *
     * @param kineticScrolling true to enable kinetic scrolling
     */
    public open fun setKineticScrolling(kineticScrolling: Boolean): Unit =
        gtk_scrolled_window_set_kinetic_scrolling(
            gtkScrolledWindowPointer.reinterpret(),
            kineticScrolling.asGBoolean()
        )

    /**
     * Sets the maximum height that @scrolled_window should keep visible.
     *
     * The @scrolled_window will grow up to this height before it starts
     * scrolling the content.
     *
     * It is a programming error to set the maximum content height to a value
     * smaller than [property@Gtk.ScrolledWindow:min-content-height].
     *
     * @param height the maximum content height
     */
    public open fun setMaxContentHeight(height: Int): Unit =
        gtk_scrolled_window_set_max_content_height(
            gtkScrolledWindowPointer.reinterpret(),
            height
        )

    /**
     * Sets the maximum width that @scrolled_window should keep visible.
     *
     * The @scrolled_window will grow up to this width before it starts
     * scrolling the content.
     *
     * It is a programming error to set the maximum content width to a
     * value smaller than [property@Gtk.ScrolledWindow:min-content-width].
     *
     * @param width the maximum content width
     */
    public open fun setMaxContentWidth(width: Int): Unit =
        gtk_scrolled_window_set_max_content_width(gtkScrolledWindowPointer.reinterpret(), width)

    /**
     * Sets the minimum height that @scrolled_window should keep visible.
     *
     * Note that this can and (usually will) be smaller than the minimum
     * size of the content.
     *
     * It is a programming error to set the minimum content height to a
     * value greater than [property@Gtk.ScrolledWindow:max-content-height].
     *
     * @param height the minimal content height
     */
    public open fun setMinContentHeight(height: Int): Unit =
        gtk_scrolled_window_set_min_content_height(
            gtkScrolledWindowPointer.reinterpret(),
            height
        )

    /**
     * Sets the minimum width that @scrolled_window should keep visible.
     *
     * Note that this can and (usually will) be smaller than the minimum
     * size of the content.
     *
     * It is a programming error to set the minimum content width to a
     * value greater than [property@Gtk.ScrolledWindow:max-content-width].
     *
     * @param width the minimal content width
     */
    public open fun setMinContentWidth(width: Int): Unit =
        gtk_scrolled_window_set_min_content_width(gtkScrolledWindowPointer.reinterpret(), width)

    /**
     * Enables or disables overlay scrolling for this scrolled window.
     *
     * @param overlayScrolling whether to enable overlay scrolling
     */
    public open fun setOverlayScrolling(overlayScrolling: Boolean): Unit =
        gtk_scrolled_window_set_overlay_scrolling(
            gtkScrolledWindowPointer.reinterpret(),
            overlayScrolling.asGBoolean()
        )

    /**
     * Sets the placement of the contents with respect to the scrollbars
     * for the scrolled window.
     *
     * The default is %GTK_CORNER_TOP_LEFT, meaning the child is
     * in the top left, with the scrollbars underneath and to the right.
     * Other values in [enum@Gtk.CornerType] are %GTK_CORNER_TOP_RIGHT,
     * %GTK_CORNER_BOTTOM_LEFT, and %GTK_CORNER_BOTTOM_RIGHT.
     *
     * See also [method@Gtk.ScrolledWindow.get_placement] and
     * [method@Gtk.ScrolledWindow.unset_placement].
     *
     * @param windowPlacement position of the child window
     */
    public open fun setPlacement(windowPlacement: CornerType): Unit =
        gtk_scrolled_window_set_placement(
            gtkScrolledWindowPointer.reinterpret(),
            windowPlacement.nativeValue
        )

    /**
     * Sets the scrollbar policy for the horizontal and vertical scrollbars.
     *
     * The policy determines when the scrollbar should appear; it is a value
     * from the [enum@Gtk.PolicyType] enumeration. If %GTK_POLICY_ALWAYS, the
     * scrollbar is always present; if %GTK_POLICY_NEVER, the scrollbar is
     * never present; if %GTK_POLICY_AUTOMATIC, the scrollbar is present only
     * if needed (that is, if the slider part of the bar would be smaller
     * than the trough — the display is larger than the page size).
     *
     * @param hscrollbarPolicy policy for horizontal bar
     * @param vscrollbarPolicy policy for vertical bar
     */
    public open fun setPolicy(
        hscrollbarPolicy: PolicyType,
        vscrollbarPolicy: PolicyType,
    ): Unit =
        gtk_scrolled_window_set_policy(
            gtkScrolledWindowPointer.reinterpret(),
            hscrollbarPolicy.nativeValue,
            vscrollbarPolicy.nativeValue
        )

    /**
     * Sets whether the natural height of the child should be calculated
     * and propagated through the scrolled window’s requested natural height.
     *
     * @param propagate whether to propagate natural height
     */
    public open fun setPropagateNaturalHeight(propagate: Boolean): Unit =
        gtk_scrolled_window_set_propagate_natural_height(
            gtkScrolledWindowPointer.reinterpret(),
            propagate.asGBoolean()
        )

    /**
     * Sets whether the natural width of the child should be calculated
     * and propagated through the scrolled window’s requested natural width.
     *
     * @param propagate whether to propagate natural width
     */
    public open fun setPropagateNaturalWidth(propagate: Boolean): Unit =
        gtk_scrolled_window_set_propagate_natural_width(
            gtkScrolledWindowPointer.reinterpret(),
            propagate.asGBoolean()
        )

    /**
     * Sets the `GtkAdjustment` for the vertical scrollbar.
     *
     * @param vadjustment the `GtkAdjustment` to use, or null to create a new one
     */
    public open fun setVadjustment(vadjustment: Adjustment? = null): Unit =
        gtk_scrolled_window_set_vadjustment(
            gtkScrolledWindowPointer.reinterpret(),
            vadjustment?.gtkAdjustmentPointer?.reinterpret()
        )

    /**
     * Unsets the placement of the contents with respect to the scrollbars.
     *
     * If no window placement is set for a scrolled window,
     * it defaults to %GTK_CORNER_TOP_LEFT.
     */
    public open fun unsetPlacement(): Unit = gtk_scrolled_window_unset_placement(gtkScrolledWindowPointer.reinterpret())

    /**
     * Emitted whenever user initiated scrolling makes the scrolled
     * window firmly surpass the limits defined by the adjustment
     * in that orientation.
     *
     * A similar behavior without edge resistance is provided by the
     * [signal@Gtk.ScrolledWindow::edge-reached] signal.
     *
     * Note: The @pos argument is LTR/RTL aware, so callers should be
     * aware too if intending to provide behavior on horizontal edges.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `pos` edge side that was hit
     */
    public fun connectEdgeOvershot(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (pos: PositionType) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "edge-overshot",
            connectEdgeOvershotFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted whenever user-initiated scrolling makes the scrolled
     * window exactly reach the lower or upper limits defined by the
     * adjustment in that orientation.
     *
     * A similar behavior with edge resistance is provided by the
     * [signal@Gtk.ScrolledWindow::edge-overshot] signal.
     *
     * Note: The @pos argument is LTR/RTL aware, so callers should be
     * aware too if intending to provide behavior on horizontal edges.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `pos` edge side that was reached
     */
    public fun connectEdgeReached(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (pos: PositionType) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "edge-reached",
            connectEdgeReachedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when focus is moved away from the scrolled window by a
     * keybinding.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * The default bindings for this signal are
     * `Ctrl + Tab` to move forward and `Ctrl + Shift + Tab` to
     * move backward.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `directionType` either %GTK_DIR_TAB_FORWARD
     * or
     *   %GTK_DIR_TAB_BACKWARD
     */
    public fun connectMoveFocusOut(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (directionType: DirectionType) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "move-focus-out",
            connectMoveFocusOutFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when a keybinding that scrolls is pressed.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * The horizontal or vertical adjustment is updated which triggers a
     * signal that the scrolled window’s child may listen to and scroll itself.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `scroll` a `GtkScrollType` describing how
     * much to scroll; `horizontal` whether the keybinding scrolls the child
     *   horizontally or not
     */
    public fun connectScrollChild(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (scroll: ScrollType, horizontal: Boolean) -> Boolean,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "scroll-child",
            connectScrollChildFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<ScrolledWindow> {
        override val type: GeneratedClassKGType<ScrolledWindow> =
            GeneratedClassKGType(gtk_scrolled_window_get_type()) {
                ScrolledWindow(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectEdgeOvershotFunc: CPointer<CFunction<(GtkPositionType) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            pos: GtkPositionType,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(pos: PositionType) -> Unit>().get().invoke(
            pos.run {
                PositionType.fromNativeValue(this)
            }
        )
    }
        .reinterpret()

private val connectEdgeReachedFunc: CPointer<CFunction<(GtkPositionType) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            pos: GtkPositionType,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(pos: PositionType) -> Unit>().get().invoke(
            pos.run {
                PositionType.fromNativeValue(this)
            }
        )
    }
        .reinterpret()

private val connectMoveFocusOutFunc: CPointer<CFunction<(GtkDirectionType) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            directionType: GtkDirectionType,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(directionType: DirectionType) -> Unit>().get().invoke(
            directionType.run {
                DirectionType.fromNativeValue(this)
            }
        )
    }
        .reinterpret()

private val connectScrollChildFunc: CPointer<CFunction<(GtkScrollType, Int) -> Int>> =
    staticCFunction {
            _: COpaquePointer,
            scroll: GtkScrollType,
            horizontal: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                scroll: ScrollType,
                horizontal: Boolean,
            ) -> Boolean
        >().get().invoke(
            scroll.run {
                ScrollType.fromNativeValue(this)
            },
            horizontal.asBoolean()
        ).asGBoolean()
    }
        .reinterpret()
