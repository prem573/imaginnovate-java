package com.imaginnovate.library2;
import java.util.*;
public class Ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet<Circle> set = new HashSet<>();
//			TreeSet<Circle> set = new TreeSet<>();
		 set.add(new Circle(1, 2, 5));
	        set.add(new Circle(1, 2, 5)); // duplicate data
	        set.add(new Circle(3, 4, 6));

	        System.out.println("HashSet contents:");
	        for (Circle c : set) {
	            System.out.println(c);
	        }
	}

}

class Circle{
	int x;
    int y;
    int radius;

    Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "Circle[x=" + x + ", y=" + y + ", r=" + radius + "]";
    }
}