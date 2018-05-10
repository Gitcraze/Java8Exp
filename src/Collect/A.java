package Collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class A {

	public void m() {
		System.out.println("hello m");
	}

	private void n() {
		System.out.println("hello n");
		this.m();
	}

	public void data(ArrayList<String> lst) {
//		Predicate<String> checkStringPresent = new Predicate<String>() {
//			@Override
//			public boolean test(String value) {
//				return "My".equalsIgnoreCase(value);
//			}
//
//		};
		Function<String, Boolean> fun = "My"::equalsIgnoreCase;
		
		Predicate<String> checkStringPresent = "My"::equalsIgnoreCase;//value -> value.equalsIgnoreCase("My");
		
		
		String finalString = lst.stream().collect(Collectors.joining(","));
		
		String str = lst.stream().filter(value -> value.equalsIgnoreCase("is Rayson")).collect(Collectors.joining(" £££££"));
		
		
		StringBuilder strBuilder = new StringBuilder();
		for (String vals : lst) {
			strBuilder.append(vals).append(",");
		}
		System.out.println(strBuilder.toString());
		System.out.println(str);
		
		

	}

	public static void main(String[] args) {
		A a = new A();
		a.n();

	}

}
