package org.gtkkn.gir.blueprints

data class FieldBlueprint(
    val kotlinName: String,
    val nativeName: String,
    val typeInfo: TypeInfo,
    val kdoc: String?,
    val version: String?,
)
