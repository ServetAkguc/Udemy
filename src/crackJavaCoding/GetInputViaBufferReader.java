package crackJavaCoding;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetInputViaBufferReader {
	public static void main(String[] args) throws IOException {
		List<String> list = readStreams(); // this method will return a list
		System.out.println(list);
	}

	static List<String> readStreams() throws IOException {
		// add the list
		List<String> list = new ArrayList<>();

		// access the stdin values via input stream reader class.
		InputStreamReader reader = new InputStreamReader(System.in);
		// run to see if we need other imports, we'll add it at line 2

		// Buffered Reader to throw everything inside the output. Stream of data
		BufferedReader stream = new BufferedReader(reader);

		String line; // this will be each line feeding from stdin

		// add the while loop to visit each line.
		while ((line = stream.readLine()) != null) {
			list.add(line);
			// System.out.println(line);
		}

		return list;

	}

}
