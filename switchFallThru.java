import java.util.*;

public class switchFallThru {
	public static void main(String[] args) {
		System.out.print("Enter a day: ");
		Scanner in = new Scanner(System.in);
		int dayOfWeek = in.nextInt();
		String day = "";

		switch(dayOfWeek) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				day = "weekday";
				break;
			case 6:
			case 7:
				day = "weekend";
				break;
		}

		System.out.println("It is a " + day);
	}
}