package Jan18;

class Student{
	private String name;
	
	String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
}



public class Test {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.setName("Rays");
		System.out.println(stu.getName());

	}

}
