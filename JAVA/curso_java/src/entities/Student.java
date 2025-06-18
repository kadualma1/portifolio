package entities;

public class Student {

	public String name;
	public double grade1, grade2, grade3;
	
	public double finalGrade () {
		return grade1 + grade2 + grade3;
	}
	
	public Boolean isPassed () {
		return finalGrade() >= 60.0;
	}
	
	public String toString() {
		if (isPassed ()) {
			return String.format("FINAL GRADE = %.2f%nPASS", finalGrade());
		}
		else {
			return String.format("FINAL GRADE = %.2f%nFAILED%nMISSING %.2f POINT(S)", finalGrade(), 60.0 - finalGrade());
		}
	}
}
