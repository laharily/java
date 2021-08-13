import java.util.Scanner;

public class TernaryOperatorDemo { // conditional operator is a ternary operator
	public static void main(String[] args) {
		System.out.print("Enter two numbers: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println(a>b? "a>b" : "a<b");
	}
}