import java.util.Scanner;

class Product {

    int prod_id;
    String prod_name;
    double price;
    int quantity_on_hand;

    void init(int id, String name, double price) {
        this.prod_id = id;
        this.prod_name = name;
        this.price = price;
        this.quantity_on_hand = 0;
    }

    double getNetPrice() {
        return price + (price * 0.12);
    }

    void purchase(int qty) {
        quantity_on_hand += qty;
        System.out.println(qty + " items purchased.");
    }

    void sell(int qty) {
        if (qty <= quantity_on_hand) {
            quantity_on_hand -= qty;
            System.out.println(qty + " items sold.");
        } else {
            System.out.println("Not enough stock available!");
        }
    }

    void display() {
        System.out.println("Product ID: " + prod_id);
        System.out.println("Product Name: " + prod_name);
        System.out.println("Price: " + price);
        System.out.println("Net Price (with 12% tax): " + getNetPrice());
        System.out.println("Quantity Available: " + quantity_on_hand);
    }
}

public class Twelve {
    public static void main(String[] args) {

        Product p = new Product();
        p.init(101, "Laptop", 50000);

        p.purchase(10);
        p.sell(3);

        p.display();
    }
}
