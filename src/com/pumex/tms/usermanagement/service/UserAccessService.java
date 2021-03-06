/**
 * @Author Jinshad P.T.
 * @Date 26/08/2016
 */

package com.pumex.tms.usermanagement.service;

import java.util.List;

import com.pumex.tms.models.Options;

public interface UserAccessService {

	Object[] loadOptions(long roleId) throws Exception;

	void saveUserAccess(Long[] options, long roleId) throws Exception;

	boolean isValidAccess(String action, String roleIDs) throws Exception;

	List<Options> getAvailableOptions(String roleIds) throws Exception;
}
