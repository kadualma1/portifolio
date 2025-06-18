package ex;

import java.util.Scanner;

public class ex_017 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while (x > 1000 || x < 1) {
			System.out.println("O número digitado deve ser um número positivo menor ou igual a 1000. Verifique!");
			x = sc.nextInt();
		}
		
		for (int i = 0; i < x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		
		
		sc.close();

	}

}
