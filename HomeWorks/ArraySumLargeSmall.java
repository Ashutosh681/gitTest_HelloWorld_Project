package HomeWorks;

import java.util.Scanner;

public class ArraySumLargeSmall {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Size of your Array");
		int size = scan.nextInt();
		int sum = 0;
		double average = 0;
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter Each Value: ");
			int a = scan.nextInt();
			arr[i] = a;
			sum = arr[i] + sum;
			average = sum / size;
		}
		scan.close();
		System.out.println("The Sum is: " + sum);

		System.out.println("The Average is: " + average);
	}

}
