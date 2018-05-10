package Collect;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Let us C");
		map.put(102, "Operating System");
		map.put(103, "Data Comm and N/W");

		System.out.println("Values before removal: " + map);

		map.remove(102);

		System.out.println("Values after removal: " + map);

	}

}
