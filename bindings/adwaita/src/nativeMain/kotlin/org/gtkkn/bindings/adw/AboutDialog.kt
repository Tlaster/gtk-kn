// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.License
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.common.toCStringList
import org.gtkkn.extensions.common.toKStringList
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwAboutDialog
import org.gtkkn.native.adw.adw_about_dialog_add_acknowledgement_section
import org.gtkkn.native.adw.adw_about_dialog_add_credit_section
import org.gtkkn.native.adw.adw_about_dialog_add_legal_section
import org.gtkkn.native.adw.adw_about_dialog_add_link
import org.gtkkn.native.adw.adw_about_dialog_get_application_icon
import org.gtkkn.native.adw.adw_about_dialog_get_application_name
import org.gtkkn.native.adw.adw_about_dialog_get_artists
import org.gtkkn.native.adw.adw_about_dialog_get_comments
import org.gtkkn.native.adw.adw_about_dialog_get_copyright
import org.gtkkn.native.adw.adw_about_dialog_get_debug_info
import org.gtkkn.native.adw.adw_about_dialog_get_debug_info_filename
import org.gtkkn.native.adw.adw_about_dialog_get_designers
import org.gtkkn.native.adw.adw_about_dialog_get_developer_name
import org.gtkkn.native.adw.adw_about_dialog_get_developers
import org.gtkkn.native.adw.adw_about_dialog_get_documenters
import org.gtkkn.native.adw.adw_about_dialog_get_issue_url
import org.gtkkn.native.adw.adw_about_dialog_get_license
import org.gtkkn.native.adw.adw_about_dialog_get_license_type
import org.gtkkn.native.adw.adw_about_dialog_get_release_notes
import org.gtkkn.native.adw.adw_about_dialog_get_release_notes_version
import org.gtkkn.native.adw.adw_about_dialog_get_support_url
import org.gtkkn.native.adw.adw_about_dialog_get_translator_credits
import org.gtkkn.native.adw.adw_about_dialog_get_type
import org.gtkkn.native.adw.adw_about_dialog_get_version
import org.gtkkn.native.adw.adw_about_dialog_get_website
import org.gtkkn.native.adw.adw_about_dialog_new
import org.gtkkn.native.adw.adw_about_dialog_new_from_appdata
import org.gtkkn.native.adw.adw_about_dialog_set_application_icon
import org.gtkkn.native.adw.adw_about_dialog_set_application_name
import org.gtkkn.native.adw.adw_about_dialog_set_artists
import org.gtkkn.native.adw.adw_about_dialog_set_comments
import org.gtkkn.native.adw.adw_about_dialog_set_copyright
import org.gtkkn.native.adw.adw_about_dialog_set_debug_info
import org.gtkkn.native.adw.adw_about_dialog_set_debug_info_filename
import org.gtkkn.native.adw.adw_about_dialog_set_designers
import org.gtkkn.native.adw.adw_about_dialog_set_developer_name
import org.gtkkn.native.adw.adw_about_dialog_set_developers
import org.gtkkn.native.adw.adw_about_dialog_set_documenters
import org.gtkkn.native.adw.adw_about_dialog_set_issue_url
import org.gtkkn.native.adw.adw_about_dialog_set_license
import org.gtkkn.native.adw.adw_about_dialog_set_license_type
import org.gtkkn.native.adw.adw_about_dialog_set_release_notes
import org.gtkkn.native.adw.adw_about_dialog_set_release_notes_version
import org.gtkkn.native.adw.adw_about_dialog_set_support_url
import org.gtkkn.native.adw.adw_about_dialog_set_translator_credits
import org.gtkkn.native.adw.adw_about_dialog_set_version
import org.gtkkn.native.adw.adw_about_dialog_set_website
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List

/**
 * A dialog showing information about the application.
 *
 * <picture>
 *   <source srcset="about-dialog-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="about-dialog.png" alt="about-dialog">
 * </picture>
 *
 * an about dialog is typically opened when the user activates the `About …`
 * item in the application's primary menu. All parts of the dialog are optional.
 *
 * ## Main page
 *
 * `AdwAboutDialog` prominently displays the application's icon, name, developer
 * name and version. They can be set with the [property@AboutDialog:application-icon],
 * [property@AboutDialog:application-name],
 * [property@AboutDialog:developer-name] and [property@AboutDialog:version]
 * respectively.
 *
 * ## What's New
 *
 * `AdwAboutDialog` provides a way for applications to display their release
 * notes, set with the [property@AboutDialog:release-notes] property.
 *
 * Release notes are formatted the same way as
 * [AppStream descriptions](https://freedesktop.org/software/appstream/docs/chap-Metadata.html#tag-description).
 *
 * The supported formatting options are:
 *
 * * Paragraph (`<p>`)
 * * Ordered list (`<ol>`), with list items (`<li>`)
 * * Unordered list (`<ul>`), with list items (`<li>`)
 *
 * Within paragraphs and list items, emphasis (`<em>`) and inline code
 * (`<code>`) text styles are supported. The emphasis is rendered in italic,
 * while inline code is shown in a monospaced font.
 *
 * Any text outside paragraphs or list items is ignored.
 *
 * Nested lists are not supported.
 *
 * Only one version can be shown at a time. By default, the displayed version
 * number matches [property@AboutDialog:version]. Use
 * [property@AboutDialog:release-notes-version] to override it.
 *
 * ## Details
 *
 * The Details page displays the application comments and links.
 *
 * The comments can be set with the [property@AboutDialog:comments] property.
 * Unlike [property@Gtk.AboutDialog:comments], this string can be long and
 * detailed. It can also contain links and Pango markup.
 *
 * To set the application website, use [property@AboutDialog:website].
 * To add extra links below the website, use [method@AboutDialog.add_link].
 *
 * If the Details page doesn't have any other content besides website, the
 * website will be displayed on the main page instead.
 *
 * ## Troubleshooting
 *
 * `AdwAboutDialog` displays the following two links on the main page:
 *
 * * Support Questions, set with the [property@AboutDialog:support-url] property,
 * * Report an Issue, set with the [property@AboutDialog:issue-url] property.
 *
 * Additionally, applications can provide debugging information. It will be
 * shown separately on the Troubleshooting page. Use the
 * [property@AboutDialog:debug-info] property to specify it.
 *
 * It's intended to be attached to issue reports when reporting issues against
 * the application. As such, it cannot contain markup or links.
 *
 * `AdwAboutDialog` provides a quick way to save debug information to a file.
 * When saving, [property@AboutDialog:debug-info-filename] would be used as
 * the suggested filename.
 *
 * ## Credits and Acknowledgements
 *
 * The Credits page has the following default sections:
 *
 * * Developers, set with the [property@AboutDialog:developers] property,
 * * Designers, set with the [property@AboutDialog:designers] property,
 * * Artists, set with the [property@AboutDialog:artists] property,
 * * Documenters, set with the [property@AboutDialog:documenters] property,
 * * Translators, set with the [property@AboutDialog:translator-credits] property.
 *
 * When setting translator credits, use the strings `"translator-credits"` or
 * `"translator_credits"` and mark them as translatable.
 *
 * The default sections that don't contain any names won't be displayed.
 *
 * The Credits page can also contain an arbitrary number of extra sections below
 * the default ones. Use [method@AboutDialog.add_credit_section] to add them.
 *
 * The Acknowledgements page can be used to acknowledge additional people and
 * organizations for their non-development contributions. Use
 * [method@AboutDialog.add_acknowledgement_section] to add sections to it. For
 * example, it can be used to list backers in a crowdfunded project or to give
 * special thanks.
 *
 * Each of the people or organizations can have an email address or a website
 * specified. To add a email address, use a string like
 * `Edgar Allan Poe <edgar@poe.com>`. To specify a website with a title, use a
 * string like `The GNOME Project https://www.gnome.org`:
 *
 * <picture>
 *   <source srcset="about-dialog-credits-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="about-dialog-credits.png" alt="about-dialog-credits">
 * </picture>
 *
 * ## Legal
 *
 * The Legal page displays the copyright and licensing information for the
 * application and other modules.
 *
 * The copyright string is set with the [property@AboutDialog:copyright]
 * property and should be a short string of one or two lines, for example:
 * `© 2022 Example`.
 *
 * Licensing information can be quickly set from a list of known licenses with
 * the [property@AboutDialog:license-type] property. If the application's
 * license is not in the list, [property@AboutDialog:license] can be used
 * instead.
 *
 * To add information about other modules, such as application dependencies or
 * data, use [method@AboutDialog.add_legal_section].
 *
 * ## Constructing
 *
 * To make constructing an `AdwAboutDialog` as convenient as possible, you can
 * use the function [func@show_about_dialog] which constructs and shows a
 * dialog.
 *
 * ```c
 * static void
 * show_about (GtkApplication *app)
 * {
 *   const char *developers[] = {
 *     "Angela Avery",
 *     NULL
 *   };
 *
 *   const char *designers[] = {
 *     "GNOME Design Team",
 *     NULL
 *   };
 *
 *   adw_show_about_dialog (GTK_WIDGET (gtk_application_get_active_window (app)),
 *                          "application-name", _("Example"),
 *                          "application-icon", "org.example.App",
 *                          "version", "1.2.3",
 *                          "copyright", "© 2022 Angela Avery",
 *                          "issue-url", "https://gitlab.gnome.org/example/example/-/issues/new",
 *                          "license-type", GTK_LICENSE_GPL_3_0,
 *                          "developers", developers,
 *                          "designers", designers,
 *                          "translator-credits", _("translator-credits"),
 *                          NULL);
 * }
 * ```
 *
 * ## CSS nodes
 *
 * `AdwAboutDialog` has a main CSS node with the name `dialog` and the
 * style class `.about`.
 * @since 1.5
 */
public class AboutDialog(
    pointer: CPointer<AdwAboutDialog>,
) : Dialog(pointer.reinterpret()),
    KGTyped {
    public val adwAboutDialogPointer: CPointer<AdwAboutDialog>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The name of the application icon.
     *
     * The icon is displayed at the top of the main page.
     *
     * @since 1.5
     */
    public var applicationIcon: String
        /**
         * Gets the name of the application icon for @self.
         *
         * @return the application icon name
         * @since 1.5
         */
        get() =
            adw_about_dialog_get_application_icon(adwAboutDialogPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the name of the application icon for @self.
         *
         * The icon is displayed at the top of the main page.
         *
         * @param applicationIcon the application icon name
         * @since 1.5
         */
        set(
            applicationIcon
        ) = adw_about_dialog_set_application_icon(adwAboutDialogPointer.reinterpret(), applicationIcon)

    /**
     * The name of the application.
     *
     * The name is displayed at the top of the main page.
     *
     * @since 1.5
     */
    public var applicationName: String
        /**
         * Gets the application name for @self.
         *
         * @return the application name
         * @since 1.5
         */
        get() =
            adw_about_dialog_get_application_name(adwAboutDialogPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the application name for @self.
         *
         * The name is displayed at the top of the main page.
         *
         * @param applicationName the application name
         * @since 1.5
         */
        set(
            applicationName
        ) = adw_about_dialog_set_application_name(adwAboutDialogPointer.reinterpret(), applicationName)

    /**
     * The list of artists of the application.
     *
     * It will be displayed on the Credits page.
     *
     * Each name may contain email addresses and URLs, see the introduction for
     * more details.
     *
     * See also:
     *
     * * [property@AboutDialog:developers]
     * * [property@AboutDialog:designers]
     * * [property@AboutDialog:documenters]
     * * [property@AboutDialog:translator-credits]
     * * [method@AboutDialog.add_credit_section]
     * * [method@AboutDialog.add_acknowledgement_section]
     *
     * @since 1.5
     */
    public var artists: List<String>?
        /**
         * Gets the list of artists of the application.
         *
         * @return The list of artists
         * @since 1.5
         */
        get() = adw_about_dialog_get_artists(adwAboutDialogPointer.reinterpret())?.toKStringList()

        /**
         * Sets the list of artists of the application.
         *
         * It will be displayed on the Credits page.
         *
         * Each name may contain email addresses and URLs, see the introduction for more
         * details.
         *
         * See also:
         *
         * * [property@AboutDialog:developers]
         * * [property@AboutDialog:designers]
         * * [property@AboutDialog:documenters]
         * * [property@AboutDialog:translator-credits]
         * * [method@AboutDialog.add_credit_section]
         * * [method@AboutDialog.add_acknowledgement_section]
         *
         * @param artists the list of artists
         * @since 1.5
         */
        set(artists) =
            memScoped {
                return adw_about_dialog_set_artists(adwAboutDialogPointer.reinterpret(), artists?.toCStringList(this))
            }

    /**
     * The comments about the application.
     *
     * Comments will be shown on the Details page, above links.
     *
     * Unlike [property@Gtk.AboutDialog:comments], this string can be long and
     * detailed. It can also contain links and Pango markup.
     *
     * @since 1.5
     */
    public var comments: String
        /**
         * Gets the comments about the application.
         *
         * @return the comments
         * @since 1.5
         */
        get() =
            adw_about_dialog_get_comments(adwAboutDialogPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the comments about the application.
         *
         * Comments will be shown on the Details page, above links.
         *
         * Unlike [property@Gtk.AboutDialog:comments], this string can be long and
         * detailed. It can also contain links and Pango markup.
         *
         * @param comments the comments
         * @since 1.5
         */
        set(comments) = adw_about_dialog_set_comments(adwAboutDialogPointer.reinterpret(), comments)

    /**
     * The copyright information.
     *
     * This should be a short string of one or two lines, for example:
     * `© 2022 Example`.
     *
     * The copyright information will be displayed on the Legal page, above the
     * application license.
     *
     * [method@AboutDialog.add_legal_section] can be used to add copyright
     * information for the application dependencies or other components.
     *
     * @since 1.5
     */
    public var copyright: String
        /**
         * Gets the copyright information for @self.
         *
         * @return the copyright information
         * @since 1.5
         */
        get() =
            adw_about_dialog_get_copyright(adwAboutDialogPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the copyright information for @self.
         *
         * This should be a short string of one or two lines, for example:
         * `© 2022 Example`.
         *
         * The copyright information will be displayed on the Legal page, before the
         * application license.
         *
         * [method@AboutDialog.add_legal_section] can be used to add copyright
         * information for the application dependencies or other components.
         *
         * @param copyright the copyright information
         * @since 1.5
         */
        set(copyright) = adw_about_dialog_set_copyright(adwAboutDialogPointer.reinterpret(), copyright)

    /**
     * The debug information.
     *
     * Debug information will be shown on the Troubleshooting page. It's intended
     * to be attached to issue reports when reporting issues against the
     * application.
     *
     * `AdwAboutDialog` provides a quick way to save debug information to a file.
     * When saving, [property@AboutDialog:debug-info-filename] would be used as
     * the suggested filename.
     *
     * Debug information cannot contain markup or links.
     *
     * @since 1.5
     */
    public var debugInfo: String
        /**
         * Gets the debug information for @self.
         *
         * @return the debug information
         * @since 1.5
         */
        get() =
            adw_about_dialog_get_debug_info(adwAboutDialogPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the debug information for @self.
         *
         * Debug information will be shown on the Troubleshooting page. It's intended
         * to be attached to issue reports when reporting issues against the
         * application.
         *
         * `AdwAboutDialog` provides a quick way to save debug information to a file.
         * When saving, [property@AboutDialog:debug-info-filename] would be used as
         * the suggested filename.
         *
         * Debug information cannot contain markup or links.
         *
         * @param debugInfo the debug information
         * @since 1.5
         */
        set(debugInfo) = adw_about_dialog_set_debug_info(adwAboutDialogPointer.reinterpret(), debugInfo)

    /**
     * The debug information filename.
     *
     * It will be used as the suggested filename when saving debug information to
     * a file.
     *
     * See [property@AboutDialog:debug-info].
     *
     * @since 1.5
     */
    public var debugInfoFilename: String
        /**
         * Gets the debug information filename for @self.
         *
         * @return the debug information filename
         * @since 1.5
         */
        get() =
            adw_about_dialog_get_debug_info_filename(adwAboutDialogPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the debug information filename for @self.
         *
         * It will be used as the suggested filename when saving debug information to a
         * file.
         *
         * See [property@AboutDialog:debug-info].
         *
         * @param filename the debug info filename
         * @since 1.5
         */
        set(filename) = adw_about_dialog_set_debug_info_filename(adwAboutDialogPointer.reinterpret(), filename)

    /**
     * The list of designers of the application.
     *
     * It will be displayed on the Credits page.
     *
     * Each name may contain email addresses and URLs, see the introduction for
     * more details.
     *
     * See also:
     *
     * * [property@AboutDialog:developers]
     * * [property@AboutDialog:artists]
     * * [property@AboutDialog:documenters]
     * * [property@AboutDialog:translator-credits]
     * * [method@AboutDialog.add_credit_section]
     * * [method@AboutDialog.add_acknowledgement_section]
     *
     * @since 1.5
     */
    public var designers: List<String>?
        /**
         * Gets the list of designers of the application.
         *
         * @return The list of designers
         * @since 1.5
         */
        get() = adw_about_dialog_get_designers(adwAboutDialogPointer.reinterpret())?.toKStringList()

        /**
         * Sets the list of designers of the application.
         *
         * It will be displayed on the Credits page.
         *
         * Each name may contain email addresses and URLs, see the introduction for more
         * details.
         *
         * See also:
         *
         * * [property@AboutDialog:developers]
         * * [property@AboutDialog:artists]
         * * [property@AboutDialog:documenters]
         * * [property@AboutDialog:translator-credits]
         * * [method@AboutDialog.add_credit_section]
         * * [method@AboutDialog.add_acknowledgement_section]
         *
         * @param designers the list of designers
         * @since 1.5
         */
        set(designers) =
            memScoped {
                return adw_about_dialog_set_designers(
                    adwAboutDialogPointer.reinterpret(),
                    designers?.toCStringList(this)
                )
            }

    /**
     * The developer name.
     *
     * The developer name is displayed on the main page, under the application
     * name.
     *
     * If the application is developed by multiple people, the developer name can
     * be set to values like "AppName team", "AppName developers" or
     * "The AppName project", and the individual contributors can be listed on the
     * Credits page, with [property@AboutDialog:developers] and related
     * properties.
     *
     * @since 1.5
     */
    public var developerName: String
        /**
         * Gets the developer name for @self.
         *
         * @return the developer_name
         * @since 1.5
         */
        get() =
            adw_about_dialog_get_developer_name(adwAboutDialogPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the developer name for @self.
         *
         * The developer name is displayed on the main page, under the application name.
         *
         * If the application is developed by multiple people, the developer name can be
         * set to values like "AppName team", "AppName developers" or
         * "The AppName project", and the individual contributors can be listed on the
         * Credits page, with [property@AboutDialog:developers] and related properties.
         *
         * @param developerName the developer name
         * @since 1.5
         */
        set(developerName) = adw_about_dialog_set_developer_name(adwAboutDialogPointer.reinterpret(), developerName)

    /**
     * The list of developers of the application.
     *
     * It will be displayed on the Credits page.
     *
     * Each name may contain email addresses and URLs, see the introduction for
     * more details.
     *
     * See also:
     *
     * * [property@AboutDialog:designers]
     * * [property@AboutDialog:artists]
     * * [property@AboutDialog:documenters]
     * * [property@AboutDialog:translator-credits]
     * * [method@AboutDialog.add_credit_section]
     * * [method@AboutDialog.add_acknowledgement_section]
     *
     * @since 1.5
     */
    public var developers: List<String>?
        /**
         * Gets the list of developers of the application.
         *
         * @return The list of developers
         * @since 1.5
         */
        get() = adw_about_dialog_get_developers(adwAboutDialogPointer.reinterpret())?.toKStringList()

        /**
         * Sets the list of developers of the application.
         *
         * It will be displayed on the Credits page.
         *
         * Each name may contain email addresses and URLs, see the introduction for more
         * details.
         *
         * See also:
         *
         * * [property@AboutDialog:designers]
         * * [property@AboutDialog:artists]
         * * [property@AboutDialog:documenters]
         * * [property@AboutDialog:translator-credits]
         * * [method@AboutDialog.add_credit_section]
         * * [method@AboutDialog.add_acknowledgement_section]
         *
         * @param developers the list of developers
         * @since 1.5
         */
        set(developers) =
            memScoped {
                return adw_about_dialog_set_developers(
                    adwAboutDialogPointer.reinterpret(),
                    developers?.toCStringList(this)
                )
            }

    /**
     * The list of documenters of the application.
     *
     * It will be displayed on the Credits page.
     *
     * Each name may contain email addresses and URLs, see the introduction for
     * more details.
     *
     * See also:
     *
     * * [property@AboutDialog:developers]
     * * [property@AboutDialog:designers]
     * * [property@AboutDialog:artists]
     * * [property@AboutDialog:translator-credits]
     * * [method@AboutDialog.add_credit_section]
     * * [method@AboutDialog.add_acknowledgement_section]
     *
     * @since 1.5
     */
    public var documenters: List<String>?
        /**
         * Gets the list of documenters of the application.
         *
         * @return The list of documenters
         * @since 1.5
         */
        get() = adw_about_dialog_get_documenters(adwAboutDialogPointer.reinterpret())?.toKStringList()

        /**
         * Sets the list of documenters of the application.
         *
         * It will be displayed on the Credits page.
         *
         * Each name may contain email addresses and URLs, see the introduction for more
         * details.
         *
         * See also:
         *
         * * [property@AboutDialog:developers]
         * * [property@AboutDialog:designers]
         * * [property@AboutDialog:artists]
         * * [property@AboutDialog:translator-credits]
         * * [method@AboutDialog.add_credit_section]
         * * [method@AboutDialog.add_acknowledgement_section]
         *
         * @param documenters the list of documenters
         * @since 1.5
         */
        set(documenters) =
            memScoped {
                return adw_about_dialog_set_documenters(
                    adwAboutDialogPointer.reinterpret(),
                    documenters?.toCStringList(this)
                )
            }

    /**
     * The URL for the application's issue tracker.
     *
     * The issue tracker link is displayed on the main page.
     *
     * @since 1.5
     */
    public var issueUrl: String
        /**
         * Gets the issue tracker URL for @self.
         *
         * @return the issue tracker URL
         * @since 1.5
         */
        get() =
            adw_about_dialog_get_issue_url(adwAboutDialogPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the issue tracker URL for @self.
         *
         * The issue tracker link is displayed on the main page.
         *
         * @param issueUrl the issue tracker URL
         * @since 1.5
         */
        set(issueUrl) = adw_about_dialog_set_issue_url(adwAboutDialogPointer.reinterpret(), issueUrl)

    /**
     * The license text.
     *
     * This can be used to set a custom text for the license if it can't be set
     * via [property@AboutDialog:license-type].
     *
     * When set, [property@AboutDialog:license-type] will be set to
     * `GTK_LICENSE_CUSTOM`.
     *
     * The license text will be displayed on the Legal page, below the copyright
     * information.
     *
     * License text can contain Pango markup and links.
     *
     * [method@AboutDialog.add_legal_section] can be used to add license
     * information for the application dependencies or other components.
     *
     * @since 1.5
     */
    public var license: String
        /**
         * Gets the license for @self.
         *
         * @return the license
         * @since 1.5
         */
        get() =
            adw_about_dialog_get_license(adwAboutDialogPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the license for @self.
         *
         * This can be used to set a custom text for the license if it can't be set via
         * [property@AboutDialog:license-type].
         *
         * When set, [property@AboutDialog:license-type] will be set to
         * `GTK_LICENSE_CUSTOM`.
         *
         * The license text will be displayed on the Legal page, below the copyright
         * information.
         *
         * License text can contain Pango markup and links.
         *
         * [method@AboutDialog.add_legal_section] can be used to add license information
         * for the application dependencies or other components.
         *
         * @param license the license
         * @since 1.5
         */
        set(license) = adw_about_dialog_set_license(adwAboutDialogPointer.reinterpret(), license)

    /**
     * The license type.
     *
     * Allows to set the application's license froma list of known licenses.
     *
     * If the application's license is not in the list,
     * [property@AboutDialog:license] can be used instead. The license type will
     * be automatically set to `GTK_LICENSE_CUSTOM` in that case.
     *
     * If set to `GTK_LICENSE_UNKNOWN`, no information will be displayed.
     *
     * If the license type is different from `GTK_LICENSE_CUSTOM`.
     * [property@AboutDialog:license] will be cleared out.
     *
     * The license description will be displayed on the Legal page, below the
     * copyright information.
     *
     * [method@AboutDialog.add_legal_section] can be used to add license
     * information for the application dependencies or other components.
     *
     * @since 1.5
     */
    public var licenseType: License
        /**
         * Gets the license type for @self.
         *
         * @return the license type
         * @since 1.5
         */
        get() =
            adw_about_dialog_get_license_type(adwAboutDialogPointer.reinterpret()).run {
                License.fromNativeValue(this)
            }

        /**
         * Sets the license for @self from a list of known licenses.
         *
         * If the application's license is not in the list,
         * [property@AboutDialog:license] can be used instead. The license type will be
         * automatically set to `GTK_LICENSE_CUSTOM` in that case.
         *
         * If @license_type is `GTK_LICENSE_UNKNOWN`, no information will be displayed.
         *
         * If @license_type is different from `GTK_LICENSE_CUSTOM`.
         * [property@AboutDialog:license] will be cleared out.
         *
         * The license description will be displayed on the Legal page, below the
         * copyright information.
         *
         * [method@AboutDialog.add_legal_section] can be used to add license information
         * for the application dependencies or other components.
         *
         * @param licenseType the license type
         * @since 1.5
         */
        set(
            licenseType
        ) = adw_about_dialog_set_license_type(adwAboutDialogPointer.reinterpret(), licenseType.nativeValue)

    /**
     * The release notes of the application.
     *
     * Release notes are displayed on the the What's New page.
     *
     * Release notes are formatted the same way as
     * [AppStream descriptions](https://freedesktop.org/software/appstream/docs/chap-Metadata.html#tag-description).
     *
     * The supported formatting options are:
     *
     * * Paragraph (`<p>`)
     * * Ordered list (`<ol>`), with list items (`<li>`)
     * * Unordered list (`<ul>`), with list items (`<li>`)
     *
     * Within paragraphs and list items, emphasis (`<em>`) and inline code
     * (`<code>`) text styles are supported. The emphasis is rendered in italic,
     * while inline code is shown in a monospaced font.
     *
     * Any text outside paragraphs or list items is ignored.
     *
     * Nested lists are not supported.
     *
     * `AdwAboutDialog` displays the version above the release notes. If set, the
     * [property@AboutDialog:release-notes-version] of the property will be used
     * as the version; otherwise, [property@AboutDialog:version] is used.
     *
     * @since 1.5
     */
    public var releaseNotes: String
        /**
         * Gets the release notes for @self.
         *
         * @return the release notes
         * @since 1.5
         */
        get() =
            adw_about_dialog_get_release_notes(adwAboutDialogPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the release notes for @self.
         *
         * Release notes are displayed on the the What's New page.
         *
         * Release notes are formatted the same way as
         * [AppStream descriptions](https://freedesktop.org/software/appstream/docs/chap-Metadata.html#tag-description).
         *
         * The supported formatting options are:
         *
         * * Paragraph (`<p>`)
         * * Ordered list (`<ol>`), with list items (`<li>`)
         * * Unordered list (`<ul>`), with list items (`<li>`)
         *
         * Within paragraphs and list items, emphasis (`<em>`) and inline code
         * (`<code>`) text styles are supported. The emphasis is rendered in italic,
         * while inline code is shown in a monospaced font.
         *
         * Any text outside paragraphs or list items is ignored.
         *
         * Nested lists are not supported.
         *
         * `AdwAboutDialog` displays the version above the release notes. If set, the
         * [property@AboutDialog:release-notes-version] of the property will be used
         * as the version; otherwise, [property@AboutDialog:version] is used.
         *
         * @param releaseNotes the release notes
         * @since 1.5
         */
        set(releaseNotes) = adw_about_dialog_set_release_notes(adwAboutDialogPointer.reinterpret(), releaseNotes)

    /**
     * The version described by the application's release notes.
     *
     * The release notes version is displayed on the What's New page, above the
     * release notes.
     *
     * If not set, [property@AboutDialog:version] will be used instead.
     *
     * For example, an application with the current version 2.0.2 might want to
     * keep the release notes from 2.0.0, and set the release notes version
     * accordingly.
     *
     * See [property@AboutDialog:release-notes].
     *
     * @since 1.5
     */
    public var releaseNotesVersion: String
        /**
         * Gets the version described by the application's release notes.
         *
         * @return the release notes version
         * @since 1.5
         */
        get() =
            adw_about_dialog_get_release_notes_version(adwAboutDialogPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the version described by the application's release notes.
         *
         * The release notes version is displayed on the What's New page, above the
         * release notes.
         *
         * If not set, [property@AboutDialog:version] will be used instead.
         *
         * For example, an application with the current version 2.0.2 might want to
         * keep the release notes from 2.0.0, and set the release notes version
         * accordingly.
         *
         * See [property@AboutDialog:release-notes].
         *
         * @param version the release notes version
         * @since 1.5
         */
        set(version) = adw_about_dialog_set_release_notes_version(adwAboutDialogPointer.reinterpret(), version)

    /**
     * The URL of the application's support page.
     *
     * The support page link is displayed on the main page.
     *
     * @since 1.5
     */
    public var supportUrl: String
        /**
         * Gets the URL of the support page for @self.
         *
         * @return the support page URL
         * @since 1.5
         */
        get() =
            adw_about_dialog_get_support_url(adwAboutDialogPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the URL of the support page for @self.
         *
         * The support page link is displayed on the main page.
         *
         * @param supportUrl the support page URL
         * @since 1.5
         */
        set(supportUrl) = adw_about_dialog_set_support_url(adwAboutDialogPointer.reinterpret(), supportUrl)

    /**
     * The translator credits string.
     *
     * It will be displayed on the Credits page.
     *
     * This string should be `"translator-credits"` or `"translator_credits"` and
     * should be marked as translatable.
     *
     * The string may contain email addresses and URLs, see the introduction for
     * more details.
     *
     * See also:
     *
     * * [property@AboutDialog:developers]
     * * [property@AboutDialog:designers]
     * * [property@AboutDialog:artists]
     * * [property@AboutDialog:documenters]
     * * [method@AboutDialog.add_credit_section]
     * * [method@AboutDialog.add_acknowledgement_section]
     *
     * @since 1.5
     */
    public var translatorCredits: String
        /**
         * Gets the translator credits string.
         *
         * @return The translator credits string
         * @since 1.5
         */
        get() =
            adw_about_dialog_get_translator_credits(adwAboutDialogPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the translator credits string.
         *
         * It will be displayed on the Credits page.
         *
         * This string should be `"translator-credits"` or `"translator_credits"` and
         * should be marked as translatable.
         *
         * The string may contain email addresses and URLs, see the introduction for
         * more details.
         *
         * See also:
         *
         * * [property@AboutDialog:developers]
         * * [property@AboutDialog:designers]
         * * [property@AboutDialog:artists]
         * * [property@AboutDialog:documenters]
         * * [method@AboutDialog.add_credit_section]
         * * [method@AboutDialog.add_acknowledgement_section]
         *
         * @param translatorCredits the translator credits
         * @since 1.5
         */
        set(
            translatorCredits
        ) = adw_about_dialog_set_translator_credits(adwAboutDialogPointer.reinterpret(), translatorCredits)

    /**
     * The version of the application.
     *
     * The version is displayed on the main page.
     *
     * If [property@AboutDialog:release-notes-version] is not set, the version
     * will also be displayed above the release notes on the What's New page.
     *
     * @since 1.5
     */
    public var version: String
        /**
         * Gets the version for @self.
         *
         * @return the version
         * @since 1.5
         */
        get() =
            adw_about_dialog_get_version(adwAboutDialogPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the version for @self.
         *
         * The version is displayed on the main page.
         *
         * If [property@AboutDialog:release-notes-version] is not set, the version will
         * also be displayed above the release notes on the What's New page.
         *
         * @param version the version
         * @since 1.5
         */
        set(version) = adw_about_dialog_set_version(adwAboutDialogPointer.reinterpret(), version)

    /**
     * The URL of the application's website.
     *
     * Website is displayed on the Details page, below comments, or on the main
     * page if the Details page doesn't have any other content.
     *
     * Applications can add other links below, see [method@AboutDialog.add_link].
     *
     * @since 1.5
     */
    public var website: String
        /**
         * Gets the application website URL for @self.
         *
         * @return the website URL
         * @since 1.5
         */
        get() =
            adw_about_dialog_get_website(adwAboutDialogPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the application website URL for @self.
         *
         * Website is displayed on the Details page, below comments, or on the main page
         * if the Details page doesn't have any other content.
         *
         * Applications can add other links below, see [method@AboutDialog.add_link].
         *
         * @param website the website URL
         * @since 1.5
         */
        set(website) = adw_about_dialog_set_website(adwAboutDialogPointer.reinterpret(), website)

    /**
     * Creates a new `AdwAboutDialog`.
     *
     * @return the newly created `AdwAboutDialog`
     * @since 1.5
     */
    public constructor() : this(adw_about_dialog_new()!!.reinterpret())

    /**
     * Creates a new `AdwAboutDialog` using AppStream metadata.
     *
     * This automatically sets the following properties with the following AppStream
     * values:
     *
     * * [property@AboutDialog:application-icon] is set from the `<id>`
     * * [property@AboutDialog:application-name] is set from the `<name>`
     * * [property@AboutDialog:developer-name] is set from the `<developer_name>`
     * * [property@AboutDialog:version] is set from the version of the latest release
     * * [property@AboutDialog:website] is set from the `<url type="homepage">`
     * * [property@AboutDialog:support-url] is set from the `<url type="help">`
     * * [property@AboutDialog:issue-url] is set from the `<url type="bugtracker">`
     * * [property@AboutDialog:license-type] is set from the `<project_license>`
     *   If the license type retrieved from AppStream is not listed in
     *   [enum@Gtk.License], it will be set to `GTK_LICENCE_CUSTOM`.
     *
     * If @release_notes_version is not `NULL`,
     * [property@AboutDialog:release-notes-version] is set to match it, while
     * [property@AboutDialog:release-notes] is set from the AppStream release
     * description for that version.
     *
     * @param resourcePath The resource to use
     * @param releaseNotesVersion The version to retrieve release notes for
     * @return the newly created `AdwAboutDialog`
     * @since 1.5
     */
    public constructor(
        resourcePath: String,
        releaseNotesVersion: String? = null,
    ) : this(adw_about_dialog_new_from_appdata(resourcePath, releaseNotesVersion)!!.reinterpret())

    /**
     * Adds a section to the Acknowledgements page.
     *
     * This can be used to acknowledge additional people and organizations for their
     * non-development contributions - for example, backers in a crowdfunded
     * project.
     *
     * Each name may contain email addresses and URLs, see the introduction for more
     * details.
     *
     * See also:
     *
     * * [property@AboutDialog:developers]
     * * [property@AboutDialog:designers]
     * * [property@AboutDialog:artists]
     * * [property@AboutDialog:documenters]
     * * [property@AboutDialog:translator-credits]
     * * [method@AboutDialog.add_credit_section]
     *
     * @param name the section name
     * @param people the list of names
     * @since 1.5
     */
    public fun addAcknowledgementSection(
        name: String? = null,
        people: List<String>,
    ): Unit =
        memScoped {
            return adw_about_dialog_add_acknowledgement_section(
                adwAboutDialogPointer.reinterpret(),
                name,
                people.toCStringList(this)
            )
        }

    /**
     * Adds an extra section to the Credits page.
     *
     * Extra sections are displayed below the standard categories.
     *
     * Each name may contain email addresses and URLs, see the introduction for more
     * details.
     *
     * See also:
     *
     * * [property@AboutDialog:developers]
     * * [property@AboutDialog:designers]
     * * [property@AboutDialog:artists]
     * * [property@AboutDialog:documenters]
     * * [property@AboutDialog:translator-credits]
     * * [method@AboutDialog.add_acknowledgement_section]
     *
     * @param name the section name
     * @param people the list of names
     * @since 1.5
     */
    public fun addCreditSection(
        name: String? = null,
        people: List<String>,
    ): Unit =
        memScoped {
            return adw_about_dialog_add_credit_section(
                adwAboutDialogPointer.reinterpret(),
                name,
                people.toCStringList(this)
            )
        }

    /**
     * Adds an extra section to the Legal page.
     *
     * Extra sections will be displayed below the application's own information.
     *
     * The parameters @copyright, @license_type and @license will be used to present
     * the it the same way as [property@AboutDialog:copyright],
     * [property@AboutDialog:license-type] and [property@AboutDialog:license] are
     * for the application's own information.
     *
     * See those properties for more details.
     *
     * This can be useful to attribute the application dependencies or data.
     *
     * Examples:
     *
     * ```c
     * adw_about_dialog_add_legal_section (ADW_ABOUT_DIALOG (about),
     *                                     _("Copyright and a known license"),
     *                                     "© 2022 Example",
     *                                     GTK_LICENSE_LGPL_2_1,
     *                                     NULL);
     *
     * adw_about_dialog_add_legal_section (ADW_ABOUT_DIALOG (about),
     *                                     _("Copyright and custom license"),
     *                                     "© 2022 Example",
     *                                     GTK_LICENSE_CUSTOM,
     *                                     "Custom license text");
     *
     * adw_about_dialog_add_legal_section (ADW_ABOUT_DIALOG (about),
     *                                     _("Copyright only"),
     *                                     "© 2022 Example",
     *                                     GTK_LICENSE_UNKNOWN,
     *                                     NULL);
     *
     * adw_about_dialog_add_legal_section (ADW_ABOUT_DIALOG (about),
     *                                     _("Custom license only"),
     *                                     NULL,
     *                                     GTK_LICENSE_CUSTOM,
     *                                     "Something completely custom here.");
     * ```
     *
     * @param title the name of the section
     * @param copyright a copyright string
     * @param licenseType the type of license
     * @param license custom license information
     * @since 1.5
     */
    public fun addLegalSection(
        title: String,
        copyright: String? = null,
        licenseType: License,
        license: String? = null,
    ): Unit =
        adw_about_dialog_add_legal_section(
            adwAboutDialogPointer.reinterpret(),
            title,
            copyright,
            licenseType.nativeValue,
            license
        )

    /**
     * Adds an extra link to the Details page.
     *
     * Extra links are displayed under the comment and website.
     *
     * Underlines in @title will be interpreted as indicating a mnemonic.
     *
     * See [property@AboutDialog:website].
     *
     * @param title the link title
     * @param url the link URL
     * @since 1.5
     */
    public fun addLink(
        title: String,
        url: String,
    ): Unit = adw_about_dialog_add_link(adwAboutDialogPointer.reinterpret(), title, url)

    /**
     * Gets the name of the application icon for @self.
     *
     * @return the application icon name
     * @since 1.5
     */
    public fun getApplicationIcon(): String =
        adw_about_dialog_get_application_icon(adwAboutDialogPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the application name for @self.
     *
     * @return the application name
     * @since 1.5
     */
    public fun getApplicationName(): String =
        adw_about_dialog_get_application_name(adwAboutDialogPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the list of artists of the application.
     *
     * @return The list of artists
     * @since 1.5
     */
    public fun getArtists(): List<String>? =
        adw_about_dialog_get_artists(adwAboutDialogPointer.reinterpret())?.toKStringList()

    /**
     * Gets the comments about the application.
     *
     * @return the comments
     * @since 1.5
     */
    public fun getComments(): String =
        adw_about_dialog_get_comments(adwAboutDialogPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the copyright information for @self.
     *
     * @return the copyright information
     * @since 1.5
     */
    public fun getCopyright(): String =
        adw_about_dialog_get_copyright(adwAboutDialogPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the debug information for @self.
     *
     * @return the debug information
     * @since 1.5
     */
    public fun getDebugInfo(): String =
        adw_about_dialog_get_debug_info(adwAboutDialogPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the debug information filename for @self.
     *
     * @return the debug information filename
     * @since 1.5
     */
    public fun getDebugInfoFilename(): String =
        adw_about_dialog_get_debug_info_filename(adwAboutDialogPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the list of designers of the application.
     *
     * @return The list of designers
     * @since 1.5
     */
    public fun getDesigners(): List<String>? =
        adw_about_dialog_get_designers(adwAboutDialogPointer.reinterpret())?.toKStringList()

    /**
     * Gets the developer name for @self.
     *
     * @return the developer_name
     * @since 1.5
     */
    public fun getDeveloperName(): String =
        adw_about_dialog_get_developer_name(adwAboutDialogPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the list of developers of the application.
     *
     * @return The list of developers
     * @since 1.5
     */
    public fun getDevelopers(): List<String>? =
        adw_about_dialog_get_developers(adwAboutDialogPointer.reinterpret())?.toKStringList()

    /**
     * Gets the list of documenters of the application.
     *
     * @return The list of documenters
     * @since 1.5
     */
    public fun getDocumenters(): List<String>? =
        adw_about_dialog_get_documenters(adwAboutDialogPointer.reinterpret())?.toKStringList()

    /**
     * Gets the issue tracker URL for @self.
     *
     * @return the issue tracker URL
     * @since 1.5
     */
    public fun getIssueUrl(): String =
        adw_about_dialog_get_issue_url(adwAboutDialogPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the license for @self.
     *
     * @return the license
     * @since 1.5
     */
    public fun getLicense(): String =
        adw_about_dialog_get_license(adwAboutDialogPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the license type for @self.
     *
     * @return the license type
     * @since 1.5
     */
    public fun getLicenseType(): License =
        adw_about_dialog_get_license_type(adwAboutDialogPointer.reinterpret()).run {
            License.fromNativeValue(this)
        }

    /**
     * Gets the release notes for @self.
     *
     * @return the release notes
     * @since 1.5
     */
    public fun getReleaseNotes(): String =
        adw_about_dialog_get_release_notes(adwAboutDialogPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the version described by the application's release notes.
     *
     * @return the release notes version
     * @since 1.5
     */
    public fun getReleaseNotesVersion(): String =
        adw_about_dialog_get_release_notes_version(adwAboutDialogPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the URL of the support page for @self.
     *
     * @return the support page URL
     * @since 1.5
     */
    public fun getSupportUrl(): String =
        adw_about_dialog_get_support_url(adwAboutDialogPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the translator credits string.
     *
     * @return The translator credits string
     * @since 1.5
     */
    public fun getTranslatorCredits(): String =
        adw_about_dialog_get_translator_credits(adwAboutDialogPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the version for @self.
     *
     * @return the version
     * @since 1.5
     */
    public fun getVersion(): String =
        adw_about_dialog_get_version(adwAboutDialogPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the application website URL for @self.
     *
     * @return the website URL
     * @since 1.5
     */
    public fun getWebsite(): String =
        adw_about_dialog_get_website(adwAboutDialogPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Sets the name of the application icon for @self.
     *
     * The icon is displayed at the top of the main page.
     *
     * @param applicationIcon the application icon name
     * @since 1.5
     */
    public fun setApplicationIcon(applicationIcon: String): Unit =
        adw_about_dialog_set_application_icon(adwAboutDialogPointer.reinterpret(), applicationIcon)

    /**
     * Sets the application name for @self.
     *
     * The name is displayed at the top of the main page.
     *
     * @param applicationName the application name
     * @since 1.5
     */
    public fun setApplicationName(applicationName: String): Unit =
        adw_about_dialog_set_application_name(adwAboutDialogPointer.reinterpret(), applicationName)

    /**
     * Sets the list of artists of the application.
     *
     * It will be displayed on the Credits page.
     *
     * Each name may contain email addresses and URLs, see the introduction for more
     * details.
     *
     * See also:
     *
     * * [property@AboutDialog:developers]
     * * [property@AboutDialog:designers]
     * * [property@AboutDialog:documenters]
     * * [property@AboutDialog:translator-credits]
     * * [method@AboutDialog.add_credit_section]
     * * [method@AboutDialog.add_acknowledgement_section]
     *
     * @param artists the list of artists
     * @since 1.5
     */
    public fun setArtists(artists: List<String>? = null): Unit =
        memScoped {
            return adw_about_dialog_set_artists(adwAboutDialogPointer.reinterpret(), artists?.toCStringList(this))
        }

    /**
     * Sets the comments about the application.
     *
     * Comments will be shown on the Details page, above links.
     *
     * Unlike [property@Gtk.AboutDialog:comments], this string can be long and
     * detailed. It can also contain links and Pango markup.
     *
     * @param comments the comments
     * @since 1.5
     */
    public fun setComments(comments: String): Unit =
        adw_about_dialog_set_comments(adwAboutDialogPointer.reinterpret(), comments)

    /**
     * Sets the copyright information for @self.
     *
     * This should be a short string of one or two lines, for example:
     * `© 2022 Example`.
     *
     * The copyright information will be displayed on the Legal page, before the
     * application license.
     *
     * [method@AboutDialog.add_legal_section] can be used to add copyright
     * information for the application dependencies or other components.
     *
     * @param copyright the copyright information
     * @since 1.5
     */
    public fun setCopyright(copyright: String): Unit =
        adw_about_dialog_set_copyright(adwAboutDialogPointer.reinterpret(), copyright)

    /**
     * Sets the debug information for @self.
     *
     * Debug information will be shown on the Troubleshooting page. It's intended
     * to be attached to issue reports when reporting issues against the
     * application.
     *
     * `AdwAboutDialog` provides a quick way to save debug information to a file.
     * When saving, [property@AboutDialog:debug-info-filename] would be used as
     * the suggested filename.
     *
     * Debug information cannot contain markup or links.
     *
     * @param debugInfo the debug information
     * @since 1.5
     */
    public fun setDebugInfo(debugInfo: String): Unit =
        adw_about_dialog_set_debug_info(adwAboutDialogPointer.reinterpret(), debugInfo)

    /**
     * Sets the debug information filename for @self.
     *
     * It will be used as the suggested filename when saving debug information to a
     * file.
     *
     * See [property@AboutDialog:debug-info].
     *
     * @param filename the debug info filename
     * @since 1.5
     */
    public fun setDebugInfoFilename(filename: String): Unit =
        adw_about_dialog_set_debug_info_filename(adwAboutDialogPointer.reinterpret(), filename)

    /**
     * Sets the list of designers of the application.
     *
     * It will be displayed on the Credits page.
     *
     * Each name may contain email addresses and URLs, see the introduction for more
     * details.
     *
     * See also:
     *
     * * [property@AboutDialog:developers]
     * * [property@AboutDialog:artists]
     * * [property@AboutDialog:documenters]
     * * [property@AboutDialog:translator-credits]
     * * [method@AboutDialog.add_credit_section]
     * * [method@AboutDialog.add_acknowledgement_section]
     *
     * @param designers the list of designers
     * @since 1.5
     */
    public fun setDesigners(designers: List<String>? = null): Unit =
        memScoped {
            return adw_about_dialog_set_designers(adwAboutDialogPointer.reinterpret(), designers?.toCStringList(this))
        }

    /**
     * Sets the developer name for @self.
     *
     * The developer name is displayed on the main page, under the application name.
     *
     * If the application is developed by multiple people, the developer name can be
     * set to values like "AppName team", "AppName developers" or
     * "The AppName project", and the individual contributors can be listed on the
     * Credits page, with [property@AboutDialog:developers] and related properties.
     *
     * @param developerName the developer name
     * @since 1.5
     */
    public fun setDeveloperName(developerName: String): Unit =
        adw_about_dialog_set_developer_name(adwAboutDialogPointer.reinterpret(), developerName)

    /**
     * Sets the list of developers of the application.
     *
     * It will be displayed on the Credits page.
     *
     * Each name may contain email addresses and URLs, see the introduction for more
     * details.
     *
     * See also:
     *
     * * [property@AboutDialog:designers]
     * * [property@AboutDialog:artists]
     * * [property@AboutDialog:documenters]
     * * [property@AboutDialog:translator-credits]
     * * [method@AboutDialog.add_credit_section]
     * * [method@AboutDialog.add_acknowledgement_section]
     *
     * @param developers the list of developers
     * @since 1.5
     */
    public fun setDevelopers(developers: List<String>? = null): Unit =
        memScoped {
            return adw_about_dialog_set_developers(adwAboutDialogPointer.reinterpret(), developers?.toCStringList(this))
        }

    /**
     * Sets the list of documenters of the application.
     *
     * It will be displayed on the Credits page.
     *
     * Each name may contain email addresses and URLs, see the introduction for more
     * details.
     *
     * See also:
     *
     * * [property@AboutDialog:developers]
     * * [property@AboutDialog:designers]
     * * [property@AboutDialog:artists]
     * * [property@AboutDialog:translator-credits]
     * * [method@AboutDialog.add_credit_section]
     * * [method@AboutDialog.add_acknowledgement_section]
     *
     * @param documenters the list of documenters
     * @since 1.5
     */
    public fun setDocumenters(documenters: List<String>? = null): Unit =
        memScoped {
            return adw_about_dialog_set_documenters(
                adwAboutDialogPointer.reinterpret(),
                documenters?.toCStringList(this)
            )
        }

    /**
     * Sets the issue tracker URL for @self.
     *
     * The issue tracker link is displayed on the main page.
     *
     * @param issueUrl the issue tracker URL
     * @since 1.5
     */
    public fun setIssueUrl(issueUrl: String): Unit =
        adw_about_dialog_set_issue_url(adwAboutDialogPointer.reinterpret(), issueUrl)

    /**
     * Sets the license for @self.
     *
     * This can be used to set a custom text for the license if it can't be set via
     * [property@AboutDialog:license-type].
     *
     * When set, [property@AboutDialog:license-type] will be set to
     * `GTK_LICENSE_CUSTOM`.
     *
     * The license text will be displayed on the Legal page, below the copyright
     * information.
     *
     * License text can contain Pango markup and links.
     *
     * [method@AboutDialog.add_legal_section] can be used to add license information
     * for the application dependencies or other components.
     *
     * @param license the license
     * @since 1.5
     */
    public fun setLicense(license: String): Unit =
        adw_about_dialog_set_license(adwAboutDialogPointer.reinterpret(), license)

    /**
     * Sets the license for @self from a list of known licenses.
     *
     * If the application's license is not in the list,
     * [property@AboutDialog:license] can be used instead. The license type will be
     * automatically set to `GTK_LICENSE_CUSTOM` in that case.
     *
     * If @license_type is `GTK_LICENSE_UNKNOWN`, no information will be displayed.
     *
     * If @license_type is different from `GTK_LICENSE_CUSTOM`.
     * [property@AboutDialog:license] will be cleared out.
     *
     * The license description will be displayed on the Legal page, below the
     * copyright information.
     *
     * [method@AboutDialog.add_legal_section] can be used to add license information
     * for the application dependencies or other components.
     *
     * @param licenseType the license type
     * @since 1.5
     */
    public fun setLicenseType(licenseType: License): Unit =
        adw_about_dialog_set_license_type(adwAboutDialogPointer.reinterpret(), licenseType.nativeValue)

    /**
     * Sets the release notes for @self.
     *
     * Release notes are displayed on the the What's New page.
     *
     * Release notes are formatted the same way as
     * [AppStream descriptions](https://freedesktop.org/software/appstream/docs/chap-Metadata.html#tag-description).
     *
     * The supported formatting options are:
     *
     * * Paragraph (`<p>`)
     * * Ordered list (`<ol>`), with list items (`<li>`)
     * * Unordered list (`<ul>`), with list items (`<li>`)
     *
     * Within paragraphs and list items, emphasis (`<em>`) and inline code
     * (`<code>`) text styles are supported. The emphasis is rendered in italic,
     * while inline code is shown in a monospaced font.
     *
     * Any text outside paragraphs or list items is ignored.
     *
     * Nested lists are not supported.
     *
     * `AdwAboutDialog` displays the version above the release notes. If set, the
     * [property@AboutDialog:release-notes-version] of the property will be used
     * as the version; otherwise, [property@AboutDialog:version] is used.
     *
     * @param releaseNotes the release notes
     * @since 1.5
     */
    public fun setReleaseNotes(releaseNotes: String): Unit =
        adw_about_dialog_set_release_notes(adwAboutDialogPointer.reinterpret(), releaseNotes)

    /**
     * Sets the version described by the application's release notes.
     *
     * The release notes version is displayed on the What's New page, above the
     * release notes.
     *
     * If not set, [property@AboutDialog:version] will be used instead.
     *
     * For example, an application with the current version 2.0.2 might want to
     * keep the release notes from 2.0.0, and set the release notes version
     * accordingly.
     *
     * See [property@AboutDialog:release-notes].
     *
     * @param version the release notes version
     * @since 1.5
     */
    public fun setReleaseNotesVersion(version: String): Unit =
        adw_about_dialog_set_release_notes_version(adwAboutDialogPointer.reinterpret(), version)

    /**
     * Sets the URL of the support page for @self.
     *
     * The support page link is displayed on the main page.
     *
     * @param supportUrl the support page URL
     * @since 1.5
     */
    public fun setSupportUrl(supportUrl: String): Unit =
        adw_about_dialog_set_support_url(adwAboutDialogPointer.reinterpret(), supportUrl)

    /**
     * Sets the translator credits string.
     *
     * It will be displayed on the Credits page.
     *
     * This string should be `"translator-credits"` or `"translator_credits"` and
     * should be marked as translatable.
     *
     * The string may contain email addresses and URLs, see the introduction for
     * more details.
     *
     * See also:
     *
     * * [property@AboutDialog:developers]
     * * [property@AboutDialog:designers]
     * * [property@AboutDialog:artists]
     * * [property@AboutDialog:documenters]
     * * [method@AboutDialog.add_credit_section]
     * * [method@AboutDialog.add_acknowledgement_section]
     *
     * @param translatorCredits the translator credits
     * @since 1.5
     */
    public fun setTranslatorCredits(translatorCredits: String): Unit =
        adw_about_dialog_set_translator_credits(adwAboutDialogPointer.reinterpret(), translatorCredits)

    /**
     * Sets the version for @self.
     *
     * The version is displayed on the main page.
     *
     * If [property@AboutDialog:release-notes-version] is not set, the version will
     * also be displayed above the release notes on the What's New page.
     *
     * @param version the version
     * @since 1.5
     */
    public fun setVersion(version: String): Unit =
        adw_about_dialog_set_version(adwAboutDialogPointer.reinterpret(), version)

    /**
     * Sets the application website URL for @self.
     *
     * Website is displayed on the Details page, below comments, or on the main page
     * if the Details page doesn't have any other content.
     *
     * Applications can add other links below, see [method@AboutDialog.add_link].
     *
     * @param website the website URL
     * @since 1.5
     */
    public fun setWebsite(website: String): Unit =
        adw_about_dialog_set_website(adwAboutDialogPointer.reinterpret(), website)

    /**
     * Emitted when a URL is activated.
     *
     * Applications may connect to it to override the default behavior, which is
     * to call [func@Gtk.show_uri].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `uri` the URI to activate. Returns `TRUE` if the link has been activated
     * @since 1.5
     */
    public fun connectActivateLink(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (uri: String) -> Boolean,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "activate-link",
            connectActivateLinkFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<AboutDialog> {
        override val type: GeneratedClassKGType<AboutDialog> =
            GeneratedClassKGType(adw_about_dialog_get_type()) { AboutDialog(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }
    }
}

private val connectActivateLinkFunc: CPointer<CFunction<(CPointer<ByteVar>) -> Int>> =
    staticCFunction {
            _: COpaquePointer,
            uri: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    uri: String,
                ) -> Boolean
            >()
            .get()
            .invoke(uri?.toKString() ?: error("Expected not null string"))
            .asGBoolean()
    }.reinterpret()