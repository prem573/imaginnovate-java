import java.util.Scanner;

public class Nine {

    public static int findLargest(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        int largest = findLargest(numbers);
        System.out.println("Largest number is: " + largest);
    }
}
