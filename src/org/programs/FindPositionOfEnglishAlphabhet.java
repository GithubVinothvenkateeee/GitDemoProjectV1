package org.programs;


public class FindPositionOfEnglishAlphabhet {

	public static void main(String[] args) {
		
		char givenchar='d';
		givenchar=Character.toLowerCase(givenchar);
//		
//		//ascii value; a=97;A=65;
//		
//		int asciivalue=(int)givenchar;
//		System.out.println(asciivalue);
//		int position=asciivalue-96;
//System.out.println(position);
		


givenchar=Character.toUpperCase(givenchar);
//A=65;
int asciivalue=(int)givenchar;
System.out.println(asciivalue);
int position=asciivalue-64;
System.out.println(position);




	}

}
