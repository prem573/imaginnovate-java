public class Eleven {

    public static void main(String[] args) {

        int num;
        int length;

        if (args.length == 0) {
            System.out.println("Please provide at least one argument.");
            return;
        }

        num = Integer.parseInt(args[0]);

        if (args.length >= 2) {
            length = Integer.parseInt(args[1]);
        } else {
            length = num;  // default value
        }

        System.out.println("Number: " + num);
        System.out.println("Length: " + length);

        System.out.println("Output:");
        for (int i = 1; i <= length; i++) {
            System.out.print(num + " ");
        }
    }
}
