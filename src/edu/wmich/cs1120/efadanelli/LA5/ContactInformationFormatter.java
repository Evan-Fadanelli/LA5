package edu.wmich.cs1120.efadanelli.LA5;

import java.io.*;
import java.util.Scanner;

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
		int someInt = -1
		for(int i =0; i<files.length; i++)
		{
			Scanner drCream = new Scanner(files[i]);
			drCream.nextLine();
			do {
				someInt = drCream.nextInt()
				catch(wrongFormateExsetion)
			}while(drCream.hasNext())
				}
		
		
		
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
					}else {//otherwise check to see if its a lowerCase letter
						if(thisChar <= 97 || thisChar >= 122) //if the character is not lowercase letter
							throw new NameFormatException(name);//throw NameFormatexception and use handeler to handle it
					}
				}
			}
		}catch(NameFormatException e) {	
			problemSolver.handleNameFormatException(e);
		}
	}
}
