import java.util.Scanner;

public class IfStatement2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any value: ");
		int a = scan.nextInt();
		if (a > 10 && a < 50) {
			System.out.println("The value of a is between 10 to 50.");
		} else if (a >= 50 && a <= 100) {
			System.out.println("the Value is between 50 to 100.");
		} else if (a < 10) {
			System.out.println("The value of a is less than 10");
		} else {
			System.out.println("The value of a is greater than 100.");
		}
		scan.close();
	}

}
