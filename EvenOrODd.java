package CorePrograms;

import java.util.Scanner;

public class EvenOrODd {
	/*
	 * Java Program to Check Whether a Number is Even or Odd
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		//Accepting input at run time 
		int num= sc.nextInt();
		//if the number is divide with 2 then it's even number else odd number
		if(num %2 == 0) 
			System.out.println(num+" is Even number");
		else
			System.out.println(num+" is Odd number");
	}

}
