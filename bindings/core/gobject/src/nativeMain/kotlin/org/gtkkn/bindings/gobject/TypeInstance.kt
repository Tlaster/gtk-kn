// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gobject.GTypeInstance
import kotlin.Pair
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * An opaque structure used as the base of all type instances.
 *
 * ## Skipped during bindings generation
 *
 * - method `get_private`: Return type gpointer is unsupported
 * - field `g_class`: Record field g_class is private
 */
public class TypeInstance(pointer: CPointer<GTypeInstance>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gobjectTypeInstancePointer: CPointer<GTypeInstance> = pointer

    /**
     * Allocate a new TypeInstance.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GTypeInstance>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to TypeInstance and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GTypeInstance>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new TypeInstance using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GTypeInstance>().ptr)
}
