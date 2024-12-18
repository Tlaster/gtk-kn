// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.gtk_buildable_get_buildable_id
import org.gtkkn.native.gtk.gtk_buildable_get_type
import kotlin.String

/**
 * `GtkBuildable` allows objects to extend and customize their deserialization
 * from ui files.
 *
 * The interface includes methods for setting names and properties of objects,
 * parsing custom tags and constructing child objects.
 *
 * The `GtkBuildable` interface is implemented by all widgets and
 * many of the non-widget objects that are provided by GTK. The
 * main user of this interface is [class@Gtk.Builder]. There should be
 * very little need for applications to call any of these functions directly.
 *
 * An object only needs to implement this interface if it needs to extend the
 * `GtkBuilder` XML format or run any extra routines at deserialization time.
 */
public interface Buildable :
    Interface,
    KGTyped {
    public val gtkBuildablePointer: CPointer<GtkBuildable>

    /**
     * Gets the ID of the @buildable object.
     *
     * `GtkBuilder` sets the name based on the ID attribute
     * of the `<object>` tag used to construct the @buildable.
     *
     * @return the ID of the buildable object
     */
    public fun getBuildableId(): String? =
        gtk_buildable_get_buildable_id(gtkBuildablePointer.reinterpret())?.toKString()

    private data class Wrapper(private val pointer: CPointer<GtkBuildable>) : Buildable {
        override val gtkBuildablePointer: CPointer<GtkBuildable> = pointer
    }

    public companion object : TypeCompanion<Buildable> {
        override val type: GeneratedInterfaceKGType<Buildable> =
            GeneratedInterfaceKGType(gtk_buildable_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GtkBuildable>): Buildable = Wrapper(pointer)

        /**
         * Get the GType of Buildable
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_buildable_get_type()
    }
}
