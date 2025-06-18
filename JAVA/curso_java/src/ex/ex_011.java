package ex;

import java.util.Scanner;

public class ex_011 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int ini, fin, duracao;
		
		ini = sc.nextInt();
		fin = sc.nextInt();
		
		if (ini < fin) {
			duracao = fin - ini;
		}
		else {
			duracao = (24-ini)+fin;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
		
		sc.close();

	}

}
