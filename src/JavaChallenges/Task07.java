package JavaChallenges;

public class Task07 {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?

		int num = 29;
		boolean isPrime1 = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime1 = false;
				break;
			}
		}
		if (isPrime1) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println("Not a prime number");
		}

	}

}
