package edu.wmich.cs1120.efadanelli.LA5;

public class PhoneNumberFormatException extends Exception {
	
<<<<<<< HEAD
	
	
	
	
	

=======
	private String number = new String();
	
	public PhoneNumberFormatException(){
		super("There is an error in the phone number formatt");
	}
	
	public PhoneNumberFormatException(String number){
		super("There is an error in the phone number formatt here: " + number);
		this.number = number;
	}
	
	public String getNumber() {
		return this.number;
	}
>>>>>>> branch 'master' of https://github.com/Evan-Fadanelli/LA5.git
}
