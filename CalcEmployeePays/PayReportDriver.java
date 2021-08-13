import java.util.*;

public class PayReportDriver {
	public static void main(String[] args) {
		
		EmployeePayReport eList = new EmployeePayReport();

		boolean done = false;
		while (!done) {
			Scanner in = new Scanner(System.in);
			System.out.print("Employee name: ");
			String eName = in.nextLine().trim();
			System.out.print("Employee type (hourly, salaried, commissioned): ");
			String eType = in.nextLine().toLowerCase().trim();
			if (eType.equals("hourly")) {
				System.out.print("Hours worked: ");
				int eHrs;
				if (in.hasNextInt()) {
					eHrs = in.nextInt();
				}
				else {
					System.out.println("Invalid input.");
					break;
				}
				System.out.print("Hourly rate: ");
				double eRate;
				if (in.hasNextDouble()) {
					eRate = in.nextDouble();
				}
				else {
					System.out.println("Invalid input.");
					break;
				}
				HourlyEmployee he = new HourlyEmployee(eName, eHrs, eRate);
				eList.add(he);
			}
			else if (eType.equals("salaried")) {
				System.out.print("Monthly salary: ");
				double eSalary;
				if (in.hasNextDouble()) {
					eSalary = in.nextDouble();
				}
				else {
					System.out.println("Invalid input.");
					break;
				}
				System.out.print("Selected for reward? (y/n) ");
				String reward = in.next().toLowerCase().trim();
				boolean eReward = false;
				if (reward.equals("y")) { 
					// System.out.println("Selected for Reward");
					eReward = true; 
				}
				else if (!reward.equals("n")) {
					System.out.println("Invalid input.");
					break;
				}
				SalariedEmployee se = new SalariedEmployee(eName, eSalary, eReward); 
				eList.add(se);
			}
			else if (eType.equals("commissioned")) {
				System.out.print("Week's sales: ");
				double eSales;
				if (in.hasNextDouble()) {
					eSales = in.nextDouble();
				}
				else {
					System.out.println("Invalid input.");
					break;
				}
				CommissionedEmployee ce = new CommissionedEmployee(eName, eSales);
				eList.add(ce);
			}
			else { 
				System.out.println("Invalid input.");
				break;
			}
			boolean correct = false;
			while (!correct) {
				System.out.print("continue? (y/n) ");
				String c = in.next().toLowerCase().trim();
				if (c.equals("n")) {
					System.out.println(eList.format());
					correct = true;
					done = true;
				}
				else if (c.equals("y")) {
					correct = true;
				}
				else {
					System.out.println("Invalid input. Please try again.");
				}
			}
		}
	}
}