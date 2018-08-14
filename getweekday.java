package jtpractice;

import java.util.Scanner;

public class getweekday {
	// this will be to determine the weekday with digits
	public static void main(String[] args) {
		// ask user for input
		System.out.println("Determine the day of the week based on number, enter a number between 1-7");

		// read input -- use scanner
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		// use user input to match numbers to days -- if else statements
		if (number == 1) {
			System.out.println("Monday");
		}

			else if (number == 2) {
				System.out.println("Tuesday");
			}

			else if (number == 3) {
				System.out.println("Wednesday");
			}

			else if (number == 4) {
				System.out.println("Thursday");
			}

			else if (number == 5) {
				System.out.println("Friday");
			}

			else if (number == 6) {
				System.out.println("Saturday");
			}

			else if (number == 7) {
				System.out.println("Sunday");
			}

			else if (number > 8) {
				System.out.println("invalid entry if number > 8");
			} else {
				System.out.println("invalid entry if char");
			}

			// print the answer
			scanner.close();
		
	
}
}
