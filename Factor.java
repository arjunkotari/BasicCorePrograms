package CorePrograms;

public class Factor {
	/*
	 * Computes the prime factorization of N using brute force.
	 */
	public static void main(String[] args) {
		// providing run time input
		System.out.println("Enter number...");
		int num = Utility.getUserInteger();
		//if the number is even then it print 2 and divide the array until number become odd
		while (num % 2 == 0) {
			System.out.print(2 + " ");
			//it can divide the number in every iteration 
			num /= 2;
		}
		//now the number become odd then only loop will be executed 
		for(int i=3; i<=num; i+=2){
			while(num % i == 0) {
				System.out.print(i+" ");
				//it can divide the number with i 
				num /= i;
			}
		}
	}
}
