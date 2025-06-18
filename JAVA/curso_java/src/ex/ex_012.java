package ex;

import java.util.Scanner;

public class ex_012 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int cd, qtd;
		double p1,p2,p3,p4,p5, total;

		cd = sc.nextInt();
		qtd = sc.nextInt();
		
		p1 = 4.00;
		p2 = 4.50;
		p3 = 5.00;
		p4 = 2.00;
		p5 = 1.50;
		
		total = 0;
		
		if (cd == 1) {
			total = p1 * qtd;
		}
		else if (cd == 2) {
			total = p2 * qtd;
		}
		else if (cd == 3) {
			total = p3 * qtd;
		}
		else if (cd == 4) {
			total = p4 * qtd;
		}
		else if (cd == 5) {
			total = p5 * qtd;
		}
		
		System.out.printf("Total: R$%.2f", total);
		
		sc.close();

	}

}
