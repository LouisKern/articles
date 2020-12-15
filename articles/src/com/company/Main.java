package com.company;

public class Main {

    public static void main(String[] args) {

    	//avancement: Exercice 2.4

		Item CornFlakes = new Item("Corn Flakes",500, 1000);
		Item ChewingGum = new Item("ChewingGum",403, 500);
		Item Water = new Item("Water",120, 800);
		ShoppingCart cart = new ShoppingCart();
		ShoppingCart cart2 = new ShoppingCart();
		ShoppingCart cart3 = new ShoppingCart();
		cart.addItem(CornFlakes);
		cart.addItem(ChewingGum);
		cart.addItem(Water);
		System.out.println(cart.getId());
		System.out.println(cart2.getId());
		System.out.println(cart3.getId());

    	/**
    	ShoppingCart cart = new ShoppingCart();
    	Item item = new Item("Corn Flakes",500);
    	cart.addItem(item);
    	cart.removeItem(item);
    	System.out.println(cart.itemCount());
		 **/
    }
}
