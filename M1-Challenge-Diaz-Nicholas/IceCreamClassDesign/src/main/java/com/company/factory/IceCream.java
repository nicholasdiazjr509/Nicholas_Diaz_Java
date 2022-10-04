package com.company.factory;

public class IceCream {
    private String flavor;
    private int productionTime;
    private String[] ingredients;
    private double productionCost;
    private double salePrice;

    public IceCream(String flavor, String[] ingredients, double productionCost, double salePrice) {
        this.flavor = flavor;
        this.ingredients = ingredients;
        this.productionCost = productionCost;
        this.salePrice = salePrice;
    }
    public void shipToIceCreamStore(){
        System.out.println("Shipment to ice cream store location.");
    }
    public void iceCreamInBulk(){
        System.out.println("Made in " + getFlavor() + " in bulk for store sale.");
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(int productionTime) {
        this.productionTime = productionTime;
    }


    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }
}
