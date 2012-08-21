package com.invito.dao.exception;

import com.common.enumerations.ErrorCodesEnum;
import com.invito.framework.exception.InvitoSystemException;

public class DataAcessFailedException extends InvitoSystemException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5175213426631872840L;

	public DataAcessFailedException(ErrorCodesEnum errorCodeEnum, Exception e) {
		super(errorCodeEnum, e);
		// TODO Auto-generated constructor stub
	}

	public DataAcessFailedException(ErrorCodesEnum errorCodeEnum) {
		super(errorCodeEnum);
		// TODO Auto-generated constructor stub
	}

	public DataAcessFailedException(String errorCode, Exception e) {
		super(errorCode, e);
		// TODO Auto-generated constructor stub
	}

	public DataAcessFailedException(String errorCode) {
		super(errorCode);
		// TODO Auto-generated constructor stub
	}

}
