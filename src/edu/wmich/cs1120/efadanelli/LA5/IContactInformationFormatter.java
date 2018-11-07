package edu.wmich.cs1120.efadanelli.LA5;

/**
 * 
 * @author Evan Fadanelli and Schyuler-James Jones
 *
 */
public interface IContactInformationFormatter {
	
	/**
	 * Takes a file, reads contact information and prints the contact information in a correct format
	 * @param filePaths - an array of file names to read and print
	 */
	void readContactInformation(String[] filePaths);
	/*read contact information from a list of files given the file paths*/
	
	/**
	 * Reads the file and checks to see if the format for the contact information is correct.
	 * If not, then it formats it and prints the correct format
	 * @param fileName - the file to read from
	 */
	void formatContactInformation(String fileName);
	/*format the contact information in one file*/
	
	/**
	 * Reads an email, if it has an error it is handled with FormatExceptionHandler.
	 * Will always print out a correctly formatted email.
	 * @param email The email address to be formatted
	 * @throws EmailAddressFormatException The exception thrown when the email is not formatted correctly 
	 */
	void formatEmail(String email) throws EmailAddressFormatException;
	/*format one email address*/
	
	/**
	 * Reads a phone number, if it has an error it is handled with FormatExceptionHandeler.
	 * Will always print out a correctly formatted phone number.
	 * @param phoneNumber The phone number to be formatted
	 * @throws PhoneNumberFormatException The exception thrown when the phone number is not formatted correctly
	 */
	void formatPhoneNumber(String phoneNumber) throws PhoneNumberFormatException; 
	/*Format one phone number*/
	
	/**
	 * Reads a name, if it has an error it is handled with FormatExceptionHandeler.
	 * Will always print out a correctly formatted name.
	 * @param name The name to be formatted
	 * @throws NameFormatException The exception thrown when the name is not formatted correctly
	 */
	void formatName(String name) throws NameFormatException;
	/*format one name*/
}
