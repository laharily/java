/** This class tests the Adder class. 
*/
public class AdderTest {
	public static void main(String[] args) {
		int a = 1;
		Adder adder = new Adder(a);

		System.out.println(adder.add(1).add(2).add(3).add(4).getIntSum());
	}
}