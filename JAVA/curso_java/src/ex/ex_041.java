package ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class ex_041 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Funcionario> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.printf("Employee #%d: %n", i + 1);
			Integer id;
			while (true) {
				System.out.print("ID: ");
				id = sc.nextInt();
				sc.nextLine();

				if (!idExists(list, id)) {
					break;
				} else {
					System.out.println("ID already taken! Choose another one.");
				}
			}
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			sc.nextLine();

			list.add(new Funcionario(id, name, salary));
		}

		Integer id;
		while (true) {
			System.out.print("Enter the employee id that will have salary increase: ");
			id = sc.nextInt();
			sc.nextLine();

			if (!idExists(list, id)) {
				System.out.println("The choosen ID does not exist. Choose another one.");
			} else {
				break;
			}
		}
		
		Funcionario func = findById(list, id);
		if (func != null) {
			System.out.print("Enter the percentage: ");
			Double percent = sc.nextDouble();
			sc.nextLine();
			
			func.increaseSalary(percent);			
		}

		System.out.println("List of employees: ");
		for (Funcionario emp : list) {
			System.out.println(emp);
		}

		sc.close();

	}

	private static boolean idExists(List<Funcionario> list, Integer id) {
		for (Funcionario emp : list) {
			if (emp.getId().equals(id)) {
				return true;
			}
		}
		return false;
	}
	
	private static Funcionario findById(List<Funcionario> list, Integer id) {
		for (Funcionario emp : list) {
			if (emp.getId().equals(id)) {
				return emp;
			}
		}
		return null;
	}

}
