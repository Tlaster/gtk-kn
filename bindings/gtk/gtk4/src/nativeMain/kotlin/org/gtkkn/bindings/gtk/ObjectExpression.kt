// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkObjectExpression
import org.gtkkn.native.gtk.gtk_object_expression_get_object
import org.gtkkn.native.gtk.gtk_object_expression_get_type
import org.gtkkn.native.gtk.gtk_object_expression_new

/**
 * A `GObject` value in a `GtkExpression`.
 */
public open class ObjectExpression(
    pointer: CPointer<GtkObjectExpression>,
) : Expression(pointer.reinterpret()),
    KGTyped {
    public val gtkObjectExpressionPointer: CPointer<GtkObjectExpression>
        get() = gPointer.reinterpret()

    /**
     * Creates an expression evaluating to the given `object` with a weak reference.
     *
     * Once the `object` is disposed, it will fail to evaluate.
     *
     * This expression is meant to break reference cycles.
     *
     * If you want to keep a reference to `object`, use [ctor@Gtk.ConstantExpression.new].
     *
     * @param object object to watch
     * @return a new `GtkExpression`
     */
    public constructor(
        `object`: Object,
    ) : this(gtk_object_expression_new(`object`.gPointer.reinterpret())!!.reinterpret())

    /**
     * Gets the object that the expression evaluates to.
     *
     * @return the object, or `NULL`
     */
    public open fun getObject(): Object? =
        gtk_object_expression_get_object(gtkObjectExpressionPointer.reinterpret())?.run {
            Object(reinterpret())
        }

    public companion object : TypeCompanion<ObjectExpression> {
        override val type: GeneratedClassKGType<ObjectExpression> =
            GeneratedClassKGType(gtk_object_expression_get_type()) { ObjectExpression(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}