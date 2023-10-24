package crackJavaCoding;

public class SetGet {

	public static void main(String[] args) {

//	     Person personInfo = new Person("John Doe", "Software Developer", 12345);
//	        System.out.println(personInfo.getPersonInfo());
	        
		Person personInfo = new Person("John Doe", "Software Developer", 12345);
		personInfo.setPersonInfo("John Doe" ,"Software Developer" , 12345);
		System.out.println(personInfo.getPersonInfo());
		System.out.println(personInfo.job);
	}

public static class Person {
		public String name;// = "John Doe";
		public String job;// = "Software Developer";
		public int schoolId;// = 12345;
		Person() {
			
		}

		Person(String name, String job, int schoolId) {
			this.name = name;
			this.job = job;
			this.schoolId = schoolId;
			System.out.println("John Doe" + "Software Developer" + 12345);
		}

		String getPersonInfo() {
			System.out.println("Gettre");
			return String.format("Name: ");
		}

		public String setPersonInfo(String name, String job, int schoolId) {
			String info = String.format("Name: %s\nJob: %s\nSchool ID: %d", name, job, schoolId);
			return info;
		}
	}
}
