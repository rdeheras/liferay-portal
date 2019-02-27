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

package com.liferay.headless.foundation.resource.v1_0.test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.liferay.headless.foundation.dto.v1_0.Organization;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.util.Base64;
import com.liferay.portal.kernel.util.Http;
import com.liferay.portal.kernel.util.HttpUtil;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.vulcan.pagination.Pagination;

import java.net.URL;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public abstract class BaseOrganizationResourceTestCase {

	@ClassRule
	@Rule
	public static final LiferayIntegrationTestRule liferayIntegrationTestRule =
		new LiferayIntegrationTestRule();

	@Before
	public void setUp() throws Exception {
		testGroup = GroupTestUtil.addGroup();

		_resourceURL = new URL(
			"http://localhost:8080/o/headless-foundation/v1.0");
	}

	@After
	public void tearDown() throws Exception {
		GroupTestUtil.deleteGroup(testGroup);
	}

	@Test
	public void testGetMyUserAccountOrganizationsPage() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetOrganization() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetOrganizationOrganizationsPage() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetOrganizationsPage() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetUserAccountOrganizationsPage() throws Exception {
		Assert.assertTrue(true);
	}

	protected void assertEquals(
		List<Organization> organizations1, List<Organization> organizations2) {

		Assert.assertEquals(organizations1.size(), organizations2.size());

		for (int i = 0; i < organizations1.size(); i++) {
			Organization organization1 = organizations1.get(i);
			Organization organization2 = organizations2.get(i);

			assertEquals(organization1, organization2);
		}
	}

	protected void assertEquals(
		Organization organization1, Organization organization2) {

		Assert.assertTrue(
			organization1 + " does not equal " + organization2,
			equals(organization1, organization2));
	}

	protected void assertEqualsIgnoringOrder(
		List<Organization> organizations1, List<Organization> organizations2) {

		Assert.assertEquals(organizations1.size(), organizations2.size());

		for (Organization organization1 : organizations1) {
			boolean contains = false;

			for (Organization organization2 : organizations2) {
				if (equals(organization1, organization2)) {
					contains = true;

					break;
				}
			}

			Assert.assertTrue(
				organizations2 + " does not contain " + organization1,
				contains);
		}
	}

	protected void assertResponseCode(
		int expectedResponseCode, Http.Response actualResponse) {

		Assert.assertEquals(
			expectedResponseCode, actualResponse.getResponseCode());
	}

	protected boolean equals(
		Organization organization1, Organization organization2) {

		if (organization1 == organization2) {
			return true;
		}

		return false;
	}

	protected Page<Organization> invokeGetMyUserAccountOrganizationsPage(
			Long myUserAccountId, Pagination pagination)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setLocation(
			_resourceURL +
				_toPath(
					"/my-user-accounts/{my-user-account-id}/organizations",
					myUserAccountId));

		return _outputObjectMapper.readValue(
			HttpUtil.URLtoString(options),
			new TypeReference<Page<Organization>>() {
			});
	}

	protected Http.Response invokeGetMyUserAccountOrganizationsPageResponse(
			Long myUserAccountId, Pagination pagination)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setLocation(
			_resourceURL +
				_toPath(
					"/my-user-accounts/{my-user-account-id}/organizations",
					myUserAccountId));

		HttpUtil.URLtoString(options);

		return options.getResponse();
	}

	protected Organization invokeGetOrganization(Long organizationId)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setLocation(
			_resourceURL +
				_toPath("/organizations/{organization-id}", organizationId));

		return _outputObjectMapper.readValue(
			HttpUtil.URLtoString(options), Organization.class);
	}

	protected Page<Organization> invokeGetOrganizationOrganizationsPage(
			Long organizationId, Pagination pagination)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setLocation(
			_resourceURL +
				_toPath(
					"/organizations/{organization-id}/organizations",
					organizationId));

		return _outputObjectMapper.readValue(
			HttpUtil.URLtoString(options),
			new TypeReference<Page<Organization>>() {
			});
	}

	protected Http.Response invokeGetOrganizationOrganizationsPageResponse(
			Long organizationId, Pagination pagination)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setLocation(
			_resourceURL +
				_toPath(
					"/organizations/{organization-id}/organizations",
					organizationId));

		HttpUtil.URLtoString(options);

		return options.getResponse();
	}

	protected Http.Response invokeGetOrganizationResponse(Long organizationId)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setLocation(
			_resourceURL +
				_toPath("/organizations/{organization-id}", organizationId));

		HttpUtil.URLtoString(options);

		return options.getResponse();
	}

	protected Page<Organization> invokeGetOrganizationsPage(
			Pagination pagination)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setLocation(
			_resourceURL + _toPath("/organizations", pagination));

		return _outputObjectMapper.readValue(
			HttpUtil.URLtoString(options),
			new TypeReference<Page<Organization>>() {
			});
	}

	protected Http.Response invokeGetOrganizationsPageResponse(
			Pagination pagination)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setLocation(
			_resourceURL + _toPath("/organizations", pagination));

		HttpUtil.URLtoString(options);

		return options.getResponse();
	}

	protected Page<Organization> invokeGetUserAccountOrganizationsPage(
			Long userAccountId, Pagination pagination)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setLocation(
			_resourceURL +
				_toPath(
					"/user-accounts/{user-account-id}/organizations",
					userAccountId));

		return _outputObjectMapper.readValue(
			HttpUtil.URLtoString(options),
			new TypeReference<Page<Organization>>() {
			});
	}

	protected Http.Response invokeGetUserAccountOrganizationsPageResponse(
			Long userAccountId, Pagination pagination)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setLocation(
			_resourceURL +
				_toPath(
					"/user-accounts/{user-account-id}/organizations",
					userAccountId));

		HttpUtil.URLtoString(options);

		return options.getResponse();
	}

	protected Organization randomOrganization() {
		return new Organization() {
			{
				comment = RandomTestUtil.randomString();
				id = RandomTestUtil.randomLong();
				logo = RandomTestUtil.randomString();
				name = RandomTestUtil.randomString();
				parentOrganizationId = RandomTestUtil.randomLong();
			}
		};
	}

	protected Group testGroup;

	protected static class Page<T> {

		public Collection<T> getItems() {
			return new ArrayList<>(items);
		}

		public int getItemsPerPage() {
			return itemsPerPage;
		}

		public int getLastPageNumber() {
			return lastPageNumber;
		}

		public int getPageNumber() {
			return pageNumber;
		}

		public int getTotalCount() {
			return totalCount;
		}

		@JsonProperty
		protected Collection<T> items;

		@JsonProperty("pageSize")
		protected int itemsPerPage;

		@JsonProperty
		protected int lastPageNumber;

		@JsonProperty("page")
		protected int pageNumber;

		@JsonProperty
		protected int totalCount;

	}

	private Http.Options _createHttpOptions() {
		Http.Options options = new Http.Options();

		options.addHeader("Accept", "application/json");

		String userNameAndPassword = "test@liferay.com:test";

		String encodedUserNameAndPassword = Base64.encode(
			userNameAndPassword.getBytes());

		options.addHeader(
			"Authorization", "Basic " + encodedUserNameAndPassword);

		options.addHeader("Content-Type", "application/json");

		return options;
	}

	private String _toPath(String template, Object value) {
		return template.replaceFirst("\\{.*\\}", String.valueOf(value));
	}

	private static final ObjectMapper _inputObjectMapper = new ObjectMapper() {
		{
			setSerializationInclusion(JsonInclude.Include.NON_NULL);
		}
	};
	private static final ObjectMapper _outputObjectMapper = new ObjectMapper();

	private URL _resourceURL;

}