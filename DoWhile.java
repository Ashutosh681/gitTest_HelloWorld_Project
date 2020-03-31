import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int a = scan.nextInt();
		System.out.println("Enter Second Number: ");
		int b = scan.nextInt();
		scan.close();
		int sum = 0;
		int c = a;

		do {
			sum = sum + a;
			System.out.println(a);
			a++;

		} while (a > b);

		System.out.println("The sum of number between " + c + " and " + b + " is " + sum);
		System.out.println("End of Program...");
	}

}
