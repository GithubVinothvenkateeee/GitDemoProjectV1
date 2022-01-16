package org.programs;

public class P11RemoveLeadingTrailingSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String given="   vinoth kumar  ";
		//using trim function
		System.out.println(given);
		System.out.println(given.trim());
		//using strip function
		//strip Trailing();
		//strip Leading();
		
		System.out.println(given.replaceAll("^[ \t]+|[ \t]$", ""));
		
		System.out.println(given.replaceAll("^[ \t]", ""));
		
		System.out.println(given.replaceAll("[ \t]+$", ""));
		
	}

}
