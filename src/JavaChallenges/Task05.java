package JavaChallenges;

public class Task05 {

	public static void main(String[] args) {
		// Create a 2D array of integers. Develop a program which will calculate the sum
		// of
		// even and odd numbers for that array.

		int[][] numbers = {

				{ 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int sumEven = 0;
		int sumOdd = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j] % 2 == 0) {
					sumEven += numbers[i][j];
				} else {
					sumOdd += numbers[i][j];
				}
			}

		}
		System.out.println("Sum of Even numbers are = " + sumEven);
		System.out.println("Sum of Odd numbers are = " + sumOdd);

	}

}
