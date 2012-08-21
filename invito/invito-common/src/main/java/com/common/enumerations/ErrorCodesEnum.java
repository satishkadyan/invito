package com.common.enumerations;

public enum ErrorCodesEnum {

	/*
	 * Error codes 10001 - 10999 are reserved for system exceptions
	 */
	SEVERE_ERROR("ERR_10001", "Severe Error", "common.error.severe.error"),

	SERVICE_UNAVAILABLE("ERR_10002", "Service Unavailable",
			"common.program.service.unavailable"),

	DATABASE_CONNECTION_UNAVAILABLE("ERR_10003", "Database Connection Error",
			"common.error.db.connection.unavailable"),

	UNEXPECTED_ERROR("ERR_10004", "Unexpected Error",
			"common.error.unexpected.error"),

	DATABASE_LAYER_EXCEPTION("ERR_10005", "Database Layer Exception",
			"common.error.db.exception"),

	OPERATION_NOT_IMPLEMENTED_EXCEPTION("ERR_10006",
			"Operation Not Supported Yet Exception",
			"common.error.operation.notimplemented"),

	AUTHENTICATION_FAILED_EXCEPTION("ERR_10007", "Authentication failed",
			"common.error.authentication.failed"),

	/*
	 * Error codes 11001 need to be used for business exceptions
	 */
	//
	BUSINESS_RULES_SERVICE_FAILED_EXCEPTION("ERR11001",
			"Exception in fetching business rules",
			"com.rt.apis.bisrul.service.failed"),

	BUSINESS_RULE_NOT_FOUND("ERR11002", "No business rule found",
			"com.rt.apis.bisrul.not.found"),

	;

	String errorCode;
	String errorMessage;
	String errorLabelCode;

	ErrorCodesEnum(String errorCode, String errorMessage, String errorLabelCode) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.errorLabelCode = errorLabelCode;
	}

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode
	 *            the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @param errorMessage
	 *            the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/**
	 * @return the errorLabelCode
	 */
	public String getErrorLabelCode() {
		return errorLabelCode;
	}

	/**
	 * @param errorLabelCode
	 *            the errorLabelCode to set
	 */
	public void setErrorLabelCode(String errorLabelCode) {
		this.errorLabelCode = errorLabelCode;
	}
}
