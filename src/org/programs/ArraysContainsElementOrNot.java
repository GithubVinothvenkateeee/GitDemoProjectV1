package org.programs;

import java.util.stream.IntStream;

public class ArraysContainsElementOrNot {

	
	public void presentornot() {
		int[] array= {1,2,3,4,5,3,3};
		int numbertofind=64;
		
		boolean found=false;
		for (int i : array) {
			if (i==numbertofind) {
	found=true;
				
				break;
			}
			}
		if (found) {
			System.out.println("number present");
		}
		else {
			System.out.println("number  not present");
		}
	}
	
	public void usingIntStream() {
		int[] array= {1,2,3,4,5,6,3};
		int numbertofind=4;
		boolean found=IntStream.of(array).anyMatch(element->element==numbertofind);
		if(found)
			System.out.println("present");
		else
			System.out.println("not present");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraysContainsElementOrNot a= new ArraysContainsElementOrNot();
		a.presentornot();
		a.usingIntStream();
	}

}
