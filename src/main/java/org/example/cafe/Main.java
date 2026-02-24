package org.example.cafe;
public class Main {
        static void main() {
            MenuItem coffee = new Coffee("Espresso", 50.0);
            MenuItem snack = new Snack("Croissant", 250.0);

            coffee.serve();
            snack.serve();

            MenuItem.Price priceInfo1 = coffee.new Price();
            MenuItem.Price priceInfo2 = snack.new Price();

            priceInfo1.showPrice();
            priceInfo2.showPrice();

            double total = coffee.getPrice() + snack.getPrice();
            System.out.println("Total: " + (int) total);
        }
    }