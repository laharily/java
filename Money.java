public class Money {
	
	private int dollars;
	private int cents;
	
	public Money() {
		dollars = 0;
		cents = 0;
	}
	
	public Money(int dollars, int cents) {
		this.dollars = dollars;
		this.cents = cents;
	}

	public int getDollars() {
		return dollars;
	}

	public int getCents() {
		return cents;
	}

	public void setDollars(int d) {
		dollars = d;
	}

	public void setCents(int c) {
		cents = c;
	}

	public Money add(Money m) {
		// add 2 objects
		if (m == null) { return null; }
		Money sumMoney = new Money();
		sumMoney.setDollars(this.dollars + m.getDollars());
		sumMoney.setCents(this.cents + m.getCents());
		return sumMoney;
	}

	public Money subtract(Money m) {
		// subtract 2 objects
		if (m == null) { return null; }
		Money subMoney = new Money();
		subMoney.setDollars(this.dollars - m.getDollars());
		subMoney.setCents(this.cents - m.getCents());
		return subMoney;
	}

	public Money multiply(int m) {
		// multiply an object by an int
		Money mMoney = new Money();
		double multAmt = dollars + (double) cents/100;
		multAmt *= m;
		mMoney.normalize(multAmt);
		return mMoney; 
	}
	
	public static Money[] multiply(Money[] moneys, int amt) {
		// multiply each object in an array by an int
		Money[] newMoney = new Money[moneys.length];
		for (int i = 0; i < moneys.length; i++) {
			int d = moneys[i].getDollars();
			int c = moneys[i].getCents();
			double multAmt = d + (double) c/100;
			multAmt *= amt;
			Money temp = new Money();
			temp.normalize(multAmt);
			newMoney[i] = temp;
		}
		return newMoney;
	}
	
	public boolean equals(Money money) { 
		if (dollars == money.getDollars() && cents == money.getCents()) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return (dollars + (double) cents/100) + "";
	}
	
	private void normalize(double amt) {
		/** normalize dollars and cents field
			@param amt amount to be noramlized (broken down into dollars and cents)
		*/
		setDollars((int) amt);
		setCents((int) ((amt * 100) % 100)); 
	}
}