package edu.wmich.cs1120.efadanelli.LA5;

public class NameFormatException extends Exception {
	
	public NameFormatException(){
		super("There is an error in the name formatt");
	}
	
	public NameFormatException(char let){
		super("There is an error in the name formatt at letter " + let);
	}
}
