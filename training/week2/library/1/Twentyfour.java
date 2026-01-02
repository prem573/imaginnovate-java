public class Twentyfour {

    static class Product {
        int id;
        String name;
        double price;

        Product(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        @Override
        public boolean equals(Object obj) {
            Product p = (Product) obj;
            return id == p.id && name.equals(p.name) && price == p.price;
        }

        @Override
        public int hashCode() {
            return id + name.hashCode() + (int) price;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Name: " + name + ", Price: " + price;
        }
    }

    public static void main(String[] args) {

        Product p1 = new Product(101, "Pen", 10);
        Product p2 = new Product(101, "Pen", 10);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("?" + p1.equals(p2));
    }
}
