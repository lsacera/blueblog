package se.bluefish.blueblog;

/*
/**
 * Base application Exception in BlueBlog. 
 * 
 * @author Robert Bur�n
 */
public class BBException extends Exception {

	/**
	 * 
	 */
	public BBException() {
		super();
	}

	/**
	 * @param message
	 */
	public BBException(String message) {
		super(message);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public BBException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param cause
	 */
	public BBException(Throwable cause) {
		super(cause);
	}

}
