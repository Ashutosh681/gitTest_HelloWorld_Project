import java.util.Scanner;

public class FunExercise {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first Number: ");
		int a = scan.nextInt();
		int b = 0;
		int i = 1;
		do {
			if (i > 5) {
				System.out.println("Not a Match!! No more tries!");
				break;
			}

			System.out.println("Guess the Number you entered first time: ");

			b = scan.nextInt();
			i++;

		} while (b != a);
		if (b == a)

		{
			System.out.println("You're Winner!!");
		}
		scan.close();
	}

}
