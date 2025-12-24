package com.imaginnovate.library2;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in=new Scanner(System.in);
			Boolean ok=true;
			while(ok) {
				 try{
		                int num = in.nextInt();
		                System.out.println("The Number is: " + num);
		                if(num==0) {
		                	ok=false;
		                }
		            } catch (Exception e) {
		                System.out.println("Invalid input! Please enter a number.");

		            }
			}
			in.close();
	}

}
