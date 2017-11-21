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

package com.liferay.polls.internal.exportimport.data.handler.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.exportimport.kernel.lar.DataLevel;
import com.liferay.polls.constants.PollsPortletKeys;
import com.liferay.portal.kernel.test.util.TestPropsValues;
import com.liferay.portal.lar.test.BasePortletDataHandlerTestCase;
import com.liferay.portal.service.test.ServiceTestUtil;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.runner.RunWith;

/**
 * @author Zoltan Csaszi
 * @author Gergely Mathe
 */
@RunWith(Arquillian.class)
public class PollsDisplayPortletDataHandlerTest
	extends BasePortletDataHandlerTestCase {

	@Before
	@Override
	public void setUp() throws Exception {
		ServiceTestUtil.setUser(TestPropsValues.getUser());

		super.setUp();
	}

	@Rule
	public final LiferayIntegrationTestRule liferayIntegrationTestRule =
		new LiferayIntegrationTestRule();

	@Override
	protected void addStagedModels() throws Exception {
	}

	@Override
	protected DataLevel getDataLevel() {
		return DataLevel.PORTLET_INSTANCE;
	}

	@Override
	protected String[] getDataPortletPreferences() {
		return new String[] {"questionId"};
	}

	@Override
	protected String getPortletId() {
		return PollsPortletKeys.POLLS_DISPLAY;
	}

	@Override
	protected boolean isDataPortalLevel() {
		return false;
	}

	@Override
	protected boolean isDataPortletInstanceLevel() {
		return true;
	}

	@Override
	protected boolean isDataSiteLevel() {
		return false;
	}

}