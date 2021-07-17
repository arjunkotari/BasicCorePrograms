package CorePrograms;

public class FlipCoin {
	/*
	 * program to find The number of times to Coin Flip.
	 */
	public static void main(String[] args) {
		//accepting input at execution time
		System.out.println("Enter how many times you need to flip");
		int flipCount = Utility.getUserInteger();
		int headCount = 0;
		int tailCount = 0;
		//counting how many times coin flip
		for (int i = 0; i < flipCount; i++)
		{
			double random = Math.random();
			if (random > 0.5) {
				//if the coin is head then count value increment with 1
				headCount++;
			}
			else {
				//if the coin is tail then count value increment with 1
				tailCount++;
			}
		}
		//displaying percentage of Head and Tails and its count
		System.out.println("Headcount is :" + headCount + "% =" + calculatePercentage(flipCount, headCount));
		System.out.println("Tailcount is :" + tailCount + "% =" + calculatePercentage(flipCount, tailCount));
	}
	/*
	 * Method to find coin percentage of Head and Tails
	 */
	private static double calculatePercentage(int flipCount, int count) {
	return (double)count / flipCount * 100;
	}
}