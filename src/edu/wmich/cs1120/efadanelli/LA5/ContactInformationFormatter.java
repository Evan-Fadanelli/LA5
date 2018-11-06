package edu.wmich.cs1120.efadanelli.LA5;

import java.io.*;

public class ContactInformationFormatter implements IContactInformationFormatter {
	
	File[] files = new File[10];
	FormatExceptionHandler problemSolver = new FormatExceptionHandler();
	
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
			System.out.println("Correct Format was entered: " + name);//GET RID OF THIS LINE EVENTUALLY
		}catch(NameFormatException e) {	
			System.out.print("There was an incorrect format: " + name + "\nCorrect format: ");
			problemSolver.handleNameFormatException(e);
		}
	}
}