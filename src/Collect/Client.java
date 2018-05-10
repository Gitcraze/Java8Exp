package Collect;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class Client {
	public static void main(String[] args) {
		List<String> prevnameslist = new ArrayList<>(10);
		prevnameslist.add("ssd");
		prevnameslist.add("sdfs");
		ImmutableEmployee immutableEmployee = new ImmutableEmployee("Nishanth", "Mathew", prevnameslist);
		System.out.println(immutableEmployee);
		String firstName = immutableEmployee.getFirstName();
		firstName = firstName+"abc";
		immutableEmployee.getPreviousNames().add("changed");
		System.out.println(immutableEmployee);
		//IntStream.range(1, 5).forEach(i ->{ Sing});
		Stream.generate(SingletonExample::getInstance).limit(10).forEach(System.out::println);
	}
	class B extends ImmutableEmployee{

		public B(String firstName, String lastName, List<String> previousNames) {
			super(firstName, lastName, previousNames);
		}
		@Override
		public List<String> getPreviousNames() {
			return super.getPreviousNames();
		}
		
	}
}
