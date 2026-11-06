package Praktikum4;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
		
		ArrayList<Integer>age= new ArrayList<Integer>();
		age.add(10);
		age.add(11);
		age.add(12);
		age.add(13);
		age.add(14);
		System.out.println(age);
		
		age.set(1, 100);
		System.out.println(age);
		age.remove(3);
		System.out.println(age);
		age.clear();
	}
}