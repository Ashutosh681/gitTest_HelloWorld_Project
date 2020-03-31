package HomeWorks;

import java.util.Scanner;

public class AscendingNumbers {

	public static void main(String[] args) {
		System.out.println("THIS PROGRAM IS TO SORT NUMBERS IN ASCENDING ORDER");
		Scanner scan = new Scanner(System.in);
		System.out.println("How many Numbers do you wanna enter?: ");
		int length = scan.nextInt();
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {// length=5: 0,1,2,3,4,
			int x = i + 1;// just to look fancy
			System.out.println("Enter Number" + x + ":");// number 0, number 1,2,3,4
			int a = scan.nextInt();// storing the input in memory location a

			arr[i] = a;// putting entered values stored in 'a' to array of i that is
						// arr[0],arr[1],arr[2],arr[3],arr[4]

		}

		scan.close();
		System.out.println("Numbers you entered: ");
		for (int i = 0; i < length; i++) {// checking entered value
			System.out.println(arr[i]);// printing values inside array
		}
		for (int i = 0; i < length; i++) {// checking entered value to compare
			for (int j = i + 1; j < length; j++) {// arranging in ascending order
				if (arr[i] > arr[j]) {
					int b = arr[i];// creating memory location to store values that conditions doesnt satisfy
					arr[i] = arr[j];
					arr[j] = b;// placing larger values in another memory location
				}

			}
		}
		System.out.println("Ascending order :");
		for (int i = 0; i < length; i++) {
			System.out.println(arr[i]);
		}
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {// arranging in ascending order
				if (arr[i] < arr[j]) {
					int b = arr[i];// creating memory location
					arr[i] = arr[j];
					arr[j] = b;// placing larger values in created memory location
				}

			}
		}
		System.out.println("Descending order :");
		for (int i = 0; i < length; i++) {
			System.out.println(arr[i]);
		}

	}
}
