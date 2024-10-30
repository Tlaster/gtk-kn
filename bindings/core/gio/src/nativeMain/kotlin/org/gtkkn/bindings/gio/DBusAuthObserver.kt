// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GCredentials
import org.gtkkn.native.gio.GDBusAuthObserver
import org.gtkkn.native.gio.GIOStream
import org.gtkkn.native.gio.g_dbus_auth_observer_allow_mechanism
import org.gtkkn.native.gio.g_dbus_auth_observer_authorize_authenticated_peer
import org.gtkkn.native.gio.g_dbus_auth_observer_get_type
import org.gtkkn.native.gio.g_dbus_auth_observer_new
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.ULong

/**
 * `GDBusAuthObserver` provides a mechanism for participating
 * in how a [class@Gio.DBusServer] (or a [class@Gio.DBusConnection])
 * authenticates remote peers.
 *
 * Simply instantiate a `GDBusAuthObserver` and connect to the
 * signals you are interested in. Note that new signals may be added
 * in the future.
 *
 * ## Controlling Authentication Mechanisms
 *
 * By default, a `GDBusServer` or server-side `GDBusConnection` will allow
 * any authentication mechanism to be used. If you only want to allow D-Bus
 * connections with the `EXTERNAL` mechanism, which makes use of credentials
 * passing and is the recommended mechanism for modern Unix platforms such
 * as Linux and the BSD family, you would use a signal handler like this:
 *
 * ```c
 * static gboolean
 * on_allow_mechanism (GDBusAuthObserver *observer,
 *                     const gchar       *mechanism,
 *                     gpointer           user_data)
 * {
 *   if (g_strcmp0 (mechanism, "EXTERNAL") == 0)
 *     {
 *       return TRUE;
 *     }
 *
 *   return FALSE;
 * }
 * ```
 *
 * ## Controlling Authorization
 *
 * By default, a `GDBusServer` or server-side `GDBusConnection` will accept
 * connections from any successfully authenticated user (but not from
 * anonymous connections using the `ANONYMOUS` mechanism). If you only
 * want to allow D-Bus connections from processes owned by the same uid
 * as the server, since GLib 2.68, you should use the
 * `G_DBUS_SERVER_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER` flag. It’s equivalent
 * to the following signal handler:
 *
 * ```c
 * static gboolean
 * on_authorize_authenticated_peer (GDBusAuthObserver *observer,
 *                                  GIOStream         *stream,
 *                                  GCredentials      *credentials,
 *                                  gpointer           user_data)
 * {
 *   gboolean authorized;
 *
 *   authorized = FALSE;
 *   if (credentials != NULL)
 *     {
 *       GCredentials *own_credentials;
 *       own_credentials = g_credentials_new ();
 *       if (g_credentials_is_same_user (credentials, own_credentials, NULL))
 *         authorized = TRUE;
 *       g_object_unref (own_credentials);
 *     }
 *
 *   return authorized;
 * }
 * ```
 * @since 2.26
 */
public open class DBusAuthObserver(
    pointer: CPointer<GDBusAuthObserver>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gioDBusAuthObserverPointer: CPointer<GDBusAuthObserver>
        get() = gPointer.reinterpret()

    /**
     * Creates a new #GDBusAuthObserver object.
     *
     * @return A #GDBusAuthObserver. Free with g_object_unref().
     * @since 2.26
     */
    public constructor() : this(g_dbus_auth_observer_new()!!.reinterpret())

    /**
     * Emits the #GDBusAuthObserver::allow-mechanism signal on @observer.
     *
     * @param mechanism The name of the mechanism, e.g. `DBUS_COOKIE_SHA1`.
     * @return true if @mechanism can be used to authenticate the other peer, false if not.
     * @since 2.34
     */
    public open fun allowMechanism(mechanism: String): Boolean =
        g_dbus_auth_observer_allow_mechanism(gioDBusAuthObserverPointer.reinterpret(), mechanism).asBoolean()

    /**
     * Emits the #GDBusAuthObserver::authorize-authenticated-peer signal on @observer.
     *
     * @param stream A #GIOStream for the #GDBusConnection.
     * @param credentials Credentials received from the peer or null.
     * @return true if the peer is authorized, false if not.
     * @since 2.26
     */
    public open fun authorizeAuthenticatedPeer(
        stream: IOStream,
        credentials: Credentials? = null,
    ): Boolean =
        g_dbus_auth_observer_authorize_authenticated_peer(
            gioDBusAuthObserverPointer.reinterpret(),
            stream.gioIOStreamPointer.reinterpret(),
            credentials?.gioCredentialsPointer?.reinterpret()
        ).asBoolean()

    /**
     * Emitted to check if @mechanism is allowed to be used.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `mechanism` The name of the mechanism, e.g. `DBUS_COOKIE_SHA1`.. Returns true if @mechanism can be used to authenticate the other peer, false if not.
     * @since 2.34
     */
    public fun connectAllowMechanism(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (mechanism: String) -> Boolean,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "allow-mechanism",
            connectAllowMechanismFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted to check if a peer that is successfully authenticated
     * is authorized.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `stream` A #GIOStream for the #GDBusConnection.; `credentials` Credentials received from the peer or null.. Returns true if the peer is authorized, false if not.
     * @since 2.26
     */
    public fun connectAuthorizeAuthenticatedPeer(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (stream: IOStream, credentials: Credentials?) -> Boolean,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "authorize-authenticated-peer",
            connectAuthorizeAuthenticatedPeerFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<DBusAuthObserver> {
        override val type: GeneratedClassKGType<DBusAuthObserver> =
            GeneratedClassKGType(g_dbus_auth_observer_get_type()) { DBusAuthObserver(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }
    }
}

private val connectAllowMechanismFunc: CPointer<CFunction<(CPointer<ByteVar>) -> Int>> =
    staticCFunction {
            _: COpaquePointer,
            mechanism: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<(mechanism: String) -> Boolean>()
            .get()
            .invoke(
                mechanism?.toKString() ?: error("Expected not null string")
            ).asGBoolean()
    }.reinterpret()

private val connectAuthorizeAuthenticatedPeerFunc:
    CPointer<CFunction<(CPointer<GIOStream>, CPointer<GCredentials>?) -> Int>> =
    staticCFunction {
            _: COpaquePointer,
            stream: CPointer<GIOStream>?,
            credentials: CPointer<GCredentials>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<(stream: IOStream, credentials: Credentials?) -> Boolean>()
            .get()
            .invoke(
                stream!!.run {
                    IOStream(reinterpret())
                },
                credentials?.run {
                    Credentials(reinterpret())
                }
            ).asGBoolean()
    }.reinterpret()