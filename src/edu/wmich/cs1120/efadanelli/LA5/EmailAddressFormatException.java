package edu.wmich.cs1120.efadanelli.LA5;

public class EmailAddressFormatException extends Exception {
	
	public EmailAddressFormatException() {
		super("Error in email format");
		private String name = new String();
		
		public EmailAddressFormatException(){
			super("There is an error in the name formatt");
		}
		
		public EmailAddressFormatException(String name){
			super("There is an error in the name formatt here: " + name);
			
			this.name = name;
		}
		
		public String getName() {
			return this.name;
		}
	}
}
