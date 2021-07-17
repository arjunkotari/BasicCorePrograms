package CorePrograms;

import java.util.Scanner;

public class Quotient_and_Remainder {
	/*
	 * Java Program to Compute Quotient and Remainder
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Dividend:");
		//Accepting Dividend at run time 
		int dividend= sc.nextInt();
		System.out.println("Enter Divisor:");
		//Accepting Divisor at run time
		int divisor= sc.nextInt();
		//finding the Quotient
		int quotient = dividend / divisor;
		//finding the Remainder
	    int remainder = dividend % divisor;
		System.out.println("Quotient is: "+quotient);
		System.out.println("Remainder is " + remainder);
		sc.close();
	}

}
