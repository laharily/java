public class boxString {
	public static void main1(String[] args) {
		System.out.println("Hello");
	}
	public static void boxString1(String contents) {
		int n = contents.length();
		for (int i = 0; i < n + 2; i++) { System.out.print("-"); }
		System.out.println();
		System.out.println("!" + contents + "!");
		for (int i = 0; i < n + 2; i++) { System.out.print("-"); }
		System.out.println();
	}
}