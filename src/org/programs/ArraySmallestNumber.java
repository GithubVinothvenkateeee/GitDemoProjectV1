package org.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySmallestNumber {
	
	
	public void usingsort() {
		int[] givenarray= {5,8,9,6,7};
		Arrays.sort(givenarray);
			System.out.println(givenarray[0]);

	}

	
		// TODO Auto-generated method stub
public void findsmallest() {
		int[] givenarray= {8,5,1,2,4};
		int smallest=Integer.MAX_VALUE;
		for(int i=0;i<givenarray.length;i++) {
			if(givenarray[i]<smallest) {
				smallest=givenarray[i];
			
			}
		
		}
		System.out.println(smallest);
}
	
public void usingCollection() {
	
	Integer[] givenarray= {50,20,30,60,80};
	List<Integer> list= Arrays.asList(givenarray);
	
	Collections.sort(list);
	System.out.println(list);
	int smallest=list.get(0);
	
	
	System.out.println(smallest);
	
	
	
}
	
public static void main(String[] args) {

	ArraySmallestNumber a=new ArraySmallestNumber();
	a.usingsort();
	a.findsmallest();
	a.usingCollection();
}
}
