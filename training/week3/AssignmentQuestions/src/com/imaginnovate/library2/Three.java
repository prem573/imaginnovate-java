package com.imaginnovate.library2;
import java.io.*;
import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int upperCount = 0;
	        int lowerCount = 0;
	        int digitCount = 0;
		System.out.println("Enter The File Name");
		Scanner in  = new Scanner(System.in);
		String Filename=in.nextLine();
		try(FileReader reader = new FileReader(Filename)){
//			System.out.println("File exists.");
			int m;
			while((m=reader.read())!=-1) {
				if (Character.isUpperCase(m)) {
                    upperCount++;
                } else if (Character.isLowerCase(m)) {
                    lowerCount++;
                } else if (Character.isDigit(m)) {
                    digitCount++;
                }
			}
			 System.out.println("Uppercase letters: " + upperCount);
	            System.out.println("Lowercase letters: " + lowerCount);
	            System.out.println("Digits: " + digitCount);
			
		}
		catch(FileNotFoundException nm) {
			System.out.println("File doesnt Exist");
		}
		catch(Exception mf) {
			
		}
	}

}
