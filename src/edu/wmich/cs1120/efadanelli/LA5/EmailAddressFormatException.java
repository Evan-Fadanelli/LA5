package edu.wmich.cs1120.efadanelli.LA5;

public class EmailAddressFormatException extends Exception {
	
	private String email = new String();
	
	/**
	 * Prints out the message there is an error in the email format
	 */
	public EmailAddressFormatException(){
		super("There is an error in the name formatt");//send this message to the superclass
	}
	
	/**
	 * Prints out the message saying there is an error in the email format and prints out the incorrect format if not handled
	 * @param email the incorrect email format
	 */
	public EmailAddressFormatException(String email){
		super("There is an error in the name formatt here: " + email);// print the error message with the incorrect format
		this.email = email;//save the incorrect
	}
	
	/**
	 * Returns the incorrectly formatted email
	 * @return the incorrectly formatted email
	 */
	public String getEmail() {
		return this.email;
	}
}