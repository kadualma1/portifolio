package ex;

import java.util.Scanner;

public class ex_032 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos números vai digitar? ");
		int n = sc.nextInt();
		int qtdPares = 0;
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("NUMEROS PARES:");
		for (int i = 0; i< vect.length; i++) {
			if (vect[i] % 2 == 0) {
				System.out.printf("%d ", vect[i]);
				qtdPares++;
			}
		}
		
		System.out.println();
		System.out.printf("QUANTIDADE DE PARES = %d", qtdPares);
		
		sc.close();

	}

}
