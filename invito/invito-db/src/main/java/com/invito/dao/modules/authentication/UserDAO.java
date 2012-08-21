package com.invito.dao.modules.authentication;

import com.invito.dao.dto.UserDTO;
import com.invito.dao.exception.DataAcessFailedException;

public interface UserDAO {

	UserDTO getUser(String userId) throws DataAcessFailedException;

}
