package edu.wmich.cs1120.efadanelli.LA5;

public class NameFormatException extends Exception {
	
	String name = new String();
	
	public NameFormatException(){
		super("There is an error in the name formatt");
	}
	
	public NameFormatException(String name){
		super("There is an error in the name formatt here: " + name);
	}
}
