package crackJavaCoding;

import java.util.*;

public class ParseAndStoreValuesInListViaScanner {
	public static void main(String[] args) {

		// Add a list and readInput method returns the list.
		ArrayList<String> list = readInput(); // now it won't work, let's fix the method
		System.out.println(list);

	}

	// this method parses stdin and stores values inside a list
	static ArrayList<String> readInput() {
		// add the list container here.
		ArrayList<String> list = new ArrayList<>();

		// Scanner object gets stdin from System class
		Scanner scanner = new Scanner(System.in); // input from stdin

		// Since there are multiple lines in the stdinput, visit all elements
		while (scanner.hasNextLine()) {
			String data = scanner.nextLine(); // get each input in string format.
			list.add(data);
			// System.out.println(data); // input values prints to console/output.
		}
		// close scanner since we are done checking for inputs.
		scanner.close();

		return list; // returning empty list as of now.
	}
}
