package ex;

import java.util.Scanner;

public class ex_029 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números vai digitar? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("DIGITE UM NUMERO:");
			vect[i] = sc.nextInt();;
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) System.out.println(vect[i]);
		}
		
		sc.close();
	}

}
