package edu.wmich.cs1120.efadanelli.LA5;

public class EmailAddressFormatException extends Exception {
	
	private String email = new String();
		
	public EmailAddressFormatException(){
		super("There is an error in the name formatt");
	}
		
	public EmailAddressFormatException(String email){
		super("There is an error in the name formatt here: " + email);			
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
}