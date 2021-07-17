package CorePrograms;

import java.util.Scanner;

public class SwapTwoNumbers {
	/*
	 * Java Program to Swap Two Numbers
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		//Accepting input at run time 
		int num1= sc.nextInt();
		System.out.println("Enter 2nd number:");
		int num2 = sc.nextInt();
		//Before swapping
		System.out.println("Before swapping");
		System.out.println("1st number = "+num1);
		System.out.println("2nd number = "+num2);
		//Swapping of two numbers with out using 3rd variable
		num1 = num1 +num2;
		num2 = num1 -num2;
		num1 = num1 - num2;
		//After swapping
		System.out.println("After swapping");
		System.out.println("1st number = "+num1);
		System.out.println("2nd number = "+num2);
	}

}
