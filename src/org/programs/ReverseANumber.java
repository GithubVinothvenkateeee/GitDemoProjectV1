package org.programs;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		
int givennumber=0;
int reversednumber=0;
System.out.println("Enter the number you want to reverse");
Scanner scanner=new Scanner(System.in);
givennumber=scanner.nextInt();
scanner.close();

while(givennumber!=0) {
reversednumber=reversednumber*10;
reversednumber=reversednumber+givennumber%10;
givennumber=givennumber/10;
}
System.out.println(reversednumber);

	}
}	
		
		
		
		
		
		
		
		
		
		
	
	
	
	
