package chapter10;

public class Item {
	private Product product;
	private int quantity;
	
	public Item(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getSubtotal() {
		return quantity * product.getPrice();
	}
	
	
}
