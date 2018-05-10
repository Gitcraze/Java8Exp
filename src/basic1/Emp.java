package basic1;

public class Emp {
	int id;
	String name;
	Address address;

	public Emp(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;

	}

	void display() {
		System.out.println(id + " " + name);
		System.out.println(address.city + " " + address.state + " " + address.country);
	}

	public static void main(String[] args) {
		Address address1 = new Address("Newcastle","Tyne", "UK");
		Address address2 = new Address("Edinburgh","SCotland", "UK");
		
		Emp e=new Emp(100, "Jack", address1);
		Emp e2=new Emp(101, "Nick", address2);
		
		e.display();
		e2.display();

	}

}
