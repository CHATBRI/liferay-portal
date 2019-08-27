/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.change.tracking.service.persistence;

import com.liferay.change.tracking.model.CTCollection;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the ct collection service. This utility wraps <code>com.liferay.change.tracking.service.persistence.impl.CTCollectionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CTCollectionPersistence
 * @generated
 */
@ProviderType
public class CTCollectionUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(CTCollection ctCollection) {
		getPersistence().clearCache(ctCollection);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, CTCollection> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CTCollection> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CTCollection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CTCollection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CTCollection> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CTCollection update(CTCollection ctCollection) {
		return getPersistence().update(ctCollection);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CTCollection update(
		CTCollection ctCollection, ServiceContext serviceContext) {

		return getPersistence().update(ctCollection, serviceContext);
	}

	/**
	 * Returns all the ct collections where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching ct collections
	 */
	public static List<CTCollection> findByCompanyId(long companyId) {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	 * Returns a range of all the ct collections where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CTCollectionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ct collections
	 * @param end the upper bound of the range of ct collections (not inclusive)
	 * @return the range of matching ct collections
	 */
	public static List<CTCollection> findByCompanyId(
		long companyId, int start, int end) {

		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the ct collections where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CTCollectionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByCompanyId(long, int, int, OrderByComparator)}
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ct collections
	 * @param end the upper bound of the range of ct collections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ct collections
	 */
	@Deprecated
	public static List<CTCollection> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<CTCollection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the ct collections where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CTCollectionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ct collections
	 * @param end the upper bound of the range of ct collections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ct collections
	 */
	public static List<CTCollection> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<CTCollection> orderByComparator) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the first ct collection in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ct collection
	 * @throws NoSuchCollectionException if a matching ct collection could not be found
	 */
	public static CTCollection findByCompanyId_First(
			long companyId, OrderByComparator<CTCollection> orderByComparator)
		throws com.liferay.change.tracking.exception.NoSuchCollectionException {

		return getPersistence().findByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the first ct collection in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ct collection, or <code>null</code> if a matching ct collection could not be found
	 */
	public static CTCollection fetchByCompanyId_First(
		long companyId, OrderByComparator<CTCollection> orderByComparator) {

		return getPersistence().fetchByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last ct collection in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ct collection
	 * @throws NoSuchCollectionException if a matching ct collection could not be found
	 */
	public static CTCollection findByCompanyId_Last(
			long companyId, OrderByComparator<CTCollection> orderByComparator)
		throws com.liferay.change.tracking.exception.NoSuchCollectionException {

		return getPersistence().findByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last ct collection in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ct collection, or <code>null</code> if a matching ct collection could not be found
	 */
	public static CTCollection fetchByCompanyId_Last(
		long companyId, OrderByComparator<CTCollection> orderByComparator) {

		return getPersistence().fetchByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the ct collections before and after the current ct collection in the ordered set where companyId = &#63;.
	 *
	 * @param ctCollectionId the primary key of the current ct collection
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ct collection
	 * @throws NoSuchCollectionException if a ct collection with the primary key could not be found
	 */
	public static CTCollection[] findByCompanyId_PrevAndNext(
			long ctCollectionId, long companyId,
			OrderByComparator<CTCollection> orderByComparator)
		throws com.liferay.change.tracking.exception.NoSuchCollectionException {

		return getPersistence().findByCompanyId_PrevAndNext(
			ctCollectionId, companyId, orderByComparator);
	}

	/**
	 * Removes all the ct collections where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public static void removeByCompanyId(long companyId) {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	 * Returns the number of ct collections where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching ct collections
	 */
	public static int countByCompanyId(long companyId) {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	 * Returns the ct collection where companyId = &#63; and name = &#63; or throws a <code>NoSuchCollectionException</code> if it could not be found.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @return the matching ct collection
	 * @throws NoSuchCollectionException if a matching ct collection could not be found
	 */
	public static CTCollection findByC_N(long companyId, String name)
		throws com.liferay.change.tracking.exception.NoSuchCollectionException {

		return getPersistence().findByC_N(companyId, name);
	}

	/**
	 * Returns the ct collection where companyId = &#63; and name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #fetchByC_N(long,String)}
	 * @param companyId the company ID
	 * @param name the name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ct collection, or <code>null</code> if a matching ct collection could not be found
	 */
	@Deprecated
	public static CTCollection fetchByC_N(
		long companyId, String name, boolean useFinderCache) {

		return getPersistence().fetchByC_N(companyId, name, useFinderCache);
	}

	/**
	 * Returns the ct collection where companyId = &#63; and name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ct collection, or <code>null</code> if a matching ct collection could not be found
	 */
	public static CTCollection fetchByC_N(long companyId, String name) {
		return getPersistence().fetchByC_N(companyId, name);
	}

	/**
	 * Removes the ct collection where companyId = &#63; and name = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @return the ct collection that was removed
	 */
	public static CTCollection removeByC_N(long companyId, String name)
		throws com.liferay.change.tracking.exception.NoSuchCollectionException {

		return getPersistence().removeByC_N(companyId, name);
	}

	/**
	 * Returns the number of ct collections where companyId = &#63; and name = &#63;.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @return the number of matching ct collections
	 */
	public static int countByC_N(long companyId, String name) {
		return getPersistence().countByC_N(companyId, name);
	}

	/**
	 * Caches the ct collection in the entity cache if it is enabled.
	 *
	 * @param ctCollection the ct collection
	 */
	public static void cacheResult(CTCollection ctCollection) {
		getPersistence().cacheResult(ctCollection);
	}

	/**
	 * Caches the ct collections in the entity cache if it is enabled.
	 *
	 * @param ctCollections the ct collections
	 */
	public static void cacheResult(List<CTCollection> ctCollections) {
		getPersistence().cacheResult(ctCollections);
	}

	/**
	 * Creates a new ct collection with the primary key. Does not add the ct collection to the database.
	 *
	 * @param ctCollectionId the primary key for the new ct collection
	 * @return the new ct collection
	 */
	public static CTCollection create(long ctCollectionId) {
		return getPersistence().create(ctCollectionId);
	}

	/**
	 * Removes the ct collection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ctCollectionId the primary key of the ct collection
	 * @return the ct collection that was removed
	 * @throws NoSuchCollectionException if a ct collection with the primary key could not be found
	 */
	public static CTCollection remove(long ctCollectionId)
		throws com.liferay.change.tracking.exception.NoSuchCollectionException {

		return getPersistence().remove(ctCollectionId);
	}

	public static CTCollection updateImpl(CTCollection ctCollection) {
		return getPersistence().updateImpl(ctCollection);
	}

	/**
	 * Returns the ct collection with the primary key or throws a <code>NoSuchCollectionException</code> if it could not be found.
	 *
	 * @param ctCollectionId the primary key of the ct collection
	 * @return the ct collection
	 * @throws NoSuchCollectionException if a ct collection with the primary key could not be found
	 */
	public static CTCollection findByPrimaryKey(long ctCollectionId)
		throws com.liferay.change.tracking.exception.NoSuchCollectionException {

		return getPersistence().findByPrimaryKey(ctCollectionId);
	}

	/**
	 * Returns the ct collection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ctCollectionId the primary key of the ct collection
	 * @return the ct collection, or <code>null</code> if a ct collection with the primary key could not be found
	 */
	public static CTCollection fetchByPrimaryKey(long ctCollectionId) {
		return getPersistence().fetchByPrimaryKey(ctCollectionId);
	}

	/**
	 * Returns all the ct collections.
	 *
	 * @return the ct collections
	 */
	public static List<CTCollection> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ct collections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CTCollectionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ct collections
	 * @param end the upper bound of the range of ct collections (not inclusive)
	 * @return the range of ct collections
	 */
	public static List<CTCollection> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ct collections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CTCollectionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of ct collections
	 * @param end the upper bound of the range of ct collections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ct collections
	 */
	@Deprecated
	public static List<CTCollection> findAll(
		int start, int end, OrderByComparator<CTCollection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the ct collections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CTCollectionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ct collections
	 * @param end the upper bound of the range of ct collections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ct collections
	 */
	public static List<CTCollection> findAll(
		int start, int end, OrderByComparator<CTCollection> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the ct collections from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ct collections.
	 *
	 * @return the number of ct collections
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CTCollectionPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<CTCollectionPersistence, CTCollectionPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CTCollectionPersistence.class);

		ServiceTracker<CTCollectionPersistence, CTCollectionPersistence>
			serviceTracker =
				new ServiceTracker
					<CTCollectionPersistence, CTCollectionPersistence>(
						bundle.getBundleContext(),
						CTCollectionPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}