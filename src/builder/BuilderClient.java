package builder;

public class BuilderClient {
	public static void main(String[] args) {
		Employee employee = new Employee.EmployeeBuilder().age(12).gender(Employee.Gender.MALE).lastName("Mathew")
				.build();
		
		System.out.println(employee);
	}
}
