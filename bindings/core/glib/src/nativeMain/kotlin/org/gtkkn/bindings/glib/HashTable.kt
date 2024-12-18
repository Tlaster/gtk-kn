// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.annotations.GLibVersion2_10
import org.gtkkn.bindings.glib.annotations.GLibVersion2_12
import org.gtkkn.bindings.glib.annotations.GLibVersion2_14
import org.gtkkn.bindings.glib.annotations.GLibVersion2_72
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GHashTable
import org.gtkkn.native.glib.g_hash_table_destroy
import org.gtkkn.native.glib.g_hash_table_foreach
import org.gtkkn.native.glib.g_hash_table_foreach_remove
import org.gtkkn.native.glib.g_hash_table_foreach_steal
import org.gtkkn.native.glib.g_hash_table_get_keys
import org.gtkkn.native.glib.g_hash_table_get_values
import org.gtkkn.native.glib.g_hash_table_new_similar
import org.gtkkn.native.glib.g_hash_table_ref
import org.gtkkn.native.glib.g_hash_table_remove_all
import org.gtkkn.native.glib.g_hash_table_size
import org.gtkkn.native.glib.g_hash_table_steal_all
import org.gtkkn.native.glib.g_hash_table_unref
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_hash_table_get_type
import org.gtkkn.native.gobject.guint
import kotlin.Unit

/**
 * The #GHashTable struct is an opaque data structure to represent a
 * [Hash Table][glib-Hash-Tables]. It should only be accessed via the
 * following functions.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `key`: gpointer
 * - parameter `key`: gpointer
 * - function `find`: Return type gpointer is unsupported
 * - parameter `length`: length: Out parameter is not supported
 * - function `get_keys_as_ptr_array`: gpointer
 * - function `get_values_as_ptr_array`: gpointer
 * - parameter `key`: gpointer
 * - parameter `key`: gpointer
 * - parameter `lookup_key`: gpointer
 * - parameter `hash_func`: HashFunc
 * - parameter `hash_func`: HashFunc
 * - parameter `key`: gpointer
 * - parameter `key`: gpointer
 * - parameter `key`: gpointer
 * - function `steal_all_keys`: gpointer
 * - function `steal_all_values`: gpointer
 * - parameter `lookup_key`: gpointer
 */
public class HashTable(pointer: CPointer<GHashTable>) : ProxyInstance(pointer) {
    public val glibHashTablePointer: CPointer<GHashTable> = pointer

    public companion object {
        /**
         * Destroys all keys and values in the #GHashTable and decrements its
         * reference count by 1. If keys and/or values are dynamically allocated,
         * you should either free them first or create the #GHashTable with destroy
         * notifiers using g_hash_table_new_full(). In the latter case the destroy
         * functions you supplied will be called on all keys and values during the
         * destruction phase.
         *
         * @param hashTable a #GHashTable
         */
        public fun destroy(hashTable: HashTable): Unit =
            g_hash_table_destroy(hashTable.glibHashTablePointer.reinterpret())

        /**
         * Calls the given function for each of the key/value pairs in the
         * #GHashTable.  The function is passed the key and value of each
         * pair, and the given @user_data parameter.  The hash table may not
         * be modified while iterating over it (you can't add/remove
         * items). To remove all items matching a predicate, use
         * g_hash_table_foreach_remove().
         *
         * The order in which g_hash_table_foreach() iterates over the keys/values in
         * the hash table is not defined.
         *
         * See g_hash_table_find() for performance caveats for linear
         * order searches in contrast to g_hash_table_lookup().
         *
         * @param hashTable a #GHashTable
         * @param func the function to call for each key/value pair
         */
        public fun foreach(hashTable: HashTable, func: HFunc): Unit = g_hash_table_foreach(
            hashTable.glibHashTablePointer.reinterpret(),
            HFuncFunc.reinterpret(),
            StableRef.create(func).asCPointer()
        )

        /**
         * Calls the given function for each key/value pair in the
         * #GHashTable. If the function returns true, then the key/value
         * pair is removed from the #GHashTable. If you supplied key or
         * value destroy functions when creating the #GHashTable, they are
         * used to free the memory allocated for the removed keys and values.
         *
         * See #GHashTableIter for an alternative way to loop over the
         * key/value pairs in the hash table.
         *
         * @param hashTable a #GHashTable
         * @param func the function to call for each key/value pair
         * @return the number of key/value pairs removed
         */
        public fun foreachRemove(hashTable: HashTable, func: HRFunc): guint = g_hash_table_foreach_remove(
            hashTable.glibHashTablePointer.reinterpret(),
            HRFuncFunc.reinterpret(),
            StableRef.create(func).asCPointer()
        )

        /**
         * Calls the given function for each key/value pair in the
         * #GHashTable. If the function returns true, then the key/value
         * pair is removed from the #GHashTable, but no key or value
         * destroy functions are called.
         *
         * See #GHashTableIter for an alternative way to loop over the
         * key/value pairs in the hash table.
         *
         * @param hashTable a #GHashTable
         * @param func the function to call for each key/value pair
         * @return the number of key/value pairs removed.
         */
        public fun foreachSteal(hashTable: HashTable, func: HRFunc): guint = g_hash_table_foreach_steal(
            hashTable.glibHashTablePointer.reinterpret(),
            HRFuncFunc.reinterpret(),
            StableRef.create(func).asCPointer()
        )

        /**
         * Retrieves every key inside @hash_table. The returned data is valid
         * until changes to the hash release those keys.
         *
         * This iterates over every entry in the hash table to build its return value.
         * To iterate over the entries in a #GHashTable more efficiently, use a
         * #GHashTableIter.
         *
         * @param hashTable a #GHashTable
         * @return a #GList containing all the keys
         *     inside the hash table. The content of the list is owned by the
         *     hash table and should not be modified or freed. Use g_list_free()
         *     when done using the list.
         * @since 2.14
         */
        @GLibVersion2_14
        public fun getKeys(hashTable: HashTable): List =
            g_hash_table_get_keys(hashTable.glibHashTablePointer.reinterpret())!!.run {
                List(reinterpret())
            }

        /**
         * Retrieves every value inside @hash_table. The returned data
         * is valid until @hash_table is modified.
         *
         * This iterates over every entry in the hash table to build its return value.
         * To iterate over the entries in a #GHashTable more efficiently, use a
         * #GHashTableIter.
         *
         * @param hashTable a #GHashTable
         * @return a #GList containing all the values
         *     inside the hash table. The content of the list is owned by the
         *     hash table and should not be modified or freed. Use g_list_free()
         *     when done using the list.
         * @since 2.14
         */
        @GLibVersion2_14
        public fun getValues(hashTable: HashTable): List =
            g_hash_table_get_values(hashTable.glibHashTablePointer.reinterpret())!!.run {
                List(reinterpret())
            }

        /**
         * Creates a new #GHashTable like g_hash_table_new_full() with a reference
         * count of 1.
         *
         * It inherits the hash function, the key equal function, the key destroy function,
         * as well as the value destroy function, from @other_hash_table.
         *
         * The returned hash table will be empty; it will not contain the keys
         * or values from @other_hash_table.
         *
         * @param otherHashTable Another #GHashTable
         * @return a new #GHashTable
         * @since 2.72
         */
        @GLibVersion2_72
        public fun newSimilar(otherHashTable: HashTable): HashTable =
            g_hash_table_new_similar(otherHashTable.glibHashTablePointer.reinterpret())!!.run {
                HashTable(reinterpret())
            }

        /**
         * Atomically increments the reference count of @hash_table by one.
         * This function is MT-safe and may be called from any thread.
         *
         * @param hashTable a valid #GHashTable
         * @return the passed in #GHashTable
         * @since 2.10
         */
        @GLibVersion2_10
        public fun ref(hashTable: HashTable): HashTable =
            g_hash_table_ref(hashTable.glibHashTablePointer.reinterpret())!!.run {
                HashTable(reinterpret())
            }

        /**
         * Removes all keys and their associated values from a #GHashTable.
         *
         * If the #GHashTable was created using g_hash_table_new_full(),
         * the keys and values are freed using the supplied destroy functions,
         * otherwise you have to make sure that any dynamically allocated
         * values are freed yourself.
         *
         * @param hashTable a #GHashTable
         * @since 2.12
         */
        @GLibVersion2_12
        public fun removeAll(hashTable: HashTable): Unit =
            g_hash_table_remove_all(hashTable.glibHashTablePointer.reinterpret())

        /**
         * Returns the number of elements contained in the #GHashTable.
         *
         * @param hashTable a #GHashTable
         * @return the number of key/value pairs in the #GHashTable.
         */
        public fun size(hashTable: HashTable): guint = g_hash_table_size(hashTable.glibHashTablePointer.reinterpret())

        /**
         * Removes all keys and their associated values from a #GHashTable
         * without calling the key and value destroy functions.
         *
         * @param hashTable a #GHashTable
         * @since 2.12
         */
        @GLibVersion2_12
        public fun stealAll(hashTable: HashTable): Unit =
            g_hash_table_steal_all(hashTable.glibHashTablePointer.reinterpret())

        /**
         * Atomically decrements the reference count of @hash_table by one.
         * If the reference count drops to 0, all keys and values will be
         * destroyed, and all memory allocated by the hash table is released.
         * This function is MT-safe and may be called from any thread.
         *
         * @param hashTable a valid #GHashTable
         * @since 2.10
         */
        @GLibVersion2_10
        public fun unref(hashTable: HashTable): Unit = g_hash_table_unref(hashTable.glibHashTablePointer.reinterpret())

        /**
         * Get the GType of HashTable
         *
         * @return the GType
         */
        public fun getType(): GType = g_hash_table_get_type()
    }
}
