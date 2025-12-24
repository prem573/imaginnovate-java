import java.util.ArrayList;

public class Two {
    public static void main(String[] args) {

        // Create ArrayList of Products
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(101, "Laptop", 55000));
        products.add(new Product(102, "Mobile", 20000));
        products.add(new Product(103, "Tablet", 30000));

        // Sort by Product Name using Lambda
        products.sort((p1, p2) -> p1.name.compareTo(p2.name));
        System.out.println("Sorted by Product Name:");
        for (Product p : products) {
            System.out.println(p);
        }

        // Sort by Product Price using Lambda
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("\nSorted by Product Price:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return id + " " + name + " " + price;
    }
}

// class ProductNameComparator implements Comparator<Product> {

//     public int compare(Product p1, Product p2) {
//         return p1.name.compareTo(p2.name);
//     }
// }


// class ProductPriceComparator implements Comparator<Product> {

//     public int compare(Product p1, Product p2) {
//         return Double.compare(p1.price, p2.price);
//     }
// }

