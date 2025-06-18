package ex;

import java.util.Locale;
import java.util.Scanner;

public class ex_005 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n, hours;
		double value, salary;
		
		n = sc.nextInt();
		hours = sc.nextInt();
		value = sc.nextDouble();

		salary = hours * value;
		
		System.out.println("NUMBER = " + n);
		System.out.printf("SALARY = U$%.2f", salary);
				
		sc.close();

	}

}
