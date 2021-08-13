public class CommissionedEmployee extends Employee {
	/**
	 * describes an employee that is paid 20% of the week's sales
	 */ 

	private double weekSales;

	public CommissionedEmployee(String aName, double sales) {
		super.name = aName;
		weekSales = sales;
	}

	public String format() {
		/**
		 * formats its line of the report
		 * @return the formatted line
		 */
		calcWeeklyPay();
		String s = String.format("%n%-15s%-25s%-1s%,.2f%31s%,.2f", super.name, "Commissioned", "$", weekSales, "$", getWeeklyPay());
		return s;
	}

	public void calcWeeklyPay() {
		/**
		 * calculates weekly pay
		 */
		super.weeklyPay = weekSales * 0.2;
	}
}