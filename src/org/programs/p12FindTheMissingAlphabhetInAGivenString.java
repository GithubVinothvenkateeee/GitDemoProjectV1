package org.programs;

import java.util.Arrays;
import java.util.HashSet;

public class p12FindTheMissingAlphabhetInAGivenString {

	
	
	//////PANGRAM
	
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		String given="hgja";
		given=given.toLowerCase();
		given=given.replaceAll(" ", "");
		String[] userArray=given.split("");
		
		String[] alphabhet="abcdefghijklmnopqrstuvwxyz".split("");
		
		HashSet<String> set1=new HashSet<String>(Arrays.asList(userArray));		
		
		HashSet<String> set2=new HashSet<String>(Arrays.asList(alphabhet));
		
		set2.removeAll(set1);
		System.out.println(set2);
	}

}
