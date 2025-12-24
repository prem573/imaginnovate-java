package com.imaginnovate.library2;

import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Seven {

//	private static final Function String = null;

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter filename: ");
        String file = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            br
            .lines()
//            .map(String::toUpperCase)
            .map(s->s.toUpperCase())
            .forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        sc.close();
    }

}
