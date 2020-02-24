package chapter10;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<Item> itemList;
	private Product product;
	DecimalFormat dec = new DecimalFormat("0.00");

	public ShoppingCart() {
		itemList = new ArrayList<Item>();

	}

	public void add(Product product, int quantity) {
		itemList.add(new Item(product, quantity));
	}

	public void remove(Product product) {

		for (int i = 0; i < itemList.size(); i++) {
			String a = product.getProduct();
			String b = itemList.get(i).getProduct().getProduct();
			if (a.equals(b)) {
				itemList.remove(i);
			}
		}

	}

	public double getTotalPrice() {
		double total = 0;
		for (Item itemObject : itemList) {
			total += itemObject.getSubtotal();
		}
		return total;
	}

	public String toString() {
		String output = "";
		double total = 0;

		if (itemList.size() == 0) {
			output = "There are no items in the shopping cart.\n";
		} else {
			output = "=== Shopping cart ===\n";
			for (Item itemObject : itemList) {
				output += itemObject.getProduct().getproductId() + ":  " + itemObject.getProduct().getProduct()
						+ ", quantity:  " + itemObject.getQuantity() + ", unit price: "
						+ dec.format(itemObject.getProduct().getPrice()).replace('.', ',') + ", subtotal: " + dec.format(itemObject.getSubtotal()).replace('.', ',') + "\n";
			}
			for (Item itemObject : itemList) {
				total += itemObject.getSubtotal();
			}
			output += "TOTAL PRICE: " + dec.format(total) + " euros\n";
		}
		return output;
	}
}
