package com.project1;

import java.util.Scanner;

public class ArithmeticCalculator2 {

		private float n1;
		private float n2;
		void n1(Scanner sc) {
			System.out.println("Enter the value of n1 ");
			n1=sc.nextFloat();
			this.n1=n1;
		}
		void n2(Scanner sc) {
			System.out.println("Enter the value of  n2");
			n2=sc.nextFloat();
			this.n2=n2;
		}

		public  float addition() {
			float addition = (n1+n2);
			return addition;
		}

		 float substraction()  {
			float substraction = (n1-n2);
			return substraction;
		}

		void  multiplication() {
			float multiplication = n1*n2;
			System.out.println("multiplication of n1 and n2 is : "+multiplication);
		}
		void  division() {
			float division = n1/n2;
			System.out.println("Division of n1 and n2 is : "+division);
		}


	public static void main(String []args) {

		Scanner sc=new Scanner(System.in);
		ArithmeticCalculator2 obj = new ArithmeticCalculator2();
		obj.n1(sc);
		obj.n2(sc);
		int choice;
		do {
		System.out.println("Enter 1 for addition, enter 2 for substraction,enter 3 for multiplication and enter 4 for divion");
		int enter = sc.nextInt();
		switch(enter) {
		case 1 :System.out.println("Addition of n1 and n2 is :" +obj.addition());
				break;
		case 2 :System.out.println("Substraction of n1 and n2 is :" +obj.substraction());
				break;
		case 3 : obj.multiplication();
				break;
		case 4: obj.division();
				break;
		}
		System.out.println("Enter 0 to carry operation further");
		 choice=sc.nextInt();
		}
		while(choice==0);

	}
}
