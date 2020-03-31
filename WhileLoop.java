import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number you want to Factorial: ");
		int i = scan.nextInt();
		long fact = 1;
		int j = 1;
		scan.close();

		while (j <= i) {
			fact = j * fact;
			j++;
		}
		System.out.println("The factorial of " + i + " is " + fact);

	}

}
