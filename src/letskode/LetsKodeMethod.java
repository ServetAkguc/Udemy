package letskode;

public class LetsKodeMethod {

	public static void main(String[] args) {
		char grade=findGrades(95);
		String studentName="Servet";
		displayGrades(studentName,grade);
		
		studentName="Berrin";
		grade=findGrades(75);
		displayGrades(studentName,grade);
		
		studentName="Rana";
		grade=findGrades(100);
		displayGrades(studentName,grade);


	}

	public static char findGrades(int score) {
		char grade;
		if (score >= 90 && score <= 100) {
			grade = 'A';
		} else if (score >= 80 && score < 90) {
			grade = 'B';
		} else if (score >= 70 && score < 80) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		return grade;
	}

	public static void displayGrades(String studentName,char grade) {
		System.out.println("=======================");
		System.out.println("Grade of " + studentName + " is " + grade);
		System.out.println("=======================");

	}
}