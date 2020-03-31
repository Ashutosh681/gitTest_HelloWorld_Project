import java.util.Scanner;

public class DoWhilecustom {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = scan.nextInt();

		scan.close();
		do {

			System.out.println(a);
			a--;

		} while (a >= 1);

	}

}
