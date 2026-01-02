import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements in reverse order:");

        for (int i = 4; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
