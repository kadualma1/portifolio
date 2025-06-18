package ex;

import java.util.Scanner;

public class ex_003 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double pi, r, a;
		
		pi = 3.14159;
		r = sc.nextDouble();
		a = Math.pow(r, 2) * pi;
		
		System.out.printf("A=%.4f", a);
		
		sc.close();
	}

}
