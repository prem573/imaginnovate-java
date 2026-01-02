import java.util.Scanner;

public class TwentyFive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String result = "";

        System.out.println("Enter names (type END to stop):");

        while (true) {
            String name = sc.nextLine();

            if (name.equalsIgnoreCase("END")) {
                break;
            }

            if (!result.isEmpty()) {
                result += "-";
            }

            result += name;
        }

        System.out.println("Output:");
        System.out.println(result);
    }
}
