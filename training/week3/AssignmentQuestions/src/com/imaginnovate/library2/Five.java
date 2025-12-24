package com.imaginnovate.library2;
import java.io.*;
public class Five {

	 public static void main(String[] args) {

	        try (BufferedReader br = new BufferedReader(new FileReader("Marks.txt"))) {

	            String line;
	            int lineNumber = 1;

	            while ((line = br.readLine()) != null) {

	                String[] marks = line.split(",");
	                int total = 0;

	                for (String mark : marks) {
	                    try {
	                        total += Integer.parseInt(mark.trim());
	                    } catch (NumberFormatException e) {
	                        // Fault tolerance: ignore invalid marks
	                        System.out.println(
	                            "Invalid mark ignored in line " + lineNumber + ": " + mark
	                        );
	                    }
	                }

	                System.out.println("Total marks of line " + lineNumber + " = " + total);
	                lineNumber++;
	            }

	        } catch (IOException e) {
	            System.out.println("File error: " + e.getMessage());
	        }
	    }

}
