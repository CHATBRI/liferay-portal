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

package com.liferay.portal.kernel.service.persistence;

import com.liferay.portal.kernel.exception.NoSuchPluginSettingException;
import com.liferay.portal.kernel.model.PluginSetting;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the plugin setting service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PluginSettingUtil
 * @generated
 */
@ProviderType
public interface PluginSettingPersistence
	extends BasePersistence<PluginSetting> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PluginSettingUtil} to access the plugin setting persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the plugin settings where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching plugin settings
	 */
	public java.util.List<PluginSetting> findByCompanyId(long companyId);

	/**
	 * Returns a range of all the plugin settings where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PluginSettingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of plugin settings
	 * @param end the upper bound of the range of plugin settings (not inclusive)
	 * @return the range of matching plugin settings
	 */
	public java.util.List<PluginSetting> findByCompanyId(
		long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the plugin settings where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PluginSettingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByCompanyId(long, int, int, OrderByComparator)}
	 * @param companyId the company ID
	 * @param start the lower bound of the range of plugin settings
	 * @param end the upper bound of the range of plugin settings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching plugin settings
	 */
	@Deprecated
	public java.util.List<PluginSetting> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<PluginSetting> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns an ordered range of all the plugin settings where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PluginSettingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of plugin settings
	 * @param end the upper bound of the range of plugin settings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plugin settings
	 */
	public java.util.List<PluginSetting> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<PluginSetting> orderByComparator);

	/**
	 * Returns the first plugin setting in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plugin setting
	 * @throws NoSuchPluginSettingException if a matching plugin setting could not be found
	 */
	public PluginSetting findByCompanyId_First(
			long companyId, OrderByComparator<PluginSetting> orderByComparator)
		throws NoSuchPluginSettingException;

	/**
	 * Returns the first plugin setting in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plugin setting, or <code>null</code> if a matching plugin setting could not be found
	 */
	public PluginSetting fetchByCompanyId_First(
		long companyId, OrderByComparator<PluginSetting> orderByComparator);

	/**
	 * Returns the last plugin setting in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plugin setting
	 * @throws NoSuchPluginSettingException if a matching plugin setting could not be found
	 */
	public PluginSetting findByCompanyId_Last(
			long companyId, OrderByComparator<PluginSetting> orderByComparator)
		throws NoSuchPluginSettingException;

	/**
	 * Returns the last plugin setting in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plugin setting, or <code>null</code> if a matching plugin setting could not be found
	 */
	public PluginSetting fetchByCompanyId_Last(
		long companyId, OrderByComparator<PluginSetting> orderByComparator);

	/**
	 * Returns the plugin settings before and after the current plugin setting in the ordered set where companyId = &#63;.
	 *
	 * @param pluginSettingId the primary key of the current plugin setting
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plugin setting
	 * @throws NoSuchPluginSettingException if a plugin setting with the primary key could not be found
	 */
	public PluginSetting[] findByCompanyId_PrevAndNext(
			long pluginSettingId, long companyId,
			OrderByComparator<PluginSetting> orderByComparator)
		throws NoSuchPluginSettingException;

	/**
	 * Removes all the plugin settings where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public void removeByCompanyId(long companyId);

	/**
	 * Returns the number of plugin settings where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching plugin settings
	 */
	public int countByCompanyId(long companyId);

	/**
	 * Returns the plugin setting where companyId = &#63; and pluginId = &#63; and pluginType = &#63; or throws a <code>NoSuchPluginSettingException</code> if it could not be found.
	 *
	 * @param companyId the company ID
	 * @param pluginId the plugin ID
	 * @param pluginType the plugin type
	 * @return the matching plugin setting
	 * @throws NoSuchPluginSettingException if a matching plugin setting could not be found
	 */
	public PluginSetting findByC_I_T(
			long companyId, String pluginId, String pluginType)
		throws NoSuchPluginSettingException;

	/**
	 * Returns the plugin setting where companyId = &#63; and pluginId = &#63; and pluginType = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #fetchByC_I_T(long,String,String)}
	 * @param companyId the company ID
	 * @param pluginId the plugin ID
	 * @param pluginType the plugin type
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching plugin setting, or <code>null</code> if a matching plugin setting could not be found
	 */
	@Deprecated
	public PluginSetting fetchByC_I_T(
		long companyId, String pluginId, String pluginType,
		boolean useFinderCache);

	/**
	 * Returns the plugin setting where companyId = &#63; and pluginId = &#63; and pluginType = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param companyId the company ID
	 * @param pluginId the plugin ID
	 * @param pluginType the plugin type
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching plugin setting, or <code>null</code> if a matching plugin setting could not be found
	 */
	public PluginSetting fetchByC_I_T(
		long companyId, String pluginId, String pluginType);

	/**
	 * Removes the plugin setting where companyId = &#63; and pluginId = &#63; and pluginType = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param pluginId the plugin ID
	 * @param pluginType the plugin type
	 * @return the plugin setting that was removed
	 */
	public PluginSetting removeByC_I_T(
			long companyId, String pluginId, String pluginType)
		throws NoSuchPluginSettingException;

	/**
	 * Returns the number of plugin settings where companyId = &#63; and pluginId = &#63; and pluginType = &#63;.
	 *
	 * @param companyId the company ID
	 * @param pluginId the plugin ID
	 * @param pluginType the plugin type
	 * @return the number of matching plugin settings
	 */
	public int countByC_I_T(long companyId, String pluginId, String pluginType);

	/**
	 * Caches the plugin setting in the entity cache if it is enabled.
	 *
	 * @param pluginSetting the plugin setting
	 */
	public void cacheResult(PluginSetting pluginSetting);

	/**
	 * Caches the plugin settings in the entity cache if it is enabled.
	 *
	 * @param pluginSettings the plugin settings
	 */
	public void cacheResult(java.util.List<PluginSetting> pluginSettings);

	/**
	 * Creates a new plugin setting with the primary key. Does not add the plugin setting to the database.
	 *
	 * @param pluginSettingId the primary key for the new plugin setting
	 * @return the new plugin setting
	 */
	public PluginSetting create(long pluginSettingId);

	/**
	 * Removes the plugin setting with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pluginSettingId the primary key of the plugin setting
	 * @return the plugin setting that was removed
	 * @throws NoSuchPluginSettingException if a plugin setting with the primary key could not be found
	 */
	public PluginSetting remove(long pluginSettingId)
		throws NoSuchPluginSettingException;

	public PluginSetting updateImpl(PluginSetting pluginSetting);

	/**
	 * Returns the plugin setting with the primary key or throws a <code>NoSuchPluginSettingException</code> if it could not be found.
	 *
	 * @param pluginSettingId the primary key of the plugin setting
	 * @return the plugin setting
	 * @throws NoSuchPluginSettingException if a plugin setting with the primary key could not be found
	 */
	public PluginSetting findByPrimaryKey(long pluginSettingId)
		throws NoSuchPluginSettingException;

	/**
	 * Returns the plugin setting with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pluginSettingId the primary key of the plugin setting
	 * @return the plugin setting, or <code>null</code> if a plugin setting with the primary key could not be found
	 */
	public PluginSetting fetchByPrimaryKey(long pluginSettingId);

	/**
	 * Returns all the plugin settings.
	 *
	 * @return the plugin settings
	 */
	public java.util.List<PluginSetting> findAll();

	/**
	 * Returns a range of all the plugin settings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PluginSettingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of plugin settings
	 * @param end the upper bound of the range of plugin settings (not inclusive)
	 * @return the range of plugin settings
	 */
	public java.util.List<PluginSetting> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the plugin settings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PluginSettingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of plugin settings
	 * @param end the upper bound of the range of plugin settings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of plugin settings
	 */
	@Deprecated
	public java.util.List<PluginSetting> findAll(
		int start, int end, OrderByComparator<PluginSetting> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns an ordered range of all the plugin settings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PluginSettingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of plugin settings
	 * @param end the upper bound of the range of plugin settings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of plugin settings
	 */
	public java.util.List<PluginSetting> findAll(
		int start, int end, OrderByComparator<PluginSetting> orderByComparator);

	/**
	 * Removes all the plugin settings from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of plugin settings.
	 *
	 * @return the number of plugin settings
	 */
	public int countAll();

}