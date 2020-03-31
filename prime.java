
import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = in.nextInt();

		String b = "true";
		in.close();
		if (a == 0 || a == 1) {
			System.out.println(a + " is not a prime number.");
		} else {
			for (int i = 2; i <= a / 2; i++) {

				if (a % i == 0) {
					System.out.println(a + " is  a Composite number.");
					b = "false";
					break;
				}

			}
			if (b == "true") {
				System.out.println(a + " is a Prime number.");
			}

		}
	}
}
