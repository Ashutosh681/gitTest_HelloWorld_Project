package HomePractise;

import java.util.Scanner;

public class methods {

	public int forint() {
		int a = 5;
		int b = 7;
		int sum = a + b;
		return sum;

	}

	public String[] allString() {
		String[] naam = { "black", "white", "big", "small" };
		for (int i = 0; i < naam.length; i++) {
			System.out.println(naam[i] + " ");

		}
		return naam;
	}

	void abc() {
		int sum = 0;
		double avg = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		int len = scan.nextInt();

		int arr[] = new int[len];
		for (int i = 0; i < len; i++) {
			System.out.println("Enter each value: ");
			arr[i] = scan.nextInt();
			sum = arr[i] + sum;

		}
		avg = sum / len;
		System.out.println("The sum of arrays is: " + sum);
		System.out.println("THe average is: " + avg);
		scan.close();
	}
}
