import java.util.Scanner;

public class SelfFactorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int a = scan.nextInt();
		System.out.println("Enter Second Number:");

		int b = scan.nextInt();

		long fact1 = 1;
		long fact2 = 1;
		int j = 1;
		int i = 1;
		scan.close();

		while (j <= a) {
			fact1 = fact1 * j;
			j++;

		}
		System.out.println(j);
		System.out.println("Factorial of " + a + " is " + fact1);
		while (i <= b) {
			fact2 = fact2 * i;
			i++;
		}
		System.out.println("Factorial of " + b + " is " + fact2);
		long diff = fact1 - fact2;

		System.out.println("Difference of factorial of " + a + " and " + b + " is " + diff);
		if (diff > 0) {
			System.out.println("The number you entered " + a + " is Greater than " + b + ".");

		} else {
			System.out.println("The number you entered " + b + " is Greater than " + a + ".");
		}
	}

}
