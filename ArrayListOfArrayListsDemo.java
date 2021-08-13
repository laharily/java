import java.util.*;

public class ArrayListOfArrayListsDemo {
	public static void main(String[] args) {
		ArrayList<ArrayList<String>> mainArrayList = new ArrayList<ArrayList<String>>();
		ArrayList<String> subArrayList = new ArrayList<String>();
		/* add elements into subArrayList */
		subArrayList.add("1.1");
		subArrayList.add("1.2");
		subArrayList.add("1.3");
		ArrayList<String> subArrayList2 = new ArrayList<String>();
		/* add elements into subArrayList2 */
		subArrayList2.add("2.1");
		subArrayList2.add("2.2");
		subArrayList2.add("2.3");
		
		mainArrayList.add(subArrayList);
		mainArrayList.add(subArrayList2);

		for (int i = 0; i < mainArrayList.size(); i++) {
			for (int k = 0; k < mainArrayList.get(i).size(); k++) {
				System.out.print(" " + mainArrayList.get(i).get(k));
			}
			System.out.println();
		}
	}
}