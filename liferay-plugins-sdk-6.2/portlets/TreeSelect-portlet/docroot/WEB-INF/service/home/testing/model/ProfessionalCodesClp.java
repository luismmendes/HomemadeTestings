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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import home.testing.service.ClpSerializer;
import home.testing.service.ProfessionalCodesLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LMendes
 */
public class ProfessionalCodesClp extends BaseModelImpl<ProfessionalCodes>
	implements ProfessionalCodes {
	public ProfessionalCodesClp() {
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
	public int getPrimaryKey() {
		return _professionalCodesId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setProfessionalCodesId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _professionalCodesId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
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

	@Override
	public int getProfessionalCodesId() {
		return _professionalCodesId;
	}

	@Override
	public void setProfessionalCodesId(int professionalCodesId) {
		_professionalCodesId = professionalCodesId;

		if (_professionalCodesRemoteModel != null) {
			try {
				Class<?> clazz = _professionalCodesRemoteModel.getClass();

				Method method = clazz.getMethod("setProfessionalCodesId",
						int.class);

				method.invoke(_professionalCodesRemoteModel, professionalCodesId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLevel() {
		return _level;
	}

	@Override
	public void setLevel(int level) {
		_level = level;

		if (_professionalCodesRemoteModel != null) {
			try {
				Class<?> clazz = _professionalCodesRemoteModel.getClass();

				Method method = clazz.getMethod("setLevel", int.class);

				method.invoke(_professionalCodesRemoteModel, level);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCode() {
		return _code;
	}

	@Override
	public void setCode(String code) {
		_code = code;

		if (_professionalCodesRemoteModel != null) {
			try {
				Class<?> clazz = _professionalCodesRemoteModel.getClass();

				Method method = clazz.getMethod("setCode", String.class);

				method.invoke(_professionalCodesRemoteModel, code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDesignation() {
		return _designation;
	}

	@Override
	public void setDesignation(String designation) {
		_designation = designation;

		if (_professionalCodesRemoteModel != null) {
			try {
				Class<?> clazz = _professionalCodesRemoteModel.getClass();

				Method method = clazz.getMethod("setDesignation", String.class);

				method.invoke(_professionalCodesRemoteModel, designation);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getProfessionalCodesRemoteModel() {
		return _professionalCodesRemoteModel;
	}

	public void setProfessionalCodesRemoteModel(
		BaseModel<?> professionalCodesRemoteModel) {
		_professionalCodesRemoteModel = professionalCodesRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _professionalCodesRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_professionalCodesRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ProfessionalCodesLocalServiceUtil.addProfessionalCodes(this);
		}
		else {
			ProfessionalCodesLocalServiceUtil.updateProfessionalCodes(this);
		}
	}

	@Override
	public ProfessionalCodes toEscapedModel() {
		return (ProfessionalCodes)ProxyUtil.newProxyInstance(ProfessionalCodes.class.getClassLoader(),
			new Class[] { ProfessionalCodes.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ProfessionalCodesClp clone = new ProfessionalCodesClp();

		clone.setProfessionalCodesId(getProfessionalCodesId());
		clone.setLevel(getLevel());
		clone.setCode(getCode());
		clone.setDesignation(getDesignation());

		return clone;
	}

	@Override
	public int compareTo(ProfessionalCodes professionalCodes) {
		int primaryKey = professionalCodes.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProfessionalCodesClp)) {
			return false;
		}

		ProfessionalCodesClp professionalCodes = (ProfessionalCodesClp)obj;

		int primaryKey = professionalCodes.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{professionalCodesId=");
		sb.append(getProfessionalCodesId());
		sb.append(", level=");
		sb.append(getLevel());
		sb.append(", code=");
		sb.append(getCode());
		sb.append(", designation=");
		sb.append(getDesignation());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("home.testing.model.ProfessionalCodes");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>professionalCodesId</column-name><column-value><![CDATA[");
		sb.append(getProfessionalCodesId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>level</column-name><column-value><![CDATA[");
		sb.append(getLevel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>code</column-name><column-value><![CDATA[");
		sb.append(getCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>designation</column-name><column-value><![CDATA[");
		sb.append(getDesignation());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _professionalCodesId;
	private int _level;
	private String _code;
	private String _designation;
	private BaseModel<?> _professionalCodesRemoteModel;
}