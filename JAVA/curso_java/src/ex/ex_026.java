package ex;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ex_026 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println(student);
		
		sc.close();

	}

}
