package Collect;

public class SingletonExample {
	private SingletonExample() {
		
	}
	private static SingletonExample instance = new SingletonExample();

	public static SingletonExample  getInstance() {
		return instance;
	}
}
