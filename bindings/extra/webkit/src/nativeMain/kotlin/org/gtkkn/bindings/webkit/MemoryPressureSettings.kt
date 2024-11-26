// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_34
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.webkit.WebKitMemoryPressureSettings
import org.gtkkn.native.webkit.webkit_memory_pressure_settings_copy
import org.gtkkn.native.webkit.webkit_memory_pressure_settings_free
import org.gtkkn.native.webkit.webkit_memory_pressure_settings_get_conservative_threshold
import org.gtkkn.native.webkit.webkit_memory_pressure_settings_get_kill_threshold
import org.gtkkn.native.webkit.webkit_memory_pressure_settings_get_memory_limit
import org.gtkkn.native.webkit.webkit_memory_pressure_settings_get_poll_interval
import org.gtkkn.native.webkit.webkit_memory_pressure_settings_get_strict_threshold
import org.gtkkn.native.webkit.webkit_memory_pressure_settings_new
import org.gtkkn.native.webkit.webkit_memory_pressure_settings_set_conservative_threshold
import org.gtkkn.native.webkit.webkit_memory_pressure_settings_set_kill_threshold
import org.gtkkn.native.webkit.webkit_memory_pressure_settings_set_memory_limit
import org.gtkkn.native.webkit.webkit_memory_pressure_settings_set_poll_interval
import org.gtkkn.native.webkit.webkit_memory_pressure_settings_set_strict_threshold
import kotlin.Double
import kotlin.UInt
import kotlin.Unit

/**
 * A boxed type representing the settings for the memory pressure handler
 *
 * #WebKitMemoryPressureSettings is a boxed type that can be used to provide some custom settings
 * to control how the memory pressure situations are handled by the different processes.
 *
 * The memory pressure system implemented inside the different process will try to keep the memory usage
 * under the defined memory limit. In order to do that, it will check the used memory with a user defined
 * frequency and decide whether it should try to release memory. The thresholds passed will define how urgent
 * is to release that memory.
 *
 * Take into account that badly defined parameters can greatly reduce the performance of the engine. For
 * example, setting memory limit too low with a fast poll interval can cause the process to constantly
 * be trying to release memory.
 *
 * A #WebKitMemoryPressureSettings can be passed to a #WebKitWebContext constructor, and the settings will
 * be applied to all the web processes created by that context.
 *
 * A #WebKitMemoryPressureSettings can be passed to webkit_website_data_manager_set_memory_pressure_settings(),
 * and the settings will be applied to all the network processes created after that call by any instance of
 * #WebKitWebsiteDataManager.
 * @since 2.34
 */
@WebKitVersion2_34
public class MemoryPressureSettings(
    pointer: CPointer<WebKitMemoryPressureSettings>,
) : Record {
    public val webkitMemoryPressureSettingsPointer: CPointer<WebKitMemoryPressureSettings> = pointer

    /**
     * Make a copy of @settings.
     *
     * @return A copy of of the passed #WebKitMemoryPressureSettings.
     * @since 2.34
     */
    @WebKitVersion2_34
    public fun copy(): MemoryPressureSettings =
        webkit_memory_pressure_settings_copy(webkitMemoryPressureSettingsPointer.reinterpret())!!.run {
            MemoryPressureSettings(reinterpret())
        }

    /**
     * Free the #WebKitMemoryPressureSettings.
     *
     * @since 2.34
     */
    @WebKitVersion2_34
    public fun free(): Unit = webkit_memory_pressure_settings_free(webkitMemoryPressureSettingsPointer.reinterpret())

    /**
     * Gets the conservative memory usage threshold.
     *
     * @return value in the `(0, 1)` range.
     * @since 2.34
     */
    @WebKitVersion2_34
    public fun getConservativeThreshold(): Double =
        webkit_memory_pressure_settings_get_conservative_threshold(webkitMemoryPressureSettingsPointer.reinterpret())

    /**
     * Gets the kill memory usage threshold.
     *
     * @return positive value, can be zero.
     * @since 2.34
     */
    @WebKitVersion2_34
    public fun getKillThreshold(): Double =
        webkit_memory_pressure_settings_get_kill_threshold(webkitMemoryPressureSettingsPointer.reinterpret())

    /**
     * Gets the memory usage limit.
     *
     * @return current value, in megabytes.
     * @since 2.34
     */
    @WebKitVersion2_34
    public fun getMemoryLimit(): UInt =
        webkit_memory_pressure_settings_get_memory_limit(webkitMemoryPressureSettingsPointer.reinterpret())

    /**
     * Gets the interval at which memory usage is checked.
     *
     * @return current interval value, in seconds.
     * @since 2.34
     */
    @WebKitVersion2_34
    public fun getPollInterval(): Double =
        webkit_memory_pressure_settings_get_poll_interval(webkitMemoryPressureSettingsPointer.reinterpret())

    /**
     * Gets the strict memory usage threshold.
     *
     * @return value in the `(0, 1)` range.
     * @since 2.34
     */
    @WebKitVersion2_34
    public fun getStrictThreshold(): Double =
        webkit_memory_pressure_settings_get_strict_threshold(webkitMemoryPressureSettingsPointer.reinterpret())

    /**
     * Sets the memory limit for the conservative policy to start working.
     *
     * Sets @value as the fraction of the defined memory limit where the conservative
     * policy starts working. This policy will try to reduce the memory footprint by
     * releasing non critical memory.
     *
     * The threshold must be bigger than 0 and smaller than 1, and it must be smaller
     * than the strict threshold defined in @settings. The default value is 0.33.
     *
     * @param value fraction of the memory limit where the conservative policy starts working.
     * @since 2.34
     */
    @WebKitVersion2_34
    public fun setConservativeThreshold(`value`: Double): Unit =
        webkit_memory_pressure_settings_set_conservative_threshold(
            webkitMemoryPressureSettingsPointer.reinterpret(),
            `value`
        )

    /**
     * Sets @value as the fraction of the defined memory limit where the process will be
     * killed.
     *
     * The threshold must be a value bigger or equal to 0. A value of 0 means that the process
     * is never killed. If the threshold is not 0, then it must be bigger than the strict threshold
     * defined in @settings. The threshold can also have values bigger than 1. The default value is 0.
     *
     * @param value fraction of the memory limit where the process will be killed because
     *   of excessive memory usage.
     * @since 2.34
     */
    @WebKitVersion2_34
    public fun setKillThreshold(`value`: Double): Unit =
        webkit_memory_pressure_settings_set_kill_threshold(webkitMemoryPressureSettingsPointer.reinterpret(), `value`)

    /**
     * Sets @memory_limit the memory limit value to @settings.
     *
     * The default value is the system's RAM size with a maximum of 3GB.
     *
     * @param memoryLimit amount of memory (in MB) that the process is allowed to use.
     * @since 2.34
     */
    @WebKitVersion2_34
    public fun setMemoryLimit(memoryLimit: UInt): Unit =
        webkit_memory_pressure_settings_set_memory_limit(webkitMemoryPressureSettingsPointer.reinterpret(), memoryLimit)

    /**
     * Sets @value as the poll interval used by @settings.
     *
     * The poll interval value must be bigger than 0. The default value is 30 seconds.
     *
     * @param value period (in seconds) between memory usage measurements.
     * @since 2.34
     */
    @WebKitVersion2_34
    public fun setPollInterval(`value`: Double): Unit =
        webkit_memory_pressure_settings_set_poll_interval(webkitMemoryPressureSettingsPointer.reinterpret(), `value`)

    /**
     * Sets the memory limit for the strict policy to start working.
     *
     * Sets @value as the fraction of the defined memory limit where the strict
     * policy starts working. This policy will try to reduce the memory footprint by
     * releasing critical memory.
     *
     * The threshold must be bigger than 0 and smaller than 1. Also, it must be bigger
     * than the conservative threshold defined in @settings, and smaller than the kill
     * threshold if the latter is not 0. The default value is 0.5.
     *
     * @param value fraction of the memory limit where the strict policy starts working.
     * @since 2.34
     */
    @WebKitVersion2_34
    public fun setStrictThreshold(`value`: Double): Unit =
        webkit_memory_pressure_settings_set_strict_threshold(webkitMemoryPressureSettingsPointer.reinterpret(), `value`)

    public companion object : RecordCompanion<MemoryPressureSettings, WebKitMemoryPressureSettings> {
        /**
         * Create a new #WebKitMemoryPressureSettings with the default values.
         *
         * @return A new #WebKitMemoryPressureSettings instance filled with the default values.
         * @since 2.34
         */
        public fun new(): MemoryPressureSettings =
            MemoryPressureSettings(webkit_memory_pressure_settings_new()!!.reinterpret())

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): MemoryPressureSettings =
            MemoryPressureSettings(pointer.reinterpret())
    }
}