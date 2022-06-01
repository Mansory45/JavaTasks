package JavaChallenges;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		/*
		 * Using Scanner create an array of countries. When an array is created,
		 * retrieve all values from it and while retrieving those values print capital
		 * for each country. (use 2 different loops).
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter how many counties you want to store inside array:");
		int size = scan.nextInt();
		String[] countries = new String[size];

		for (int i = 0; i < countries.length; i++) {
			System.out.println("Please enter your country");
			countries[i] = scan.next();
		}

		String capital = null;
		for (String country : countries) {
			if (country.equalsIgnoreCase("Afghanistan")) {
				capital = "Kabul";
			}

			if (country.equalsIgnoreCase("Pakistan")) {
				capital = "Islam Abad";
			}
			if (country.equalsIgnoreCase("Uzbekistan")) {
				capital = "Tashkent";
			}
			if (country.equalsIgnoreCase("France")) {
				capital = "Paris";
			}
			System.out.println(country + " capital is " + capital);
		}

	}

}
