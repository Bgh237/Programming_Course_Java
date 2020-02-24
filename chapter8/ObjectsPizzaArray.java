package chapter8;

import java.util.ArrayList;

public class ObjectsPizzaArray {

	public static void main(String[] args) {
		
		Pizza firstPizza = new Pizza("Diavolo", 8.75);
		Pizza secondPizza = new Pizza("Frutti al Mare", 9.00);
		Pizza thirdPizza = new Pizza("Alla Pollo", 7.50);
		
		ArrayList<Pizza> pizzaList = new ArrayList<Pizza>();
		
		pizzaList.add(firstPizza);
		pizzaList.add(secondPizza);
		pizzaList.add(thirdPizza);
		
		for (Pizza pizzaObject : pizzaList) {
			System.out.println(pizzaObject.toString());
			}

	}

}
