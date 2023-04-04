/*
 * Copyright (c) 2023 gtk-kt
 *
 * This file is part of gtk-kt.
 * gtk-kt is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kt is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kt. If not, see https://www.gnu.org/licenses/.
 */

package org.gtkkn.gir.generator

import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import org.gtkkn.gir.blueprints.InterfaceBlueprint

interface InterfaceGenerator : KDocGenerator, MiscGenerator {
    fun buildInterface(iface: InterfaceBlueprint): TypeSpec =
        TypeSpec.interfaceBuilder(iface.typeName).apply {
            addProperty(buildInterfacePointerProperty(iface))

            // kdoc
            addKdoc(buildTypeKDoc(iface.kdoc, iface.version, iface.skippedObjects))

            // properties
            iface.properties.forEach { property ->
                addProperty(buildProperty(property, iface.objectPointerName))
            }

            // methods
            iface.methods.forEach { method ->
                addFunction(buildMethod(method, iface.objectPointerName))
            }

            // signal connect methods
            iface.signals.forEach { signal ->
                addFunction(buildSignalConnectFunction(signal, iface.objectPointerName))
            }

            val wrapperClass = TypeSpec.classBuilder("Wrapper")
                .addModifiers(KModifier.PRIVATE, KModifier.DATA)
                .addSuperinterface(iface.typeName)
                .primaryConstructor(
                    FunSpec.constructorBuilder()
                        .addParameter("pointer", iface.objectPointerTypeName)
                        .build(),
                )
                .addProperty(
                    PropertySpec.builder("pointer", iface.objectPointerTypeName, KModifier.PRIVATE)
                        .initializer("pointer")
                        .build(),
                )
                .addProperty(
                    PropertySpec.builder(iface.objectPointerName, iface.objectPointerTypeName, KModifier.OVERRIDE)
                        .initializer("pointer")
                        .build(),
                )
                .build()

            addType(wrapperClass)

            // Add companion with factory wrapper function
            val companionBuilder = TypeSpec.companionObjectBuilder()

            // wrap factory function
            val factoryFunc = FunSpec.builder("wrap")
                .addParameter("pointer", iface.objectPointerTypeName)
                .returns(iface.typeName)
                .addStatement("return Wrapper(pointer)")
            companionBuilder.addFunction(factoryFunc.build())

            iface.functions.forEach { companionBuilder.addFunction(buildFunction(it)) }

            addType(companionBuilder.build())
        }.build()

    private fun buildInterfacePointerProperty(iface: InterfaceBlueprint): PropertySpec =
        PropertySpec.builder(iface.objectPointerName, iface.objectPointerTypeName)
            .build()
}
