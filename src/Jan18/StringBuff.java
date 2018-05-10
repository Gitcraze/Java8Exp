package Jan18;

public class StringBuff {

	public static void main(String[] args) {
		StringBuffer ray = new StringBuffer("Rayson");
		ray.append(" Thomas");
		System.out.println(ray);
		ray.replace(1, 4, "RAYSU");
		System.out.println(ray);
		ray.delete(1, 4);
		System.out.println(ray);
		System.out.println(ray.reverse());
		
	}

}
