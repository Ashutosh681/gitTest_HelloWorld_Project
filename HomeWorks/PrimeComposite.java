package HomeWorks;

import java.util.Scanner;

public class PrimeComposite {

	public static void main(String[] args) {
		System.out.println("THIS PROGRAM CHECKS PRIME OR COMPOSITE NUMBER");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number to Check: ");
		int a = scan.nextInt();
		String b = "true";

		scan.close();
		if (a == 0 || a == 1) {
			System.out.println(a + " is neither Prime nor Composite ");
		} else {
			for (int i = 2; i <= a / 2; i++) {
				if (a % i == 0) {
					System.out.println(a + " is a Composite Number.");

					b = "false";

					break;
				}

			}
			if (b == "true") {
				System.out.println(a + " is a Prime Number. ");

			}

		}
	}
}
