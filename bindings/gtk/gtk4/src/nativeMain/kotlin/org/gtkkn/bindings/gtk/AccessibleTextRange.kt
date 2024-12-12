// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_14
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gobject.gsize
import org.gtkkn.native.gtk.GtkAccessibleTextRange
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A range inside the text of an accessible object.
 * @since 4.14
 */
@GtkVersion4_14
public class AccessibleTextRange(pointer: CPointer<GtkAccessibleTextRange>, cleaner: Cleaner? = null) :
    ProxyInstance(pointer) {
    public val gtkAccessibleTextRangePointer: CPointer<GtkAccessibleTextRange> = pointer

    /**
     * the start of the range, in characters
     */
    public var start: gsize
        get() = gtkAccessibleTextRangePointer.pointed.start

        @UnsafeFieldSetter
        set(`value`) {
            gtkAccessibleTextRangePointer.pointed.start = value
        }

    /**
     * the length of the range, in characters
     */
    public var length: gsize
        get() = gtkAccessibleTextRangePointer.pointed.length

        @UnsafeFieldSetter
        set(`value`) {
            gtkAccessibleTextRangePointer.pointed.length = value
        }

    /**
     * Allocate a new AccessibleTextRange.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GtkAccessibleTextRange>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to AccessibleTextRange and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GtkAccessibleTextRange>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new AccessibleTextRange using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GtkAccessibleTextRange>().ptr)

    /**
     * Allocate a new AccessibleTextRange.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param start the start of the range, in characters
     * @param length the length of the range, in characters
     */
    public constructor(start: gsize, length: gsize) : this() {
        this.start = start
        this.length = length
    }

    /**
     * Allocate a new AccessibleTextRange using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param start the start of the range, in characters
     * @param length the length of the range, in characters
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        start: gsize,
        length: gsize,
        scope: AutofreeScope,
    ) : this(scope) {
        this.start = start
        this.length = length
    }

    override fun toString(): String = "AccessibleTextRange(start=$start, length=$length)"
}
