// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GNetworkService
import org.gtkkn.native.gio.GSocketConnectable
import org.gtkkn.native.gio.g_network_service_get_domain
import org.gtkkn.native.gio.g_network_service_get_protocol
import org.gtkkn.native.gio.g_network_service_get_scheme
import org.gtkkn.native.gio.g_network_service_get_service
import org.gtkkn.native.gio.g_network_service_get_type
import org.gtkkn.native.gio.g_network_service_new
import org.gtkkn.native.gio.g_network_service_set_scheme
import kotlin.String
import kotlin.Unit

/**
 * Like [class@Gio.NetworkAddress] does with hostnames, `GNetworkService`
 * provides an easy way to resolve a SRV record, and then attempt to
 * connect to one of the hosts that implements that service, handling
 * service priority/weighting, multiple IP addresses, and multiple
 * address families.
 *
 * See [struct@Gio.SrvTarget] for more information about SRV records, and see
 * [iface@Gio.SocketConnectable] for an example of using the connectable
 * interface.
 */
public open class NetworkService(
    pointer: CPointer<GNetworkService>,
) : Object(pointer.reinterpret()), SocketConnectable, KGTyped {
    public val gioNetworkServicePointer: CPointer<GNetworkService>
        get() = gPointer.reinterpret()

    override val gioSocketConnectablePointer: CPointer<GSocketConnectable>
        get() = gPointer.reinterpret()

    /**
     * Network domain, for example `example.com`.
     *
     * @since 2.22
     */
    public open val domain: String
        /**
         * Gets the domain that @srv serves. This might be either UTF-8 or
         * ASCII-encoded, depending on what @srv was created with.
         *
         * @return @srv's domain name
         * @since 2.22
         */
        get() =
            g_network_service_get_domain(gioNetworkServicePointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

    /**
     * Network protocol, for example `tcp`.
     *
     * @since 2.22
     */
    public open val protocol: String
        /**
         * Gets @srv's protocol name (eg, "tcp").
         *
         * @return @srv's protocol name
         * @since 2.22
         */
        get() =
            g_network_service_get_protocol(gioNetworkServicePointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

    /**
     * Network scheme (default is to use service).
     *
     * @since 2.22
     */
    public open var scheme: String
        /**
         * Gets the URI scheme used to resolve proxies. By default, the service name
         * is used as scheme.
         *
         * @return @srv's scheme name
         * @since 2.26
         */
        get() =
            g_network_service_get_scheme(gioNetworkServicePointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Set's the URI scheme used to resolve proxies. By default, the service name
         * is used as scheme.
         *
         * @param scheme a URI scheme
         * @since 2.26
         */
        set(scheme) = g_network_service_set_scheme(gioNetworkServicePointer.reinterpret(), scheme)

    /**
     * Service name, for example `ldap`.
     *
     * @since 2.22
     */
    public open val service: String
        /**
         * Gets @srv's service name (eg, "ldap").
         *
         * @return @srv's service name
         * @since 2.22
         */
        get() =
            g_network_service_get_service(gioNetworkServicePointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

    /**
     * Creates a new #GNetworkService representing the given @service,
     * @protocol, and @domain. This will initially be unresolved; use the
     * #GSocketConnectable interface to resolve it.
     *
     * @param service the service type to look up (eg, "ldap")
     * @param protocol the networking protocol to use for @service (eg, "tcp")
     * @param domain the DNS domain to look up the service in
     * @return a new #GNetworkService
     * @since 2.22
     */
    public constructor(
        service: String,
        protocol: String,
        domain: String,
    ) : this(g_network_service_new(service, protocol, domain)!!.reinterpret())

    /**
     * Gets the domain that @srv serves. This might be either UTF-8 or
     * ASCII-encoded, depending on what @srv was created with.
     *
     * @return @srv's domain name
     * @since 2.22
     */
    public open fun getDomain(): String =
        g_network_service_get_domain(gioNetworkServicePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets @srv's protocol name (eg, "tcp").
     *
     * @return @srv's protocol name
     * @since 2.22
     */
    public open fun getProtocol(): String =
        g_network_service_get_protocol(gioNetworkServicePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the URI scheme used to resolve proxies. By default, the service name
     * is used as scheme.
     *
     * @return @srv's scheme name
     * @since 2.26
     */
    public open fun getScheme(): String =
        g_network_service_get_scheme(gioNetworkServicePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets @srv's service name (eg, "ldap").
     *
     * @return @srv's service name
     * @since 2.22
     */
    public open fun getService(): String =
        g_network_service_get_service(gioNetworkServicePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Set's the URI scheme used to resolve proxies. By default, the service name
     * is used as scheme.
     *
     * @param scheme a URI scheme
     * @since 2.26
     */
    public open fun setScheme(scheme: String): Unit =
        g_network_service_set_scheme(gioNetworkServicePointer.reinterpret(), scheme)

    public companion object : TypeCompanion<NetworkService> {
        override val type: GeneratedClassKGType<NetworkService> =
            GeneratedClassKGType(g_network_service_get_type()) {
                NetworkService(it.reinterpret())
            }

        init {
            GioTypeProvider.register()
        }
    }
}
