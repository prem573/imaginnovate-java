import java.util.Scanner;

public class TwentyTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Positions of spaces:");

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                System.out.println("Space at position: " + i);
            }
        }
    }
}
