package crackJavaCoding;

import java.util.ArrayList;
import java.util.Scanner;

public class FilterTextFromGivenData {
	public static void main(String[]args) {
		
		ArrayList<String> list =new ArrayList<>();//readInput();
		list.add("12rana%$3");
		list.add("23ok");
		list.add("3eggs");
		list.add("85berrrr");
		list.add("125serrr");
		System.out.println("LIst from Read inputs :: "+list);
		
		ArrayList <String> numbers = filterText(list);
		System.out.println("Numbers are :::: "+numbers);
		
	}
	static ArrayList<String>filterText(ArrayList<String> list){
		
		if(list.isEmpty()) return null;//odd case
		
		ArrayList<String> strings = new ArrayList<>();
		
		for(int i =0; i<list.size();i++) {
			String data = list.get(i);
			
			//Lambda solution
//			boolean numberCheck = data.chars().allMatch(Character::isDigit);
//			if(numberCheck){
//				nums.add(Integer.parseInt(data));
//			}
			
			//regex solution
			String str = data.replaceAll("[^a-zA-Z]", "");
			System.out.println("Regex solution is :: "+str);
			
			//handle Number Format Exception
			if (!str.equals(null)) {
				try {
					strings.add(str);
					
				}catch (NumberFormatException nfe) {
					
				}
			}
		}
		
		return strings;
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
