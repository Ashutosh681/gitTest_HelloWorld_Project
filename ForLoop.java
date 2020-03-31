import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value of a: ");
		int a = scan.nextInt();
		System.out.println("Enter value of b: ");
		int b = scan.nextInt();
		scan.close();
		if (a > b) {
			for (int i = 1; i <= a; i++) {
				System.out.println("The value is: " + i);
			}
		} else {
			System.out.println("The value of a < b");

		}

	}

}
