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

import com.liferay.headless.foundation.dto.v1_0.Keyword;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.util.Base64;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.Http;
import com.liferay.portal.kernel.util.HttpUtil;
import com.liferay.portal.kernel.util.URLCodec;
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
public abstract class BaseKeywordResourceTestCase {

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
	public void testDeleteKeyword() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetContentSpaceKeywordsPage() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetKeyword() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testPostContentSpaceKeyword() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testPutKeyword() throws Exception {
		Assert.assertTrue(true);
	}

	protected void assertEquals(Keyword keyword1, Keyword keyword2) {
		Assert.assertTrue(
			keyword1 + " does not equal " + keyword2,
			equals(keyword1, keyword2));
	}

	protected void assertEquals(
		List<Keyword> keywords1, List<Keyword> keywords2) {

		Assert.assertEquals(keywords1.size(), keywords2.size());

		for (int i = 0; i < keywords1.size(); i++) {
			Keyword keyword1 = keywords1.get(i);
			Keyword keyword2 = keywords2.get(i);

			assertEquals(keyword1, keyword2);
		}
	}

	protected void assertEqualsIgnoringOrder(
		List<Keyword> keywords1, List<Keyword> keywords2) {

		Assert.assertEquals(keywords1.size(), keywords2.size());

		for (Keyword keyword1 : keywords1) {
			boolean contains = false;

			for (Keyword keyword2 : keywords2) {
				if (equals(keyword1, keyword2)) {
					contains = true;

					break;
				}
			}

			Assert.assertTrue(
				keywords2 + " does not contain " + keyword1, contains);
		}
	}

	protected void assertResponseCode(
		int expectedResponseCode, Http.Response actualResponse) {

		Assert.assertEquals(
			expectedResponseCode, actualResponse.getResponseCode());
	}

	protected boolean equals(Keyword keyword1, Keyword keyword2) {
		if (keyword1 == keyword2) {
			return true;
		}

		return false;
	}

	protected boolean invokeDeleteKeyword(Long keywordId) throws Exception {
		Http.Options options = _createHttpOptions();

		options.setDelete(true);

		options.setLocation(
			_resourceURL + _toPath("/keywords/{keyword-id}", keywordId));

		return _outputObjectMapper.readValue(
			HttpUtil.URLtoString(options), Boolean.class);
	}

	protected Http.Response invokeDeleteKeywordResponse(Long keywordId)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setDelete(true);

		options.setLocation(
			_resourceURL + _toPath("/keywords/{keyword-id}", keywordId));

		HttpUtil.URLtoString(options);

		return options.getResponse();
	}

	protected Page<Keyword> invokeGetContentSpaceKeywordsPage(
			Long contentSpaceId, String filterString, Pagination pagination,
			String sortString)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setLocation(
			_getContentSpaceKeywordsLocation(
				contentSpaceId, filterString, pagination, sortString));

		return _outputObjectMapper.readValue(
			HttpUtil.URLtoString(options),
			new TypeReference<Page<Keyword>>() {
			});
	}

	protected Http.Response invokeGetContentSpaceKeywordsPageResponse(
			Long contentSpaceId, String filterString, Pagination pagination,
			String sortString)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setLocation(
			_getContentSpaceKeywordsLocation(
				contentSpaceId, filterString, pagination, sortString));

		HttpUtil.URLtoString(options);

		return options.getResponse();
	}

	protected Keyword invokeGetKeyword(Long keywordId) throws Exception {
		Http.Options options = _createHttpOptions();

		options.setLocation(
			_resourceURL + _toPath("/keywords/{keyword-id}", keywordId));

		return _outputObjectMapper.readValue(
			HttpUtil.URLtoString(options), Keyword.class);
	}

	protected Http.Response invokeGetKeywordResponse(Long keywordId)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setLocation(
			_resourceURL + _toPath("/keywords/{keyword-id}", keywordId));

		HttpUtil.URLtoString(options);

		return options.getResponse();
	}

	protected Keyword invokePostContentSpaceKeyword(
			Long contentSpaceId, Keyword keyword)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setBody(
			_inputObjectMapper.writeValueAsString(keyword),
			ContentTypes.APPLICATION_JSON, StringPool.UTF8);

		options.setLocation(
			_resourceURL +
				_toPath(
					"/content-spaces/{content-space-id}/keywords",
					contentSpaceId));

		options.setPost(true);

		return _outputObjectMapper.readValue(
			HttpUtil.URLtoString(options), Keyword.class);
	}

	protected Http.Response invokePostContentSpaceKeywordResponse(
			Long contentSpaceId, Keyword keyword)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setBody(
			_inputObjectMapper.writeValueAsString(keyword),
			ContentTypes.APPLICATION_JSON, StringPool.UTF8);

		options.setLocation(
			_resourceURL +
				_toPath(
					"/content-spaces/{content-space-id}/keywords",
					contentSpaceId));

		options.setPost(true);

		HttpUtil.URLtoString(options);

		return options.getResponse();
	}

	protected Keyword invokePutKeyword(Long keywordId, Keyword keyword)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setBody(
			_inputObjectMapper.writeValueAsString(keyword),
			ContentTypes.APPLICATION_JSON, StringPool.UTF8);

		options.setLocation(
			_resourceURL + _toPath("/keywords/{keyword-id}", keywordId));

		options.setPut(true);

		return _outputObjectMapper.readValue(
			HttpUtil.URLtoString(options), Keyword.class);
	}

	protected Http.Response invokePutKeywordResponse(
			Long keywordId, Keyword keyword)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setBody(
			_inputObjectMapper.writeValueAsString(keyword),
			ContentTypes.APPLICATION_JSON, StringPool.UTF8);

		options.setLocation(
			_resourceURL + _toPath("/keywords/{keyword-id}", keywordId));

		options.setPut(true);

		HttpUtil.URLtoString(options);

		return options.getResponse();
	}

	protected Keyword randomKeyword() {
		return new Keyword() {
			{
				contentSpace = RandomTestUtil.randomLong();
				dateCreated = RandomTestUtil.nextDate();
				dateModified = RandomTestUtil.nextDate();
				id = RandomTestUtil.randomLong();
				name = RandomTestUtil.randomString();
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

	private String _getContentSpaceKeywordsLocation(
		Long contentSpaceId, String filterString, Pagination pagination,
		String sortString) {

		String url =
			_resourceURL +
				_toPath(
					"/content-spaces/{content-space-id}/keywords",
					contentSpaceId);

		url += "?filter=" + URLCodec.encodeURL(filterString);
		url += "&page=" + pagination.getPageNumber();
		url += "&pageSize=" + pagination.getItemsPerPage();
		url += "&sort=" + URLCodec.encodeURL(sortString);

		return url;
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