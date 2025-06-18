package entities;

public class OrderItem {

	private Integer quantity;
	private Double price;
	private Product prod;
	
	public OrderItem() {}
	public OrderItem(Integer quantity, Product prod) {
		this.quantity = quantity;
	    this.prod = prod;
	    this.price = prod.getPrice();
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
	
	public Product getProduct() {
		return prod;
	}
	
	public String toString() {
		return prod.getName() 
				+ ", Quantity: " 
				+ quantity
				+ ", Subtotal:" 
				+ subTotal(); 
	}
}
