import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int b = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = in.nextInt();
		in.close();
		for (int i = 1; i <= 20; i++) {
			b = a * i;
			if (i % 2 == 1) {
				System.out.println(a + " * " + i + " = " + b);
			}

		}
		in.close();
	}

}
