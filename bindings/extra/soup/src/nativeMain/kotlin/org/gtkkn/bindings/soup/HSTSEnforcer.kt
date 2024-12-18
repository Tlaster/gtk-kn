// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.soup.SoupHSTSEnforcer
import org.gtkkn.native.soup.SoupHSTSPolicy
import org.gtkkn.native.soup.SoupSessionFeature
import org.gtkkn.native.soup.soup_hsts_enforcer_get_domains
import org.gtkkn.native.soup.soup_hsts_enforcer_get_policies
import org.gtkkn.native.soup.soup_hsts_enforcer_get_type
import org.gtkkn.native.soup.soup_hsts_enforcer_has_valid_policy
import org.gtkkn.native.soup.soup_hsts_enforcer_is_persistent
import org.gtkkn.native.soup.soup_hsts_enforcer_new
import org.gtkkn.native.soup.soup_hsts_enforcer_set_policy
import org.gtkkn.native.soup.soup_hsts_enforcer_set_session_policy
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * Automatic HTTP Strict Transport Security enforcing for [class@Session].
 *
 * A #SoupHSTSEnforcer stores HSTS policies and enforces them when
 * required. #SoupHSTSEnforcer implements [iface@SessionFeature], so you
 * can add an HSTS enforcer to a session with
 * [method@Session.add_feature] or [method@Session.add_feature_by_type].
 *
 * #SoupHSTSEnforcer keeps track of all the HTTPS destinations that,
 * when connected to, return the Strict-Transport-Security header with
 * valid values. #SoupHSTSEnforcer will forget those destinations
 * upon expiry or when the server requests it.
 *
 * When the [class@Session] the #SoupHSTSEnforcer is attached to queues or
 * restarts a message, the #SoupHSTSEnforcer will rewrite the URI to HTTPS if
 * the destination is a known HSTS host and is contacted over an insecure
 * transport protocol (HTTP). Users of #SoupHSTSEnforcer are advised to listen
 * to changes in the [property@Message:uri] property in order to be aware of
 * changes in the message URI.
 *
 * Note that #SoupHSTSEnforcer does not support any form of long-term
 * HSTS policy persistence. See [class@HSTSEnforcerDB] for a persistent
 * enforcer.
 */
public open class HSTSEnforcer(pointer: CPointer<SoupHSTSEnforcer>) :
    Object(pointer.reinterpret()),
    SessionFeature,
    KGTyped {
    public val soupHSTSEnforcerPointer: CPointer<SoupHSTSEnforcer>
        get() = gPointer.reinterpret()

    override val soupSessionFeaturePointer: CPointer<SoupSessionFeature>
        get() = gPointer.reinterpret()

    /**
     * Creates a new #SoupHSTSEnforcer.
     *
     * The base #SoupHSTSEnforcer class does not support persistent storage of HSTS
     * policies, see [class@HSTSEnforcerDB] for that.
     *
     * @return a new #SoupHSTSEnforcer
     */
    public constructor() : this(soup_hsts_enforcer_new()!!.reinterpret())

    /**
     * Gets a list of domains for which there are policies in @enforcer.
     *
     * @param sessionPolicies whether to include session policies
     * @return a newly allocated
     *   list of domains. Use [func@GLib.List.free_full] and [func@GLib.free] to free the
     *   list.
     */
    public open fun getDomains(sessionPolicies: Boolean): List =
        soup_hsts_enforcer_get_domains(soupHSTSEnforcerPointer.reinterpret(), sessionPolicies.asGBoolean())!!.run {
            List(reinterpret())
        }

    /**
     * Gets a list with the policies in @enforcer.
     *
     * @param sessionPolicies whether to include session policies
     * @return a newly
     *   allocated list of policies. Use [func@GLib.List.free_full] and
     *   [method@HSTSPolicy.free] to free the list.
     */
    public open fun getPolicies(sessionPolicies: Boolean): List =
        soup_hsts_enforcer_get_policies(soupHSTSEnforcerPointer.reinterpret(), sessionPolicies.asGBoolean())!!.run {
            List(reinterpret())
        }

    /**
     * Gets whether @hsts_enforcer has a currently valid policy for @domain.
     *
     * @param domain a domain.
     * @return true if access to @domain should happen over HTTPS, false
     *   otherwise.
     */
    public open fun hasValidPolicy(domain: String): Boolean =
        soup_hsts_enforcer_has_valid_policy(soupHSTSEnforcerPointer.reinterpret(), domain).asBoolean()

    /**
     * Gets whether @hsts_enforcer stores policies persistenly.
     *
     * @return true if @hsts_enforcer storage is persistent or false otherwise.
     */
    public open fun isPersistent(): Boolean =
        soup_hsts_enforcer_is_persistent(soupHSTSEnforcerPointer.reinterpret()).asBoolean()

    /**
     * Sets @policy to @hsts_enforcer.
     *
     * If @policy is expired, any existing HSTS policy for its host will be removed
     * instead. If a policy existed for this host, it will be replaced. Otherwise,
     * the new policy will be inserted. If the policy is a session policy, that is,
     * one created with [ctor@HSTSPolicy.new_session_policy], the policy will not
     * expire and will be enforced during the lifetime of @hsts_enforcer's
     * [class@Session].
     *
     * @param policy the policy of the HSTS host
     */
    public open fun setPolicy(policy: HSTSPolicy): Unit =
        soup_hsts_enforcer_set_policy(soupHSTSEnforcerPointer.reinterpret(), policy.soupHSTSPolicyPointer.reinterpret())

    /**
     * Sets a session policy for @domain.
     *
     * A session policy is a policy that is permanent to the lifetime of
     * @hsts_enforcer's [class@Session] and doesn't expire.
     *
     * @param domain policy domain or hostname
     * @param includeSubdomains true if the policy applies on sub domains
     */
    public open fun setSessionPolicy(domain: String, includeSubdomains: Boolean): Unit =
        soup_hsts_enforcer_set_session_policy(
            soupHSTSEnforcerPointer.reinterpret(),
            domain,
            includeSubdomains.asGBoolean()
        )

    /**
     * Emitted when @hsts_enforcer changes.
     *
     * If a policy has been added,
     * @new_policy will contain the newly-added policy and
     * @old_policy will be null. If a policy has been deleted,
     * @old_policy will contain the to-be-deleted policy and
     * @new_policy will be null. If a policy has been changed,
     * @old_policy will contain its old value, and @new_policy its
     * new value.
     *
     * Note that you shouldn't modify the policies from a callback to
     * this signal.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `oldPolicy` the old #SoupHSTSPolicy value; `newPolicy` the new #SoupHSTSPolicy value
     */
    public fun connectChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (oldPolicy: HSTSPolicy, newPolicy: HSTSPolicy) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "changed",
        connectChangedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    public companion object : TypeCompanion<HSTSEnforcer> {
        override val type: GeneratedClassKGType<HSTSEnforcer> =
            GeneratedClassKGType(soup_hsts_enforcer_get_type()) { HSTSEnforcer(it.reinterpret()) }

        init {
            SoupTypeProvider.register()
        }

        /**
         * Get the GType of HSTSEnforcer
         *
         * @return the GType
         */
        public fun getType(): GType = soup_hsts_enforcer_get_type()
    }
}

private val connectChangedFunc:
    CPointer<CFunction<(CPointer<SoupHSTSPolicy>, CPointer<SoupHSTSPolicy>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            oldPolicy: CPointer<SoupHSTSPolicy>?,
            newPolicy: CPointer<SoupHSTSPolicy>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(oldPolicy: HSTSPolicy, newPolicy: HSTSPolicy) -> Unit>().get().invoke(
            oldPolicy!!.run {
                HSTSPolicy(reinterpret())
            },
            newPolicy!!.run {
                HSTSPolicy(reinterpret())
            }
        )
    }
        .reinterpret()
