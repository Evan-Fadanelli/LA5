package edu.wmich.cs1120.efadanelli.LA5;

import java.io.*;
import java.util.*;

public class ContactInformationFormatter implements IContactInformationFormatter {
	
	File[] files = new File[10];//The file array
	FormatExceptionHandler problemSolver = new FormatExceptionHandler();//the formatExceptoinHandeler
	
	@Override
	public void readContactInformation(String[] filePaths){
		for(int fileTraverser=0;fileTraverser<filePaths.length;fileTraverser++) {//traverse through the loop and format each contact information file
			formatContactInformation(filePaths[fileTraverser]);
			System.out.println();//print a new line to look nice :)
		}
	}

	@Override
	public void formatContactInformation(String fileName){
		try {
			File file = new File(fileName);//make a new file with that fileName
			Scanner fileReader = new Scanner(file);//make a scanner to traverse the file
			formatName(fileReader.nextLine());//format the name and print it
			formatPhoneNumber(fileReader.nextLine());//format the phone number and print it
			formatEmail(fileReader.nextLine());//format the email and print it
			fileReader.close();//close the scanner
		}catch(FileNotFoundException e) {//if a file does not exist, then...
			System.out.print(fileName);//print the name of the missing file
			problemSolver.handleFileNotFoundException(e);//pass the error to the exception handler
		}
	}

	@Override
	public void formatEmail(String email){
		try {
			for(int i = 0; i<email.length()-1;i++){//go through the email and...
				char emailChar = email.charAt(i);	
				if(emailChar > 64 || emailChar < 91){//check if each char is lowerCase	
					throw new EmailAddressFormatException(email);//if it isn't, throw an exception
				}			
			}
		}catch(EmailAddressFormatException e) {//if an exception was thrown, then...
			problemSolver.handleEmailFormatException(e);//pass it to the exception handler
		}
	}

	@Override
	public void formatPhoneNumber(String phoneNumber){
		try {
			if(phoneNumber.charAt(0)!='(')//if the first character is NOT a ( throw an exception,  
				throw new PhoneNumberFormatException(phoneNumber);
			else if(phoneNumber.charAt(4)!=')')//if the fourth character is NOT a ) throw an exception, 
				throw new PhoneNumberFormatException(phoneNumber);
			else if(phoneNumber.charAt(5)!='-' || phoneNumber.charAt(9)!='-')//if the fifth or ninth character is NOT a - throw an exception, 
				throw new PhoneNumberFormatException(phoneNumber);
			System.out.println(phoneNumber);
		}catch(PhoneNumberFormatException e) {
			problemSolver.handlePhoneNumberFormatException(e);
		}
	}

	@Override
	public void formatName(String name){
		// TODO Auto-generated method stub
		boolean secondWord = false;//flag to mark the second word
		try {
			for(int stringIndex=0;stringIndex <= name.length()-1;stringIndex++) {//start to traverse the string
				char thisChar = name.charAt(stringIndex);//get the character the traverser is at
				if(thisChar == ' ') {//check to see if were at the second word
					secondWord = true;//if we are set the space true (the next letter must be capitalized
					continue;//go to next letter
				}else {//otherwise check to see if its the first or second word cap. letter
					if(stringIndex == 0 || secondWord) {//if it is
						secondWord = false;//set secondWord to false
						if(thisChar < 65 || thisChar > 90) //if the character is not capital letter
							throw new NameFormatException(name);//throw NameFormatexception and use handler to handle it
					}else {//otherwise check to see if its a lowerCase letter
						if(thisChar < 97 || thisChar > 122) //if the character is not lowerCase letter
							throw new NameFormatException(name);//throw NameFormatexception and use handler to handle it
					}
				}
			}
			System.out.println(name);//print the name out
		}catch(NameFormatException e) {	//if a NameFormatException is thrown, then...
			problemSolver.handleNameFormatException(e);//send the name forward
		}
	}
}