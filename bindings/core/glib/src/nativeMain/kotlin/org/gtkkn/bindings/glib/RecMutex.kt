// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GRecMutex
import org.gtkkn.native.glib.g_rec_mutex_clear
import org.gtkkn.native.glib.g_rec_mutex_init
import org.gtkkn.native.glib.g_rec_mutex_lock
import org.gtkkn.native.glib.g_rec_mutex_trylock
import org.gtkkn.native.glib.g_rec_mutex_unlock
import kotlin.Boolean
import kotlin.Unit

/**
 * The GRecMutex struct is an opaque data structure to represent a
 * recursive mutex. It is similar to a #GMutex with the difference
 * that it is possible to lock a GRecMutex multiple times in the same
 * thread without deadlock. When doing so, care has to be taken to
 * unlock the recursive mutex as often as it has been locked.
 *
 * If a #GRecMutex is allocated in static storage then it can be used
 * without initialisation.  Otherwise, you should call
 * g_rec_mutex_init() on it and g_rec_mutex_clear() when done.
 *
 * A GRecMutex should only be accessed with the
 * g_rec_mutex_ functions.
 *
 * ## Skipped during bindings generation
 *
 * - field `p`: Record field p is private
 * - field `i`: Record field i is private
 *
 * @since 2.32
 */
public class RecMutex(
    pointer: CPointer<GRecMutex>,
) : Record {
    public val glibRecMutexPointer: CPointer<GRecMutex> = pointer

    /**
     * Frees the resources allocated to a recursive mutex with
     * g_rec_mutex_init().
     *
     * This function should not be used with a #GRecMutex that has been
     * statically allocated.
     *
     * Calling g_rec_mutex_clear() on a locked recursive mutex leads
     * to undefined behaviour.
     *
     * @since 2.32
     */
    public fun clear(): Unit = g_rec_mutex_clear(glibRecMutexPointer.reinterpret())

    /**
     * Initializes a #GRecMutex so that it can be used.
     *
     * This function is useful to initialize a recursive mutex
     * that has been allocated on the stack, or as part of a larger
     * structure.
     *
     * It is not necessary to initialise a recursive mutex that has been
     * statically allocated.
     *
     * |[<!-- language="C" -->
     *   typedef struct {
     *     GRecMutex m;
     *     ...
     *   } Blob;
     *
     * Blob *b;
     *
     * b = g_new (Blob, 1);
     * g_rec_mutex_init (&b->m);
     * ]|
     *
     * Calling g_rec_mutex_init() on an already initialized #GRecMutex
     * leads to undefined behaviour.
     *
     * To undo the effect of g_rec_mutex_init() when a recursive mutex
     * is no longer needed, use g_rec_mutex_clear().
     *
     * @since 2.32
     */
    public fun `init`(): Unit = g_rec_mutex_init(glibRecMutexPointer.reinterpret())

    /**
     * Locks @rec_mutex. If @rec_mutex is already locked by another
     * thread, the current thread will block until @rec_mutex is
     * unlocked by the other thread. If @rec_mutex is already locked
     * by the current thread, the 'lock count' of @rec_mutex is increased.
     * The mutex will only become available again when it is unlocked
     * as many times as it has been locked.
     *
     * @since 2.32
     */
    public fun lock(): Unit = g_rec_mutex_lock(glibRecMutexPointer.reinterpret())

    /**
     * Tries to lock @rec_mutex. If @rec_mutex is already locked
     * by another thread, it immediately returns false. Otherwise
     * it locks @rec_mutex and returns true.
     *
     * @return true if @rec_mutex could be locked
     * @since 2.32
     */
    public fun trylock(): Boolean = g_rec_mutex_trylock(glibRecMutexPointer.reinterpret()).asBoolean()

    /**
     * Unlocks @rec_mutex. If another thread is blocked in a
     * g_rec_mutex_lock() call for @rec_mutex, it will become unblocked
     * and can lock @rec_mutex itself.
     *
     * Calling g_rec_mutex_unlock() on a recursive mutex that is not
     * locked by the current thread leads to undefined behaviour.
     *
     * @since 2.32
     */
    public fun unlock(): Unit = g_rec_mutex_unlock(glibRecMutexPointer.reinterpret())

    public companion object : RecordCompanion<RecMutex, GRecMutex> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): RecMutex = RecMutex(pointer.reinterpret())
    }
}