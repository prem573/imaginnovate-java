class Product {

    int prod_id;
    String prod_name;
    double price;
    int quantity_on_hand;

    // Default 
    Product() {
        this.prod_id = 0;
        this.prod_name = "Unknown";
        this.price = 0.0;
        this.quantity_on_hand = 0;
    }

    Product(int id, String name) {
        this.prod_id = id;
        this.prod_name = name;
        this.price = 0.0;
        this.quantity_on_hand = 0;
    }

    Product(int id, String name, double price) {
        this.prod_id = id;
        this.prod_name = name;
        this.price = price;
        this.quantity_on_hand = 0;
    }

    Product(int id, String name, double price, int qty) {
        this.prod_id = id;
        this.prod_name = name;
        this.price = price;
        this.quantity_on_hand = qty;
    }

    double getNetPrice() {
        return price + (price * 0.12);
    }

    void purchase(int qty) {
        quantity_on_hand += qty;
    }

    void sell(int qty) {
        if (qty <= quantity_on_hand)
            quantity_on_hand -= qty;
        else
            System.out.println("Not enough stock!");
    }

    void display() {
        System.out.println("ID: " + prod_id);
        System.out.println("Name: " + prod_name);
        System.out.println("Price: " + price);
        System.out.println("Net Price: " + getNetPrice());
        System.out.println("Quantity: " + quantity_on_hand);
        System.out.println("-------------------------");
    }
}

public class Thirteen {
    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product(101, "Pen");
        Product p3 = new Product(102, "Notebook", 50);
        Product p4 = new Product(103, "Laptop", 50000, 5);

        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }
}
