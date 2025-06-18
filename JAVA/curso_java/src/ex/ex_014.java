package ex;

import java.util.Scanner;

public class ex_014 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int  digit = sc.nextInt();
		int password = 2002;
		
		while(digit != password) {
			System.out.println("Senha incorreta!");
			digit = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
		
	}

}
