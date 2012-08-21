/**
 * 
 */
package com.invito.framework.exception;

import com.common.enumerations.ErrorCodesEnum;

/**
 * @author Admin
 * 
 */
public class InvitoBusinessException extends InvitoBaseException {

	/**
	 * @param errorCode
	 * @param e
	 */
	public InvitoBusinessException(String errorCode, Exception e) {
		super(errorCode, e);
		super.setExceptionType(BUSINESS_EXCEPTION_TYPE);
	}

	/**
	 * @param errorCode
	 */
	public InvitoBusinessException(String errorCode) {
		super(errorCode);
		super.setExceptionType(BUSINESS_EXCEPTION_TYPE);
	}

	/**
	 * @param errorCodeEnum
	 * @param e
	 */
	public InvitoBusinessException(ErrorCodesEnum errorCodeEnum, Exception e) {
		super(errorCodeEnum, e);
		super.setExceptionType(BUSINESS_EXCEPTION_TYPE);
	}

	/**
	 * @param errorCodeEnum
	 */
	public InvitoBusinessException(ErrorCodesEnum errorCodeEnum) {
		super(errorCodeEnum);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1146757635940220423L;

}
