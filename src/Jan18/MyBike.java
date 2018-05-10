package Jan18;

abstract class Bike {
	
	abstract void run();
}

class MyBike extends Bike{
	void run()
	{
		System.out.println("Riding My Bike");
	}
	
	public static void main(String args[]){
		Bike b= new MyBike();
		b.run();
	}
}
