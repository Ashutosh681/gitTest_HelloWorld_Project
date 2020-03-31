import java.util.Scanner;

public class sample {

	public static void main(String[] args) {
		int value1, value2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value1: ");
		value1 = scan.nextInt();
		System.out.println("Enter value2: ");
		value2 = scan.nextInt();
		scan.close();
		System.out.println("Value of First input is: " + value1);
		System.out.println("Value of Second input is: " + value2);
		int sum = value1 + value2;
		System.out.println("The Sum of the input is: " + sum);
	}
}
