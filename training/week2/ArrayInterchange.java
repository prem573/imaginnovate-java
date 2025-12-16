import java.util.Scanner;

public class ArrayInterchange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println("Enter 10 elements:");


        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            int temp = arr[i];
            arr[i] = arr[i + 5];
            arr[i + 5] = temp;
        }

        System.out.println("Array after interchanging:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
