package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.MemberName

data class FunctionBlueprint(
    val kotlinName: String,
    val nativeName: String,
    val nativeMemberName: MemberName,
    val parameterBlueprints: List<ParameterBlueprint>,
    val returnTypeInfo: TypeInfo,
)
