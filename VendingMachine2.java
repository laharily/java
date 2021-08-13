import java.util.*;
import java.lang.*;

public class VendingMachine2 {
	/** simulates a vending machine */
	
	public static void main(String[] args) {
		
		int quarters, dimes, nickels;
		double money;
		String userSelection;
		int pChipQuantity = 2, cookieQuantity = 2, candyQuantity = 2;
		final double pCHIPAMT = 1.25, cOOKIEAMT = 0.85, cANDYAMT = 0.95;
		String menu = "1. Potato Chips: $1.25\n2. Cookies: $0.85\n3. candies: $0.95";
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.print("\nEnter the amount of quarters: ");
			if (in.hasNextInt()) {
				quarters = in.nextInt();
			} else {
				System.out.println("Invalid amount.");
				break;
			}
			System.out.print("Enter the amount of dimes: ");
			if (in.hasNextInt()) {
				dimes = in.nextInt();
			} else {
				System.out.println("Invalid amount.");
				break;
			}
			System.out.print("Enter the amount of nickels: ");
			if (in.hasNextInt()) {
				nickels = in.nextInt();
			} else {
				System.out.println("Invalid amount.");
				break;
			}
			if (quarters < 0 || dimes < 0 || nickels < 0) {
				System.out.println("Invalid amount.");
				break;
			}
			money = (quarters*25/100.0) + (dimes*10/100.0) + (nickels*5/100.0);
			System.out.println(menu);
			System.out.print("What would you like from the menu? (1 for potato chips, 2 for cookies, 3 for candies) ");
			userSelection = in.next();
			if (userSelection.equals("1")) {
				if (pChipQuantity == 0) {
					System.out.println("Sold out. Please make another choice. ");
				}
				else if (money == pCHIPAMT) {
						System.out.println("Please take your potato chips.");
						pChipQuantity--;
				}
				else if (money > pCHIPAMT) {
					double change = money - pCHIPAMT;
					System.out.println("Please take your potato chips. Change: $" + Math.round(change*100.0)/100.0);
					pChipQuantity--;
				}
				else {
					System.out.println("Money is not enough for the price. Your money has been returned.");
				}
			}
			else if (userSelection.equals("2")) {
				if (cookieQuantity == 0) {
					System.out.println("Sold out. Please make another choice. Your money has been returned.");
				}
				else if (money == cOOKIEAMT) {
					System.out.println("Please take your cookies.");
					cookieQuantity--;
				}
				else if (money > cOOKIEAMT) {
					double change = money - cOOKIEAMT;
					System.out.println("Please take your cookies. Change: $" + Math.round(change*100.0)/100.0);
					cookieQuantity--;
				}
				else {
					System.out.println("Money is not enough for the price. Your money has been returned.");
				}
			}
			else if (userSelection.equals("3")) {
				if (candyQuantity == 0) {
					System.out.println("Sold out. Please make another choice. ");
				}
				else if (money == cANDYAMT) {
					System.out.println("Please take your candies.");
					candyQuantity--;
				}
				else if (money > cANDYAMT) {
					double change = money - cANDYAMT;
					System.out.println("Please take your candies. Change: $" + Math.round(change*100.0)/100.0);
					candyQuantity--;
				}
				else {
					System.out.println("Money is not enough for the price. Your money has been returned.");
				}
			}
			else {
				System.out.println(userSelection + " does not exist.");
			}
			System.out.print("Do you want to continue? (y/n) ");
			if (in.next().equals("n")) {
				break;
			}
		}
	}
}