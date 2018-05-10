package basic;

import java.util.Scanner;

public class Simple {

	public static void main(String[] args) {

		int marks;
		System.out.println("Please enter your marks:");
		Scanner scanner = new Scanner(System.in);
		marks = scanner.nextInt();

		if (marks > 40)
			System.out.println("PASS");
		else if (marks < 40)
			System.out.println("FAIL");
		else if (marks >= 40 || marks < 60)
			System.out.println("SECOND CLASS");

	}

}
