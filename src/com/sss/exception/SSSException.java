package com.sss.exception;


public class SSSException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public static int dccErrorCode = 100;
	public static final String ENCRYPTION_DECRYPTION_OPERATION_ERROR_CODE = String.valueOf(dccErrorCode++);
	public static final String ENCRYPTION_DECRYPTION_OPERATION_MESSAGE = "Encrption/Decryption operation resulted in exception";
	
	public static final String FILE_OPERATION_ERROR_CODE = String.valueOf(dccErrorCode++);
	public static final String FILE_OPERATION_MESSAGE = "File handling operation resulted in exception";

	public SSSException (String errorCode, String errorMessage, Exception e) {
		e.printStackTrace();
//		logger.logInfo("An exception occurred ErrorCode : " + errorCode + ", Error Message : " + errorMessage);
//		logger.logError(e);
	}
}