package basic;

public class ByMeth {
	
	void myName(String name)
	{
		System.out.println("My name is "+name);
	}
	void myId(int id)
	{
		System.out.println("My id is "+id);
	}

	public static void main(String[] args) {
		
		ByMeth b1 = new ByMeth();
		ByMeth b2 = new ByMeth();
		
		b1.myName("Rayson");
		b1.myId(007);
		
		b2.myName("Thomas");
		b2.myId(700);
	}

}
