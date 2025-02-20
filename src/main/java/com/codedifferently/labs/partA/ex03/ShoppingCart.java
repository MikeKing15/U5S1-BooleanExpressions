package com.codedifferently.labs.partA.ex03;

public class ShoppingCart {
    public static String shopping() {
        String response = "";
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

        // Numeric fields
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
        double total;
        String message = custName + " wants to purchase " + quantity + " " + itemDesc;

        total = (price * quantity) * tax;

        boolean outOfStock = false;

        if (quantity > 1) {
            message = custName + " wants to purchase " + quantity + " " + itemDesc + "s";
        }

        if (outOfStock) {
            response = "Sorry, the item is out of stock.";
        } else {
            response = message + "\nTotal cost with tax: " + total;
        }

        return response;
    }

    public static void main(String[] args) {
        String shopOutput = shopping();
        System.out.println(shopOutput);
    }
}
