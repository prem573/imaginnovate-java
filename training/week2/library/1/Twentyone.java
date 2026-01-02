import java.util.Scanner;

public class Twentyone {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks separated by commas: ");
        String input = sc.nextLine();

        String[] marks = input.split(",");
        int total = 0;

        for (String m : marks) {
            total += Integer.parseInt(m.trim());
        }

        System.out.println("Total Marks = " + total);
    }
}
