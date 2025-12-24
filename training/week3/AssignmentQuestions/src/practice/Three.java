package practice;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers:");

        int count = 0;

        while (count < 3) {
            try{
                int num = sc.nextInt();
                System.out.println("The Number is: " + num);
                count++; 
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); 
            }
        }

        sc.close();
    }
}
