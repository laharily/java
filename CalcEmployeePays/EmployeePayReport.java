import java.util.*;

public class EmployeePayReport {
	/**
	 * describes an employee pay report for a set of employees
	 */ 

	private ArrayList<Employee> employees;

	public EmployeePayReport() {
		employees = new ArrayList<Employee>();
	}

	public String format() {
		/** 
		 * formats the employee pay report
		 * @return the formatted employee pay report
		 */
		// String s = String.format("%n%s%14s%20s%20s%20s%20s", "Name", "Type", "Hours", "Sales", "Rate", "Weekly Pay");
		String s = String.format("%n%-15s%-15s%-10s%-20s%-20s%-11s", "Name", "Type", "Hours", "Sales", "Rate", "Weekly Pay");
		s += String.format("%n");
		for (int i = 0; i < 100; i++) {
			// prints 100 equal signs
			s += String.format("=");
		}
		for (Employee employee : employees) {
			s += employee.format();
		}
		s += String.format("%n");
		for (int i = 0; i < 100; i++) {
			// prints 100 equal signs
			s += String.format("=");
		}
		s += String.format("%n%s%74s%,.2f%n%s%n", "TOTAL: ", "$", getTotalPay(), "* = A 10% bonus is awarded");
		return s;
	}

	public void add(Employee employee) {
		/** 
		 * adds an employee to this pay report
		 * @param employee the employee
		 */
		employees.add(employee);
	}

	private double getTotalPay() {
		/** 
		 * computes the total pay for all employees
		 * @return the total pay
		 */
		double totalPay = 0;
		for (Employee employee : employees) {
			totalPay += employee.getWeeklyPay();
		}
		return totalPay;
	}
}