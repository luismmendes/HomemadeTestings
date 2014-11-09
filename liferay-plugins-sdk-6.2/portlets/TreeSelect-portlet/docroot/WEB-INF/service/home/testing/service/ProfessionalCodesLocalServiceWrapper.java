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

package home.testing.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ProfessionalCodesLocalService}.
 *
 * @author LMendes
 * @see ProfessionalCodesLocalService
 * @generated
 */
public class ProfessionalCodesLocalServiceWrapper
	implements ProfessionalCodesLocalService,
		ServiceWrapper<ProfessionalCodesLocalService> {
	public ProfessionalCodesLocalServiceWrapper(
		ProfessionalCodesLocalService professionalCodesLocalService) {
		_professionalCodesLocalService = professionalCodesLocalService;
	}

	/**
	* Adds the professional codes to the database. Also notifies the appropriate model listeners.
	*
	* @param professionalCodes the professional codes
	* @return the professional codes that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public home.testing.model.ProfessionalCodes addProfessionalCodes(
		home.testing.model.ProfessionalCodes professionalCodes)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _professionalCodesLocalService.addProfessionalCodes(professionalCodes);
	}

	/**
	* Creates a new professional codes with the primary key. Does not add the professional codes to the database.
	*
	* @param professionalCodesId the primary key for the new professional codes
	* @return the new professional codes
	*/
	@Override
	public home.testing.model.ProfessionalCodes createProfessionalCodes(
		int professionalCodesId) {
		return _professionalCodesLocalService.createProfessionalCodes(professionalCodesId);
	}

	/**
	* Deletes the professional codes with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param professionalCodesId the primary key of the professional codes
	* @return the professional codes that was removed
	* @throws PortalException if a professional codes with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public home.testing.model.ProfessionalCodes deleteProfessionalCodes(
		int professionalCodesId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _professionalCodesLocalService.deleteProfessionalCodes(professionalCodesId);
	}

	/**
	* Deletes the professional codes from the database. Also notifies the appropriate model listeners.
	*
	* @param professionalCodes the professional codes
	* @return the professional codes that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public home.testing.model.ProfessionalCodes deleteProfessionalCodes(
		home.testing.model.ProfessionalCodes professionalCodes)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _professionalCodesLocalService.deleteProfessionalCodes(professionalCodes);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _professionalCodesLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _professionalCodesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link home.testing.model.impl.ProfessionalCodesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _professionalCodesLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link home.testing.model.impl.ProfessionalCodesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _professionalCodesLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _professionalCodesLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _professionalCodesLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public home.testing.model.ProfessionalCodes fetchProfessionalCodes(
		int professionalCodesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _professionalCodesLocalService.fetchProfessionalCodes(professionalCodesId);
	}

	/**
	* Returns the professional codes with the primary key.
	*
	* @param professionalCodesId the primary key of the professional codes
	* @return the professional codes
	* @throws PortalException if a professional codes with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public home.testing.model.ProfessionalCodes getProfessionalCodes(
		int professionalCodesId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _professionalCodesLocalService.getProfessionalCodes(professionalCodesId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _professionalCodesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the professional codeses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link home.testing.model.impl.ProfessionalCodesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of professional codeses
	* @param end the upper bound of the range of professional codeses (not inclusive)
	* @return the range of professional codeses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<home.testing.model.ProfessionalCodes> getProfessionalCodeses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _professionalCodesLocalService.getProfessionalCodeses(start, end);
	}

	/**
	* Returns the number of professional codeses.
	*
	* @return the number of professional codeses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getProfessionalCodesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _professionalCodesLocalService.getProfessionalCodesesCount();
	}

	/**
	* Updates the professional codes in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param professionalCodes the professional codes
	* @return the professional codes that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public home.testing.model.ProfessionalCodes updateProfessionalCodes(
		home.testing.model.ProfessionalCodes professionalCodes)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _professionalCodesLocalService.updateProfessionalCodes(professionalCodes);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _professionalCodesLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_professionalCodesLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _professionalCodesLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject getAllProfessionalCodes() {
		return _professionalCodesLocalService.getAllProfessionalCodes();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ProfessionalCodesLocalService getWrappedProfessionalCodesLocalService() {
		return _professionalCodesLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedProfessionalCodesLocalService(
		ProfessionalCodesLocalService professionalCodesLocalService) {
		_professionalCodesLocalService = professionalCodesLocalService;
	}

	@Override
	public ProfessionalCodesLocalService getWrappedService() {
		return _professionalCodesLocalService;
	}

	@Override
	public void setWrappedService(
		ProfessionalCodesLocalService professionalCodesLocalService) {
		_professionalCodesLocalService = professionalCodesLocalService;
	}

	private ProfessionalCodesLocalService _professionalCodesLocalService;
}