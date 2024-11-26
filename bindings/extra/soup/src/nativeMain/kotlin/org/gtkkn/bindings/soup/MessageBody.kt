// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.soup.SoupMessageBody
import org.gtkkn.native.soup.soup_message_body_append_bytes
import org.gtkkn.native.soup.soup_message_body_complete
import org.gtkkn.native.soup.soup_message_body_flatten
import org.gtkkn.native.soup.soup_message_body_get_accumulate
import org.gtkkn.native.soup.soup_message_body_get_chunk
import org.gtkkn.native.soup.soup_message_body_got_chunk
import org.gtkkn.native.soup.soup_message_body_new
import org.gtkkn.native.soup.soup_message_body_ref
import org.gtkkn.native.soup.soup_message_body_set_accumulate
import org.gtkkn.native.soup.soup_message_body_truncate
import org.gtkkn.native.soup.soup_message_body_unref
import org.gtkkn.native.soup.soup_message_body_wrote_chunk
import kotlin.Boolean
import kotlin.Long
import kotlin.Unit

/**
 * #SoupMessageBody represents the request or response body of a
 * [class@Message].
 *
 * Note that while @length always reflects the full length of the
 * message body, @data is normally null, and will only be filled in
 * after [method@MessageBody.flatten] is called. For client-side
 * messages, this automatically happens for the response body after it
 * has been fully read. Likewise, for server-side
 * messages, the request body is automatically filled in after being
 * read.
 *
 * As an added bonus, when @data is filled in, it is always terminated
 * with a `\0` byte (which is not reflected in @length).
 *
 * ## Skipped during bindings generation
 *
 * - method `append`: soup_message_body_append is shadowedBy append_take
 * - parameter `data`: Array parameter of type guint8 is not supported
 * - field `data`: Fields with arrays are not supported
 */
public class MessageBody(
    pointer: CPointer<SoupMessageBody>,
) : Record {
    public val soupMessageBodyPointer: CPointer<SoupMessageBody> = pointer

    /**
     * length of @data
     */
    public var length: Long
        get() = soupMessageBodyPointer.pointed.length
        set(`value`) {
            soupMessageBodyPointer.pointed.length = value
        }

    /**
     * Appends the data from @buffer to @body.
     *
     * @param buffer a #GBytes
     */
    public fun appendBytes(buffer: Bytes): Unit =
        soup_message_body_append_bytes(soupMessageBodyPointer.reinterpret(), buffer.glibBytesPointer)

    /**
     * Tags @body as being complete.
     *
     * Call this when using chunked encoding after you have appended the last chunk.
     */
    public fun complete(): Unit = soup_message_body_complete(soupMessageBodyPointer.reinterpret())

    /**
     * Fills in @body's data field with a buffer containing all of the
     * data in @body.
     *
     * Adds an additional `\0` byte not counted by @body's
     * length field.
     *
     * @return a #GBytes containing the same data as @body.
     *   (You must [method@GLib.Bytes.unref] this if you do not want it.)
     */
    public fun flatten(): Bytes =
        soup_message_body_flatten(soupMessageBodyPointer.reinterpret())!!.run {
            Bytes(reinterpret())
        }

    /**
     * Gets the accumulate flag on @body.
     *
     * See [method@MessageBody.set_accumulate. for details.
     *
     * @return the accumulate flag for @body.
     */
    public fun getAccumulate(): Boolean =
        soup_message_body_get_accumulate(soupMessageBodyPointer.reinterpret()).asBoolean()

    /**
     * Gets a [struct@GLib.Bytes] containing data from @body starting at @offset.
     *
     * The size of the returned chunk is unspecified. You can iterate
     * through the entire body by first calling
     * [method@MessageBody.get_chunk] with an offset of 0, and then on each
     * successive call, increment the offset by the length of the
     * previously-returned chunk.
     *
     * If @offset is greater than or equal to the total length of @body,
     * then the return value depends on whether or not
     * [method@MessageBody.complete] has been called or not; if it has,
     * then [method@MessageBody.get_chunk] will return a 0-length chunk
     * (indicating the end of @body). If it has not, then
     * [method@MessageBody.get_chunk] will return null (indicating that
     * @body may still potentially have more data, but that data is not
     * currently available).
     *
     * @param offset an offset
     * @return a #GBytes
     */
    public fun getChunk(offset: Long): Bytes? =
        soup_message_body_get_chunk(soupMessageBodyPointer.reinterpret(), offset)?.run {
            Bytes(reinterpret())
        }

    /**
     * Handles the #SoupMessageBody part of receiving a chunk of data from
     * the network.
     *
     * Normally this means appending @chunk to @body, exactly as with
     * [method@MessageBody.append_bytes], but if you have set @body's accumulate
     * flag to false, then that will not happen.
     *
     * This is a low-level method which you should not normally need to
     * use.
     *
     * @param chunk a #GBytes received from the network
     */
    public fun gotChunk(chunk: Bytes): Unit =
        soup_message_body_got_chunk(soupMessageBodyPointer.reinterpret(), chunk.glibBytesPointer)

    /**
     * Atomically increments the reference count of @body by one.
     *
     * @return the passed in #SoupMessageBody
     */
    public fun ref(): MessageBody =
        soup_message_body_ref(soupMessageBodyPointer.reinterpret())!!.run {
            MessageBody(reinterpret())
        }

    /**
     * Sets or clears the accumulate flag on @body.
     *
     * (The default value is true.) If set to false, @body's data field will not
     * be filled in after the body is fully sent/received, and the chunks that make
     * up @body may be discarded when they are no longer needed.
     *
     * If you set the flag to false on the [class@Message] request_body of a
     * client-side message, it will block the accumulation of chunks into
     * @body's data field, but it will not normally cause the chunks to
     * be discarded after being written like in the server-side
     * [class@Message] response_body case, because the request body needs to
     * be kept around in case the request needs to be sent a second time
     * due to redirection or authentication.
     *
     * @param accumulate whether or not to accumulate body chunks in @body
     */
    public fun setAccumulate(accumulate: Boolean): Unit =
        soup_message_body_set_accumulate(soupMessageBodyPointer.reinterpret(), accumulate.asGBoolean())

    /**
     * Deletes all of the data in @body.
     */
    public fun truncate(): Unit = soup_message_body_truncate(soupMessageBodyPointer.reinterpret())

    /**
     * Atomically decrements the reference count of @body by one.
     *
     * When the reference count reaches zero, the resources allocated by
     * @body are freed
     */
    public fun unref(): Unit = soup_message_body_unref(soupMessageBodyPointer.reinterpret())

    /**
     * Handles the #SoupMessageBody part of writing a chunk of data to the
     * network.
     *
     * Normally this is a no-op, but if you have set @body's accumulate flag to
     * false, then this will cause @chunk to be discarded to free up memory.
     *
     * This is a low-level method which you should not need to use, and
     * there are further restrictions on its proper use which are not
     * documented here.
     *
     * @param chunk a #GBytes returned from [method@MessageBody.get_chunk]
     */
    public fun wroteChunk(chunk: Bytes): Unit =
        soup_message_body_wrote_chunk(soupMessageBodyPointer.reinterpret(), chunk.glibBytesPointer)

    public companion object : RecordCompanion<MessageBody, SoupMessageBody> {
        /**
         * Creates a new #SoupMessageBody.
         *
         * [class@Message] uses this internally; you
         * will not normally need to call it yourself.
         *
         * @return a new #SoupMessageBody.
         */
        public fun new(): MessageBody = MessageBody(soup_message_body_new()!!.reinterpret())

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): MessageBody =
            MessageBody(pointer.reinterpret())
    }
}