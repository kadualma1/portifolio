package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		List<Product> prods = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (type == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				prods.add(new ImportedProduct(name, price, customsFee));
			} else if (type == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				sc.nextLine();
				String date = sc.nextLine();
				LocalDate manufactureDate = LocalDate.parse(date, fmt);
				prods.add(new UsedProduct(name, price, manufactureDate));
			} else {
				prods.add(new Product(name, price));
			}

		}

		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (Product prod : prods) {
			System.out.println(prod.priceTag());
		}

		sc.close();

	}

}
