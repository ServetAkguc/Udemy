package crackJavaCoding;

import java.util.*;//need it for file and error handling classes
//if you want, you can also import classes directly, e.g util.Scanner
import java.io.*;

public class ReadInputFromStdln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
///create logic here: Add a void type function to print input from stdl
		readInput();//that's all to call the void function 
	}
	//Let's get out of main, and add Read input method.
	// use scanner to retrieve std input
	static void readInput() {
		//scanner object gets stdin from system class
		Scanner scanner = new Scanner(System.in);//input from stdin
		
		//since there are multiple lines in the stdinput, visit all elements
		while(scanner.hasNextLine()) {
			String data = scanner.nextLine();// get each input in string format
			System.out.println(data);//input values prints to console/output.
			
		}
		//close scanner since we are done checking for inputs.
		scanner.close();
	}

}
