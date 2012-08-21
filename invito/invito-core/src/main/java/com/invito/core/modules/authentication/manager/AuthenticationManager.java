/**
 * 
 */
package com.invito.core.modules.authentication.manager;

import com.common.vo.UserVO;
import com.invito.core.modules.authentication.exception.AuthenticationFailedException;

/**
 * @author Prakash Solanki
 * 
 */
public interface AuthenticationManager {

	UserVO authenticateUser(String userId, String password)
			throws AuthenticationFailedException;

}
