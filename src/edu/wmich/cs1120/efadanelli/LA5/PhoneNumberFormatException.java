package edu.wmich.cs1120.efadanelli.LA5;

public class PhoneNumberFormatException extends Exception {

	private String number = new String();
	
	/**
	 * Prints out the message there is an error in the phone number format
	 */
	public PhoneNumberFormatException(){
		super("There is an error in the phone number format.");
	}
	
	/**
	 * Prints out the message saying there is an error in the phone number format and prints out the incorrect format if not handled
	 * @param number the incorrect number format
	 */
	public PhoneNumberFormatException(String number){
		super("There is an error in the phone number format. Given phone number: " + number);
		this.number = number;
	}
	
	
	/**
	 * Returns the incorrectly formatted number
	 * @return the incorrectly formatted number
	 */
	public String getNumber() {
		return this.number;
	}
}