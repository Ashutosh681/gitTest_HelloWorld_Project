package HomeWorks;

import java.util.Scanner;

public class ArrayLargeSmall2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Size of the array you want: ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter each value: ");
			int a = scan.nextInt();
			arr[i] = a;
		}
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {

			}
		}
		scan.close();
	}

}
