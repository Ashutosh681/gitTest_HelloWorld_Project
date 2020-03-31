import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // do we have to take new scanner variable if we are taking another input?
		System.out.println("Enter a number greater than 0: ");
		int a = in.nextInt();
		in.close();
		if (a % 2 == 0) {
			System.out.println(a + " is an Even number");
		} else {
			System.out.println(a + " is an Odd number");
		}
	}
}
