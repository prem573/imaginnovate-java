import java.util.Scanner;

public class LargestOfTen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int max, num;

        System.out.println("Enter 10 numbers:");

        // Read first number and assume it is the largest
        max = sc.nextInt();

        // Read remaining 9 numbers
        for (int i = 2; i <= 10; i++) {
            num = sc.nextInt();

            if (num > max) {
                max = num;
            }
        }

        System.out.println("Largest number is: " + max);
        sc.close();
    }
}
