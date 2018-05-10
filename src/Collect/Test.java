package Collect;

public class Test {
	String school;
	double fee;
	
	 Test(String school, double fee) {
		 this.school=school;
		 this.fee=fee;
		System.out.println("The details are: "+school+"\n"+fee);
	}
	 
	 Test(String schoolname, double feeamount) {

		System.out.println("The details are: "+school+"\n"+fee);
	}
	 
	 
	 void display()
	 {System.out.println("The details are: "+school+"\n"+fee);}
	
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test tst= new Test("RAY School",123.45);
		tst.display();
		
	}

}
