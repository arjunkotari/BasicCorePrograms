package CorePrograms;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number::");
		//Accepting input at run time 
		int n= sc.nextInt();
		double result = 0;
		//repeat till 'n' times 
		for(int i=1; i<=n; i++)
		{
			//computing  1/1 + 1/2 + 1/3 + ... + 1/N
			result +=(double)1/i;			
		}
		//displaying result of number
		System.out.println("Hormonic number of "+n+" is: "+result);
		sc.close();
	}

}
