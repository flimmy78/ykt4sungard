/**
 * Copyright (c) 2000-2008 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portlet.softwarecatalog.service.http;

import com.liferay.portlet.softwarecatalog.service.SCProductVersionServiceUtil;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * <a href="SCProductVersionServiceJSON.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be
 * overwritten the next time is generated.
 * </p>
 *
 * <p>
 * This class provides a JSON utility for the
 * <code>com.liferay.portlet.softwarecatalog.service.SCProductVersionServiceUtil</code>
 * service utility. The static methods of this class calls the same methods of
 * the service utility. However, the signatures are different because it is
 * difficult for JSON to support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to a <code>org.json.JSONArray</code>. If the method in the
 * service utility returns a <code>com.liferay.portlet.softwarecatalog.model.SCProductVersion</code>,
 * that is translated to a <code>org.json.JSONObject</code>. Methods that JSON
 * cannot safely use are skipped. The logic for the translation is encapsulated
 * in <code>com.liferay.portlet.softwarecatalog.service.http.SCProductVersionJSONSerializer</code>.
 * </p>
 *
 * <p>
 * This allows you to call the the backend services directly from JavaScript.
 * See <code>portal-web/docroot/html/portlet/tags_admin/unpacked.js</code> for a
 * reference of how that portlet uses the generated JavaScript in
 * <code>portal-web/docroot/html/js/service.js</code> to call the backend
 * services directly from JavaScript.
 * </p>
 *
 * <p>
 * The JSON utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 *
 * @see com.liferay.portlet.softwarecatalog.service.SCProductVersionServiceUtil
 * @see com.liferay.portlet.softwarecatalog.service.http.SCProductVersionJSONSerializer
 *
 */
public class SCProductVersionServiceJSON {
	public static JSONObject addProductVersion(long productEntryId,
		java.lang.String version, java.lang.String changeLog,
		java.lang.String downloadPageURL, java.lang.String directDownloadURL,
		boolean repoStoreArtifact, long[] frameworkVersionIds,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws java.rmi.RemoteException, com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException {
		com.liferay.portlet.softwarecatalog.model.SCProductVersion returnValue = SCProductVersionServiceUtil.addProductVersion(productEntryId,
				version, changeLog, downloadPageURL, directDownloadURL,
				repoStoreArtifact, frameworkVersionIds,
				addCommunityPermissions, addGuestPermissions);

		return SCProductVersionJSONSerializer.toJSONObject(returnValue);
	}

	public static JSONObject addProductVersion(long productEntryId,
		java.lang.String version, java.lang.String changeLog,
		java.lang.String downloadPageURL, java.lang.String directDownloadURL,
		boolean repoStoreArtifact, long[] frameworkVersionIds,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws java.rmi.RemoteException, com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException {
		com.liferay.portlet.softwarecatalog.model.SCProductVersion returnValue = SCProductVersionServiceUtil.addProductVersion(productEntryId,
				version, changeLog, downloadPageURL, directDownloadURL,
				repoStoreArtifact, frameworkVersionIds, communityPermissions,
				guestPermissions);

		return SCProductVersionJSONSerializer.toJSONObject(returnValue);
	}

	public static void deleteProductVersion(long productVersionId)
		throws java.rmi.RemoteException, com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException {
		SCProductVersionServiceUtil.deleteProductVersion(productVersionId);
	}

	public static JSONObject getProductVersion(long productVersionId)
		throws java.rmi.RemoteException, com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException {
		com.liferay.portlet.softwarecatalog.model.SCProductVersion returnValue = SCProductVersionServiceUtil.getProductVersion(productVersionId);

		return SCProductVersionJSONSerializer.toJSONObject(returnValue);
	}

	public static JSONArray getProductVersions(long productEntryId, int begin,
		int end)
		throws java.rmi.RemoteException, com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException {
		java.util.List returnValue = SCProductVersionServiceUtil.getProductVersions(productEntryId,
				begin, end);

		return SCProductVersionJSONSerializer.toJSONArray(returnValue);
	}

	public static int getProductVersionsCount(long productEntryId)
		throws java.rmi.RemoteException, com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException {
		int returnValue = SCProductVersionServiceUtil.getProductVersionsCount(productEntryId);

		return returnValue;
	}

	public static JSONObject updateProductVersion(long productVersionId,
		java.lang.String version, java.lang.String changeLog,
		java.lang.String downloadPageURL, java.lang.String directDownloadURL,
		boolean repoStoreArtifact, long[] frameworkVersionIds)
		throws java.rmi.RemoteException, com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException {
		com.liferay.portlet.softwarecatalog.model.SCProductVersion returnValue = SCProductVersionServiceUtil.updateProductVersion(productVersionId,
				version, changeLog, downloadPageURL, directDownloadURL,
				repoStoreArtifact, frameworkVersionIds);

		return SCProductVersionJSONSerializer.toJSONObject(returnValue);
	}
}