package org.sam;

public class OddEvenNumbers {
	public static void main(String[] args) {
		int value = 20;
		System.out.println("The ODD Number in 1 to 20 :");
		for (int i = 1; i <= value; i++) {
			if (i % 2 != 0) {
				System.out.println(i);

			}

		}
		System.out.println("The Even Number in 1 to 20 :");
		for (int j = 1; j <= value; j++) {
			if (j % 2 == 0) {
				System.out.println(j);

			}

		}
	}

}
