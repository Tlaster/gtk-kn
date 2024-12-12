// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GScanner
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_scanner_cur_line
import org.gtkkn.native.glib.g_scanner_cur_position
import org.gtkkn.native.glib.g_scanner_cur_token
import org.gtkkn.native.glib.g_scanner_destroy
import org.gtkkn.native.glib.g_scanner_eof
import org.gtkkn.native.glib.g_scanner_get_next_token
import org.gtkkn.native.glib.g_scanner_input_file
import org.gtkkn.native.glib.g_scanner_input_text
import org.gtkkn.native.glib.g_scanner_new
import org.gtkkn.native.glib.g_scanner_peek_next_token
import org.gtkkn.native.glib.g_scanner_scope_foreach_symbol
import org.gtkkn.native.glib.g_scanner_scope_remove_symbol
import org.gtkkn.native.glib.g_scanner_set_scope
import org.gtkkn.native.glib.g_scanner_sync_file_offset
import org.gtkkn.native.glib.g_scanner_unexp_token
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.gobject.gint
import org.gtkkn.native.gobject.guint
import kotlin.Boolean
import kotlin.Pair
import kotlin.String
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * `GScanner` provides a general-purpose lexical scanner.
 *
 * You should set @input_name after creating the scanner, since
 * it is used by the default message handler when displaying
 * warnings and errors. If you are scanning a file, the filename
 * would be a good choice.
 *
 * The @user_data and @max_parse_errors fields are not used.
 * If you need to associate extra data with the scanner you
 * can place them here.
 *
 * If you want to use your own message handler you can set the
 * @msg_handler field. The type of the message handler function
 * is declared by #GScannerMsgFunc.
 *
 * ## Skipped during bindings generation
 *
 * - method `cur_value`: Return type TokenValue is unsupported
 * - method `error`: Varargs parameter is not supported
 * - method `lookup_symbol`: Return type gpointer is unsupported
 * - parameter `value`: gpointer
 * - method `scope_lookup_symbol`: Return type gpointer is unsupported
 * - method `warn`: Varargs parameter is not supported
 * - field `user_data`: gpointer
 * - field `qdata`: Data
 * - field `value`: TokenValue
 * - field `next_value`: TokenValue
 * - field `symbol_table`: Record field symbol_table is private
 * - field `input_fd`: Record field input_fd is private
 * - field `text`: Record field text is private
 * - field `text_end`: Record field text_end is private
 * - field `buffer`: Record field buffer is private
 * - field `scope_id`: Record field scope_id is private
 * - field `msg_handler`: ScannerMsgFunc
 */
public class Scanner(pointer: CPointer<GScanner>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val glibScannerPointer: CPointer<GScanner> = pointer

    /**
     * unused
     */
    public var maxParseErrors: guint
        get() = glibScannerPointer.pointed.max_parse_errors

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerPointer.pointed.max_parse_errors = value
        }

    /**
     * g_scanner_error() increments this field
     */
    public var parseErrors: guint
        get() = glibScannerPointer.pointed.parse_errors

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerPointer.pointed.parse_errors = value
        }

    /**
     * name of input stream, featured by the default message handler
     */
    public var inputName: String?
        get() = glibScannerPointer.pointed.input_name?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerPointer.pointed.input_name?.let { g_free(it) }
            glibScannerPointer.pointed.input_name = value?.let { g_strdup(it) }
        }

    /**
     * link into the scanner configuration
     */
    public var config: ScannerConfig?
        get() = glibScannerPointer.pointed.config?.run {
            ScannerConfig(reinterpret())
        }

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerPointer.pointed.config = value?.glibScannerConfigPointer
        }

    /**
     * token parsed by the last g_scanner_get_next_token()
     */
    public var token: TokenType
        get() = glibScannerPointer.pointed.token.run {
            TokenType.fromNativeValue(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerPointer.pointed.token = value.nativeValue
        }

    /**
     * line number of the last token from g_scanner_get_next_token()
     */
    public var line: guint
        get() = glibScannerPointer.pointed.line

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerPointer.pointed.line = value
        }

    /**
     * char number of the last token from g_scanner_get_next_token()
     */
    public var position: guint
        get() = glibScannerPointer.pointed.position

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerPointer.pointed.position = value
        }

    /**
     * token parsed by the last g_scanner_peek_next_token()
     */
    public var nextToken: TokenType
        get() = glibScannerPointer.pointed.next_token.run {
            TokenType.fromNativeValue(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerPointer.pointed.next_token = value.nativeValue
        }

    /**
     * line number of the last token from g_scanner_peek_next_token()
     */
    public var nextLine: guint
        get() = glibScannerPointer.pointed.next_line

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerPointer.pointed.next_line = value
        }

    /**
     * char number of the last token from g_scanner_peek_next_token()
     */
    public var nextPosition: guint
        get() = glibScannerPointer.pointed.next_position

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerPointer.pointed.next_position = value
        }

    /**
     * Allocate a new Scanner.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GScanner>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Scanner and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GScanner>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Scanner using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GScanner>().ptr)

    /**
     * Allocate a new Scanner.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param maxParseErrors unused
     * @param parseErrors g_scanner_error() increments this field
     * @param inputName name of input stream, featured by the default message handler
     * @param config link into the scanner configuration
     * @param token token parsed by the last g_scanner_get_next_token()
     * @param line line number of the last token from g_scanner_get_next_token()
     * @param position char number of the last token from g_scanner_get_next_token()
     * @param nextToken token parsed by the last g_scanner_peek_next_token()
     * @param nextLine line number of the last token from g_scanner_peek_next_token()
     * @param nextPosition char number of the last token from g_scanner_peek_next_token()
     */
    public constructor(
        maxParseErrors: guint,
        parseErrors: guint,
        inputName: String?,
        config: ScannerConfig?,
        token: TokenType,
        line: guint,
        position: guint,
        nextToken: TokenType,
        nextLine: guint,
        nextPosition: guint,
    ) : this() {
        this.maxParseErrors = maxParseErrors
        this.parseErrors = parseErrors
        this.inputName = inputName
        this.config = config
        this.token = token
        this.line = line
        this.position = position
        this.nextToken = nextToken
        this.nextLine = nextLine
        this.nextPosition = nextPosition
    }

    /**
     * Allocate a new Scanner using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param maxParseErrors unused
     * @param parseErrors g_scanner_error() increments this field
     * @param inputName name of input stream, featured by the default message handler
     * @param config link into the scanner configuration
     * @param token token parsed by the last g_scanner_get_next_token()
     * @param line line number of the last token from g_scanner_get_next_token()
     * @param position char number of the last token from g_scanner_get_next_token()
     * @param nextToken token parsed by the last g_scanner_peek_next_token()
     * @param nextLine line number of the last token from g_scanner_peek_next_token()
     * @param nextPosition char number of the last token from g_scanner_peek_next_token()
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        maxParseErrors: guint,
        parseErrors: guint,
        inputName: String?,
        config: ScannerConfig?,
        token: TokenType,
        line: guint,
        position: guint,
        nextToken: TokenType,
        nextLine: guint,
        nextPosition: guint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.maxParseErrors = maxParseErrors
        this.parseErrors = parseErrors
        this.inputName = inputName
        this.config = config
        this.token = token
        this.line = line
        this.position = position
        this.nextToken = nextToken
        this.nextLine = nextLine
        this.nextPosition = nextPosition
    }

    /**
     * Returns the current line in the input stream (counting
     * from 1). This is the line of the last token parsed via
     * g_scanner_get_next_token().
     *
     * @return the current line
     */
    public fun curLine(): guint = g_scanner_cur_line(glibScannerPointer.reinterpret())

    /**
     * Returns the current position in the current line (counting
     * from 0). This is the position of the last token parsed via
     * g_scanner_get_next_token().
     *
     * @return the current position on the line
     */
    public fun curPosition(): guint = g_scanner_cur_position(glibScannerPointer.reinterpret())

    /**
     * Gets the current token type. This is simply the @token
     * field in the #GScanner structure.
     *
     * @return the current token type
     */
    public fun curToken(): TokenType = g_scanner_cur_token(glibScannerPointer.reinterpret()).run {
        TokenType.fromNativeValue(this)
    }

    /**
     * Frees all memory used by the #GScanner.
     */
    public fun destroy(): Unit = g_scanner_destroy(glibScannerPointer.reinterpret())

    /**
     * Returns true if the scanner has reached the end of
     * the file or text buffer.
     *
     * @return true if the scanner has reached the end of
     *     the file or text buffer
     */
    public fun eof(): Boolean = g_scanner_eof(glibScannerPointer.reinterpret()).asBoolean()

    /**
     * Parses the next token just like g_scanner_peek_next_token()
     * and also removes it from the input stream. The token data is
     * placed in the @token, @value, @line, and @position fields of
     * the #GScanner structure.
     *
     * @return the type of the token
     */
    public fun getNextToken(): TokenType = g_scanner_get_next_token(glibScannerPointer.reinterpret()).run {
        TokenType.fromNativeValue(this)
    }

    /**
     * Prepares to scan a file.
     *
     * @param inputFd a file descriptor
     */
    public fun inputFile(inputFd: gint): Unit = g_scanner_input_file(glibScannerPointer.reinterpret(), inputFd)

    /**
     * Prepares to scan a text buffer.
     *
     * @param text the text buffer to scan
     * @param textLen the length of the text buffer
     */
    public fun inputText(text: String, textLen: guint): Unit =
        g_scanner_input_text(glibScannerPointer.reinterpret(), text, textLen)

    /**
     * Parses the next token, without removing it from the input stream.
     * The token data is placed in the @next_token, @next_value, @next_line,
     * and @next_position fields of the #GScanner structure.
     *
     * Note that, while the token is not removed from the input stream
     * (i.e. the next call to g_scanner_get_next_token() will return the
     * same token), it will not be reevaluated. This can lead to surprising
     * results when changing scope or the scanner configuration after peeking
     * the next token. Getting the next token after switching the scope or
     * configuration will return whatever was peeked before, regardless of
     * any symbols that may have been added or removed in the new scope.
     *
     * @return the type of the token
     */
    public fun peekNextToken(): TokenType = g_scanner_peek_next_token(glibScannerPointer.reinterpret()).run {
        TokenType.fromNativeValue(this)
    }

    /**
     * Calls the given function for each of the symbol/value pairs
     * in the given scope of the #GScanner. The function is passed
     * the symbol and value of each pair, and the given @user_data
     * parameter.
     *
     * @param scopeId the scope id
     * @param func the function to call for each symbol/value pair
     */
    public fun scopeForeachSymbol(scopeId: guint, func: HFunc): Unit = g_scanner_scope_foreach_symbol(
        glibScannerPointer.reinterpret(),
        scopeId,
        HFuncFunc.reinterpret(),
        StableRef.create(func).asCPointer()
    )

    /**
     * Removes a symbol from a scope.
     *
     * @param scopeId the scope id
     * @param symbol the symbol to remove
     */
    public fun scopeRemoveSymbol(scopeId: guint, symbol: String): Unit =
        g_scanner_scope_remove_symbol(glibScannerPointer.reinterpret(), scopeId, symbol)

    /**
     * Sets the current scope.
     *
     * @param scopeId the new scope id
     * @return the old scope id
     */
    public fun setScope(scopeId: guint): guint = g_scanner_set_scope(glibScannerPointer.reinterpret(), scopeId)

    /**
     * Rewinds the filedescriptor to the current buffer position
     * and blows the file read ahead buffer. This is useful for
     * third party uses of the scanners filedescriptor, which hooks
     * onto the current scanning position.
     */
    public fun syncFileOffset(): Unit = g_scanner_sync_file_offset(glibScannerPointer.reinterpret())

    /**
     * Outputs a message through the scanner's msg_handler,
     * resulting from an unexpected token in the input stream.
     * Note that you should not call g_scanner_peek_next_token()
     * followed by g_scanner_unexp_token() without an intermediate
     * call to g_scanner_get_next_token(), as g_scanner_unexp_token()
     * evaluates the scanner's current token (not the peeked token)
     * to construct part of the message.
     *
     * @param expectedToken the expected token
     * @param identifierSpec a string describing how the scanner's user
     *     refers to identifiers (null defaults to "identifier").
     *     This is used if @expected_token is %G_TOKEN_IDENTIFIER or
     *     %G_TOKEN_IDENTIFIER_NULL.
     * @param symbolSpec a string describing how the scanner's user refers
     *     to symbols (null defaults to "symbol"). This is used if
     *     @expected_token is %G_TOKEN_SYMBOL or any token value greater
     *     than %G_TOKEN_LAST.
     * @param symbolName the name of the symbol, if the scanner's current
     *     token is a symbol.
     * @param message a message string to output at the end of the
     *     warning/error, or null.
     * @param isError if true it is output as an error. If false it is
     *     output as a warning.
     */
    public fun unexpToken(
        expectedToken: TokenType,
        identifierSpec: String,
        symbolSpec: String,
        symbolName: String,
        message: String,
        isError: gint,
    ): Unit = g_scanner_unexp_token(
        glibScannerPointer.reinterpret(),
        expectedToken.nativeValue,
        identifierSpec,
        symbolSpec,
        symbolName,
        message,
        isError
    )

    override fun toString(): String =
        "Scanner(maxParseErrors=$maxParseErrors, parseErrors=$parseErrors, inputName=$inputName, config=$config, token=$token, line=$line, position=$position, nextToken=$nextToken, nextLine=$nextLine, nextPosition=$nextPosition)"

    public companion object {
        /**
         * Creates a new #GScanner.
         *
         * The @config_templ structure specifies the initial settings
         * of the scanner, which are copied into the #GScanner
         * @config field. If you pass null then the default settings
         * are used.
         *
         * @param configTempl the initial scanner settings
         * @return the new #GScanner
         */
        public fun new(configTempl: ScannerConfig): Scanner =
            g_scanner_new(configTempl.glibScannerConfigPointer.reinterpret())!!.run {
                Scanner(reinterpret())
            }
    }
}
