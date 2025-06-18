package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		String path = "c:\\temp\\in.csv";
		List<Product> prodList = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] list = line.split(",");
				String name = list[0].trim();
				Double price = Double.parseDouble(list[1].trim());
				Integer quantity = Integer.parseInt(list[2].trim());

				Product prod = new Product(price, name, quantity);
				prodList.add(prod);
				line = br.readLine();
			}
		} catch (IOException err) {
			System.out.println("Error reading product: " + err.getLocalizedMessage());
		} catch (NumberFormatException err) {
			System.out.println("Error on number format: " + err.getLocalizedMessage());
		}

		File strPath = new File(path);
		File outDir =  new File(strPath.getParent() + "\\out");
		boolean success = outDir.mkdir();
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(outDir + "\\summary.csv"))) {
			for (Product prod : prodList) {
				bw.write(prod.toString());
				bw.newLine();
			}
		} catch (IOException err) {
			System.out.println("Error writing file: " + err.getLocalizedMessage());
		}

	}

}
