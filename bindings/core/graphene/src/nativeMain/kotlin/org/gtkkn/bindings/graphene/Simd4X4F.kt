// This is a generated file. Do not modify.
package org.gtkkn.bindings.graphene

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.graphene.graphene_simd4x4f_t
import kotlin.Pair
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * ## Skipped during bindings generation
 *
 * - field `x`: Record field x is private
 * - field `y`: Record field y is private
 * - field `z`: Record field z is private
 * - field `w`: Record field w is private
 */
public class Simd4X4F(pointer: CPointer<graphene_simd4x4f_t>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val grapheneSimd4X4FPointer: CPointer<graphene_simd4x4f_t> = pointer

    /**
     * Allocate a new Simd4X4F.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<graphene_simd4x4f_t>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Simd4X4F and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<graphene_simd4x4f_t>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Simd4X4F using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<graphene_simd4x4f_t>().ptr)
}
