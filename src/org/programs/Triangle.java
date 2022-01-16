package org.programs;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int row=0;
		int column=0;
		int numberoflines=0;
		Scanner scanner=new Scanner(System.in);
		numberoflines=scanner.nextInt();
		scanner.close();
		System.out.println("Enter the number of lines:");
		
		for(row=0;row<numberoflines;row++) {
			for(column=0;column<=row;column++) {
			System.out.print("*   ");
		}
		System.out.println();
	}
		
		/*int startingnumber=1;
		 int row=0;
		 int column=0;
		 int limit=0;
		 scanner scanner=new scanner(system.in);
		 limit=scanner.nextint();
		 system.out.println("Enter the number:");
		 
		 for(row=0;row<=limit;row++){
		 for(column=0;column<=row;column++){
		 system.out.print(startingnumber+" ");
		 startingnumber=startingnumber+1;
		 }
		 system.out.println();
		
		
		
		
		
		
*/
}
}