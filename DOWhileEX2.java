import java.util.Scanner;

public class DOWhileEX2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int i = 1;

		do {
			if (i > 4) {
				System.out.println("Maximum Attempts Entered! No more Attempts!");
				break;
			}
			System.out.println("Guess a number so you can end this program: ");
			a = scan.nextInt();
			i++;
		} while (a != 0);
		if (a == 0) {
			System.out.println("Correct!!");
		}
		scan.close();
	}

}
