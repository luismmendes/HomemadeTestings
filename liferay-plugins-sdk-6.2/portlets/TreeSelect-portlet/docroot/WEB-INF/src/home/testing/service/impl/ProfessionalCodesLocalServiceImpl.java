/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package home.testing.service.impl;

import home.testing.model.ProfessionalCodes;
import home.testing.service.base.ProfessionalCodesLocalServiceBaseImpl;
import home.testing.service.persistence.ProfessionalCodesUtil;

import java.util.List;
import java.util.TreeMap;

import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;

/**
 * The implementation of the professional codes local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link home.testing.service.ProfessionalCodesLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author LMendes
 * @see home.testing.service.base.ProfessionalCodesLocalServiceBaseImpl
 * @see home.testing.service.ProfessionalCodesLocalServiceUtil
 */
public class ProfessionalCodesLocalServiceImpl extends
		ProfessionalCodesLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * home.testing.service.ProfessionalCodesLocalServiceUtil} to access the
	 * professional codes local service.
	 */

	public JSONObject getAllProfessionalCodes() {
		
		JSONObject jTree = JSONFactoryUtil.createJSONObject();
		DynamicQuery cppQuery = DynamicQueryFactoryUtil.forClass(
				ProfessionalCodes.class,
				PortletClassLoaderUtil.getClassLoader());
		Criterion level3 = PropertyFactoryUtil.forName("level").eq(new Integer ("3")); 
		
		cppQuery.add(level3);
		
		try {
			List<ProfessionalCodes> l = ProfessionalCodesUtil.findWithDynamicQuery(cppQuery);
			
			for (ProfessionalCodes professionalCodes : l) {
				jTree.put(professionalCodes.getCode(), professionalCodes.getDesignation());
			}
			
			for (ProfessionalCodes profCodes : ProfessionalCodesUtil.findAll()) {
				if (!jTree.has(profCodes.getCode())){
					
					int parentSize = profCodes.getCode().replace(".", "").length()-1 ;
					
					String parent = profCodes.getCode().replace(".", "").substring(0, parentSize); 
					
					jTree.getJSONObject(parent).put(profCodes.getCode(), profCodes.getDesignation());
				}
			}
			
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return jTree;
	}
}