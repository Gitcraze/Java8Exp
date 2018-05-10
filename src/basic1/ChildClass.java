package basic1;

public class ChildClass extends SuperClass{
	
	public ChildClass(String str){
		
		super();
		
		test();
		
		super.test();
	}
	
	@Override
	public void test(){
		System.out.println("Child class test method");
	}

	public static void main(String[] args) {

		ChildClass ch = new ChildClass("str");
		
	}

}
