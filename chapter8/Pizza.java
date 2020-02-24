package chapter8;

import java.text.DecimalFormat;

public class Pizza {
	private String name;
	private double price;
	
	DecimalFormat dec = new DecimalFormat("0.00");
	
	public Pizza(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return name + " (" + dec.format(price) + " euros)";
	};

}


