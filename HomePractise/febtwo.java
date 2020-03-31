package HomePractise;

public class febtwo {
	String name1 = "Ashutosh";
	int age1 = 25;
	String name2 = "Rabin";
	int age2 = 27;

	public void status() {
		System.out.println("This is status method.");
		System.out.println(name1);
		System.out.println(age1);
	}

	public void status2() {
		System.out.println("This is status2 method.");
		System.out.println(name2);
		System.out.println(age2);
	}

	double agediff() {
		System.out.println("Age difference is: ");
		int diff = age2 - age1;

		// System.out.println(age2 - age1);
		return diff;
	}

	/*
	 * public static void main(String[] args) { febtwo feb = new febtwo();
	 * feb.status(); feb.agediff(); }
	 */

}
