package crackJavaCoding;

public class FindCommonCharacters {
	public static void main(String[]args) {
		
		String str1 = "Merhaba";
		String str2 = "hello";
		getCommon(str1, str2);
	}
	static void getCommon(String str1, String str2) {
		String result = "";
		//rule out odd case
		if(str1.length()==0||str2.length()==0) {
			return;
		}
			// find the shorter text
//		if(str1.length()>str2.length()) {
//		System.out.println(str2);
//	}else {
//		System.out.println(str1);
//	}
		//short way to do if else
		String shorter = str1.length()>str2.length() ? str2 : str1;
		System.out.println(shorter); 
		
		// find the longer text
		String longer = shorter.equals(str1)?str2:str1;
		System.out.println(longer); 
		
		//iterate all characters of shorter
		for(int i =0 ; i<shorter.length(); i++) {
			//Store chars of shorter as a String
			String c = Character.toString(shorter.charAt(i));
			System.out.println(c);
			
			//use contains to look up if each shorter char is found in longer text
			if(longer.contains(c)&&Character.isLetter(c.charAt(0))) result+=c;
				
		}
		System.out.println("Result of common characters is in two String ::: "+result);
	}

}
