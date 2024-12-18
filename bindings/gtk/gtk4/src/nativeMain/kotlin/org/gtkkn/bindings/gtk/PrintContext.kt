// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.pango.Context
import org.gtkkn.bindings.pango.FontMap
import org.gtkkn.bindings.pango.Layout
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.gdouble
import org.gtkkn.native.gtk.GtkPrintContext
import org.gtkkn.native.gtk.gtk_print_context_create_pango_context
import org.gtkkn.native.gtk.gtk_print_context_create_pango_layout
import org.gtkkn.native.gtk.gtk_print_context_get_dpi_x
import org.gtkkn.native.gtk.gtk_print_context_get_dpi_y
import org.gtkkn.native.gtk.gtk_print_context_get_height
import org.gtkkn.native.gtk.gtk_print_context_get_page_setup
import org.gtkkn.native.gtk.gtk_print_context_get_pango_fontmap
import org.gtkkn.native.gtk.gtk_print_context_get_type
import org.gtkkn.native.gtk.gtk_print_context_get_width

/**
 * A `GtkPrintContext` encapsulates context information that is required when
 * drawing pages for printing.
 *
 * This includes the cairo context and important parameters like page size
 * and resolution. It also lets you easily create [class@Pango.Layout] and
 * [class@Pango.Context] objects that match the font metrics of the cairo surface.
 *
 * `GtkPrintContext` objects get passed to the
 * [signal@Gtk.PrintOperation::begin-print],
 * [signal@Gtk.PrintOperation::end-print],
 * [signal@Gtk.PrintOperation::request-page-setup] and
 * [signal@Gtk.PrintOperation::draw-page] signals on the
 * [class@Gtk.PrintOperation] object.
 *
 * ## Using GtkPrintContext in a ::draw-page callback
 *
 * ```c
 * static void
 * draw_page (GtkPrintOperation *operation,
 *            GtkPrintContext   *context,
 *            int                page_nr)
 * {
 *   cairo_t *cr;
 *   PangoLayout *layout;
 *   PangoFontDescription *desc;
 *
 *   cr = gtk_print_context_get_cairo_context (context);
 *
 *   // Draw a red rectangle, as wide as the paper (inside the margins)
 *   cairo_set_source_rgb (cr, 1.0, 0, 0);
 *   cairo_rectangle (cr, 0, 0, gtk_print_context_get_width (context), 50);
 *
 *   cairo_fill (cr);
 *
 *   // Draw some lines
 *   cairo_move_to (cr, 20, 10);
 *   cairo_line_to (cr, 40, 20);
 *   cairo_arc (cr, 60, 60, 20, 0, M_PI);
 *   cairo_line_to (cr, 80, 20);
 *
 *   cairo_set_source_rgb (cr, 0, 0, 0);
 *   cairo_set_line_width (cr, 5);
 *   cairo_set_line_cap (cr, CAIRO_LINE_CAP_ROUND);
 *   cairo_set_line_join (cr, CAIRO_LINE_JOIN_ROUND);
 *
 *   cairo_stroke (cr);
 *
 *   // Draw some text
 *   layout = gtk_print_context_create_pango_layout (context);
 *   pango_layout_set_text (layout, "Hello World! Printing is easy", -1);
 *   desc = pango_font_description_from_string ("sans 28");
 *   pango_layout_set_font_description (layout, desc);
 *   pango_font_description_free (desc);
 *
 *   cairo_move_to (cr, 30, 20);
 *   pango_cairo_layout_path (cr, layout);
 *
 *   // Font Outline
 *   cairo_set_source_rgb (cr, 0.93, 1.0, 0.47);
 *   cairo_set_line_width (cr, 0.5);
 *   cairo_stroke_preserve (cr);
 *
 *   // Font Fill
 *   cairo_set_source_rgb (cr, 0, 0.0, 1.0);
 *   cairo_fill (cr);
 *
 *   g_object_unref (layout);
 * }
 * ```
 *
 * ## Skipped during bindings generation
 *
 * - method `get_cairo_context`: Return type cairo.Context is unsupported
 * - parameter `top`: top: Out parameter is not supported
 * - parameter `cr`: cairo.Context
 */
public open class PrintContext(pointer: CPointer<GtkPrintContext>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val gtkPrintContextPointer: CPointer<GtkPrintContext>
        get() = gPointer.reinterpret()

    /**
     * Creates a new `PangoContext` that can be used with the
     * `GtkPrintContext`.
     *
     * @return a new Pango context for @context
     */
    public open fun createPangoContext(): Context =
        gtk_print_context_create_pango_context(gtkPrintContextPointer.reinterpret())!!.run {
            Context(reinterpret())
        }

    /**
     * Creates a new `PangoLayout` that is suitable for use
     * with the `GtkPrintContext`.
     *
     * @return a new Pango layout for @context
     */
    public open fun createPangoLayout(): Layout =
        gtk_print_context_create_pango_layout(gtkPrintContextPointer.reinterpret())!!.run {
            Layout(reinterpret())
        }

    /**
     * Obtains the horizontal resolution of the `GtkPrintContext`,
     * in dots per inch.
     *
     * @return the horizontal resolution of @context
     */
    public open fun getDpiX(): gdouble = gtk_print_context_get_dpi_x(gtkPrintContextPointer.reinterpret())

    /**
     * Obtains the vertical resolution of the `GtkPrintContext`,
     * in dots per inch.
     *
     * @return the vertical resolution of @context
     */
    public open fun getDpiY(): gdouble = gtk_print_context_get_dpi_y(gtkPrintContextPointer.reinterpret())

    /**
     * Obtains the height of the `GtkPrintContext`, in pixels.
     *
     * @return the height of @context
     */
    public open fun getHeight(): gdouble = gtk_print_context_get_height(gtkPrintContextPointer.reinterpret())

    /**
     * Obtains the `GtkPageSetup` that determines the page
     * dimensions of the `GtkPrintContext`.
     *
     * @return the page setup of @context
     */
    public open fun getPageSetup(): PageSetup =
        gtk_print_context_get_page_setup(gtkPrintContextPointer.reinterpret())!!.run {
            PageSetup(reinterpret())
        }

    /**
     * Returns a `PangoFontMap` that is suitable for use
     * with the `GtkPrintContext`.
     *
     * @return the font map of @context
     */
    public open fun getPangoFontmap(): FontMap =
        gtk_print_context_get_pango_fontmap(gtkPrintContextPointer.reinterpret())!!.run {
            FontMap(reinterpret())
        }

    /**
     * Obtains the width of the `GtkPrintContext`, in pixels.
     *
     * @return the width of @context
     */
    public open fun getWidth(): gdouble = gtk_print_context_get_width(gtkPrintContextPointer.reinterpret())

    public companion object : TypeCompanion<PrintContext> {
        override val type: GeneratedClassKGType<PrintContext> =
            GeneratedClassKGType(gtk_print_context_get_type()) { PrintContext(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of PrintContext
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_print_context_get_type()
    }
}
