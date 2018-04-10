/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.jvm.runtime;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/loadJava8/compiledJava")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class Jvm8RuntimeDescriptorLoaderTestGenerated extends AbstractJvm8RuntimeDescriptorLoaderTest {
    public void testAllFilesPresentInCompiledJava() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/loadJava8/compiledJava"), Pattern.compile("^(.+)\\.java$"), TargetBackend.ANY, true);
    }

    @TestMetadata("InnerClassTypeAnnotation.java")
    public void testInnerClassTypeAnnotation() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/loadJava8/compiledJava/InnerClassTypeAnnotation.java");
        doTest(fileName);
    }

    @TestMetadata("MapRemove.java")
    public void testMapRemove() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/loadJava8/compiledJava/MapRemove.java");
        doTest(fileName);
    }

    @TestMetadata("TypeAnnotations.java")
    public void testTypeAnnotations() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/loadJava8/compiledJava/TypeAnnotations.java");
        doTest(fileName);
    }

    @TestMetadata("TypeParameterAnnotations.java")
    public void testTypeParameterAnnotations() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/loadJava8/compiledJava/TypeParameterAnnotations.java");
        doTest(fileName);
    }
}
