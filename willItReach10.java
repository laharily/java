public class willItReach10 {
	public static void main(String[] args) {
		double sum = 0;
		double d = 0;
		while (d != 10.0) {
			d += 0.1;
			sum += sum + d;
			System.out.println(d);
		}
	}
}
