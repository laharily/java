public abstract class Employee {
	/**
	 * describes a general employee
	 */

	protected String name;
	protected double weeklyPay;

	public abstract String format();

	public abstract void calcWeeklyPay();

	public double getWeeklyPay() {
		return weeklyPay;
	}

	public String getName() {
		return name;
	}
}