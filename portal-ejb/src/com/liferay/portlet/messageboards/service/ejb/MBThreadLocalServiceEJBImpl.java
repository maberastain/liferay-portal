/**
 * Copyright (c) 2000-2006 Liferay, Inc. All rights reserved.
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

package com.liferay.portlet.messageboards.service.ejb;

import com.liferay.portal.spring.util.SpringUtil;

import com.liferay.portlet.messageboards.service.spring.MBThreadLocalService;
import com.liferay.portlet.messageboards.service.spring.MBThreadLocalServiceFactory;

import org.springframework.context.ApplicationContext;

import javax.ejb.CreateException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

/**
 * <a href="MBThreadLocalServiceEJBImpl.java.html"><b><i>View Source</i></b></a>
 *
 * @author  Brian Wing Shun Chan
 *
 */
public class MBThreadLocalServiceEJBImpl implements MBThreadLocalService,
	SessionBean {
	public void deleteThread(java.lang.String threadId)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		MBThreadLocalServiceFactory.getTxImpl().deleteThread(threadId);
	}

	public void deleteThread(
		com.liferay.portlet.messageboards.model.MBThread thread)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		MBThreadLocalServiceFactory.getTxImpl().deleteThread(thread);
	}

	public void deleteThreads(java.lang.String categoryId)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		MBThreadLocalServiceFactory.getTxImpl().deleteThreads(categoryId);
	}

	public int getCategoriesThreadsCount(java.util.List categoryIds)
		throws com.liferay.portal.SystemException {
		return MBThreadLocalServiceFactory.getTxImpl()
										  .getCategoriesThreadsCount(categoryIds);
	}

	public java.util.List getGroupThreads(java.lang.String groupId, int begin,
		int end) throws com.liferay.portal.SystemException {
		return MBThreadLocalServiceFactory.getTxImpl().getGroupThreads(groupId,
			begin, end);
	}

	public java.util.List getGroupThreads(java.lang.String groupId,
		java.lang.String userId, int begin, int end)
		throws com.liferay.portal.SystemException {
		return MBThreadLocalServiceFactory.getTxImpl().getGroupThreads(groupId,
			userId, begin, end);
	}

	public int getGroupThreadsCount(java.lang.String groupId)
		throws com.liferay.portal.SystemException {
		return MBThreadLocalServiceFactory.getTxImpl().getGroupThreadsCount(groupId);
	}

	public int getGroupThreadsCount(java.lang.String groupId,
		java.lang.String userId) throws com.liferay.portal.SystemException {
		return MBThreadLocalServiceFactory.getTxImpl().getGroupThreadsCount(groupId,
			userId);
	}

	public com.liferay.portlet.messageboards.model.MBThread getThread(
		java.lang.String threadId)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		return MBThreadLocalServiceFactory.getTxImpl().getThread(threadId);
	}

	public java.util.List getThreads(java.lang.String categoryId, int begin,
		int end) throws com.liferay.portal.SystemException {
		return MBThreadLocalServiceFactory.getTxImpl().getThreads(categoryId,
			begin, end);
	}

	public int getThreadsCount(java.lang.String categoryId)
		throws com.liferay.portal.SystemException {
		return MBThreadLocalServiceFactory.getTxImpl().getThreadsCount(categoryId);
	}

	public boolean hasReadThread(java.lang.String userId,
		java.lang.String threadId) throws com.liferay.portal.SystemException {
		return MBThreadLocalServiceFactory.getTxImpl().hasReadThread(userId,
			threadId);
	}

	public void ejbCreate() throws CreateException {
	}

	public void ejbRemove() {
	}

	public void ejbActivate() {
	}

	public void ejbPassivate() {
	}

	public SessionContext getSessionContext() {
		return _sc;
	}

	public void setSessionContext(SessionContext sc) {
		_sc = sc;
	}

	private SessionContext _sc;
}