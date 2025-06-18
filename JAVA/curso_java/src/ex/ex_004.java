package ex;

import java.util.Scanner;

public class ex_004 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, prod1, prod2, result;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		prod1 = a * b;
		prod2 = c * d;
		result = prod1 - prod2;
		
		System.out.println("DIFERENCA = " + result);
		
		sc.close();

	}

}
