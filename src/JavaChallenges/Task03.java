package JavaChallenges;

public class Task03 {

	public static void main(String[] args) {
		// Create a 2D array of integer values. Print the sum of all numbers.

		int[][] numbers = {

				{ 2, 3, 5 }, 
				{ 5, 6, 8 }, 
				{ 8, 9, 7 } 
				};
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				sum += numbers[i][j];
			}
		}
		System.out.println(sum);

	}

}
