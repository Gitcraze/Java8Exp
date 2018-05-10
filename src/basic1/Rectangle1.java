package basic1;

public class Rectangle1 {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(), r2 = new Rectangle();
//		Rectangle r2 = new Rectangle();
		
		r1.insert(10, 20);
		r2.insert(30, 40);
		
		r1.calculateArea();
		r2.calculateArea();


	}

}
