package com.invito.dao.dto;

import com.common.vo.UserVO;

public class UserDTO extends UserVO{

	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserDTO() {
		// TODO Auto-generated constructor stub
	}
	public UserDTO(String userId, String userName,String password) {
		super(userId, userName);
		this.password=password;
		// TODO Auto-generated constructor stub
	}

	
	

}
