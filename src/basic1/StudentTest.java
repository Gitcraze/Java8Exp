package basic1;

class Stud{
	int rollno;
	String name;
	float fee;
	
	Stud(int rollno, String name, float fee){
		this.rollno=rollno;
		this.name = name;
		this.fee = fee;
			}
	void display(){
		System.out.println(rollno+""+name+""+fee);
	}
	
}




public class StudentTest {

	public static void main(String[] args) {
		Stud s1 = new Stud(100,"Rays", 4000f);
		Stud s2 = new Stud(200,"Toms", 3000f);
		s1.display();
		s2.display();

	}

}
