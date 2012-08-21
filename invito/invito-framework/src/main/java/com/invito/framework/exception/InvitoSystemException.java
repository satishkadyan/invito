/**
 * 
 */
package com.invito.framework.exception;

import com.common.enumerations.ErrorCodesEnum;


/**
 * @author Admin
 * 
 */
public class InvitoSystemException extends InvitoBaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4197422745681241940L;

	/**
	 * @param errorCode
	 * @param e
	 */
	public InvitoSystemException(String errorCode, Exception e) {
		super(errorCode, e);
		super.setExceptionType(SYSTEM_EXCEPTION_TYPE);
	}

	/**
	 * @param errorCode
	 */
	public InvitoSystemException(String errorCode) {
		super(errorCode);
		super.setExceptionType(SYSTEM_EXCEPTION_TYPE);
	}

	/**
	 * @param errorCodeEnum
	 * @param e
	 */
	public InvitoSystemException(ErrorCodesEnum errorCodeEnum, Exception e) {
		super(errorCodeEnum, e);
		super.setExceptionType(SYSTEM_EXCEPTION_TYPE);
	}

	/**
	 * @param errorCodeEnum
	 */
	public InvitoSystemException(ErrorCodesEnum errorCodeEnum) {
		super(errorCodeEnum);
	}
}
