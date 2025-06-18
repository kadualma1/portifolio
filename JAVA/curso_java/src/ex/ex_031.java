package ex;

import java.util.Scanner;

public class ex_031 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		int menores = 0;
		double[] altura = new double[n];
		double somaAlturas = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %dª pessoa: %n", i + 1);
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			sc.nextLine();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			sc.nextLine();
			
			if (idade[i] < 16) menores ++;
			somaAlturas += altura[i];
		}
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n", somaAlturas/n);
		System.out.printf("Pessoas com menos de 16 anos: %.2f% %n", ((double) menores / n) * 100);
		
		for (int i = 0; i < idade.length; i++) {
			if (idade[i] < 16) System.out.println(nome[i]);
		}
		
		sc.close();

	}

}
