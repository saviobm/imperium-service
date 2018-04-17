package br.com.imperium.exception;

public class ImperiumErrorException extends Exception {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = -8996368333759132740L;
	
	public ImperiumErrorException(String msg) {
		super(msg);
	}
	
	public ImperiumErrorException(String msg, Exception ex) {
		super(msg, ex);
	}

}