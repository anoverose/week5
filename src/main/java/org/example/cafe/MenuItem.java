package org.example.cafe;
public class MenuItem {
    private String name;
    private double price;
    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void serve() {
    }
    class Price {
        public void showPrice() {
            System.out.println(name + " costs " + (int) price);
        }
    }
}