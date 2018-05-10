package basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Seclarg {

	static void secondLargest(int[] input) {
		int firstLargest, secondLargest;

		if (input[0] > input[1]) {
			firstLargest = input[0];
			secondLargest = input[1];
		} else {
			firstLargest = input[1];
			secondLargest = input[2];

		}

		for (int i = 2; i < input.length; i++) {
			if (input[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = input[i];
			} else if (input[i] < firstLargest && input[i] > secondLargest) {
				secondLargest = input[i];
			}
		}
		System.out.println("Input Array :");
		System.out.println(Arrays.toString(input));
		System.out.println("Second Largest Element :");
		System.out.println(secondLargest);

	}

	public static void main(String[] args) {
		secondLargest(new int[] {47350, 47351, 47355, 47356, 47365, 47777, 48000, 47778});
	}

}