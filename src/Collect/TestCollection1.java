package Collect;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TestCollection1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("hey");
		al.add("there");
		al.add("how");
		al.add("hey");

		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("are");
		al1.add("you");

		java.util.Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		java.util.Iterator<String> itr1 = al1.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		System.out.println("*****************************************");

		al.addAll(al1);
		java.util.Iterator<String> itr2 = al.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("*****************************************");
		al.removeAll(al1);
		java.util.Iterator<String> itr3 = al.iterator();
		while (itr3.hasNext()) {
			System.out.println(itr3.next());
		}

	}

}
