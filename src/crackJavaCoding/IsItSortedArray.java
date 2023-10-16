package crackJavaCoding;

import java.util.SortedMap;

public class IsItSortedArray {
	public static void main(String[]args) {
		
		int [] sortedArray = {1,2,3,4,5};
		int [] unSortedArray = {5,4,3,2,1};
		
		System.out.println("Is sortedArray sorted? ::: "+ isSorted(sortedArray));
		System.out.println("Is unSortedArray sorted? ::: "+ isSorted(unSortedArray));
		
		int [] arr1 = {3,5,7,8,9}; //true
		int [] arg1 = {9,5,10,11,12};//false
		
		boolean resultArr = sorted(arr1, 0);
		boolean resultArg = sorted(arg1,0);
		
		System.out.println("arr sorted ? ::: "+resultArr);
		System.out.println("arg sorted ? ::: "+resultArg);
	}

	static boolean sorted(int []arr, int index) {
		//check first index equal  to last element
		if(index == arr.length-1)return true;
		
		//arr[index] > arr[index+1] return false
		if (arr[index]> arr[index+1])return false;
		
		//if all checks out, return true
		boolean result = sorted(arr,index+1);
		
		return result;
	}
	public static boolean isSorted(int[]array) {
		
		int n = array.length;
		
		for(int i = 0; i <n-1;i++) {
			if(array[i]>array[i+1]) {
				return false;// not sorted in ascending order
			}
			
		}
		
		return true;
	}
}
