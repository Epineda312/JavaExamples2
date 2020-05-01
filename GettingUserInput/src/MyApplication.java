import java.util.Scanner;

public class MyApplication {
	public static void main(String[] args) {

		// Scanner value = new Scanner(System.in);

		/*
		 * System.out.println("Enter a text line"); String text = input.nextLine();
		 * System.out.println("Your line is: " + text);
		 * 
		 * System.out.println("Enter an integer"); int aValue = input.nextInt();
		 * System.out.println("Your integer is: " + aValue);
		 * 
		 * System.out.println("Enter a decimal number: "); double number =
		 * input.nextDouble(); System.out.println("Your Decimal is: " + number);
		 */

		// The following code is part of a previous section.

		Scanner input = new Scanner(System.in);
		int number = 0;
		do {
			System.out.println("Enter a number: ");
			number = input.nextInt();
		} while (number != 9);
		System.out.println("You got 9");
	}
}
