package org.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class P1ToReverseAString {



	public void stringbuffer() {

		String given = "vinoth kumar";
		StringBuffer buffer = new StringBuffer();
		buffer.append(given);
		System.out.println(buffer.reverse());
	}
	public void charArray() {	
		String given = "vinoth kumar venkatesan";
		char[] characterArray = given.toCharArray();
		String reverse = "";

		for(int i=characterArray.length-1;i>=0;i--) {
			reverse = reverse+characterArray[i];
		}
		System.out.println(reverse);

	}
	public void usingCollection() {
		String given= "vinoth kumar Venkatesan Suseela";
		char[] array=given.toCharArray();
		List<Character> list=new ArrayList<Character>(0);

		for (Character character : list) {
			list.add(character);
		}

		Collections.reverse(list);//returns void so not sysout instead using iterator

		ListIterator iterator= list.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}


	public static void main(String[] args) {

		P1ToReverseAString string  = new P1ToReverseAString();
		string.usingCollection();




	}

}






