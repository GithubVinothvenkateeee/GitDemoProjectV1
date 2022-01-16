package org.programs;

public class P14ExtractNumbersFromStringAndAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String given = "34vinothkumar908";
		int total=0;
		
		for(int i=0;i<given.length();i++) {
		char character=given.charAt(i);
		if(Character.isDigit(character)) {
			total = total+Character.getNumericValue(character);
			
		}
		}
		System.out.println(total);
	}

}
