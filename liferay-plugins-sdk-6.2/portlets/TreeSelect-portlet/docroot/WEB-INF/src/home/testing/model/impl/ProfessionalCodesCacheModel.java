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

package home.testing.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import home.testing.model.ProfessionalCodes;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ProfessionalCodes in entity cache.
 *
 * @author LMendes
 * @see ProfessionalCodes
 * @generated
 */
public class ProfessionalCodesCacheModel implements CacheModel<ProfessionalCodes>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{professionalCodesId=");
		sb.append(professionalCodesId);
		sb.append(", level=");
		sb.append(level);
		sb.append(", code=");
		sb.append(code);
		sb.append(", designation=");
		sb.append(designation);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ProfessionalCodes toEntityModel() {
		ProfessionalCodesImpl professionalCodesImpl = new ProfessionalCodesImpl();

		professionalCodesImpl.setProfessionalCodesId(professionalCodesId);
		professionalCodesImpl.setLevel(level);

		if (code == null) {
			professionalCodesImpl.setCode(StringPool.BLANK);
		}
		else {
			professionalCodesImpl.setCode(code);
		}

		if (designation == null) {
			professionalCodesImpl.setDesignation(StringPool.BLANK);
		}
		else {
			professionalCodesImpl.setDesignation(designation);
		}

		professionalCodesImpl.resetOriginalValues();

		return professionalCodesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		professionalCodesId = objectInput.readInt();
		level = objectInput.readInt();
		code = objectInput.readUTF();
		designation = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(professionalCodesId);
		objectOutput.writeInt(level);

		if (code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(code);
		}

		if (designation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(designation);
		}
	}

	public int professionalCodesId;
	public int level;
	public String code;
	public String designation;
}