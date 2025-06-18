package ex;

import java.util.Scanner;

public class ex_038 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		sc.nextLine();
		String[] nome = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		double media = 6.0;
		
		for (int i = 0; i < nome.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %dº aluno:%n", i+1);
			nome[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		System.out.println("Alunos aprovados:");
		for (int i = 0; i < nome.length; i++) {
			if (((nota1[i] + nota2[i])/2) >= media) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();

	}

}
