package HomePractise;

import java.util.Scanner;

public class LbsKG {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your input? ");
		System.out.println("Enter 1 for Lbs or 2 for KG: ");
		int lbs = scan.nextInt();
		if (lbs == 1) {
			System.out.println("Enter Lbs: ");
			double lb = scan.nextDouble();
			double kg = (lb * 0.454);
			System.out.println(lb + " Pounds is " + kg + " KGs.");
		} else if (lbs == 2) {
			System.out.println("Enter KG: ");
			double kg = scan.nextDouble();
			double lb = (kg * 2.205);
			System.out.println(kg + " KG is " + lb + " Pounds.");
		} else {
			System.out.println("Invalid Selection!");

		}
		scan.close();
	}

}
