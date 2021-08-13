public class SalariedEmployee extends Employee {
	/**
	 * describes an employee that is paid a fixed weekly salary
	 */ 

	private boolean selectedForReward;
	private double monthlyPay;

	public SalariedEmployee(String aName, double salary, boolean reward) {
		super.name = aName;
		monthlyPay = salary;
		super.weeklyPay = monthlyPay/4;
		selectedForReward = reward;
	}

	public String format() {
		/** 
		 * formats its line of the report
		 * @return the formatted line
		 */
		calcWeeklyPay();
		String s = String.format("%n%-15s%-65s%-1s%,.2f", super.name, "Salaried", "$", getWeeklyPay());
		if (selectedForReward) {
			s += "*";
		}
		return s;
	}

	public void calcWeeklyPay() {
		/** 
		 * calculates weekly pay
		 */
		if (selectedForReward) { 
			// if employee is selected for a reward, add a 10% bonus to salary
			super.weeklyPay = super.weeklyPay + (super.weeklyPay * 0.1); 
		}
	}
}