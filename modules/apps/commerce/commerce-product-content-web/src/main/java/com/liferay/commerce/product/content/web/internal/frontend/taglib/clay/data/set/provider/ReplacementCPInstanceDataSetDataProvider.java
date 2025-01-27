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

package com.liferay.commerce.product.content.web.internal.frontend.taglib.clay.data.set.provider;

import com.liferay.commerce.product.catalog.CPSku;
import com.liferay.commerce.product.content.web.internal.frontend.constants.CPContentDataSetConstants;
import com.liferay.commerce.product.content.web.internal.model.ReplacementSku;
import com.liferay.commerce.product.model.CPDefinition;
import com.liferay.commerce.product.model.CPInstance;
import com.liferay.commerce.product.service.CPInstanceLocalService;
import com.liferay.commerce.product.util.CPInstanceHelper;
import com.liferay.frontend.taglib.clay.data.Filter;
import com.liferay.frontend.taglib.clay.data.Pagination;
import com.liferay.frontend.taglib.clay.data.set.provider.ClayDataSetDataProvider;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.vulcan.util.TransformUtil;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Alessio Antonio Rendina
 */
@Component(
	enabled = false, immediate = true,
	property = "clay.data.provider.key=" + CPContentDataSetConstants.COMMERCE_DATA_SET_KEY_REPLACEMENT_CP_INSTANCES,
	service = ClayDataSetDataProvider.class
)
public class ReplacementCPInstanceDataSetDataProvider
	implements ClayDataSetDataProvider<ReplacementSku> {

	@Override
	public List<ReplacementSku> getItems(
			HttpServletRequest httpServletRequest, Filter filter,
			Pagination pagination, Sort sort)
		throws PortalException {

		String cpInstanceUuid = ParamUtil.getString(
			httpServletRequest, "cpInstanceUuid");
		long cProductId = ParamUtil.getLong(httpServletRequest, "cProductId");

		return TransformUtil.transform(
			_getReplacementCPSkus(cpInstanceUuid, cProductId),
			replacementCPSku -> {
				CPInstance cpInstance = _cpInstanceLocalService.getCPInstance(
					replacementCPSku.getCPInstanceId());

				CPDefinition cpDefinition = cpInstance.getCPDefinition();

				return new ReplacementSku(
					cpDefinition.getName(
						LocaleUtil.toLanguageId(
							_portal.getLocale(httpServletRequest))),
					null, cpInstance.getCPInstanceId(), cpInstance.getSku());
			});
	}

	@Override
	public int getItemsCount(
			HttpServletRequest httpServletRequest, Filter filter)
		throws PortalException {

		String cpInstanceUuid = ParamUtil.getString(
			httpServletRequest, "cpInstanceUuid");
		long cProductId = ParamUtil.getLong(httpServletRequest, "cProductId");

		List<CPSku> cpSkus = _getReplacementCPSkus(cpInstanceUuid, cProductId);

		return cpSkus.size();
	}

	private List<CPSku> _getReplacementCPSkus(
		String cpInstanceUuid, long cProductId) {

		List<CPSku> cpSkus = new ArrayList<>();

		CPInstance cpInstance = _cpInstanceLocalService.fetchCProductInstance(
			cProductId, cpInstanceUuid);

		CPInstance replacementCPInstance =
			_cpInstanceLocalService.fetchCProductInstance(
				cpInstance.getReplacementCProductId(),
				cpInstance.getReplacementCPInstanceUuid());

		while (replacementCPInstance != null) {
			cpSkus.add(_cpInstanceHelper.toCPSku(replacementCPInstance));

			replacementCPInstance =
				_cpInstanceLocalService.fetchCProductInstance(
					replacementCPInstance.getReplacementCProductId(),
					replacementCPInstance.getReplacementCPInstanceUuid());
		}

		return cpSkus;
	}

	@Reference
	private CPInstanceHelper _cpInstanceHelper;

	@Reference
	private CPInstanceLocalService _cpInstanceLocalService;

	@Reference
	private Portal _portal;

}