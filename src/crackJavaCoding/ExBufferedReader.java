package crackJavaCoding;

import java.util.*;
import java.io.*;


public class ExBufferedReader {
	public static void main(String[] args) throws IOException {
	      
	      // let's use the same approach as previous lesson.
	      // create a void type function/method.
	      readStreams(); 
	      
	    }
	    
	    // implement the method below.
	    static void readStreams() throws IOException{
	      
	      // access the stdin values via input stream reader class.
	      InputStreamReader reader = new InputStreamReader(System.in);
	      // run to see if we need other imports, we'll add it at line 2
	      
	      //Buffered Reader to throw everything inside the output. Stream of data
	      BufferedReader stream = new BufferedReader(reader); 
	      
	      String line; // this will be each line feeding from stdin
	      
	      // add the while loop to visit each line.
	      while( (line = stream.readLine() ) != null ){
	        System.out.println(line); // let's see if it is reading each line correctly
	      }
	      
	      // we need either use try-catch block or utilize throws keyword.
	    }
	    
}
