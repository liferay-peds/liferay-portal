/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.search.admin.web.internal.util;

import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.search.admin.web.internal.constants.SearchAdminNavigationConstants;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mario Leandro
 */
public class SearchAdminNavigationUtil {

	public static List<String> getTabs1Names(
		boolean indexInformationAvailable,
		PermissionChecker permissionChecker) {

		List<String> tabs1Names = new ArrayList<>();

		if (permissionChecker.isOmniadmin()) {
			tabs1Names.add(SearchAdminNavigationConstants.TABS1_CONNECTIONS);
		}

		tabs1Names.add(SearchAdminNavigationConstants.TABS1_INDEX_ACTIONS);

		if (indexInformationAvailable && permissionChecker.isOmniadmin()) {
			tabs1Names.add(SearchAdminNavigationConstants.TABS1_FIELD_MAPPINGS);
		}

		return tabs1Names;
	}

}