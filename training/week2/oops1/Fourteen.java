class Counter {

    private int count;

    // Default 
    Counter() {
        count = 0;
    }

    Counter(int value) {
        count = value;
    }

    void increment() {
        count++;
    }

    void decrement() {
        count--;
    }

    int getCount() {
        return count;
    }
}

public class Fourteen {
    public static void main(String[] args) {

        Counter c1 = new Counter();
        System.out.println("Initial count (default): " + c1.getCount());

        c1.increment();
        c1.increment();
        System.out.println("After increment: " + c1.getCount());

        c1.decrement();
        System.out.println("After decrement: " + c1.getCount());

        Counter c2 = new Counter(10);
        System.out.println("Initial count (parameterized): " + c2.getCount());
    }
}
