import java.util.Scanner;
import java.util.Random;

public class Eighteen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(25) + 1; 
        int guess;

        System.out.println("Guess the number (1 to 25). You have 3 attempts.");

        for (int i = 1; i <= 3; i++) {
            System.out.print("Attempt " + i + ": ");
            guess = sc.nextInt();

            if (guess == number) {
                System.out.println("🎉 Correct! You guessed the number.");
                return;
            } else if (guess < number) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }

        System.out.println("❌ Sorry! The correct number was: " + number);
    }
}
