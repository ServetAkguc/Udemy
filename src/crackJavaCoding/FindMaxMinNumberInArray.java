package crackJavaCoding;

import java.util.Scanner;

public class FindMaxMinNumberInArray {
	public static void main(String []arguments) {
		
		int arr [] = {5,8,7,4,6,9,3,2,1,10};
		int minimum = arr[0];
		int maximum= arr[1];
		//find the maximum number		
		for (int a :arr) {
			if(maximum<a) {
				maximum =a;
			}
		}
		System.out.println("Maximum value in the array is ::: "+maximum);
		
	//find the minimum number
		for(int a : arr) {
			if(minimum>a) {
				minimum =a;
			}
		}
		System.out.println("Minimum value in the array is ::: "+minimum);
		int greatestDifference = maximum-minimum;
		System.out.println("Greatest ascending difference is:: " + greatestDifference);
//		int n, max;
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the number of elements in the array");
//		n = s.nextInt();
//		int a [] = new int[n];
//		System.out.println("Enter the elements of array");
//		for(int i =0; i<n;i++) {
//			a[i] = s.nextInt();
//		}
//		max = a[0];
//		for(int i =0; i<n;i++) {
//			if(max<a[i]) {
//				max=a[i];
//			}
//		}
//		System.out.println("Maximum value in the array is ::: "+max);
		
		
	}

}
