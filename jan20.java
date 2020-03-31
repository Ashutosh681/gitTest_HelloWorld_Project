import java.util.Scanner;

public class jan20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int count = scan.nextInt();

		scan.close();
		do {
			System.out.println("the value: " + count);
			count++;
		} while (count < 10);
		System.out.println("this is outside loop");
	}
}
