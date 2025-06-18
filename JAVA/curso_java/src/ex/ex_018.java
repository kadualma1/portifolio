package ex;

import java.util.Scanner;

public class ex_018 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		int in, out;
		
		in = 0;
		out = 0;
		
		for (int i = 0; i < N; i++) {
			int X = sc.nextInt();
			if (X >= 10 && X <= 20) {
				in++;
			}
			else {
				out++;
			}
		}
		
		System.out.printf("%d in%n%d out", in, out);
		
		sc.close();

	}

}
