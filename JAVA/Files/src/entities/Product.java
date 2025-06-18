package entities;

public class Product {

	private Double price;
	private String name;
	private Integer quantity;
	
	public Product(Double price, String name, Integer quantity) {
		this.price = price;
		this.name = name;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}
	
	public Double subTotal() {
		return price * quantity;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(name)
			.append(",")
			.append(subTotal());
		
		return sb.toString();
	}
	
}
