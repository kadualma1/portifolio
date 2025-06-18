package ex;

import java.util.Scanner;

public class ex_020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			
			if (y != 0) {
				System.out.println(x/y);
			}
			else {
				System.out.println("Divisão Impossível");
			}
			
		}
		
		sc.close();

	}

}
