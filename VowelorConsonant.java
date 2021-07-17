package CorePrograms;

import java.util.Scanner;

public class VowelorConsonant {
	/*
	 * Java Program to Check Whether an Alphabet is Vowel or Consonant
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Alphabet:");
		//Accepting input at run time 
		char c= sc.nextLine().charAt(0);
		//checking its vowel or consonant
		if('a'==c || 'e'==c || 'i'==c || 'o'==c || 'u'==c) 
			System.out.println(c+" is vowel");
		else
	        System.out.println(c + " is consonant");
		sc.close();
		}
}
