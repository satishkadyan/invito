/**
 * 
 */
package com.invito.core.modules.authentication.exception;

import com.common.enumerations.ErrorCodesEnum;
import com.invito.framework.exception.InvitoBusinessException;

/**
 * @author Prakash Solanki
 *
 */
public class AuthenticationFailedException extends InvitoBusinessException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1762276640335715640L;

	/**
	 * @param errorCode
	 * @param e
	 */
	public AuthenticationFailedException(String errorCode, Exception e) {
		super(errorCode, e);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param errorCode
	 */
	public AuthenticationFailedException(String errorCode) {
		super(errorCode);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param errorCodeEnum
	 * @param e
	 */
	public AuthenticationFailedException(ErrorCodesEnum errorCodeEnum,
			Exception e) {
		super(errorCodeEnum, e);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param errorCodeEnum
	 */
	public AuthenticationFailedException(ErrorCodesEnum errorCodeEnum) {
		super(errorCodeEnum);
		// TODO Auto-generated constructor stub
	}

}
