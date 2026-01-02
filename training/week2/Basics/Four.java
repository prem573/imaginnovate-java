import java.util.Scanner;

public class Four {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day (1 to 7): ");
        int day = sc.nextInt();

        System.out.print("Enter hours worked: ");
        int hours = sc.nextInt();

        int rate = switch (day) {
            case 1, 2, 3 -> 200;
            case 4, 5 -> 400;
            case 6 -> 600;
            case 7 -> 800;
            default -> 0;
        };

        int total = rate * hours;

        if (total > 2000) {
            total += total * 0.10;
        }

        System.out.println("Total " + total);
    }
}
