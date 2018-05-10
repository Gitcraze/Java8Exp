package basic;

public class Calc {
	static int salary=1000;
	
	Calc(int age, String name)
	{
		System.out.println("The record is: "+name+" "+salary+ " "+age);
	}
	
	static int cube(int x)
	{
		return x*x*x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = Calc.cube(5);
		System.out.println("Cube result for "+"is "+result);
		Calc calc1= new Calc(25,"Dave");
		Calc calc2= new Calc(30,"Kate");

	}

}
