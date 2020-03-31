package HomePractise;

import java.util.Scanner;

public class gas2 {

	public static void main(String[] args) {
		double pg = 1.95, money, tg, mileage, miles, tank, change, max;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Amount you want to buy Gas: $$");
		money = scan.nextDouble();
		System.out.println("Enter the Average mileage of your car: ");
		mileage = scan.nextDouble();
		System.out.println("Enter the Fuel tank capacity of your car(Gallons): ");
		tank = scan.nextDouble();
		tg = money / pg;
		miles = mileage * tg;
		change = (tg - tank) * pg;
		max = tank * mileage;

		System.out.println("-------------------------");
		System.out.println(" The Average mileage of your car is " + mileage);
		System.out.println("-------------------------");

		if (tg <= tank) {
			System.out.println("You'll get " + tg + " gallons of gas for $" + money);
			System.out.println("-------------------------");
			System.out.println(tg + " Gallons will take you upto " + miles + " miles. ");
			System.out.println("-------------------------");
			System.out.println("You're good to go after fillup. Have a nice day!! ");
			System.out.println("-------------------------");

		} else {

			System.out.println("You'll get " + tg + " gallons of gas for $" + money);
			System.out.println("-------------------------");
			System.out.println("After this Fillup you can drive " + max + " miles.");
			System.out.println("-------------------------");
			System.out.println("Dont forget to take your change after fillup");
			System.out.println("-------------------------");
			System.out.println("Your change is: $$" + change);
			System.out.println("-------------------------");

		}
		scan.close();
	}

}
