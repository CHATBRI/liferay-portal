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

package com.liferay.jenkins.results.parser;

import com.liferay.jenkins.results.parser.job.property.JobProperty;

/**
 * @author Michael Hashimoto
 */
public class SubrepositoryAcceptancePullRequestJob
	extends SubrepositoryGitRepositoryJob implements TestSuiteJob {

	public SubrepositoryAcceptancePullRequestJob(
		String jobName, BuildProfile buildProfile, String testSuiteName,
		String repositoryName, String portalUpstreamBranchName) {

		super(jobName, buildProfile, repositoryName, portalUpstreamBranchName);

		_testSuiteName = testSuiteName;

		_setValidationRequired();
	}

	@Override
	public String getTestSuiteName() {
		return _testSuiteName;
	}

	private void _setValidationRequired() {
		JobProperty jobProperty = getJobProperty("test.run.validation");

		recordJobProperty(jobProperty);

		validationRequired = Boolean.parseBoolean(jobProperty.getValue());
	}

	private final String _testSuiteName;

}