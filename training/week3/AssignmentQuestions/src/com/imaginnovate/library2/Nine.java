package com.imaginnovate.library2;
import java.io.*;
import java.util.*;
public class Nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Set<String> names = new TreeSet<>();
		try (BufferedReader br = new BufferedReader(new FileReader("one.txt"))) {
            br.lines().map(String::trim).filter(s -> !s.isEmpty()).forEach(names::add);
        }
		catch(Exception E) {
			System.out.println(E.getMessage());
		}

        try (BufferedReader br = new BufferedReader(new FileReader("two.txt"))) {
            br.lines().map(String::trim).filter(s -> !s.isEmpty()).forEach(names::add);
        }
        catch(Exception E3) {
			System.out.println(E3.getMessage());
		}


        names.forEach(System.out::println);
	}

}
