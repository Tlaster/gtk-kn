// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.glib.GlibException

public class MediaErrorException(
    error: Error,
    public val code: MediaError,
) : GlibException(error)