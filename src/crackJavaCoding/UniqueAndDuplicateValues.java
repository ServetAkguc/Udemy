package crackJavaCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueAndDuplicateValues {
	public static void main(String []args) {
		List<Integer> numbers = Arrays.asList(1,2,3,2,4,3,2);
		
		Set<Integer> uniqueValues = new HashSet();
		Set<Integer> duplicateValues = new HashSet();
		
		for(Integer num : numbers) {
			if(!uniqueValues.add(num)) {
				//if add returns false, it's a duplicate
				duplicateValues.add(num);
			}
		}
		
		//Convert duplicateValues set to a list if needed
		List <Integer> duplicateValuesList = new ArrayList(duplicateValues);
		System.out.println("Unique values :: "+ uniqueValues);
		System.out.println("Duplicate Values:: "+ duplicateValuesList);
	}

}
