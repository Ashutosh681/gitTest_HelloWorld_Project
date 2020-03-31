package HomeWorks;

import java.util.Scanner;

public class Calculator1st {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first Number: ");
		int a = scan.nextInt();
		System.out.println("Enter Second Number: ");
		int b = scan.nextInt();

		scan.close();
		int sum = a + b;
		int diff = a - b;
		int mult = a * b;
		float div = a / b;
		System.out.println("The Sum of Numbers " + a + " and " + b + " is: " + sum);
		System.out.println("The Difference of Numbers " + a + " and " + b + " is: " + diff);
		System.out.println("The Product of Numbers " + a + " and " + b + " is: " + mult);
		System.out.println("The Division of Numbers " + a + " and " + b + " is: " + div);
	}

}
