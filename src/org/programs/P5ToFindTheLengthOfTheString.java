package org.programs;

public class P5ToFindTheLengthOfTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String given="vinothkumar";
System.out.println(given.length());

int sum=0;
char[] character=given.toCharArray();
for (char c : character) {
	sum=sum+1;
}
System.out.println(sum);
	}

}
