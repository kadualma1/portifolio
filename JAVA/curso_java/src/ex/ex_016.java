package ex;

import java.util.Scanner;

public class ex_016 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		int alcool, gas, diesel;
		
		n = sc.nextInt();
		alcool = 0;
		gas = 0;
		diesel = 0;
		
		while (n != 4) {
			switch (n) {
				case 1:
					alcool += 1;
					break;
				case 2:
					gas += 1;
					break;
				case 3:
					diesel += 1;
					break;
				default:
					System.out.println("Favor digitar um código válido");
			}	
			
			n = sc.nextInt();

		}

		System.out.printf("MUITO OBRIGADO!%nAlcool: %d%nGasolina: %d%nDiesel: %d%n", alcool, gas, diesel);
		
		sc.close();

	}

}
