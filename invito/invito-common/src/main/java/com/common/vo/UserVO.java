/**
 * 
 */
package com.common.vo;

/**
 * @author Prakash Solanki
 * 
 */
public class UserVO {
	
	private String userId ;
	private String userName ;
	

	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	/**
	 * 
	 */
	public UserVO() {
		
		// TODO Auto-generated constructor stub
	}


	public UserVO(String userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}

	
}
