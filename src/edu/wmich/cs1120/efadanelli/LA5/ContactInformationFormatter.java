package edu.wmich.cs1120.efadanelli.LA5;

import java.io.*;
import java.util.Scanner;

public class ContactInformationFormatter implements IContactInformationFormatter {
	
	File[] files = new File[10];
	FormatExceptionHandler problemSolver = new FormatExceptionHandler();
	int[] phoneNumberArray = new int[10];
	
	@Override
	public void readContactInformation(String[] filePaths) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void formatContactInformation(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void formatEmail(String email) throws EmailAddressFormatException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void formatPhoneNumber(String phoneNumber) throws PhoneNumberFormatException {
		int numberForTheArray = 0;
		try {
			for(int a = 0; a< phoneNumber.length()-1; a++){
				char pasta = phoneNumber.charAt(a);
				switch(pasta) {
				case 48: phoneNumberArray[numberForTheArray] = 0;
					numberForTheArray++;
					break;
				case 49: phoneNumberArray[numberForTheArray] = 1;
					numberForTheArray++;
					break;
				case 50: phoneNumberArray[numberForTheArray] = 2;
					numberForTheArray++;
					break;
				case 51: phoneNumberArray[numberForTheArray] = 3;
					numberForTheArray++;
					break;
				case 52: phoneNumberArray[numberForTheArray] = 4;
					numberForTheArray++;
					break;
				case 53: phoneNumberArray[numberForTheArray] = 5;
					numberForTheArray++;
					break;
				case 54: phoneNumberArray[numberForTheArray] = 6;
					numberForTheArray++;
					break;
				case 55: phoneNumberArray[numberForTheArray] = 7;
					numberForTheArray++;
					break;
				case 56: phoneNumberArray[numberForTheArray] = 8;
					numberForTheArray++;
					break;
				case 57: phoneNumberArray[numberForTheArray] = 9;
					numberForTheArray++;
					break;
				default: throw new PhoneNumberFormatException(phoneNumber);
				}
			}
		}catch(PhoneNumberFormatException e) {
			problemSolver.handlePhoneNumberFormatException(e);
		}
	}

	@Override
	public void formatName(String name) throws NameFormatException {
		// TODO Auto-generated method stub
		boolean secondWord = false;
		try {
			for(int stringIndex=0;stringIndex <= name.length()-1;stringIndex++) {
				char thisChar = name.charAt(stringIndex);
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
			System.out.println(name);
		}catch(NameFormatException e) {	
			problemSolver.handleNameFormatException(e);
		}
	}
}