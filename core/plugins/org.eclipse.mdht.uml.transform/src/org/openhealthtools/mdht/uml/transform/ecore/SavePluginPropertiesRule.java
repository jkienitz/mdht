/*******************************************************************************
 * Copyright (c) 2012 Christian W. Damus and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 *
 *******************************************************************************/
package org.openhealthtools.mdht.uml.transform.ecore;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.transform.core.ITransformMonitor;
import org.openhealthtools.mdht.transform.core.RuleKind;
import org.openhealthtools.mdht.transform.core.TransformationException;
import org.openhealthtools.mdht.transform.core.impl.AbstractRule;
import org.openhealthtools.mdht.uml.transform.PluginPropertiesUtil;

/**
 * A rule that saves the <tt>plugin.properties</tt> file generated by the transformation.
 */
public class SavePluginPropertiesRule extends AbstractRule {

	public SavePluginPropertiesRule() {
		super(IEcoreTransformIDs.SAVE_PLUGIN_PROPERTIES_RULE, RuleKind.SAVE, "Save plugin.properties file");
	}

	@Override
	protected Object doApply(EObject input, ITransformMonitor monitor) throws TransformationException {
		getContext().get(PluginPropertiesUtil.class).save();
		return null;
	}

}
