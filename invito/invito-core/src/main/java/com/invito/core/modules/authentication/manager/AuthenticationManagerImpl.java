package com.invito.core.modules.authentication.manager;

import com.common.enumerations.ErrorCodesEnum;
import com.common.vo.UserVO;
import com.invito.core.modules.authentication.exception.AuthenticationFailedException;
import com.invito.dao.dto.UserDTO;
import com.invito.dao.exception.DataAcessFailedException;
import com.invito.dao.modules.authentication.UserDAO;

public class AuthenticationManagerImpl implements AuthenticationManager {
	private UserDAO userDAO ;
	
	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public AuthenticationManagerImpl() {
		// TODO Auto-generated constructor stub
	}

	public UserVO authenticateUser(String userId, String password)
			throws AuthenticationFailedException {
		// TODO Auto-generated method stub
		
		 try {
			UserDTO  userDTO = userDAO.getUser(userId);
		if(userDTO.getPassword()==password){
			return (UserVO) userDTO;
		}else{
			throw new AuthenticationFailedException(ErrorCodesEnum.AUTHENTICATION_FAILED_EXCEPTION);
		}
		 } catch (DataAcessFailedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new AuthenticationFailedException(e.getMessage());
		} 
		
	}

}
