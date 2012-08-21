package com.invito.dao.modules.authentication;

import com.invito.dao.dto.UserDTO;
import com.invito.dao.exception.DataAcessFailedException;

public class UserDAOImpl implements UserDAO {

	public UserDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	public UserDTO getUser(String userId) throws DataAcessFailedException {
		// TODO Auto-generated method stub
		
		UserDTO userdto = new UserDTO("id1", "username1", "password1");
		
		return null;
	}

}
