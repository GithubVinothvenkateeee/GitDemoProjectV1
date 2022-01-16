package org.programs;

public class P15ReplaceVowelsWithDollars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String givenText="I miss Mahendra Singh Dhoni";
		char[] charArray=givenText.toCharArray();
		for(int i=0;i<givenText.length();i++) {
			if(givenText.charAt(i)=='A'||givenText.charAt(i)=='E'||
					givenText.charAt(i)=='I'||givenText.charAt(i)=='O'||
					givenText.charAt(i)=='U'||givenText.charAt(i)=='a'||givenText.charAt(i)=='e'||givenText.charAt(i)=='i'||
					givenText.charAt(i)=='o'||givenText.charAt(i)=='u')
				charArray[i]='*';
		}
		for(int i=0;i<givenText.length();i++) {
			System.out.print(charArray[i]);
		}
		
		
		
//		//using regular expression
//		String replacedText=givenText.replaceAll("[AEIOUaeiou", "*");
//		System.out.println(replacedText);
		
		
		
//		//using regular expression
//		String replacedText=givenText.replaceAll("[AEIOUaeiou", "\\$");
//		System.out.println(replacedText);
	}

}
