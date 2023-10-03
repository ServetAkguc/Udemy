package crackJavaCoding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindCommonCharactersInTwoStringLIST {

	public static void main(String[] args) {
		String str1 = "abcdef";
		String str2 = "accdfgh";

		List<Character> result = findCommonCharacters(str1, str2);

		System.out.println("Common characters: " + result);
	}

	public static List<Character> findCommonCharacters(String str1, String str2) {
		List<Character> commonChars = new ArrayList<>();

		//Create an array to keep track of character occurences in str2
		boolean[]charInStr2 = new boolean[256];//Assuming ASCII characters
		
		//Mark characters from str2 in the array
		for (char c: str2.toCharArray()) {
			charInStr2[c] =true;
		}
		//Check characters in str1 against the array
		for (char c :str1.toCharArray()) {
			if(charInStr2[c]) {
				commonChars.add(c);
				charInStr2[c] = false; // to avoid duplicates 
			}
		}
		
		
		return commonChars;
	}
}