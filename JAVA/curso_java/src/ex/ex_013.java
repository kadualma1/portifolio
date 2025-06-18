package ex;

import java.util.Scanner;

public class ex_013 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		double v = sc.nextDouble();
		String intervalo = "";
		
		if (v >= 0 && v <= 25) {
			intervalo = "[0, 25]";
		}
		else if (v > 25 && v <= 50) {
			intervalo = "[25, 50]";
		}
		else if (v > 50 && v <= 75) {
			intervalo = "[50, 75]";
		}
		else if (v > 75 && v <= 100) {
			intervalo = "[75, 100]";
		}
		
		if (intervalo == "") {
			System.out.println("Fora de Intervalo");
		}
		else {
			System.out.println("Intervalo: " + intervalo);
		}
		
		sc.close();

	}

}
