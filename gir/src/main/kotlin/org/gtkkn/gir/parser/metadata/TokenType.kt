/*
 * Copyright (c) 2024 gtk-kn
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kn. If not, see https://www.gnu.org/licenses/.
 */

package org.gtkkn.gir.parser.metadata

enum class TokenType {
    EOF,
    NONE,
    IDENTIFIER,
    INTEGER_LITERAL,
    REAL_LITERAL,
    STRING_LITERAL,
    CHARACTER_LITERAL,
    OPEN_BRACE,
    CLOSE_BRACE,
    OPEN_PARENS,
    CLOSE_PARENS,
    OPEN_BRACKET,
    CLOSE_BRACKET,
    DOT,
    COMMA,
    SEMICOLON,
    COLON,
    ASSIGN,
    PLUS,
    MINUS,
    STAR,
    DIV,
    PERCENT,
    OP_EQ,
    OP_NE,
    OP_LT,
    OP_GT,
    OP_LE,
    OP_GE,
    OP_NEG,
    OP_AND,
    OP_OR,
    OP_INC,
    OP_DEC,
    INDENT,
    DEDENT,
    EOL,
    TRUE,
    FALSE,
    NULL,
    HASH,
    UNKNOWN
}
