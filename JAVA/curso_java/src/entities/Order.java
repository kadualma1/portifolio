package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	private DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDateTime moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> order = new ArrayList<>();
	
	public Order() {}

	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrder() {
		return order;
	}
	
	public void addItem (OrderItem item) {
		order.add(item);
	}
	
	public void removeItem (OrderItem item) {
		order.remove(item);
	}
	
	public Double total () {
		Double total = 0.0;
		
		for (OrderItem ord : order) {
			total += ord.subTotal();
		}
		
		return total;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Order moment: ").append(moment.format(fmt)).append("\n");
		sb.append("Order status: ").append(status).append("\n");
		sb.append("Client: ").append(client.getName());
		sb.append("(").append(client.getBirthDate().format(fmt2)).append(") - ");
		sb.append(client.getEmail()).append("\n");
		
		sb.append("Order items: \n");
		for (OrderItem item : order) {
			sb.append(item.getProduct().getName())
				.append("$").append(String.format("%.2f", item.getProduct().getPrice()));
			sb.append(", Quantity: ").append(item.getQuantity())
				.append(", Subtotal: $").append(String.format("%.2f", item.subTotal()))
				.append("\n");
		}
		sb.append("Total price: $").append(String.format("%.2f", total()));
		
		return sb.toString();
	}
	
}
