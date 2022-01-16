package org.programs;

public class SwapTwoNumbers {


		public void usingThirdVariable() {
			
		
		int mysalary=2000;
		int bosssalary=4000;
		int temp=mysalary;
		mysalary=bosssalary;
		bosssalary=temp;
		System.out.println(mysalary+"  "+bosssalary);
		}

		public void usingAddSub() {
			int firstnumber=40;
			int secondnumber=80;
			firstnumber=firstnumber-secondnumber;
			secondnumber=firstnumber+secondnumber;
			firstnumber=secondnumber-firstnumber;
			
			System.out.println(firstnumber+"  "+secondnumber);
		}
		
		public void usingMulDiv() {    //condition:provided two numbers are non zero otherwise it will throw arithmetic expression
			int firstnumber=5;
			int secondnumber=10;
			firstnumber=firstnumber*secondnumber;
			secondnumber=firstnumber/secondnumber;
			firstnumber=firstnumber/secondnumber;
			System.out.println(firstnumber+"  "+secondnumber);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			SwapTwoNumbers object=new SwapTwoNumbers();
			
		object.usingThirdVariable();
		object.usingAddSub();
		object.usingMulDiv();
		}	
}

