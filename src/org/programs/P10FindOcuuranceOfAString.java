package org.programs;

public class P10FindOcuuranceOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="vinoth";
		char tofind='i';
		 int occurance=0;
		 
		 
		input=input.toLowerCase();
		for(int i=0;i<=input.length();i++) {
			if(input.charAt(i)==tofind) {
				occurance=occurance+1;
			}
		}
		System.out.println(occurance);
		
	}

}
