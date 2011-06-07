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
import static org.haschemi.utils.emfbuildergen.tests.lazyBuilder.util.builder.ABuilder.newABuilder;
import static org.haschemi.utils.emfbuildergen.tests.lazyBuilder.util.builder.BBuilder.newBBuilder;
import static org.junit.Assert.assertThat;

import org.haschemi.utils.emfbuildergen.tests.lazyBuilder.A;
import org.haschemi.utils.emfbuildergen.tests.lazyBuilder.util.builder.ABuilder;
import org.haschemi.utils.emfbuildergen.tests.lazyBuilder.util.builder.BBuilder;
import org.junit.Test;

public class EMFBuilderGeneratorTest {
  @Test
  public void callsReferencedBuilderLazy() {
    BBuilder bBuilder = newBBuilder();
    ABuilder aBuilder = newABuilder().withB(bBuilder);

    A a1 = aBuilder.but().build();
    A a2 = aBuilder.but().build();

    assertThat(a1.getB(), is(notNullValue()));
    assertThat(a2.getB(), is(notNullValue()));
  }
}
