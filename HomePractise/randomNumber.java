package HomePractise;

import java.util.Random;
import java.util.Scanner;

public class randomNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 5;
		int random = 0;

		int a = 0;
		System.out.println("You have " + max + " tries to get win, if you get the Same Number you entered, you win.");
		for (int i = 1; i <= max; i++) {
			System.out.println("Enter a number greater than " + max + ": ");
			a = scan.nextInt();
			System.out.println("--------------------");
			System.out.println("You Entered: " + a);
			Random rand = new Random();
			random = rand.nextInt(a);
			int random1 = (random + 1);
			System.out.println("--------------------");
			System.out.println(("You got: " + random1));

			if (random1 == a) {
				System.out.println("--------------------");
				System.out.println("Congrats!!!! You've won.");
				System.out.println("--------------------");
				break;
			} else if (max >= a) {
				System.out.println("--------------------");
				System.out.println("Chance: " + i);
				System.out.println("--------------------");
			} else {
				System.out.println("You lose!!! Better luck next time.");
			}
		}

		// System.out.println("--------------------");
		// }
		scan.close();
	}

}
