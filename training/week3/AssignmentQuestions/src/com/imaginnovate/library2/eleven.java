package com.imaginnovate.library2;
import java.util.*;
public class eleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<String> lengthComparator = (s1, s2) -> {
            int diff = s1.length() - s2.length();
            // If lengths are equal, sort alphabetically
            return diff != 0 ? diff : s1.compareTo(s2);
        };

        TreeSet<String> set = new TreeSet<>(lengthComparator);

        set.add("Java");
        set.add("Python");
        
        set.add("C");set.add("C");
        set.add("JavaScript");
        set.add("Go");
        set.add("Rust");

        System.out.println("Strings sorted by length:");
        set.forEach(System.out::println);
	}

}
