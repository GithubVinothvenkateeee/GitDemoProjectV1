package org.programs;

public class LengthOfAString {

	public void withoutUsingLengthfunction() {
		String input="vinothkumar";
		
		char tofind='a';
		input=input.toUpperCase();
	String charactertofind=	Character.toString(tofind).toUpperCase();
		
	int actuallength=input.length();
		System.out.println(actuallength);
		
		input=input.replace(charactertofind, "");
		
		int lengthafterReplacement=input.length();
		System.out.println(lengthafterReplacement);
		
		System.out.println(actuallength-lengthafterReplacement);
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String given="vinothkumar";
System.out.println(given.length());

char[] chararray=given.toCharArray();
int length=0;
for (char c : chararray) {
	length++;
	
}

System.out.println(length);


	}

}


