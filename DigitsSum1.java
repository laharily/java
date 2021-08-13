import java.util.*;

/** This program reads an integer between 0 and 1000 and adds all the digits in the 
integer. */
public class DigitsSum1 {
	public static void main(String[] args) {
		System.out.print("Enter an integer between 0 and 1000: ");
		Scanner in = new Scanner(System.in);
		int integer = in.nextInt();
		if (integer > 1000 || integer < 0) {
			System.out.println("Invalid input. Has to be between 0 and 1000.");
		}
		else {
			int sum = integer%10 + (integer/10)%10 + (integer/100)%10 + (integer/1000)%10;
			System.out.println("The sum of the digits is " + sum);
		}
	}
} 
