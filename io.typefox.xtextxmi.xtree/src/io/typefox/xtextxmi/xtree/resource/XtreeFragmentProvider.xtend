/** 
 * Copyright (c) 2017 TypeFox and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package io.typefox.xtextxmi.xtree.resource

import com.google.inject.Inject
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.IFragmentProvider
import org.eclipse.xtext.util.IResourceScopeCache

/** 
 * A fragment provider that uses qualified names as fragments. 
 */
class XtreeFragmentProvider implements IFragmentProvider {
	
	@Inject IQualifiedNameConverter qualifiedNameConverter
	@Inject IQualifiedNameProvider qualifiedNameProvider
	@Inject IResourceScopeCache cache
	
	static val CACHE_KEY = 'name2element'
	
	override getEObject(Resource resource, String fragment, Fallback fallback) {
		try {
			val qualifiedName = qualifiedNameConverter.toQualifiedName(fragment)
			return getName2ElementMap(resource).get(qualifiedName)
		} catch (Exception exc) {
			return fallback.getEObject(fragment)
		}
	}
	
	/** 
	 * Returns a map qualifiedName -> EObject that is calculated on demand and cached. 
	 */
	def private Map<QualifiedName, EObject> getName2ElementMap(Resource resource) {
		cache.get(CACHE_KEY, resource, [
			val name2element = <QualifiedName, EObject>newHashMap
			resource.allContents.forEach [
				name2element.put(qualifiedNameProvider.getFullyQualifiedName(it), it)
			]
			return name2element
		])
	}
	
	override getFragment(EObject obj, Fallback fallback) {
		return qualifiedNameConverter.toString(qualifiedNameProvider.getFullyQualifiedName(obj))
	}
}