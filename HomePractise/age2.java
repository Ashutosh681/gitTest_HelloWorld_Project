package HomePractise;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class age2 {

	public static void main(String[] args) {
		int ayear, amonth, aday;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = scan.nextLine();
		System.out.println("Enter your Birth Year: ");
		ayear = scan.nextInt();
		System.out.println("Enter your Birth Month: ");
		amonth = scan.nextInt();
		System.out.println("Enter your Birth Day: ");
		aday = scan.nextInt();

		LocalDate adate = LocalDate.of(ayear, amonth, aday);// date of birth

		LocalDate bdate = LocalDate.now();// current date

		Period diff = Period.between(adate, bdate);// difference between current date and date of birth

		System.out.println(name + " You are " + diff.getYears() + " years, " + diff.getMonths() + " months and "
				+ diff.getDays() + " days old.");
		Period diff2 = Period.between(adate, bdate);

		int cmonth = 11 - diff2.getMonths();
		int cdays = 30 - diff2.getDays();

		System.out.println(name + " Your birthday is in " + cmonth + " months and " + cdays + " days.");
		scan.close();
	}

}
