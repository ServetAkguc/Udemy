package crackJavaCoding;

import java.util.ArrayList;
import java.util.Scanner;

public class FilterNumberFromGivenData {
	public static void main(String[]args) {
		
		ArrayList<String> list = readInput();
		System.out.println("LIst from Read inputs :: "+list);
		
		ArrayList <Integer> numbers = filterNumbers(list);
		System.out.println("Numbers are :::: "+numbers);
		
	}
	static ArrayList<Integer>filterNumbers(ArrayList<String> list){
		
		if(list.isEmpty()) return null;//odd case
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		for(int i =0; i<list.size();i++) {
			String data = list.get(i);
			
			//Lambda solution
//			boolean numberCheck = data.chars().allMatch(Character::isDigit);
//			if(numberCheck){
//				nums.add(Integer.parseInt(data));
//			}
			
			//regex solution
			String number = data.replaceAll("[^0-9]", "");
			System.out.println("Regex solution is :: "+number);
			
			//handle Number Format Exception
			if (!number.equals(null)) {
				try {
					nums.add(Integer.parseInt(number));
					
				}catch (NumberFormatException nfe) {
					
				}
			}
		}
		
		return nums;
	}
	
	static ArrayList<String> readInput(){
		ArrayList<String>output = new ArrayList<>();


		Scanner in = new Scanner(System.in);
		
		while(in.hasNextLine()) {
			String data = in.nextLine();
			output.add(data);
					
		}
		return output;
		}
}
