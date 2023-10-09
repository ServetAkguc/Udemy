package crackJavaCoding;

public class GreatestAscendingDifference {

	public static void main(String[] args) {

		int arr[] = { 6, 5, 4, 3, 2, 1 };

		int min = arr[0]; // to be reassigned once new min found
		int max = arr[2]; // to be reassigned

		int current = 1;
		int index = 0; // use this var to find index of min.
		// check values to the right of index.

		for (int i = 0; i < arr.length; i++) {
			current = arr[i];
			// step 1: find lowest value on the lefthand side.
			// assume there is at least one element on the righthand side.
			if (min > current && current != arr[arr.length - 1]) {
				min = current; // found new minimum value, reassigned
				index = i;
			}

			// step 2: find highest value on the righthand side.
			if (min < current && current > arr[index]) {
				max = current;
			} else {
				max = 0;
			}

		}

		// step 3: verify min is not greater than max, return -1 otherwise.
		if (min > max) {
			System.out.println(-1);
		} else {
			System.out.println(max - min);
		}
		
		// Print out some test values
		System.out.println("minimum: " + min);
		System.out.println("index of lowest number: " + index);
		System.out.println("max: " + max);

	}

}