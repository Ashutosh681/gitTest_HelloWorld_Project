package HomePractise;

import java.util.Scanner;

public class jan29 {

	public static void main(String[] args) {
		double speed, distance, time, layover, laytimes, dt, sum = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the distance you Travelled(in miles): ");
		distance = scan.nextDouble();
		System.out.println("Enter the time you took to complete the distance(in hours): ");
		time = scan.nextDouble();

		System.out.println("How many layovers did you have?: ");
		layover = scan.nextDouble();
		double[] arr = new double[(int) layover];

		for (int i = 1; i <= layover; i++) {
			System.out.println("Enter layover: " + i);
			laytimes = scan.nextDouble();
			arr[i] = laytimes;
			sum = arr[i] + sum;

		}
		scan.close();
		System.out.println("Your Total layover was: " + sum + " hours");
		dt = time - sum;

		speed = (distance) / (time - sum);

		System.out.println("Your speed was: " + speed + " mph");
		System.out.println("Your Drive Time was: " + dt);

		if (speed >= 75) {
			System.out.println("you were Over Speeding. ");
		} else {
			System.out.println("You drove well. ");
		}

	}

}
