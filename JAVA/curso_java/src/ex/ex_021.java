package ex;

import java.util.Scanner;

public class ex_021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int fat = n;
		
		for (int i = n; i > 0; i--) {
			if (n != i) {
				fat *= i;
			}
		}
		
		if (n == 0) fat = 1;
		
		System.out.println(fat);
		
		sc.close();

	}

}
