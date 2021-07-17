package CorePrograms;

public class LargestAmoung3Num {
	/*
	 * Java Program to Find the Largest Among Three Numbers
	 */
	public static void main(String[] args) {
		int temp,largest;
		System.out.println("Enter 1st number");
		int n1 = Utility.getUserInteger();
		System.out.println("Enter 2st number");
		int n2 = Utility.getUserInteger();
		System.out.println("Enter 3rd number");
		int n3 = Utility.getUserInteger();
		//Ternary Operator to check greatest number
		temp = n1 > n2 ? n1:n2;
		largest = temp > n3 ? temp:n3;
		System.out.println("Largets number is: "+largest);
	}

}
