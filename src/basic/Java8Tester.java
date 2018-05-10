package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Tester {

	public static void main(String[] args) {

		List<String> names1 = new ArrayList<String>();
		names1.add("Rays");
		names1.add("Toms");
		names1.add("Alice");
		names1.add("Reena");

		List<String> names2 = new ArrayList<String>();
		names2.add("Rays1");
		names2.add("Toms1");
		names2.add("Alice1");
		names2.add("Reena1");

		Java8Tester tester = new Java8Tester();
		
		System.out.println("Sort using Java 7 syntax");
		tester.sortUsingJava7(names1);
		System.out.println(names1);
		
		System.out.println("Sort using Java 8 syntax");
		tester.sortUsingJava8(names2);
		System.out.println(names2);
	}
	
	//Sort using java 7
	private void sortUsingJava7(List<String> names) {
		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				return s1.compareTo(s2);
			}

		});
	}
	
	//Sort using java 8
	private void sortUsingJava8(List<String> names){
		
		List<String> sortedList = names.stream().sorted().collect(Collectors.toList());
		Function<String,String> syso =  String::toUpperCase;
		
		
		Optional<String> highest = sortedList.stream().map((s) -> s.toUpperCase()).max((s1, s2) -> s1.compareTo(s2));
		highest.ifPresent(System.out::println);
		//Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	}
}
