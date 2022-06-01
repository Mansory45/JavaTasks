package JavaChallenges;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// Using Scanner create an array of integer values.
				// After the array is created, calculate the sum of all stored elements in that array. 
				

				Scanner scan = new Scanner(System.in);
				int sum = 0;
				System.out.println("How many numbers you want to enter?");
				int size = scan.nextInt();
				int[] numbers = new int[size];

				for (int i = 0; i < size; i++) {
					System.out.println("Enter the number");
					numbers[i] = scan.nextInt();
					sum += numbers[i];
				}

				System.out.println("The sum of all " + size + " number are = " + sum);


	}

}
