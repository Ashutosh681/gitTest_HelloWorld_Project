
public class ContinueExample {

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			if (i % 2 == 1) {
				System.out.println(i + " is odd number.");
				continue;
			}
			System.out.println(i + " is even number.");
		}
	}

}
