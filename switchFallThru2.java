import java.util.*;

public class switchFallThru2 {
	public static void main(String[] args) {
		System.out.print("Enter a model: ");
		Scanner in = new Scanner(System.in);
		String model = in.next();
		String features = " ";

		switch(model) {
			case "adv": features += "wifi ";
			case "intm": features += "picture-in-picture ";
			case "basic": features += "remote control "; break;
		}

		System.out.println("the " + model + " has features " + features);
	}
}