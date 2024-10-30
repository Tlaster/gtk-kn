// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.pango.PangoAttribute
import org.gtkkn.native.pango.pango_attribute_as_color
import org.gtkkn.native.pango.pango_attribute_as_float
import org.gtkkn.native.pango.pango_attribute_as_font_desc
import org.gtkkn.native.pango.pango_attribute_as_font_features
import org.gtkkn.native.pango.pango_attribute_as_int
import org.gtkkn.native.pango.pango_attribute_as_language
import org.gtkkn.native.pango.pango_attribute_as_shape
import org.gtkkn.native.pango.pango_attribute_as_size
import org.gtkkn.native.pango.pango_attribute_as_string
import org.gtkkn.native.pango.pango_attribute_copy
import org.gtkkn.native.pango.pango_attribute_destroy
import org.gtkkn.native.pango.pango_attribute_equal
import org.gtkkn.native.pango.pango_attribute_init
import kotlin.Boolean
import kotlin.UInt
import kotlin.Unit

/**
 * The `PangoAttribute` structure represents the common portions of all
 * attributes.
 *
 * Particular types of attributes include this structure as their initial
 * portion. The common portion of the attribute holds the range to which
 * the value in the type-specific part of the attribute applies and should
 * be initialized using [method@Pango.Attribute.init]. By default, an attribute
 * will have an all-inclusive range of [0,%G_MAXUINT].
 */
public class Attribute(
    pointer: CPointer<PangoAttribute>,
) : Record {
    public val pangoAttributePointer: CPointer<PangoAttribute> = pointer

    /**
     * the class structure holding information about the type of the attribute
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val klass: AttrClass?
        get() =
            pangoAttributePointer.pointed.klass?.run {
                AttrClass(reinterpret())
            }

    /**
     * the start index of the range (in bytes).
     */
    public var startIndex: UInt
        get() = pangoAttributePointer.pointed.start_index
        set(`value`) {
            pangoAttributePointer.pointed.start_index = value
        }

    /**
     * end index of the range (in bytes). The character at this index
     *   is not included in the range.
     */
    public var endIndex: UInt
        get() = pangoAttributePointer.pointed.end_index
        set(`value`) {
            pangoAttributePointer.pointed.end_index = value
        }

    /**
     * Returns the attribute cast to `PangoAttrColor`.
     *
     * This is mainly useful for language bindings.
     *
     * @return The attribute as `PangoAttrColor`,
     *   or null if it's not a color attribute
     * @since 1.50
     */
    public fun asColor(): AttrColor? =
        pango_attribute_as_color(pangoAttributePointer.reinterpret())?.run {
            AttrColor(reinterpret())
        }

    /**
     * Returns the attribute cast to `PangoAttrFloat`.
     *
     * This is mainly useful for language bindings.
     *
     * @return The attribute as `PangoAttrFloat`,
     *   or null if it's not a floating point attribute
     * @since 1.50
     */
    public fun asFloat(): AttrFloat? =
        pango_attribute_as_float(pangoAttributePointer.reinterpret())?.run {
            AttrFloat(reinterpret())
        }

    /**
     * Returns the attribute cast to `PangoAttrFontDesc`.
     *
     * This is mainly useful for language bindings.
     *
     * @return The attribute as `PangoAttrFontDesc`,
     *   or null if it's not a font description attribute
     * @since 1.50
     */
    public fun asFontDesc(): AttrFontDesc? =
        pango_attribute_as_font_desc(pangoAttributePointer.reinterpret())?.run {
            AttrFontDesc(reinterpret())
        }

    /**
     * Returns the attribute cast to `PangoAttrFontFeatures`.
     *
     * This is mainly useful for language bindings.
     *
     * @return The attribute as `PangoAttrFontFeatures`,
     *   or null if it's not a font features attribute
     * @since 1.50
     */
    public fun asFontFeatures(): AttrFontFeatures? =
        pango_attribute_as_font_features(pangoAttributePointer.reinterpret())?.run {
            AttrFontFeatures(reinterpret())
        }

    /**
     * Returns the attribute cast to `PangoAttrInt`.
     *
     * This is mainly useful for language bindings.
     *
     * @return The attribute as `PangoAttrInt`,
     *   or null if it's not an integer attribute
     * @since 1.50
     */
    public fun asInt(): AttrInt? =
        pango_attribute_as_int(pangoAttributePointer.reinterpret())?.run {
            AttrInt(reinterpret())
        }

    /**
     * Returns the attribute cast to `PangoAttrLanguage`.
     *
     * This is mainly useful for language bindings.
     *
     * @return The attribute as `PangoAttrLanguage`,
     *   or null if it's not a language attribute
     * @since 1.50
     */
    public fun asLanguage(): AttrLanguage? =
        pango_attribute_as_language(pangoAttributePointer.reinterpret())?.run {
            AttrLanguage(reinterpret())
        }

    /**
     * Returns the attribute cast to `PangoAttrShape`.
     *
     * This is mainly useful for language bindings.
     *
     * @return The attribute as `PangoAttrShape`,
     *   or null if it's not a shape attribute
     * @since 1.50
     */
    public fun asShape(): AttrShape? =
        pango_attribute_as_shape(pangoAttributePointer.reinterpret())?.run {
            AttrShape(reinterpret())
        }

    /**
     * Returns the attribute cast to `PangoAttrSize`.
     *
     * This is mainly useful for language bindings.
     *
     * @return The attribute as `PangoAttrSize`,
     *   or NULL if it's not a size attribute
     * @since 1.50
     */
    public fun asSize(): AttrSize? =
        pango_attribute_as_size(pangoAttributePointer.reinterpret())?.run {
            AttrSize(reinterpret())
        }

    /**
     * Returns the attribute cast to `PangoAttrString`.
     *
     * This is mainly useful for language bindings.
     *
     * @return The attribute as `PangoAttrString`,
     *   or null if it's not a string attribute
     * @since 1.50
     */
    public fun asString(): AttrString? =
        pango_attribute_as_string(pangoAttributePointer.reinterpret())?.run {
            AttrString(reinterpret())
        }

    /**
     * Make a copy of an attribute.
     *
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy].
     */
    public fun copy(): Attribute =
        pango_attribute_copy(pangoAttributePointer.reinterpret())!!.run {
            Attribute(reinterpret())
        }

    /**
     * Destroy a `PangoAttribute` and free all associated memory.
     */
    public fun destroy(): Unit = pango_attribute_destroy(pangoAttributePointer.reinterpret())

    /**
     * Compare two attributes for equality.
     *
     * This compares only the actual value of the two
     * attributes and not the ranges that the attributes
     * apply to.
     *
     * @param attr2 another `PangoAttribute`
     * @return true if the two attributes have the same value
     */
    public fun equal(attr2: Attribute): Boolean =
        pango_attribute_equal(pangoAttributePointer.reinterpret(), attr2.pangoAttributePointer).asBoolean()

    /**
     * Initializes @attr's klass to @klass, it's start_index to
     * %PANGO_ATTR_INDEX_FROM_TEXT_BEGINNING and end_index to
     * %PANGO_ATTR_INDEX_TO_TEXT_END such that the attribute applies
     * to the entire text by default.
     *
     * @param klass a `PangoAttrClass`
     * @since 1.20
     */
    public fun `init`(klass: AttrClass): Unit =
        pango_attribute_init(pangoAttributePointer.reinterpret(), klass.pangoAttrClassPointer)

    public companion object : RecordCompanion<Attribute, PangoAttribute> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Attribute = Attribute(pointer.reinterpret())
    }
}