package ex;

import java.util.Scanner;

public class ex_006 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int cd1, cd2, n1, n2;
		double vl1, vl2, vlFinal;
		
		cd1 = sc.nextInt();
		n1 = sc.nextInt();
		vl1 = sc.nextDouble();
		
		cd2 = sc.nextInt();
		n2 = sc.nextInt();
		vl2 = sc.nextDouble();
		
		vlFinal = (n1 * vl1) + (n2 * vl2);
		
		System.out.printf("VALOR A PAGAR: R$%.2f", vlFinal);
		
		sc.close();

	}

}
