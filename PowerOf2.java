package CorePrograms;

public class PowerOf2 {
	/*
	 * java program to find power of 2
	 */
	public static void main(String[] args) {
		System.out.println("Enter num b/w 1 to 30...");
		// read in one command-line argument
		int n = Integer.parseInt(args[0]);
		// count from 0 to N
		int i = 0; 
		int powerOfTwo = 1; 
		// repeat until i equals n
		while (i < n) {
		// print out the power of two
		System.out.println(i + " " + powerOfTwo); 
		// double to get the next one
		powerOfTwo = 2 * powerOfTwo; 
		i ++;
		}
	}
}
