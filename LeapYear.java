package CorePrograms;

public class LeapYear {
	/*
	 * java program to find Leap year
	 */
	public static void main(String[] args) {		
		System.out.println("Enter an Year: ");
		int year = Utility.getUserInteger();
		int count=0,digitCheck;
		digitCheck = year;
		//condition to check the given number digits
		while(digitCheck != 0)
		{
			digitCheck=digitCheck/10;
			count++;
		}
		//if the number contain 4 digits then only it's check for leap year
		if(count == 4) {
			//condition for leap year
			if (((year % 4 == 0) || (year % 400 == 0)) || (year%100 != 0))
				System.out.println("Specified year is a leap year");
			else
		        System.out.println("Specified year is not a leap year");
		}
		//if the number does not contain 4 digits then it executes this statement.
		else
			System.out.println("It is not an year[YYYY] "+year);
	}

}
