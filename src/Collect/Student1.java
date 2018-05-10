package Collect;

public class Student1 {
	int rollno;
	String name,course;
	float fee;
	
	Student1(int rollno, String name, String course){
		this.rollno=rollno;
		this.name=name;
		this.course=course;
	}
	
	Student1(int rollno,String name, String course, float fee){
		this(rollno,name, course);
		this.fee=fee;
	}
	
	void display(){System.out.println(rollno+" "+name+" "+course+ " "+fee);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1=new Student1(111, "Nish","Java");
		Student1 s2=new Student1(222, "Rays","Cucumber",20000);
		s1.display();
		s2.display();

	}

}
