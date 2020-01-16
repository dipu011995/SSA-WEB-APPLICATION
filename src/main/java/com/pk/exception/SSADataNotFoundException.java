package com.pk.exception;

/**
 * This is Class is to handel Exception
 * @author Pankaj Kumar
 *
 */
public class SSADataNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public SSADataNotFoundException() {

	}
	
	public SSADataNotFoundException(Error msg) {
		super(msg);
	}
	
	

}
