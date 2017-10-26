package Problem4;

public class Main {

	public static void main(String[] args) {
		Student student = new Student("Michael");
		Employee employee = new Employee("Jackson");
		Person person = student;
		
		
		String temp = person.getName();
		System.out.println( temp );
		System.out.println( person +"\n");
		
		
		person = employee;
		temp = person.getName();
		System.out.println( temp );
		System.out.println( person );
	}

}
