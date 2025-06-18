package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {

	private LocalDate manufactureDate;
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	public UsedProduct() {super();}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag () {
		StringBuilder sb = new StringBuilder();
		
		sb.append(getName())
			.append(" (used) $ ")
			.append(String.format("%.2f", getPrice()))
			.append(" (Manufacture date: ")
			.append(manufactureDate.format(fmt))
			.append(")");
		
		return sb.toString();
	}
	
}
