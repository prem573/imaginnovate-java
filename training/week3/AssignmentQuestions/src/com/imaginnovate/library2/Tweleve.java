package com.imaginnovate.library2;
import java.util.*;
import java.util.regex.Pattern;
public class Tweleve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String panRegex = "[A-Z]{5}[0-9]{4}[A-Z]";
		String pan="ABCDE1234F";
        if (Pattern.matches(panRegex, pan)) {
            System.out.println("Valid PAN number");
        } else {
            System.out.println("Invalid PAN number");
        }

	}

}
