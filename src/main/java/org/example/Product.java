package org.example;

public class Product {
    double cost;
    int qty;
    String product;

    public Product(double cost, int qty, String product) {
        this.cost = cost;
        this.qty = qty;
        this.product = product;
    }

    public void totalCost() {
        double ttlcost = cost * qty;
        System.out.println("Total Cost is $" + ttlcost);
    }

    public void printProduct() {
        System.out.println(this.product + " costs $" + this.cost + " and " + this.qty + " units were purchased");
    }
}
