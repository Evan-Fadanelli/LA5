package edu.wmich.cs1120.efadanelli.LA5;

import java.io.FileNotFoundException;

public class FormatExceptionHandler implements IFormatExceptionHandler {

	@Override
	public void handleFileNotFoundException(FileNotFoundException e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handlePhoneNumberFormatException(PhoneNumberFormatException e) {
		// TODO Auto-generated method stub
		String number = e.getNumber();
		String newNumber = "(";
		int traverser = 0;
		int tracker = 0;
		while(tracker < 3) {
			if(number.charAt(traverser) >= 48 && number.charAt(traverser) <= 57) {
				newNumber = newNumber + number.charAt(traverser);
				tracker++;
			}
			traverser++;
		}
		newNumber = newNumber + ")-";
		while(tracker < 6) {
			if(number.charAt(traverser) >= 48 && number.charAt(traverser) <= 57) {
				newNumber = newNumber + number.charAt(traverser);
				tracker++;
			}
			traverser++;
		}
		newNumber = newNumber + "-";
		while(tracker < 10) {
			if(number.charAt(traverser) >= 48 && number.charAt(traverser) <= 57) {
				newNumber = newNumber + number.charAt(traverser);
				tracker++;
			}
			traverser++;
		}
		System.out.println(newNumber);
	}

	@Override
	public void handleEmailFormatException(EmailAddressFormatException e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleNameFormatException(NameFormatException e) {
		// TODO Auto-generated method stub
		String name = e.getName();
		name = name.toLowerCase();
		char[] workingString = name.toCharArray();
		workingString[0] = (char)(name.charAt(0)-32);
		for(int stringPosition=1;stringPosition <= name.length()-1;stringPosition++) {
			if(name.charAt(stringPosition) == ' ') {
				workingString[stringPosition+1] = (char)(name.charAt(stringPosition+1) - 32);
				break;
			}
		}
		for(int stringPosition=0;stringPosition <= name.length()-1;stringPosition++)
			System.out.print(workingString[stringPosition]);
		System.out.println("");
	}

}
