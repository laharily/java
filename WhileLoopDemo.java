import java.util.Scanner; 

public class WhileLoopDemo {
	public static void main(String[] args) {
		String choice = "y";
		Scanner input = new Scanner(System.in);

		while (choice.equals("y")) {
			System.out.print("Ask again? (y/n) ");
			choice = input.next();
		}
		System.out.println("Bye!");
	}
}