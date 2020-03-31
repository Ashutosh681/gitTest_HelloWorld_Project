package HomePractise;

import java.util.Scanner;

public class CarNote {

	public static void main(String[] args) {
		int cs, income;
		double lf, apr = 0, msrp, amount, mp, dp;// mp is monthly payment, dp is downpayment
		double fc = 1500, ta;// finance charge,total amount paid for the car,mp is monthly payment
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello, What is your name?");
		String name = scan.nextLine();
		System.out.println("What is your credit score?");
		cs = scan.nextInt();
		System.out.println("How much do you earn every month?: ");
		income = scan.nextInt();
		System.out.println("How much Down Payment you are doing today? ");
		dp = scan.nextDouble();
		System.out.println("Enter your length of Financing?: ");
		lf = scan.nextDouble();
		System.out.println("Enter the Total MSRP of your vehicle: $$");
		msrp = scan.nextDouble();
		amount = (apr * lf * msrp) / 100;
		ta = amount + msrp + fc;
		mp = (ta - dp) / (12 * lf);
		scan.close();

		if (cs >= 720 && income > 7500 || income == 5000) {

			System.out.println("Congrats!! " + name + " You are qualified for " + apr + "% APR financing.");
			System.out.println("Total MSRP of your car is: $$" + msrp);
			System.out.println("You are paying a total interest of $" + amount + " at the end of: " + lf
					+ " years. Only finance charge of $" + fc + " was charged for qualifying 0% APR.");
			System.out.println();
			System.out.println("You are paying Total amount of $" + ta + "for your car in " + lf
					+ " years. And your monthly Payment is: " + mp + " with the Downpayment of $" + dp);
		} else if (cs < 720 && cs >= 680 && income < 7500 && income >= 3500) {
			apr = 5;
			System.out.println("Congrats!! " + name + " You are qualified for " + apr + "% APR financing.");
			System.out.println("Total MSRP of your car is: $$" + msrp);
			System.out.println("You are paying a total interest of $" + amount + " at the end of: " + lf + " years.");
			System.out.println();
			System.out.println("You are paying Total amount of $" + ta + "for your car in " + lf
					+ " years. And your monthly Payment is: " + mp + " with the Downpayment of $" + dp);

		} else if (cs < 680 || cs == 625 && income < 3500 || income == 2500) {
			apr = 10;
			System.out.println("Congrats!! " + name + " You are qualified for " + apr + "% APR financing.");
			System.out.println("Total MSRP of your car is: $$" + msrp);
			System.out.println("You are paying a total interest of $" + amount + " at the end of: " + lf + " years.");
			System.out.println();
			System.out.println("You are paying Total amount of $" + ta + "for your car in " + lf
					+ " years. And your monthly Payment is: " + mp + " with the Downpayment of $" + dp);
		} else if (cs < 625 || cs == 550 && income < 2500 || income == 2000) {
			apr = 15;
			System.out.println("Congrats!! " + name + " You are qualified for " + apr + "% APR financing.");
			System.out.println("Total MSRP of your car is: $$" + msrp);
			System.out.println("You are paying a total interest of $" + amount + " at the end of: " + lf + " years.");
			System.out.println();
			System.out.println("You are paying $" + ta + "for your car in " + lf
					+ " years. And your monthly Payment is: " + mp + " with the Downpayment of $" + dp);
		} else if (cs <= 550 || cs == 500 && income < 2000 || income == 1500) {
			apr = 20;
			System.out.println("Congrats!! " + name + " You are qualified for " + apr + "% APR financing.");
			System.out.println("Total MSRP of your car is: $$" + msrp);
			System.out.println("You are paying a total interest of $" + amount + " at the end of: " + lf + " years.");
			System.out.println();
			System.out.println("You are paying Total amount of $" + ta + "for your car in " + lf
					+ " years. And your monthly Payment is: " + mp + " with the Downpayment of $" + dp);
		} else if (cs < 500 && income < 1500) {
			System.out.println("Sorry!! " + name + " You are not qualified for any of our financing services. ");
			System.out.println("Have a great day!!");
		}
	}

}
