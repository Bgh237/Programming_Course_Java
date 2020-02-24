package chapter10;

public class Product {
	private String product;
	private int productId;
	private double price;
	
	public Product (int productId, String product, double price) {
		this.product = product;
		this.productId = productId;
		this.price = price;
	}
	
	public String getProduct() {
		return product;
	}
	
	public  int getproductId() {
		return productId;
	}
	
	public double getPrice() {
		return price;
	}
	
}
