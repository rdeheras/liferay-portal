/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.jenkins.results.parser.test.clazz.group;

import com.liferay.jenkins.results.parser.GitWorkingDirectory;

import java.io.File;

import java.util.List;

/**
 * @author Peter Yoo
 */
public interface TestClassGroup {

	public List<TestClass> getTestClasses();

	public List<TestClass.TestClassFile> getTestClassFiles();

	public interface TestClass extends Comparable<TestClass> {

		public TestClassFile getTestClassFile();

		public List<TestClassMethod> getTestClassMethods();

		public static class TestClassFile extends File {

			public TestClassFile(File parent, String child) {
				super(parent, child);

				_relativePath = getPath();
			}

			public TestClassFile(String pathname) {
				super(pathname);

				_relativePath = pathname;
			}

			public TestClassFile(
				String pathname, String absolutePath,
				GitWorkingDirectory gitWorkingDirectory) {

				super(pathname);

				File workingDirectory =
					gitWorkingDirectory.getWorkingDirectory();

				_relativePath = absolutePath.replace(
					workingDirectory.getAbsolutePath(), "");
			}

			public String getRelativePath() {
				return _relativePath;
			}

			private final String _relativePath;

		}

		public static class TestClassMethod {

			public String getName() {
				return _name;
			}

			public TestClassGroup.TestClass getTestClass() {
				return _testClass;
			}

			public boolean isIgnored() {
				return _ignored;
			}

			protected TestClassMethod(
				boolean ignored, String name,
				BaseTestClassGroup.BaseTestClass testClass) {

				_ignored = ignored;
				_name = name;
				_testClass = testClass;
			}

			private final boolean _ignored;
			private final String _name;
			private final TestClassGroup.TestClass _testClass;

		}

	}

}