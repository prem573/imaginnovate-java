package com.imaginnovate.library2;

//import java.util.Scanner;
import java.io.*;
public class Eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter filename: ");
//        String file = sc.nextLine();
        
        try(BufferedReader kl = new BufferedReader(new FileReader("names.txt"))){
        	String name;
        	kl.lines().distinct().sorted().forEach(System.out::println);
        	
        }catch(Exception E) {
        	System.out.println(E.getMessage());
        }
	}

}
