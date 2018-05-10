package basic;

import java.util.Scanner;

public class radius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius = 0;
		Scanner read = new Scanner(System.in);
		System.out.println("Please enter radius");
		
		radius = read.nextInt();
		
		double perimeter = 2*Math.PI*radius;
		System.out.println("Perimeter of the circle="+perimeter);
	}

}
