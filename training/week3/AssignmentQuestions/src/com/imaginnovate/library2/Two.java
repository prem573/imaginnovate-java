package com.imaginnovate.library2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Two {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try (FileWriter writer = new FileWriter("names.txt")) {

            System.out.println("Enter names (type END to stop):");

            while (true) {
                String name = in.nextLine();

                if (name.equalsIgnoreCase("END")) {
                    break;
                }

                writer.write(name + "\n");
            }

            System.out.println("Names successfully written to names.txt");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        in.close();
    }
}
