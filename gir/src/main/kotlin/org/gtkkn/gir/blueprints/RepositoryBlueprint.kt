package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.ClassName

data class RepositoryBlueprint(
    val name: String,
    val kotlinModuleName: String,
    val classBlueprints: List<ClassBlueprint>,
    val interfaceBlueprints: List<InterfaceBlueprint>,
    val enumBlueprints: List<EnumBlueprint>,
    val functionBlueprints: List<FunctionBlueprint>,
    val callbackBlueprints: List<CallbackBlueprint>,
    val bitfieldBlueprints: List<BitfieldBlueprint>,
    val constantBlueprints: List<ConstantBlueprint>,
    val recordBlueprints: List<RecordBlueprint>,
    val skippedObjects: List<SkippedObject>,
    val repositoryObjectName: ClassName,
    val repositoryCallbacksName: ClassName,
)