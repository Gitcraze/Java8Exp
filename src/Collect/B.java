package Collect;

import java.util.ArrayList;
import java.util.Iterator;

public class B extends A {
	public void m() {
		System.out.println("hello ray");
	}

	public void n() {
		super.m();
	}
	


	public static void main(String[] args) {
		B b = new B();
		b.n();
		b.m();
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("is rayson");
		arr.add("My");
		arr.add("name");
		arr.add("is Rayson");
		System.out.println(arr);
		b.data(arr);
		Iterator itr = arr.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}

	}

}
