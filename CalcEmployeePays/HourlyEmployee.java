public class HourlyEmployee extends Employee {
	/**
	 * describes an employee that is paid by the hour 
	 */ 

	private int hoursWorked;
	private double hourlyRate;

	public HourlyEmployee(String aName, int hours, double rate) {
		super.name = aName;
		hoursWorked = hours;
		hourlyRate = rate;
	}

	public String format() {
		/**
		 * formats its line of the report
		 * @return the formatted line
		 */
		calcWeeklyPay();
		String s = String.format("%n%-15s%-15s%-30d%-1s%,.2f%15s%,.2f", super.name, "Hourly", hoursWorked, "$", hourlyRate, "$", getWeeklyPay());
		return s;
	}

	public void calcWeeklyPay() {
		/**
		 * calculates weekly pay
		 */
		if (hoursWorked > 40) {
			// if employee worked more than 40 hours, double the rate for each extra hour
			int extraHrs = hoursWorked - 40;
			super.weeklyPay = (40 * hourlyRate) + (extraHrs * hourlyRate * 2);
		}
		else {
			super.weeklyPay = hoursWorked * hourlyRate;
		}
	}
}