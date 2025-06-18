package ex;

import java.util.Scanner;

import entities.Employee;

public class ex_025 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		double percent;
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		
		System.out.println();
		System.out.print("Wich percentage to increase salary? ");
		percent = sc.nextDouble();
		
		employee.increaseSalary(percent);
		System.out.println();
		System.out.println("Updated data: " + employee);
		
		
		sc.close();

	}

}
