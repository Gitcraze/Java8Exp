package basic1;

public class TestPoly {

	public static void main(String[] args) {
		Shape s;
		s = new Rectangles();
		s.draw();
		
		s = new Circle();
		s.draw();
		
		s = new Triangle();
		s.draw();
	}

}
