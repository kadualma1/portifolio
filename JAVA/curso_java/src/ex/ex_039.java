package ex;

import java.util.Scanner;

public class ex_039 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		double menorAltura = 0.0;
		double maiorAltura = 0.0;
		double media = 0;
		int nHomens = 0;
		
		for (int i = 0; i < altura.length; i++) {
			System.out.printf("Altura da %dª pessoa: ", i+1);
			altura[i] = sc.nextDouble();
			System.out.printf("Genero da %dª pessoa: ", i+1);
			genero[i] = sc.next().charAt(0);
			
			if(genero[i] == 'M') {
				nHomens++;
			}
			if(genero[i] == 'F') {
				media+=altura[i];
			}
		}
		
		media /= (n - nHomens);
		
		menorAltura = altura[0];
		for (int i = 0; i < altura.length; i++) {
			if (altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
		}
		
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", media);
		System.out.printf("Numero de homens = %d%n", nHomens);
		
		sc.close();

	}

}
