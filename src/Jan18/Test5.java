package Jan18;

interface A {
	void a();// bydefault, public and abstract

	void b();

	void c();

	void d();
}

abstract class B implements A {
	public void c() {
		System.out.println("I am in C");
	}
}

class M extends B {
	public void a() {
		System.out.println("I am in A");
	}

	public void b() {
		System.out.println("I am in B");
	}

	public void d() {
		System.out.println("I am in D");
	}
}

public class Test5 {

	public static void main(String[] args) {
		A a = new M();
		a.a();
		a.b();
		a.c();
		a.d();

	}

}
