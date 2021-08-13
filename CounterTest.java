/** This class tests the Counter class.
*/
public class CounterTest {
	public static void main(String[] args) {
		Counter tally = new Counter();
		tally.count();
		tally.count();
		int result = tally.getValue();
		System.out.println("Value: " + result);
		tally.count();
		tally.count();
		result = tally.getValue();
		System.out.println("Value: " + result);
	}
}