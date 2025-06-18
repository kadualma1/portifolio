package ex;

import java.util.Scanner;

public class ex_037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos nomes você irá digitar? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		int maisVelho = 0;
		int pessoa = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %dª pessoa:%n", i+1);
			sc.nextLine();
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			if (idade[i] > pessoa) {
				maisVelho = i;
				pessoa = idade[i];
			}
		}
		
		System.out.printf("PESSOA MAIS VELHA: %s", nome[maisVelho]);
		
		sc.close();

	}

}
