// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GCond
import org.gtkkn.native.glib.g_cond_broadcast
import org.gtkkn.native.glib.g_cond_clear
import org.gtkkn.native.glib.g_cond_init
import org.gtkkn.native.glib.g_cond_signal
import kotlin.Unit

/**
 * The #GCond struct is an opaque data structure that represents a
 * condition. Threads can block on a #GCond if they find a certain
 * condition to be false. If other threads change the state of this
 * condition they signal the #GCond, and that causes the waiting
 * threads to be woken up.
 *
 * Consider the following example of a shared variable.  One or more
 * threads can wait for data to be published to the variable and when
 * another thread publishes the data, it can signal one of the waiting
 * threads to wake up to collect the data.
 *
 * Here is an example for using GCond to block a thread until a condition
 * is satisfied:
 * |[<!-- language="C" -->
 *   gpointer current_data = NULL;
 *   GMutex data_mutex;
 *   GCond data_cond;
 *
 *   void
 *   push_data (gpointer data)
 *   {
 *     g_mutex_lock (&data_mutex);
 *     current_data = data;
 *     g_cond_signal (&data_cond);
 *     g_mutex_unlock (&data_mutex);
 *   }
 *
 *   gpointer
 *   pop_data (void)
 *   {
 *     gpointer data;
 *
 *     g_mutex_lock (&data_mutex);
 *     while (!current_data)
 *       g_cond_wait (&data_cond, &data_mutex);
 *     data = current_data;
 *     current_data = NULL;
 *     g_mutex_unlock (&data_mutex);
 *
 *     return data;
 *   }
 * ]|
 * Whenever a thread calls pop_data() now, it will wait until
 * current_data is non-null, i.e. until some other thread
 * has called push_data().
 *
 * The example shows that use of a condition variable must always be
 * paired with a mutex.  Without the use of a mutex, there would be a
 * race between the check of @current_data by the while loop in
 * pop_data() and waiting. Specifically, another thread could set
 * @current_data after the check, and signal the cond (with nobody
 * waiting on it) before the first thread goes to sleep. #GCond is
 * specifically useful for its ability to release the mutex and go
 * to sleep atomically.
 *
 * It is also important to use the g_cond_wait() and g_cond_wait_until()
 * functions only inside a loop which checks for the condition to be
 * true.  See g_cond_wait() for an explanation of why the condition may
 * not be true even after it returns.
 *
 * If a #GCond is allocated in static storage then it can be used
 * without initialisation.  Otherwise, you should call g_cond_init()
 * on it and g_cond_clear() when done.
 *
 * A #GCond should only be accessed via the g_cond_ functions.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `mutex`: Mutex
 * - parameter `mutex`: Mutex
 * - field `p`: Record field p is private
 * - field `i`: Record field i is private
 */
public class Cond(
    pointer: CPointer<GCond>,
) : Record {
    public val glibCondPointer: CPointer<GCond> = pointer

    /**
     * If threads are waiting for @cond, all of them are unblocked.
     * If no threads are waiting for @cond, this function has no effect.
     * It is good practice to lock the same mutex as the waiting threads
     * while calling this function, though not required.
     */
    public fun broadcast(): Unit = g_cond_broadcast(glibCondPointer.reinterpret())

    /**
     * Frees the resources allocated to a #GCond with g_cond_init().
     *
     * This function should not be used with a #GCond that has been
     * statically allocated.
     *
     * Calling g_cond_clear() for a #GCond on which threads are
     * blocking leads to undefined behaviour.
     *
     * @since 2.32
     */
    public fun clear(): Unit = g_cond_clear(glibCondPointer.reinterpret())

    /**
     * Initialises a #GCond so that it can be used.
     *
     * This function is useful to initialise a #GCond that has been
     * allocated as part of a larger structure.  It is not necessary to
     * initialise a #GCond that has been statically allocated.
     *
     * To undo the effect of g_cond_init() when a #GCond is no longer
     * needed, use g_cond_clear().
     *
     * Calling g_cond_init() on an already-initialised #GCond leads
     * to undefined behaviour.
     *
     * @since 2.32
     */
    public fun `init`(): Unit = g_cond_init(glibCondPointer.reinterpret())

    /**
     * If threads are waiting for @cond, at least one of them is unblocked.
     * If no threads are waiting for @cond, this function has no effect.
     * It is good practice to hold the same lock as the waiting thread
     * while calling this function, though not required.
     */
    public fun signal(): Unit = g_cond_signal(glibCondPointer.reinterpret())

    public companion object : RecordCompanion<Cond, GCond> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Cond = Cond(pointer.reinterpret())
    }
}