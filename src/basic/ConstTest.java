package basic;

public class ConstTest {
	
	private String ray;
	public String tom;
	
	void setName(String name)
	{
		ray = name;
		System.out.println("The name is "+ ray);
	}
	private String printName()
	{
		return ray;
		
	}
	
	public ConstTest(int a, int b) {
		int c;
		c = a+b;
		System.out.println("The sum is c, which is "+ c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstTest test = new ConstTest(10, 20);
//		
//		test.setName("Rayson");
//		test.printName();
	
		test.tom = "I am good";
		test.ray="Nope";
	}

}
