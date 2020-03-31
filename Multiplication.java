import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = in.nextInt();
		System.out.println("Enter length of Multiplication: ");
		int c = in.nextInt();
		System.out.println("This is The Multiplication Table for " + a);
		in.close();
		for (int i = 1; i <= c; i++) {
			int b = a * i;
			System.out.println(a + " * " + i + " = " + b);
		}

	}

}
