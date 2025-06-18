package ex;

import java.util.Scanner;

import util.CurrencyConverter;

public class ex_027 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double boughtDollars;
		
		System.out.print("What is the dollar price? ");
		CurrencyConverter.dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		boughtDollars = sc.nextDouble();
		
		System.out.println("Amout to be paid in reais = R$ " + CurrencyConverter.realPrice(boughtDollars));
		
		sc.close();

	}

}
