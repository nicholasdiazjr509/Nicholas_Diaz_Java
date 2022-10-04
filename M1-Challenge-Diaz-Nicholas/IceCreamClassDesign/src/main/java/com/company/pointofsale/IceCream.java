package com.company.pointofsale;

public class IceCream {
    private String flavor;
    private int quantity;
    private double price;

    public IceCream(String flavor, int quantity, double price) {
        this.flavor = flavor;
        this.quantity = quantity;
        this.price = price;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
