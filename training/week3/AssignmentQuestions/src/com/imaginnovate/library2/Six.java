package com.imaginnovate.library2;
import java.io.*;
public class Six {

	 public static void main(String[] args) {
//	        File file = new File();

	        
	        try (BufferedReader br = new BufferedReader(new FileReader("Marks.txt"))) {
	            String line;
	            System.out.println("Reading file:");
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            System.out.println("Error while reading file");
	        }

	        // 2️⃣ APPEND to the file
	        try (FileWriter fw = new FileWriter("Marks.txt", true)) { 
	            fw.write("\n20");
	            System.out.println("\nData appended successfully.");
	        } catch (IOException e) {
	            System.out.println("Error while appending file");
	        }
	    }

}
