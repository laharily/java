/** This class models a tally counter. 
*/
public class Counter {
	
	private int value;

	public int getValue() {
		/** Gets the current value of this counter. 
			@return the current value
		*/
		return value;
	}

	public void count() {
		/** Advances the value of this counter by 1. 
		*/
		value++;
	}

	public void reset() {
		/** Resets the value of this counter to 0.
		*/
		value = 0;
	}
}
