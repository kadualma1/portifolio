package ex;

import java.util.Scanner;

public class ex_023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int n = sc.nextInt();
//		
//		if (n <= 0) n = 1;
//		
//		for (int i = 1; i <= n; i++) {
//			int sqr = (int) Math.pow(i, 2);
//			int cub = (int) Math.pow(i, 3);
//			
//			System.out.printf("%d %d %d%n", i, sqr, cub);			
//		}
		
		int nivel = sc.nextInt();
		int counter = 0;
		
		for (int i = 1; i <= nivel; i++) {
			if (i % 3 == 0) counter ++;
		}
		
		System.out.println(counter);
		
		sc.close();

	}

}
