package HomePractise;

import java.util.Scanner;

public class Arraysumofuserinput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int length = 0;
		int sum = 0;
		System.out.println("Please Enter size of Array: ");
		length = scan.nextInt();
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.println("Enter Each value: ");
			arr[i] = scan.nextInt();
			sum = sum + arr[i];

		}
		System.out.println("-------------------------");
		for (int value : arr) {
			System.out.println(value);
		}
		System.out.println("Sum of Elements in Array= " + sum);
		System.out.println(arr.length);
		scan.close();
	}

}
