package crackJavaCoding;

import java.util.Arrays;

public class CharComparison {
	
	static Object [] data = {1,1,1,12,12,"$aa","bbb","c","d","d"};
	public static void main(String []args) {
		getStrings(6);
		
		
		String result = getStrings(data,5);
		System.out.println("Result is::: "+result);
		
		//once one type; constraint : parameter must be String type
		int countResult = getCount("1");
		System.out.println("Count Result ::: "+ countResult);
		
	}

	static int getCount (String word) {
		int count = 0;
		
		for(int i =0; i<data.length;i++) {
			if(String.valueOf(data[i]).equalsIgnoreCase(word)) {
				count++; // add 1 more to count every time you see the word
			}
		}
		return count;
	}
	
	static void getStrings(int index) {
		//choose the data you want to convert into chars
		String str = String.valueOf(data[index]);
		
		if(Character.isLetter(str.charAt(0)) || Character.isDigit(str.charAt(0))){
			System.out.println(Arrays.toString(str.toCharArray()));
		}
	}
	static String getStrings(Object[] data, int index) {
	return String.valueOf(data[index]);	
	}
}
