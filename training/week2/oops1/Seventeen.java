class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    double getNetPrice() {
        return price;
    }

    void print() {
        System.out.println(name + " : " + getNetPrice());
    }
}

class ImportedProduct extends Product {
    double duty;

    ImportedProduct(String name, double price, double duty) {
        super(name, price);
        this.duty = duty;
    }

    double getNetPrice() {
        return price + duty;
    }
}

class DiscountedProduct extends Product {
    double discount;

    DiscountedProduct(String name, double price, double discount) {
        super(name, price);
        this.discount = discount;
    }

    double getNetPrice() {
        return price - (price * discount / 100);
    }
}

public class Seventeen {
    public static void main(String[] args) {

        Product p1 = new ImportedProduct("Laptop", 50000, 5000);
        Product p2 = new DiscountedProduct("Mobile", 30000, 10);

        p1.print();
        p2.print();
    }
}
