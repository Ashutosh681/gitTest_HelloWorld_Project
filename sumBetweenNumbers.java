import java.util.Scanner;

public class sumBetweenNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int a = scan.nextInt();
		System.out.println("Enter Second Number: ");
		int b = scan.nextInt();
		scan.close();
		int sum = 0;
		int c = a;
		if (a < b) {
			while (a < b) {
				sum = sum + a;
				System.out.println(a);
				a++;

			}
			System.out.println("The Sum of Number Between " + c + " and " + b + " is " + sum);
		} else {
			System.out.println("Enter Final value Greater than Initial value ");
		}

	}

}
