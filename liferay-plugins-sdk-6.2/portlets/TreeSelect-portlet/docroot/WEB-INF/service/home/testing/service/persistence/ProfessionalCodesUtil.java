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

package home.testing.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import home.testing.model.ProfessionalCodes;

import java.util.List;

/**
 * The persistence utility for the professional codes service. This utility wraps {@link ProfessionalCodesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LMendes
 * @see ProfessionalCodesPersistence
 * @see ProfessionalCodesPersistenceImpl
 * @generated
 */
public class ProfessionalCodesUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(ProfessionalCodes professionalCodes) {
		getPersistence().clearCache(professionalCodes);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ProfessionalCodes> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ProfessionalCodes> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ProfessionalCodes> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ProfessionalCodes update(ProfessionalCodes professionalCodes)
		throws SystemException {
		return getPersistence().update(professionalCodes);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ProfessionalCodes update(
		ProfessionalCodes professionalCodes, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(professionalCodes, serviceContext);
	}

	/**
	* Caches the professional codes in the entity cache if it is enabled.
	*
	* @param professionalCodes the professional codes
	*/
	public static void cacheResult(
		home.testing.model.ProfessionalCodes professionalCodes) {
		getPersistence().cacheResult(professionalCodes);
	}

	/**
	* Caches the professional codeses in the entity cache if it is enabled.
	*
	* @param professionalCodeses the professional codeses
	*/
	public static void cacheResult(
		java.util.List<home.testing.model.ProfessionalCodes> professionalCodeses) {
		getPersistence().cacheResult(professionalCodeses);
	}

	/**
	* Creates a new professional codes with the primary key. Does not add the professional codes to the database.
	*
	* @param professionalCodesId the primary key for the new professional codes
	* @return the new professional codes
	*/
	public static home.testing.model.ProfessionalCodes create(
		int professionalCodesId) {
		return getPersistence().create(professionalCodesId);
	}

	/**
	* Removes the professional codes with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param professionalCodesId the primary key of the professional codes
	* @return the professional codes that was removed
	* @throws home.testing.NoSuchProfessionalCodesException if a professional codes with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static home.testing.model.ProfessionalCodes remove(
		int professionalCodesId)
		throws com.liferay.portal.kernel.exception.SystemException,
			home.testing.NoSuchProfessionalCodesException {
		return getPersistence().remove(professionalCodesId);
	}

	public static home.testing.model.ProfessionalCodes updateImpl(
		home.testing.model.ProfessionalCodes professionalCodes)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(professionalCodes);
	}

	/**
	* Returns the professional codes with the primary key or throws a {@link home.testing.NoSuchProfessionalCodesException} if it could not be found.
	*
	* @param professionalCodesId the primary key of the professional codes
	* @return the professional codes
	* @throws home.testing.NoSuchProfessionalCodesException if a professional codes with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static home.testing.model.ProfessionalCodes findByPrimaryKey(
		int professionalCodesId)
		throws com.liferay.portal.kernel.exception.SystemException,
			home.testing.NoSuchProfessionalCodesException {
		return getPersistence().findByPrimaryKey(professionalCodesId);
	}

	/**
	* Returns the professional codes with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param professionalCodesId the primary key of the professional codes
	* @return the professional codes, or <code>null</code> if a professional codes with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static home.testing.model.ProfessionalCodes fetchByPrimaryKey(
		int professionalCodesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(professionalCodesId);
	}

	/**
	* Returns all the professional codeses.
	*
	* @return the professional codeses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<home.testing.model.ProfessionalCodes> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<home.testing.model.ProfessionalCodes> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the professional codeses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link home.testing.model.impl.ProfessionalCodesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of professional codeses
	* @param end the upper bound of the range of professional codeses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of professional codeses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<home.testing.model.ProfessionalCodes> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the professional codeses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of professional codeses.
	*
	* @return the number of professional codeses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ProfessionalCodesPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ProfessionalCodesPersistence)PortletBeanLocatorUtil.locate(home.testing.service.ClpSerializer.getServletContextName(),
					ProfessionalCodesPersistence.class.getName());

			ReferenceRegistry.registerReference(ProfessionalCodesUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ProfessionalCodesPersistence persistence) {
	}

	private static ProfessionalCodesPersistence _persistence;
}