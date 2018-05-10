package Collect;

import java.util.ArrayList;

public class ListExample {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Amit");
		al.add("Vijay");
		al.add("Rays");
		al.add(2,"Toms");
		
		System.out.println("Element at 3rd position: "+al.get(3));
		for(String s:al)
		{
			System.out.println(s);
		}
		

	}

}
