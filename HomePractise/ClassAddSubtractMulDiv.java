package HomePractise;

public class ClassAddSubtractMulDiv {

	int a = 10, b = 20;

	void loop() {
		for (int i = a; i <= b; i++) {
			System.out.println(i);
		}
	}

	void add() {
		int add = a + b;
		System.out.println("Sum= " + add);
	}

	void subtract() {
		int sub = b - a;
		System.out.println("Difference= " + sub);
	}

	void mult() {
		int mult = a * b;
		System.out.println("Product= " + mult);
	}

	double div() {
		int div = b / a;
		// System.out.println("Product= " + div);
		return div;
	}

}