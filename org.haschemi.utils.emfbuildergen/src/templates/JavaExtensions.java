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
package templates;

import org.eclipse.emf.ecore.EStructuralFeature;

public class JavaExtensions {
	public static String javaPackage(final String p_javaClass) {
		return p_javaClass.substring(0, p_javaClass.lastIndexOf("."));
	}

	public static void throwRuntimeException(final String p_message) {
		throw new RuntimeException(p_message);
	}

	/**
	 * Code taken from org.eclipse.uml2.codegen.ecore.Generator.
	 */
	public static String pluralize(String name) {
		if (name.equalsIgnoreCase("children") || name.endsWith("Children")) { //$NON-NLS-1$ //$NON-NLS-2$
			return name;
		} else if (name.equalsIgnoreCase("child") || name.endsWith("Child")) { //$NON-NLS-1$ //$NON-NLS-2$
			return name + "ren"; //$NON-NLS-1$
		} else if (name.equalsIgnoreCase("data") || name.endsWith("Data")) { //$NON-NLS-1$ //$NON-NLS-2$
			return name;
		} else if (name.equalsIgnoreCase("datum") || name.endsWith("Datum")) { //$NON-NLS-1$ //$NON-NLS-2$
			return name.substring(0, name.length() - 2) + "a"; //$NON-NLS-1$
		} else if (name.endsWith("By")) { //$NON-NLS-1$
			return name + "s"; //$NON-NLS-1$
		} else if (name.endsWith("y")) { //$NON-NLS-1$
			return name.substring(0, name.length() - 1) + "ies"; //$NON-NLS-1$
		} else if (name.endsWith("ex")) { //$NON-NLS-1$
			return name.substring(0, name.length() - 2) + "ices"; //$NON-NLS-1$
		} else if (name.endsWith("x")) { //$NON-NLS-1$
			return name + "es"; //$NON-NLS-1$
		} else if (name.endsWith("us")) { //$NON-NLS-1$
			return name.substring(0, name.length() - 2) + "i"; //$NON-NLS-1$
		} else if (name.endsWith("ss")) { //$NON-NLS-1$
			return name + "es"; //$NON-NLS-1$
		} else if (name.endsWith("s")) { //$NON-NLS-1$
			return name;
		} else {
			return name + "s"; //$NON-NLS-1$
		}
	}
	
	public String normalizedName(EStructuralFeature p_structuralFeature) {
		if(p_structuralFeature.getName().equals("class")) {
			return "class_";
		}
		return p_structuralFeature.getName();
	}
}
