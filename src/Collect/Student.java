package Collect;

import java.util.ArrayList;
import java.util.Iterator;

class Stud {

	int rollno;
	String name;
	int age;

	Stud(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

}


public class Student{
	public static void main(String args[]){
		Stud s1= new Stud(101,"Raysoo", 37);
		Stud s2= new Stud(102,"Bochoo", 6);
		Stud s3= new Stud(103,"Gachee", 1);
		
		ArrayList<Stud> st = new ArrayList<Stud>();
		st.add(s1);
		st.add(s2);
		st.add(s3);
		
		Iterator itr= st.iterator();
		while(itr.hasNext()){
			Stud al = (Stud)itr.next();
			System.out.println(al.rollno+" "+al.name+" "+al.age);
		}
	}
}