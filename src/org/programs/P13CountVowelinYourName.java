package org.programs;

public class P13CountVowelinYourName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String given="Mahendra Singh Dhoni";
		int vowelcount=0;
		given=given.toLowerCase();
		
		for(int i=0;i<given.length();i++) {
			if(given.charAt(i)=='a'||given.charAt(i)=='e'||given.charAt(i)=='i'||
					given.charAt(i)=='o'||given.charAt(i)=='u') {
				vowelcount++;
			}
		}
		System.out.println(vowelcount);
	}

}
