package JavaChallenges;

public class Task10 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?

		String[] stringArray = { "Java", "Python", "JavaScript", "Python", "C#", };

		for (int i = 0; i < stringArray.length; i++) {// traverses over the first element of the array
			for (int j = i + 1; j < stringArray.length; j++) {// traverses over the second element of the array.
				if (stringArray[i] == stringArray[j]) {
					System.out.println(stringArray[i]);
				}
			}
		}

	}

}
