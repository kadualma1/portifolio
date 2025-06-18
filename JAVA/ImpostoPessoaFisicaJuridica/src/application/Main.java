package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número de contribuintes: ");
		int n = sc.nextInt();

		List<Contribuinte> conts = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Contribuinte #" + i + ": ");
			System.out.print("Pessoa física ou jurídica (f/j)? ");
			char c = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			Double rendaAnual = sc.nextDouble();
			if (c == 'j') {
				System.out.print("Número de funcionários: ");
				Integer funcionarios = sc.nextInt();
				conts.add(new PessoaJuridica(nome, rendaAnual, funcionarios));
			} else {
				System.out.print("Despesas com saúde: ");
				Double gastosSaude = sc.nextDouble();
				conts.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			}
		}
		
		System.out.println();
		System.out.println("IMPOSTOS PAGOS:");
		Double valorTotal = 0.0;
		for (Contribuinte cont : conts) {
			System.out.printf("%s: R$ %.2f%n", cont.getNome(), cont.calcularImposto());
			valorTotal += cont.calcularImposto();
		}

		System.out.println();
		System.out.printf("IMPOSTOS TOTAIS: $ %.2f", valorTotal);

		sc.close();

	}

}
