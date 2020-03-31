
public class pyramid {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int k = 10; k <= 20; k++) {
			for (int l = 10; l <= k; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int m = 20; m <= 30; m++) {
			System.out.println("*");
		}
	}

}
