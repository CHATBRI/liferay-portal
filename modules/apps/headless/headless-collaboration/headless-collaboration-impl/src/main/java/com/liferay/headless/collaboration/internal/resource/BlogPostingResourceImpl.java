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

package com.liferay.headless.collaboration.internal.resource;

import com.liferay.blogs.model.BlogsEntry;
import com.liferay.blogs.service.BlogsEntryService;
import com.liferay.headless.collaboration.dto.BlogPosting;
import com.liferay.headless.collaboration.resource.BlogPostingResource;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.vulcan.context.Pagination;
import com.liferay.portal.vulcan.dto.Page;

import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Javier Gamarra
 */
@Component(
	properties = "OSGI-INF/blog-posting.properties",
	service = BlogPostingResource.class
)
public class BlogPostingResourceImpl extends BaseBlogPostingResourceImpl {

	@Override
	public Page<BlogPosting> getContentSpaceBlogPostingPage(
		Long parentId, Pagination pagination) {

		return new Page<>(
			transform(
				_blogsEntryService.getGroupEntries(
					parentId, WorkflowConstants.STATUS_APPROVED,
					pagination.getStartPosition(), pagination.getEndPosition()),
				this::_toBlogPosting),
			_blogsEntryService.getGroupEntriesCount(
				parentId, WorkflowConstants.STATUS_APPROVED));
	}

	private BlogPosting _toBlogPosting(BlogsEntry blogsEntry) {
		BlogPosting blogPosting = new BlogPosting();

		blogPosting.setAlternativeHeadline(blogsEntry.getSubtitle());
		blogPosting.setArticleBody(blogsEntry.getContent());
		blogPosting.setCaption(blogsEntry.getCoverImageCaption());
		blogPosting.setDescription(blogsEntry.getDescription());
		blogPosting.setFriendlyUrlPath(blogsEntry.getUrlTitle());
		blogPosting.setHeadline(blogsEntry.getTitle());
		blogPosting.setId(blogsEntry.getEntryId());

		return blogPosting;
	}

	@Reference
	private BlogsEntryService _blogsEntryService;

}