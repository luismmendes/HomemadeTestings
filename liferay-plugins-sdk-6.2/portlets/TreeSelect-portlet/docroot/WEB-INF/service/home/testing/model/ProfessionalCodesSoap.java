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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author LMendes
 * @generated
 */
public class ProfessionalCodesSoap implements Serializable {
	public static ProfessionalCodesSoap toSoapModel(ProfessionalCodes model) {
		ProfessionalCodesSoap soapModel = new ProfessionalCodesSoap();

		soapModel.setProfessionalCodesId(model.getProfessionalCodesId());
		soapModel.setLevel(model.getLevel());
		soapModel.setCode(model.getCode());
		soapModel.setDesignation(model.getDesignation());

		return soapModel;
	}

	public static ProfessionalCodesSoap[] toSoapModels(
		ProfessionalCodes[] models) {
		ProfessionalCodesSoap[] soapModels = new ProfessionalCodesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ProfessionalCodesSoap[][] toSoapModels(
		ProfessionalCodes[][] models) {
		ProfessionalCodesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ProfessionalCodesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ProfessionalCodesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ProfessionalCodesSoap[] toSoapModels(
		List<ProfessionalCodes> models) {
		List<ProfessionalCodesSoap> soapModels = new ArrayList<ProfessionalCodesSoap>(models.size());

		for (ProfessionalCodes model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ProfessionalCodesSoap[soapModels.size()]);
	}

	public ProfessionalCodesSoap() {
	}

	public int getPrimaryKey() {
		return _professionalCodesId;
	}

	public void setPrimaryKey(int pk) {
		setProfessionalCodesId(pk);
	}

	public int getProfessionalCodesId() {
		return _professionalCodesId;
	}

	public void setProfessionalCodesId(int professionalCodesId) {
		_professionalCodesId = professionalCodesId;
	}

	public int getLevel() {
		return _level;
	}

	public void setLevel(int level) {
		_level = level;
	}

	public String getCode() {
		return _code;
	}

	public void setCode(String code) {
		_code = code;
	}

	public String getDesignation() {
		return _designation;
	}

	public void setDesignation(String designation) {
		_designation = designation;
	}

	private int _professionalCodesId;
	private int _level;
	private String _code;
	private String _designation;
}