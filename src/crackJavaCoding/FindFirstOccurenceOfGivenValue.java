package crackJavaCoding;

public class FindFirstOccurenceOfGivenValue {
	
	public static void main(String[]args) {
		int []array = {1,2,3,4,3,5};
		int[] arr1 = {1,3,5,3,3};
		int [] arr2 = {9,3,5,1,1,1};
		int target = 3;
		
//		System.out.println(findFirst(arr1,0,3));
//		String result = findFirst(arr1,0,3)== 1 ?"Match":"Not match";
//		System.out.println(result);
		
		int firstOccurence = findFirstOccurence(array,target);

		if(firstOccurence !=-1) {
			System.out.println("First occurence of "+target+" is at index "+ firstOccurence);
		}else {
			System.out.println(target+ " not found in the array");
		}
	}
	
	//Find first occurence index
	//arr : provided series of numbers; sorted or unsorted
	//start: first indec or where we start looking for value
	//value: is what we look for and return index location
	
	static int findFirst(int[]arr,int index, int value) {
		if(index ==arr.length)return -1;
		if(arr[index]==value)return index;
		
		return findFirst(arr,index+1,value);
	}
	//stack over flow exception!!!
	//Find the last occurence index
	

	public static int findFirstOccurence(int[]arr,int target) {
		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==target) {
//				return i;//return first index of the first occcurence
//			}
			for (int a :arr) {
				if(a==target) {
					return a;
				}
			}
		}
		return -1;//return if the target value is not found in the array
	}
	
}
