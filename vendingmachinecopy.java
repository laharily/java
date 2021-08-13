String userSelection, coinType;
		int pChipQuantity = 2, cookieQuantity = 2, candyQuantity = 2;
		final double pCHIPAMT = 1.25, cOOKIEAMT = 0.85, cANDYAMT = 0.95;
		String menu = "1. Potato Chips: $1.25\n2. Cookies: $0.85\n3. candies: $0.95";
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.print("What type of coin will you use? (q for quarter, d for dime, n for nickel, quit to quit) ");
			coinType = in.next();
			if (coinType.equals("quit")) {
				break;
			}
			System.out.print("Enter the amount of coins you will use: ");
			if (in.hasNextInt()) {
				coinAmount = in.nextInt();
			}
			else {
				System.out.println("invalid amount.");
				break;
			}
			if (coinType.equals("q")) {
				money = (coinAmount * 25)/100.0;
			}
			else if (coinType.equals("d")) {
				money = (coinAmount * 10)/100.0;
			}
			else if (coinType.equals("n")) {
				money = (coinAmount * 5)/100.0;
			}
			else { 
				System.out.println("invalid coin type.");
				break; 
			}
			System.out.println(menu);
			System.out.print("What would you like from the menu? (pc for potato chips, co for cookies, ca for candies) ");
			userSelection = in.next();
			if (userSelection.equals("pc")) {
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
					System.out.println("Money is not enough for the price.");
				}
			}
			else if (userSelection.equals("co")) {
				if (cookieQuantity == 0) {
					System.out.println("Sold out. Please make another choice. ");
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
					System.out.println("Money is not enough for the price.");
				}
			}
			else if (userSelection.equals("ca")) {
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
					System.out.println("Money is not enough for the price.");
				}
			}
			else {
				System.out.println(userSelection + " does not exist.");
			}
		}
	}
}