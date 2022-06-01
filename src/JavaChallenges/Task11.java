package JavaChallenges;

import java.util.Arrays;

public class Task11 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?

		int[] array = { 1, 20, 56, 40, 10 };
		Arrays.sort(array);
		System.out.println("The second largest number in the array = " + array[array.length - 2]);

	}

}
