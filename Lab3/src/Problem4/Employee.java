package Problem4;

public class Employee extends Person{
	int salary;
	public Employee() {
		super();
		double salary = 0.0;
	}
	public Employee(int salary) {
		this.salary = salary;
	}
	public Employee(String name) {
		super(name);
	}

}
