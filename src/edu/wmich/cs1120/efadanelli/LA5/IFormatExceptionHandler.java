package edu.wmich.cs1120.efadanelli.LA5;

import java.io.*;

public interface IFormatExceptionHandler {
	
	/**
	 * Takes a FileNotFoundException and prints out the error message that the file cannot be found. 
	 * @param e The Exception being passed to the method
	 */
	void handleFileNotFoundException(FileNotFoundException e);
	/*Handle file not found exception*/
	
	/**
	 * Takes a PhoneNumberFormatException and prints out the correct format for it
	 * @param e The PhoneNumberFormatException passed to the method. Holds the incorrect phone number
	 */
	void handlePhoneNumberFormatException(PhoneNumberFormatException e);
	/*Handle phone number format exception*/
	
	/**
	 * Takes a EmailAddressFormatException and prints out the correct format for it
	 * @param e The EmailAddressFormatException passed to the method. Holds the incorrect email address
	 */
	void handleEmailFormatException(EmailAddressFormatException e);
	/*Handle email format exception*/
	
	/**
	 * Takes a NameFormatException and prints out the correct format for it
	 * @param e The NameFormatException passed to the method. Holds the incorrect name
	 */
	void handleNameFormatException(NameFormatException e);
	/*Handle name format exception*/
}