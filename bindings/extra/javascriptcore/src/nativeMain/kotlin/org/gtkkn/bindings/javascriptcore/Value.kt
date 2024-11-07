// This is a generated file. Do not modify.
package org.gtkkn.bindings.javascriptcore

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.bindings.gobject.Callback
import org.gtkkn.bindings.gobject.CallbackFunc
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.javascriptcore.annotations.JavaScriptCoreVersion2_28
import org.gtkkn.bindings.javascriptcore.annotations.JavaScriptCoreVersion2_38
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.common.toCStringList
import org.gtkkn.extensions.common.toKStringList
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.javascriptcore.JSCValue
import org.gtkkn.native.javascriptcore.jsc_value_array_buffer_get_size
import org.gtkkn.native.javascriptcore.jsc_value_get_context
import org.gtkkn.native.javascriptcore.jsc_value_get_type
import org.gtkkn.native.javascriptcore.jsc_value_is_array
import org.gtkkn.native.javascriptcore.jsc_value_is_array_buffer
import org.gtkkn.native.javascriptcore.jsc_value_is_boolean
import org.gtkkn.native.javascriptcore.jsc_value_is_constructor
import org.gtkkn.native.javascriptcore.jsc_value_is_function
import org.gtkkn.native.javascriptcore.jsc_value_is_null
import org.gtkkn.native.javascriptcore.jsc_value_is_number
import org.gtkkn.native.javascriptcore.jsc_value_is_object
import org.gtkkn.native.javascriptcore.jsc_value_is_string
import org.gtkkn.native.javascriptcore.jsc_value_is_typed_array
import org.gtkkn.native.javascriptcore.jsc_value_is_undefined
import org.gtkkn.native.javascriptcore.jsc_value_new_array_from_strv
import org.gtkkn.native.javascriptcore.jsc_value_new_boolean
import org.gtkkn.native.javascriptcore.jsc_value_new_from_json
import org.gtkkn.native.javascriptcore.jsc_value_new_function_variadic
import org.gtkkn.native.javascriptcore.jsc_value_new_null
import org.gtkkn.native.javascriptcore.jsc_value_new_number
import org.gtkkn.native.javascriptcore.jsc_value_new_string
import org.gtkkn.native.javascriptcore.jsc_value_new_string_from_bytes
import org.gtkkn.native.javascriptcore.jsc_value_new_typed_array
import org.gtkkn.native.javascriptcore.jsc_value_new_typed_array_with_buffer
import org.gtkkn.native.javascriptcore.jsc_value_new_undefined
import org.gtkkn.native.javascriptcore.jsc_value_object_define_property_data
import org.gtkkn.native.javascriptcore.jsc_value_object_delete_property
import org.gtkkn.native.javascriptcore.jsc_value_object_enumerate_properties
import org.gtkkn.native.javascriptcore.jsc_value_object_get_property
import org.gtkkn.native.javascriptcore.jsc_value_object_get_property_at_index
import org.gtkkn.native.javascriptcore.jsc_value_object_has_property
import org.gtkkn.native.javascriptcore.jsc_value_object_is_instance_of
import org.gtkkn.native.javascriptcore.jsc_value_object_set_property
import org.gtkkn.native.javascriptcore.jsc_value_object_set_property_at_index
import org.gtkkn.native.javascriptcore.jsc_value_to_boolean
import org.gtkkn.native.javascriptcore.jsc_value_to_double
import org.gtkkn.native.javascriptcore.jsc_value_to_int32
import org.gtkkn.native.javascriptcore.jsc_value_to_json
import org.gtkkn.native.javascriptcore.jsc_value_to_string_as_bytes
import org.gtkkn.native.javascriptcore.jsc_value_typed_array_get_buffer
import org.gtkkn.native.javascriptcore.jsc_value_typed_array_get_length
import org.gtkkn.native.javascriptcore.jsc_value_typed_array_get_offset
import org.gtkkn.native.javascriptcore.jsc_value_typed_array_get_size
import org.gtkkn.native.javascriptcore.jsc_value_typed_array_get_type
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List

/**
 * JSCValue represents a reference to a value in a #JSCContext. The JSCValue
 * protects the referenced value from being garbage collected.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `size`: Unsupported pointer to primitive type
 * - parameter `parameters`: Array parameter of type Value is not supported
 * - parameter `parameters`: Array parameter of type Value is not supported
 * - parameter `setter`: GObject.Callback
 * - parameter `parameters`: Array parameter of type Value is not supported
 * - method `to_string`: C function jsc_value_to_string is ignored
 * - parameter `length`: length: Out parameter is not supported
 * - parameter `data`: gpointer
 * - parameter `array`: Array parameter of type Value is not supported
 * - parameter `parameter_types`: Array parameter of type GType is not supported
 * - parameter `instance`: gpointer
 */
public class Value(
    pointer: CPointer<JSCValue>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val javascriptcoreValuePointer: CPointer<JSCValue>
        get() = gPointer.reinterpret()

    /**
     * The #JSCContext in which the value was created.
     */
    public val context: Context
        /**
         * Get the #JSCContext in which @value was created.
         *
         * @return the #JSCValue context.
         */
        get() =
            jsc_value_get_context(javascriptcoreValuePointer.reinterpret())!!.run {
                Context(reinterpret())
            }

    /**
     * Create a new #JSCValue referencing an array of strings with the items from @strv. If @array
     * is null or empty a new empty array will be created.
     *
     * @param context a #JSCContext
     * @param strv a null-terminated array of strings
     * @return a #JSCValue.
     */
    public constructor(context: Context, strv: List<String>) : this(
        memScoped {
            jsc_value_new_array_from_strv(
                context.javascriptcoreContextPointer.reinterpret(),
                strv.toCStringList(this)
            )!!.reinterpret()
        }
    )

    /**
     * Create a new #JSCValue from @value
     *
     * @param context a #JSCContext
     * @param value a #gboolean
     * @return a #JSCValue.
     */
    public constructor(
        context: Context,
        `value`: Boolean,
    ) : this(
        jsc_value_new_boolean(context.javascriptcoreContextPointer.reinterpret(), `value`.asGBoolean())!!.reinterpret()
    )

    /**
     * Create a new #JSCValue referencing a new value created by parsing @json.
     *
     * @param context a #JSCContext
     * @param json the JSON string to be parsed
     * @return a #JSCValue.
     * @since 2.28
     */
    public constructor(
        context: Context,
        json: String,
    ) : this(jsc_value_new_from_json(context.javascriptcoreContextPointer.reinterpret(), json)!!.reinterpret())

    /**
     * Create a function in @context. If @name is null an anonymous function will be created.
     * When the function is called by JavaScript or jsc_value_function_call(), @callback is called
     * receiving an #GPtrArray of #JSCValue<!-- -->s with the arguments and then @user_data as last parameter.
     * When the function is cleared in @context, @destroy_notify is called with @user_data as parameter.
     *
     * Note that the value returned by @callback must be fully transferred. In case of boxed types, you could use
     * %G_TYPE_POINTER instead of the actual boxed #GType to ensure that the instance owned by #JSCClass is used.
     * If you really want to return a new copy of the boxed type, use #JSC_TYPE_VALUE and return a #JSCValue created
     * with jsc_value_new_object() that receives the copy as instance parameter.
     *
     * @param context a #JSCContext
     * @param name the function name or null
     * @param callback a #GCallback.
     * @param returnType the #GType of the function return value, or %G_TYPE_NONE if the function is void.
     * @return a #JSCValue.
     */
    public constructor(
        context: Context,
        name: String? = null,
        callback: Callback,
        returnType: ULong,
    ) : this(
        jsc_value_new_function_variadic(
            context.javascriptcoreContextPointer.reinterpret(),
            name,
            CallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            returnType
        )!!.reinterpret()
    )

    /**
     * Create a new #JSCValue referencing <function>null</function> in @context.
     *
     * @param context a #JSCContext
     * @return a #JSCValue.
     */
    public constructor(
        context: Context,
    ) : this(jsc_value_new_null(context.javascriptcoreContextPointer.reinterpret())!!.reinterpret())

    /**
     * Create a new #JSCValue from @number.
     *
     * @param context a #JSCContext
     * @param number a number
     * @return a #JSCValue.
     */
    public constructor(
        context: Context,
        number: Double,
    ) : this(jsc_value_new_number(context.javascriptcoreContextPointer.reinterpret(), number)!!.reinterpret())

    /**
     * Create a new #JSCValue from @string. If you need to create a #JSCValue from a
     * string containing null characters, use jsc_value_new_string_from_bytes() instead.
     *
     * @param context a #JSCContext
     * @param string a null-terminated string
     * @return a #JSCValue.
     */
    public constructor(
        context: Context,
        string: String? = null,
    ) : this(jsc_value_new_string(context.javascriptcoreContextPointer.reinterpret(), string)!!.reinterpret())

    /**
     * Create a new #JSCValue from @bytes.
     *
     * @param context a #JSCContext
     * @param bytes a #GBytes
     * @return a #JSCValue.
     */
    public constructor(
        context: Context,
        bytes: Bytes? = null,
    ) : this(
        jsc_value_new_string_from_bytes(
            context.javascriptcoreContextPointer.reinterpret(),
            bytes?.glibBytesPointer
        )!!.reinterpret()
    )

    /**
     * Create a new typed array containing a given amount of elements.
     *
     * Create a #JSCValue referencing a new typed array with space for @length
     * elements of a given @type. As all typed arrays must have an associated
     * `ArrayBuffer`, a new one of suitable size will be allocated to store
     * the elements, which will be initialized to zero.
     *
     * The @type must *not* be %JSC_TYPED_ARRAY_NONE.
     *
     * @param context a #JSCContext
     * @param type the type of array elements
     * @param length number of elements in the array
     * @return a #JSCValue
     * @since 2.38
     */
    public constructor(
        context: Context,
        type: TypedArrayType,
        length: ULong,
    ) : this(
        jsc_value_new_typed_array(
            context.javascriptcoreContextPointer.reinterpret(),
            type.nativeValue,
            length
        )!!.reinterpret()
    )

    /**
     * Gets the size in bytes of the array buffer.
     *
     * Obtains the size in bytes of the memory region that holds the contents of
     * an %ArrayBuffer.
     *
     * @return size, in bytes.
     * @since 2.38
     */
    @JavaScriptCoreVersion2_38
    public fun arrayBufferGetSize(): ULong = jsc_value_array_buffer_get_size(javascriptcoreValuePointer.reinterpret())

    /**
     * Get the #JSCContext in which @value was created.
     *
     * @return the #JSCValue context.
     */
    public fun getContext(): Context =
        jsc_value_get_context(javascriptcoreValuePointer.reinterpret())!!.run {
            Context(reinterpret())
        }

    /**
     * Get whether the value referenced by @value is an array.
     *
     * @return whether the value is an array.
     */
    public fun isArray(): Boolean = jsc_value_is_array(javascriptcoreValuePointer.reinterpret()).asBoolean()

    /**
     * Check whether the @value is an %ArrayBuffer.
     *
     * @return whether the value is an %ArrayBuffer
     * @since 2.38
     */
    @JavaScriptCoreVersion2_38
    public fun isArrayBuffer(): Boolean =
        jsc_value_is_array_buffer(javascriptcoreValuePointer.reinterpret()).asBoolean()

    /**
     * Get whether the value referenced by @value is a boolean.
     *
     * @return whether the value is a boolean.
     */
    public fun isBoolean(): Boolean = jsc_value_is_boolean(javascriptcoreValuePointer.reinterpret()).asBoolean()

    /**
     * Get whether the value referenced by @value is a constructor.
     *
     * @return whether the value is a constructor.
     */
    public fun isConstructor(): Boolean = jsc_value_is_constructor(javascriptcoreValuePointer.reinterpret()).asBoolean()

    /**
     * Get whether the value referenced by @value is a function
     *
     * @return whether the value is a function.
     */
    public fun isFunction(): Boolean = jsc_value_is_function(javascriptcoreValuePointer.reinterpret()).asBoolean()

    /**
     * Get whether the value referenced by @value is <function>null</function>.
     *
     * @return whether the value is null.
     */
    public fun isNull(): Boolean = jsc_value_is_null(javascriptcoreValuePointer.reinterpret()).asBoolean()

    /**
     * Get whether the value referenced by @value is a number.
     *
     * @return whether the value is a number.
     */
    public fun isNumber(): Boolean = jsc_value_is_number(javascriptcoreValuePointer.reinterpret()).asBoolean()

    /**
     * Get whether the value referenced by @value is an object.
     *
     * @return whether the value is an object.
     */
    public fun isObject(): Boolean = jsc_value_is_object(javascriptcoreValuePointer.reinterpret()).asBoolean()

    /**
     * Get whether the value referenced by @value is a string
     *
     * @return whether the value is a string
     */
    public fun isString(): Boolean = jsc_value_is_string(javascriptcoreValuePointer.reinterpret()).asBoolean()

    /**
     * Determines whether a value is a typed array.
     *
     * @return Whether @value is a typed array.
     * @since 2.38
     */
    @JavaScriptCoreVersion2_38
    public fun isTypedArray(): Boolean = jsc_value_is_typed_array(javascriptcoreValuePointer.reinterpret()).asBoolean()

    /**
     * Get whether the value referenced by @value is <function>undefined</function>.
     *
     * @return whether the value is undefined.
     */
    public fun isUndefined(): Boolean = jsc_value_is_undefined(javascriptcoreValuePointer.reinterpret()).asBoolean()

    /**
     * Create a new typed array value with elements from an array buffer.
     *
     * Create a #JSCValue referencing a new typed array value containing
     * elements of the given @type, where the elements are stored at the memory
     * region represented by the @array_buffer.
     *
     * The @type must *not* be %JSC_TYPED_ARRAY_NONE.
     *
     * The @offset and @length parameters can be used to indicate which part of
     * the array buffer can be accessed through the typed array. If both are
     * omitted (passing zero as @offset, and `-1` as @length), the whole
     * @array_buffer is exposed through the typed array. Omitting the @length
     * with a non-zero @offset will expose the remainder of the @array_buffer
     * starting at the indicated offset.
     *
     * @param type type of array elements.
     * @param offset offset, in bytes.
     * @param length number of array elements, or `-1`.
     * @return a #JSCValue
     * @since 2.38
     */
    @JavaScriptCoreVersion2_38
    public fun newTypedArrayWithBuffer(
        type: TypedArrayType,
        offset: ULong,
        length: Long,
    ): Value =
        jsc_value_new_typed_array_with_buffer(
            javascriptcoreValuePointer.reinterpret(),
            type.nativeValue,
            offset,
            length
        )!!.run {
            Value(reinterpret())
        }

    /**
     * Define or modify a property with @property_name in object referenced by @value. This is equivalent to
     * JavaScript <function>Object.defineProperty()</function> when used with a data descriptor.
     *
     * @param propertyName the name of the property to define
     * @param flags #JSCValuePropertyFlags
     * @param propertyValue the default property value
     */
    public fun objectDefinePropertyData(
        propertyName: String,
        flags: ValuePropertyFlags,
        propertyValue: Value? = null,
    ): Unit =
        jsc_value_object_define_property_data(
            javascriptcoreValuePointer.reinterpret(),
            propertyName,
            flags.mask,
            propertyValue?.javascriptcoreValuePointer?.reinterpret()
        )

    /**
     * Try to delete property with @name from @value. This function will return false if
     * the property was defined without %JSC_VALUE_PROPERTY_CONFIGURABLE flag.
     *
     * @param name the property name
     * @return true if the property was deleted, or false otherwise.
     */
    public fun objectDeleteProperty(name: String): Boolean =
        jsc_value_object_delete_property(javascriptcoreValuePointer.reinterpret(), name).asBoolean()

    /**
     * Get the list of property names of @value. Only properties defined with %JSC_VALUE_PROPERTY_ENUMERABLE
     * flag will be collected.
     *
     * @return a null-terminated array of strings containing the
     *    property names, or null if @value doesn't have enumerable properties.  Use g_strfreev() to free.
     */
    public fun objectEnumerateProperties(): List<String>? =
        jsc_value_object_enumerate_properties(javascriptcoreValuePointer.reinterpret())?.toKStringList()

    /**
     * Get property with @name from @value.
     *
     * @param name the property name
     * @return the property #JSCValue.
     */
    public fun objectGetProperty(name: String): Value =
        jsc_value_object_get_property(javascriptcoreValuePointer.reinterpret(), name)!!.run {
            Value(reinterpret())
        }

    /**
     * Get property at @index from @value.
     *
     * @param index the property index
     * @return the property #JSCValue.
     */
    public fun objectGetPropertyAtIndex(index: UInt): Value =
        jsc_value_object_get_property_at_index(javascriptcoreValuePointer.reinterpret(), index)!!.run {
            Value(reinterpret())
        }

    /**
     * Get whether @value has property with @name.
     *
     * @param name the property name
     * @return true if @value has a property with @name, or false otherwise
     */
    public fun objectHasProperty(name: String): Boolean =
        jsc_value_object_has_property(javascriptcoreValuePointer.reinterpret(), name).asBoolean()

    /**
     * Get whether the value referenced by @value is an instance of class @name.
     *
     * @param name a class name
     * @return whether the value is an object instance of class @name.
     */
    public fun objectIsInstanceOf(name: String): Boolean =
        jsc_value_object_is_instance_of(javascriptcoreValuePointer.reinterpret(), name).asBoolean()

    /**
     * Set @property with @name on @value.
     *
     * @param name the property name
     * @param property the #JSCValue to set
     */
    public fun objectSetProperty(
        name: String,
        `property`: Value,
    ): Unit =
        jsc_value_object_set_property(
            javascriptcoreValuePointer.reinterpret(),
            name,
            `property`.javascriptcoreValuePointer.reinterpret()
        )

    /**
     * Set @property at @index on @value.
     *
     * @param index the property index
     * @param property the #JSCValue to set
     */
    public fun objectSetPropertyAtIndex(
        index: UInt,
        `property`: Value,
    ): Unit =
        jsc_value_object_set_property_at_index(
            javascriptcoreValuePointer.reinterpret(),
            index,
            `property`.javascriptcoreValuePointer.reinterpret()
        )

    /**
     * Convert @value to a boolean.
     *
     * @return a #gboolean result of the conversion.
     */
    public fun toBoolean(): Boolean = jsc_value_to_boolean(javascriptcoreValuePointer.reinterpret()).asBoolean()

    /**
     * Convert @value to a double.
     *
     * @return a #gdouble result of the conversion.
     */
    public fun toDouble(): Double = jsc_value_to_double(javascriptcoreValuePointer.reinterpret())

    /**
     * Convert @value to a #gint32.
     *
     * @return a #gint32 result of the conversion.
     */
    public fun toInt32(): Int = jsc_value_to_int32(javascriptcoreValuePointer.reinterpret())

    /**
     * Create a JSON string of @value serialization. If @indent is 0, the resulting JSON will
     * not contain newlines. The size of the indent is clamped to 10 spaces.
     *
     * @param indent The number of spaces to indent when nesting.
     * @return a null-terminated JSON string with serialization of @value
     * @since 2.28
     */
    @JavaScriptCoreVersion2_28
    public fun toJson(indent: UInt): String =
        jsc_value_to_json(javascriptcoreValuePointer.reinterpret(), indent)?.toKString()
            ?: error("Expected not null string")

    /**
     * Convert @value to a string and return the results as #GBytes. This is needed
     * to handle strings with null characters.
     *
     * @return a #GBytes with the result of the conversion.
     */
    public fun toStringAsBytes(): Bytes =
        jsc_value_to_string_as_bytes(javascriptcoreValuePointer.reinterpret())!!.run {
            Bytes(reinterpret())
        }

    /**
     * Obtain the %ArrayBuffer for the memory region of the typed array elements.
     *
     * @return A #JSCValue
     * @since 2.38
     */
    @JavaScriptCoreVersion2_38
    public fun typedArrayGetBuffer(): Value =
        jsc_value_typed_array_get_buffer(javascriptcoreValuePointer.reinterpret())!!.run {
            Value(reinterpret())
        }

    /**
     * Gets the number of elements in a typed array.
     *
     * @return number of elements.
     * @since 2.38
     */
    @JavaScriptCoreVersion2_38
    public fun typedArrayGetLength(): ULong = jsc_value_typed_array_get_length(javascriptcoreValuePointer.reinterpret())

    /**
     * Gets the offset over the underlying array buffer data.
     *
     * @return offset, in bytes.
     * @since 2.38
     */
    @JavaScriptCoreVersion2_38
    public fun typedArrayGetOffset(): ULong = jsc_value_typed_array_get_offset(javascriptcoreValuePointer.reinterpret())

    /**
     * Gets the size of a typed array.
     *
     * @return size, in bytes.
     * @since 2.38
     */
    @JavaScriptCoreVersion2_38
    public fun typedArrayGetSize(): ULong = jsc_value_typed_array_get_size(javascriptcoreValuePointer.reinterpret())

    /**
     * Gets the type of elements contained in a typed array.
     *
     * @return type of the elements, or %JSC_TYPED_ARRAY_NONE if @value is not a typed array.
     * @since 2.38
     */
    @JavaScriptCoreVersion2_38
    public fun typedArrayGetType(): TypedArrayType =
        jsc_value_typed_array_get_type(javascriptcoreValuePointer.reinterpret()).run {
            TypedArrayType.fromNativeValue(this)
        }

    public companion object : TypeCompanion<Value> {
        override val type: GeneratedClassKGType<Value> =
            GeneratedClassKGType(jsc_value_get_type()) { Value(it.reinterpret()) }

        init {
            JavascriptcoreTypeProvider.register()
        }

        /**
         * Create a new #JSCValue referencing <function>null</function> in @context.
         *
         * @param context a #JSCContext
         * @return a #JSCValue.
         */
        public fun newNull(context: Context): Value =
            Value(jsc_value_new_null(context.javascriptcoreContextPointer.reinterpret())!!.reinterpret())

        /**
         * Create a new #JSCValue referencing <function>undefined</function> in @context.
         *
         * @param context a #JSCContext
         * @return a #JSCValue.
         */
        public fun newUndefined(context: Context): Value =
            Value(jsc_value_new_undefined(context.javascriptcoreContextPointer.reinterpret())!!.reinterpret())
    }
}
