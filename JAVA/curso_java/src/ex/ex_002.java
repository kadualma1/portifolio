package ex;
import java.util.Scanner;

public class ex_002 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x, y, soma;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		soma = x + y;
		
		System.out.printf("SOMA = %d", soma);

		sc.close();
	}

}
