package crackJavaCoding;

import java.util.HashSet;
import java.util.Set;

public class FindCommonCharactersInTwoStringLIST {

	public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "acdfgh";

        Set<Character> commonChars = findCommonCharacters(str1, str2);

        System.out.println("Common characters: " + commonChars);
    }

    public static Set<Character> findCommonCharacters(String str1, String str2) {
        Set<Character> commonChars = new HashSet<>();

        // Create sets to store the characters of both strings
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        // Add characters from the first string to set1
        for (char c : str1.toCharArray()) {
            set1.add(c);
        }

        // Add characters from the second string to set2
        for (char c : str2.toCharArray()) {
            set2.add(c);
        }

        // Iterate through set1 and check if each character exists in set2
        for (char c : set1) {
            if (set2.contains(c)) {
                commonChars.add(c);
            }
        }

        return commonChars;
    }
}
