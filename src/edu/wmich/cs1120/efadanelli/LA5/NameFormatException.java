package edu.wmich.cs1120.efadanelli.LA5;

public class NameFormatException extends Exception {
	
	private String name = new String();
	
	/**
	 * Prints out the message there is an error in the name format
	 */
	public NameFormatException(){
		super("There is an error in the name formatt");
	}
	
	/**
	 * Prints out the message saying there is an error in the name format and prints out the incorrect format if not handled
	 * @param name the incorrect name format
	 */
	public NameFormatException(String name){
		super("There is an error in the name formatt here: " + name);
		this.name = name;
	}
	
	/**
	 * Returns the incorrectly formatted name
	 * @return the incorrectly formatted name
	 */
	public String getName() {
		return this.name;
	}
}