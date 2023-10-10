package crackJavaCoding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GetUniqueDuplicateValues {

	public static void main(String[] args) {
		String str1 = "get";
		String str2 = "etg";

		int result = getDuplicateValues(str1, str2);
		System.out.println(result);
	}

	static int getDuplicateValues(String str1, String str2) {
		// handle if words are empty
		if (str1.length() == 0 || str2.length() == 0)
			return 0;
		int count = 0;
		String dups = ""; // add unique characters

		List<String> word1 = helper(str1); // word1 has unique characters as a list
		List<String> word2 = helper(str2); // word2 has unique characters as a list
		// System.out.println(word1 + "\n" + word2);

		// compare two inputs and get unique count and print
		if (word1.size() <= word2.size()) {

			for (int i = 0; i < word1.size(); i++) {
				for (int j = 0; j < word2.size(); j++) {

					if (word1.get(i).equalsIgnoreCase(word2.get(j))) {
						dups += word2.get(j); // store duplicate values
						count++;
					}
				}
			}
		}
		System.out.println(dups);
		return count;
	}

	static List<String> helper(String str) {
		// Handle duplicate string characters
		Set<String> set = new HashSet<>();

		for (int i = 0; i < str.length(); i++) {
			set.add(String.valueOf(str.charAt(i)));
		}

		List<String> list = new ArrayList<>(set);
		return list;
	}
}
