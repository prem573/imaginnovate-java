import java.util.Random;

public class Nineteen {
    public static void main(String[] args) {

        int[] arr = new int[10];
        Random rand = new Random();
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = rand.nextInt(100) + 1;
            sum += arr[i];
        }

        double average = sum / 10.0;

        System.out.println("Array elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nAverage: " + average);

        System.out.println("Elements greater than average:");
        for (int num : arr) {
            if (num > average) {
                System.out.print(num + " ");
            }
        }
    }
}
