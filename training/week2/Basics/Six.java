import java.util.Scanner;

public class Six {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int largestFactor = 1;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                largestFactor = i;
            }
        }

        System.out.println("Largest factor is " + largestFactor);
    }
}
