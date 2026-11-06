package arraylist2;

import java.util.ArrayList;
import java.util.Arrays;

public class Praktikum5 {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> x= new ArrayList<ArrayList<Integer>>();
		
		x.add(new ArrayList<Integer>());
		
		x.get(0).add(0,3);
		
		x.add(new ArrayList<Integer>(Arrays.asList(3,4,5)));
		
		x.get(1).add(0,1);
		
		x.add(new ArrayList<Integer>(Arrays.asList(3,87)));
		
		x.get(1).remove(0);
		
		System.out.println(x.get(2).get(0));
	}
}
