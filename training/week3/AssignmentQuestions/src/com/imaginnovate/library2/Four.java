package com.imaginnovate.library2;
import java.io.*;
import java.util.Scanner;

public class Four {

	 public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter filename: ");
        String filename = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            String line;
            System.out.println("\nLines with more than 5 characters:");

            while ((line = br.readLine()) != null) {
                if (line.length() > 5) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}
