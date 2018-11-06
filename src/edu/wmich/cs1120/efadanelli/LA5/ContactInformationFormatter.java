package edu.wmich.cs1120.efadanelli.LA5;

import java.io.*;

public class ContactInformationFormatter implements IContactInformationFormatter {
	
	File[] files = new File[10];
	
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void formatName(String name) throws NameFormatException {
		// TODO Auto-generated method stub
		boolean secondWord = false;
		try {
			for(int stringIndex=0;stringIndex <= name.length();stringIndex++) {
				char thisChar = name.charAt(stringIndex);
				if(thisChar == ' ') {//check to see if were at the second word
					secondWord = true;//if we are set the space true (the next letter must be capitalized
					continue;//go to next letter
				}else {//otherwise check to see if its the first or second word cap. letter
					if(stringIndex == 0 || secondWord) {//if it is
						secondWord = false;//set secondWord to false
						if(thisChar <= 65 || thisChar >= 90) //if the character is not capital letter
							throw new NameFormatException(name);//throw NameFormatexception and use handeler to handle it
					}else {//otherwise check to see if its a lowercase letter
						
					}
				}
			}
		}catch(NameFormatException e) {	
			//committed here
		}
	}
}
