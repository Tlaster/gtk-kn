// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_48
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gio.GInputMessage
import org.gtkkn.native.gobject.gint
import org.gtkkn.native.gobject.gsize
import org.gtkkn.native.gobject.guint
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * Structure used for scatter/gather data input when receiving multiple
 * messages or packets in one go. You generally pass in an array of empty
 * #GInputVectors and the operation will use all the buffers as if they
 * were one buffer, and will set @bytes_received to the total number of bytes
 * received across all #GInputVectors.
 *
 * This structure closely mirrors `struct mmsghdr` and `struct msghdr` from
 * the POSIX sockets API (see `man 2 recvmmsg`).
 *
 * If @address is non-null then it is set to the source address the message
 * was received from, and the caller must free it afterwards.
 *
 * If @control_messages is non-null then it is set to an array of control
 * messages received with the message (if any), and the caller must free it
 * afterwards. @num_control_messages is set to the number of elements in
 * this array, which may be zero.
 *
 * Flags relevant to this message will be returned in @flags. For example,
 * `MSG_EOR` or `MSG_TRUNC`.
 *
 * ## Skipped during bindings generation
 *
 * - field `vectors`: Fields with arrays are not supported
 * - field `control_messages`: Fields with arrays are not supported
 * - field `num_control_messages`: Unsupported pointer to primitive type
 *
 * @since 2.48
 */
@GioVersion2_48
public class InputMessage(pointer: CPointer<GInputMessage>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gioInputMessagePointer: CPointer<GInputMessage> = pointer

    /**
     * return location
     *   for a #GSocketAddress, or null
     */
    public var address: SocketAddress?
        get() = gioInputMessagePointer.pointed.address?.run {
            SocketAddress(reinterpret())
        }

        @UnsafeFieldSetter
        set(`value`) {
            gioInputMessagePointer.pointed.address = value?.gioSocketAddressPointer?.reinterpret()
        }

    /**
     * the number of input vectors pointed to by @vectors
     */
    public var numVectors: guint
        get() = gioInputMessagePointer.pointed.num_vectors

        @UnsafeFieldSetter
        set(`value`) {
            gioInputMessagePointer.pointed.num_vectors = value
        }

    /**
     * will be set to the number of bytes that have been
     *   received
     */
    public var bytesReceived: gsize
        get() = gioInputMessagePointer.pointed.bytes_received

        @UnsafeFieldSetter
        set(`value`) {
            gioInputMessagePointer.pointed.bytes_received = value
        }

    /**
     * collection of #GSocketMsgFlags for the received message,
     *   outputted by the call
     */
    public var flags: gint
        get() = gioInputMessagePointer.pointed.flags

        @UnsafeFieldSetter
        set(`value`) {
            gioInputMessagePointer.pointed.flags = value
        }

    /**
     * Allocate a new InputMessage.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GInputMessage>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to InputMessage and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GInputMessage>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new InputMessage using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GInputMessage>().ptr)

    /**
     * Allocate a new InputMessage.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param address return location
     *   for a #GSocketAddress, or null
     * @param numVectors the number of input vectors pointed to by @vectors
     * @param bytesReceived will be set to the number of bytes that have been
     *   received
     * @param flags collection of #GSocketMsgFlags for the received message,
     *   outputted by the call
     */
    public constructor(
        address: SocketAddress?,
        numVectors: guint,
        bytesReceived: gsize,
        flags: gint,
    ) : this() {
        this.address = address
        this.numVectors = numVectors
        this.bytesReceived = bytesReceived
        this.flags = flags
    }

    /**
     * Allocate a new InputMessage using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param address return location
     *   for a #GSocketAddress, or null
     * @param numVectors the number of input vectors pointed to by @vectors
     * @param bytesReceived will be set to the number of bytes that have been
     *   received
     * @param flags collection of #GSocketMsgFlags for the received message,
     *   outputted by the call
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        address: SocketAddress?,
        numVectors: guint,
        bytesReceived: gsize,
        flags: gint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.address = address
        this.numVectors = numVectors
        this.bytesReceived = bytesReceived
        this.flags = flags
    }

    override fun toString(): String =
        "InputMessage(address=$address, numVectors=$numVectors, bytesReceived=$bytesReceived, flags=$flags)"
}
