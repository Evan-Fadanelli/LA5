package edu.wmich.cs1120.efadanelli.LA5;

import java.io.FileNotFoundException;

public class FormatExceptionHandler implements IFormatExceptionHandler {

	@Override
	public void handleFileNotFoundException(FileNotFoundException e) {
		// TODO Auto-generated method stub
		System.out.println("(The system cannot find the specified file)");
	}

	@Override
	public void handlePhoneNumberFormatException(PhoneNumberFormatException e) {
		// TODO Auto-generated method stub
		String number = e.getNumber();//make a new string called number (makes the code easier to read)
		String newNumber = "(";//make the first element a (
		int traverser = 0;//make a traverser to traverse the number
		int tracker = 0;//make a tracker to track how many numbers have been counted
		while(tracker < 3) {//if the first 3 numbers are counted, then stop
			if(number.charAt(traverser) >= 48 && number.charAt(traverser) <= 57) {//is the character here a number?
				newNumber = newNumber + number.charAt(traverser);//if yes, set the next character in newNumber to that number
				tracker++;
			}
			traverser++;
		}
		newNumber = newNumber + ")-";//set the next part of the new number to )-
		while(tracker < 6) {//if the first 6 numbers are counted, then stop
			if(number.charAt(traverser) >= 48 && number.charAt(traverser) <= 57) {//is the character here a number?
				newNumber = newNumber + number.charAt(traverser);//if yes, set the next character in newNumber to that number
				tracker++;
			}
			traverser++;
		}
		newNumber = newNumber + "-";//set the next part of the new number to -
		while(tracker < 10) {
			if(number.charAt(traverser) >= 48 && number.charAt(traverser) <= 57) {//is the character here a number?
				newNumber = newNumber + number.charAt(traverser);//if yes, set the next character in newNumber to that number
				tracker++;
			}
			traverser++;
		}
		System.out.println(newNumber);//print out the new number
	}

	@Override
	public void handleEmailFormatException(EmailAddressFormatException e) {
		// TODO Auto-generated method stub
		String email = e.getEmail();//get the email
		email = email.toLowerCase();//make it all lowerCase
		System.out.println(email);//print it out
	}

	@Override
	public void handleNameFormatException(NameFormatException e) {
		// TODO Auto-generated method stub
		String name = e.getName();//get the incorrectly formatted name
		name = name.toLowerCase();//set the whole name to lowerCase
		char[] workingString = name.toCharArray();//make a character array to work with
		workingString[0] = (char)(name.charAt(0)-32);//make the first string 
		for(int stringPosition=1;stringPosition <= name.length()-1;stringPosition++) {//traverse the string for the space
			if(name.charAt(stringPosition) == ' ') {//if the space is reached
				workingString[stringPosition+1] = (char)(name.charAt(stringPosition+1) - 32);//make the next letter capitalized
				break;//stop loosing
			}
		}
		for(int stringPosition=0;stringPosition <= name.length()-1;stringPosition++)//print out the string
			System.out.print(workingString[stringPosition]);
		System.out.println("");
	}

}