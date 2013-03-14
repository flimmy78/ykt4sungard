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

package com.liferay.portal.model;

import com.liferay.portal.ModelListenerException;
import com.liferay.portal.service.LayoutLocalServiceUtil;
import com.liferay.portal.servlet.filters.layoutcache.LayoutCacheUtil;

/**
 * <a href="PortletPreferencesListener.java.html"><b><i>View Source</i></b></a>
 *
 * @author Alexander Chow
 *
 */
public class PortletPreferencesListener implements ModelListener {

	public void onBeforeCreate(BaseModel model) throws ModelListenerException {
	}

	public void onAfterCreate(BaseModel model) throws ModelListenerException {
	}

	public void onBeforeRemove(BaseModel model) throws ModelListenerException {
	}

	public void onAfterRemove(BaseModel model) throws ModelListenerException {
		clearCache(model);
	}

	public void onBeforeUpdate(BaseModel model) throws ModelListenerException {
	}

	public void onAfterUpdate(BaseModel model) throws ModelListenerException {
		clearCache(model);
	}

	protected void clearCache(BaseModel model) {
		PortletPreferencesModel prefs = (PortletPreferencesModel)model;

		try {
			Layout layout = LayoutLocalServiceUtil.getLayout(
				prefs.getPlid());

			if (!layout.isPrivateLayout()) {
				LayoutCacheUtil.clearCache(layout.getCompanyId());
			}
		}
		catch (Exception e) {
			LayoutCacheUtil.clearCache();
		}
	}

}