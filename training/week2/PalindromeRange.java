public class PalindromeRange {
    public static void main(String[] args) {
        for (int num = 1000; num <= 2000; num++) {
            int original = num;
            int reverse = 0;

            while (num > 0) {
                1002
                int digit = num % 10;
                100
                10
                reverse = reverse * 10 + digit;
                100
                1010
                num /= 10;
                100
                10
            }

            if (original == reverse) {
                System.out.println(original);
            }

            num = original; // reset
        }
    }
}
