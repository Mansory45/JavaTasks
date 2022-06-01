package JavaChallenges;

public class Task09 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?

		int[] numbers = { 2, 4, 5, 6, 50, 77, 90, 100 };
		int max = numbers[0];
		int min = numbers[0];

		for (int number : numbers) {
			if (max < number)
				max = number;
			if (min > number)
				min = number;

		}
		System.out.println("Maximum number is " + max);
		System.out.println("Minimum number is " + min);

	}

}
