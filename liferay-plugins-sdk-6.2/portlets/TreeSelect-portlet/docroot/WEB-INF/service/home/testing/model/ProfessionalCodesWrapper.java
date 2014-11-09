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

package home.testing.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ProfessionalCodes}.
 * </p>
 *
 * @author LMendes
 * @see ProfessionalCodes
 * @generated
 */
public class ProfessionalCodesWrapper implements ProfessionalCodes,
	ModelWrapper<ProfessionalCodes> {
	public ProfessionalCodesWrapper(ProfessionalCodes professionalCodes) {
		_professionalCodes = professionalCodes;
	}

	@Override
	public Class<?> getModelClass() {
		return ProfessionalCodes.class;
	}

	@Override
	public String getModelClassName() {
		return ProfessionalCodes.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("professionalCodesId", getProfessionalCodesId());
		attributes.put("level", getLevel());
		attributes.put("code", getCode());
		attributes.put("designation", getDesignation());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer professionalCodesId = (Integer)attributes.get(
				"professionalCodesId");

		if (professionalCodesId != null) {
			setProfessionalCodesId(professionalCodesId);
		}

		Integer level = (Integer)attributes.get("level");

		if (level != null) {
			setLevel(level);
		}

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		String designation = (String)attributes.get("designation");

		if (designation != null) {
			setDesignation(designation);
		}
	}

	/**
	* Returns the primary key of this professional codes.
	*
	* @return the primary key of this professional codes
	*/
	@Override
	public int getPrimaryKey() {
		return _professionalCodes.getPrimaryKey();
	}

	/**
	* Sets the primary key of this professional codes.
	*
	* @param primaryKey the primary key of this professional codes
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_professionalCodes.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the professional codes ID of this professional codes.
	*
	* @return the professional codes ID of this professional codes
	*/
	@Override
	public int getProfessionalCodesId() {
		return _professionalCodes.getProfessionalCodesId();
	}

	/**
	* Sets the professional codes ID of this professional codes.
	*
	* @param professionalCodesId the professional codes ID of this professional codes
	*/
	@Override
	public void setProfessionalCodesId(int professionalCodesId) {
		_professionalCodes.setProfessionalCodesId(professionalCodesId);
	}

	/**
	* Returns the level of this professional codes.
	*
	* @return the level of this professional codes
	*/
	@Override
	public int getLevel() {
		return _professionalCodes.getLevel();
	}

	/**
	* Sets the level of this professional codes.
	*
	* @param level the level of this professional codes
	*/
	@Override
	public void setLevel(int level) {
		_professionalCodes.setLevel(level);
	}

	/**
	* Returns the code of this professional codes.
	*
	* @return the code of this professional codes
	*/
	@Override
	public java.lang.String getCode() {
		return _professionalCodes.getCode();
	}

	/**
	* Sets the code of this professional codes.
	*
	* @param code the code of this professional codes
	*/
	@Override
	public void setCode(java.lang.String code) {
		_professionalCodes.setCode(code);
	}

	/**
	* Returns the designation of this professional codes.
	*
	* @return the designation of this professional codes
	*/
	@Override
	public java.lang.String getDesignation() {
		return _professionalCodes.getDesignation();
	}

	/**
	* Sets the designation of this professional codes.
	*
	* @param designation the designation of this professional codes
	*/
	@Override
	public void setDesignation(java.lang.String designation) {
		_professionalCodes.setDesignation(designation);
	}

	@Override
	public boolean isNew() {
		return _professionalCodes.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_professionalCodes.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _professionalCodes.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_professionalCodes.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _professionalCodes.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _professionalCodes.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_professionalCodes.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _professionalCodes.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_professionalCodes.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_professionalCodes.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_professionalCodes.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ProfessionalCodesWrapper((ProfessionalCodes)_professionalCodes.clone());
	}

	@Override
	public int compareTo(home.testing.model.ProfessionalCodes professionalCodes) {
		return _professionalCodes.compareTo(professionalCodes);
	}

	@Override
	public int hashCode() {
		return _professionalCodes.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<home.testing.model.ProfessionalCodes> toCacheModel() {
		return _professionalCodes.toCacheModel();
	}

	@Override
	public home.testing.model.ProfessionalCodes toEscapedModel() {
		return new ProfessionalCodesWrapper(_professionalCodes.toEscapedModel());
	}

	@Override
	public home.testing.model.ProfessionalCodes toUnescapedModel() {
		return new ProfessionalCodesWrapper(_professionalCodes.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _professionalCodes.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _professionalCodes.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_professionalCodes.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProfessionalCodesWrapper)) {
			return false;
		}

		ProfessionalCodesWrapper professionalCodesWrapper = (ProfessionalCodesWrapper)obj;

		if (Validator.equals(_professionalCodes,
					professionalCodesWrapper._professionalCodes)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ProfessionalCodes getWrappedProfessionalCodes() {
		return _professionalCodes;
	}

	@Override
	public ProfessionalCodes getWrappedModel() {
		return _professionalCodes;
	}

	@Override
	public void resetOriginalValues() {
		_professionalCodes.resetOriginalValues();
	}

	private ProfessionalCodes _professionalCodes;
}