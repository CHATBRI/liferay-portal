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

package com.liferay.object.web.internal.configuration.activator;

import com.liferay.object.web.internal.configuration.FFObjectFieldBusinessTypeConfiguration;
import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;

import java.util.Map;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;

/**
 * @author Mateus Santana
 */
@Component(
	configurationPid = "com.liferay.object.web.internal.configuration.FFObjectFieldBusinessTypeConfiguration",
	immediate = true,
	service = FFObjectFieldBusinessTypeConfigurationActivator.class
)
public class FFObjectFieldBusinessTypeConfigurationActivator {

	public boolean enabled() {
		return _ffObjectFieldBusinessTypeConfiguration.enabled();
	}

	@Activate
	@Modified
	protected void activate(Map<String, Object> properties) {
		_ffObjectFieldBusinessTypeConfiguration =
			ConfigurableUtil.createConfigurable(
				FFObjectFieldBusinessTypeConfiguration.class, properties);
	}

	private volatile FFObjectFieldBusinessTypeConfiguration
		_ffObjectFieldBusinessTypeConfiguration;

}