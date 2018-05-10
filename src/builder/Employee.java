package builder;

public class Employee {
	private String lastName;
	private int age;
	private Gender gender;

	public static class EmployeeBuilder {
		public EmployeeBuilder() {
		}
		private  String lastName;
		private int age;
		private Gender gender;

		public  EmployeeBuilder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public EmployeeBuilder age(int age) {
			this.age = age;
			return this;
		}

		public EmployeeBuilder gender(Gender gender) {
			this.gender = gender;
			return this;
		}

		public Employee build() {
			return new Employee(this);
		}

	}

	@Override
	public String toString() {
		return "Employee [lastName=" + lastName + ", age=" + age + ", gender=" + gender + "]";
	}

	/**
	 * 
	 * @param employeeBuilder
	 */
	public Employee(EmployeeBuilder employeeBuilder) {
		this.lastName = employeeBuilder.lastName;
		this.age = employeeBuilder.age;
		this.gender = employeeBuilder.gender;
	}

	public enum Gender {
		MALE, FEMALE;
	}
}
