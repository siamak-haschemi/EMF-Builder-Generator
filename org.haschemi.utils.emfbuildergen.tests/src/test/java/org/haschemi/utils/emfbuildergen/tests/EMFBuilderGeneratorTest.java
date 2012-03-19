/*******************************************************************************
 * Copyright (c) 2010 - 2010 Azmun project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Azmun project committers - initial API and implementation
 * Web: http://www.azmun.de
 * Contact : siamak AT haschemi.org
 *******************************************************************************/
package org.haschemi.utils.emfbuildergen.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.haschemi.utils.emfbuildergen.tests.lazyBuilder.util.builder.LazyBuilderBuilders.newABuilder;
import static org.haschemi.utils.emfbuildergen.tests.lazyBuilder.util.builder.LazyBuilderBuilders.newBBuilder;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.haschemi.utils.emfbuildergen.EMFBuilderGenerator;
import org.haschemi.utils.emfbuildergen.tests.lazyBuilder.A;
import org.haschemi.utils.emfbuildergen.tests.lazyBuilder.util.builder.ABuilder;
import org.haschemi.utils.emfbuildergen.tests.lazyBuilder.util.builder.BBuilder;
import org.junit.Before;
import org.junit.Test;

public class EMFBuilderGeneratorTest {
	private String platformUri;
	private WorkflowContextDefaultImpl context;
	private IssuesImpl issues;
	private NullProgressMonitor progressMonitor;
	
	@Before
	public void setUp() throws IOException {
		setPlatformUri(new File("..").getCanonicalPath());
		context = new WorkflowContextDefaultImpl();
		issues = new IssuesImpl();
		progressMonitor = new NullProgressMonitor();
	}

	@Test
	public void callsReferencedBuilderLazy() {
		BBuilder bBuilder = newBBuilder();
		ABuilder aBuilder = newABuilder().withB(bBuilder);

		A a1 = aBuilder.but().build();
		A a2 = aBuilder.but().build();

		assertThat(a1.getB(), is(notNullValue()));
		assertThat(a2.getB(), is(notNullValue()));
	}

	@Test
	public void testIssue6_MoreThanOnePackage() throws IOException {
		EMFBuilderGenerator emfBuilderGenerator = new EMFBuilderGenerator();
		emfBuilderGenerator.setEcoreURI(URI.createPlatformResourceURI("/org.haschemi.utils.emfbuildergen.tests/model/issue6.ecore", true).toString());
		emfBuilderGenerator.addGenModelUri(URI.createPlatformResourceURI("/org.haschemi.utils.emfbuildergen.tests/model/issue6.genmodel", true).toString());
		invoke(emfBuilderGenerator);
	}

	private void invoke(EMFBuilderGenerator emfBuilderGenerator) {
		emfBuilderGenerator.setPlatformUri(platformUri);
		emfBuilderGenerator.checkConfiguration(issues);
		emfBuilderGenerator.invoke(context, progressMonitor, issues);
		if (issues.getErrors().length > 0) {
			StringBuilder sb = new StringBuilder();
			for (Diagnostic diagnostic : issues.getErrors()) {
				sb.append(diagnostic.getMessage()).append("\n");
			}
			fail(sb.toString());
		}
	}	

	private void setPlatformUri(final String pathToPlatform) {
		final File f = new File(pathToPlatform);
		if (f.exists()) {
			for (final File subdir : f.listFiles(new FileFilter() {
				@Override
				public boolean accept(final File arg0) {
					return arg0.exists() && arg0.isDirectory()
							&& !arg0.getName().startsWith(".");
				}
			})) {
				final String s = subdir.getName();
				try {
					final URI uri = URI.createFileURI(subdir.getCanonicalPath()
							+ "/");
					EcorePlugin.getPlatformResourceMap().put(s, uri);
				} catch (final IOException e) {
					throw new RuntimeException(
							"Error when registering platform location", e);
				}
			}
		}
	}
}
