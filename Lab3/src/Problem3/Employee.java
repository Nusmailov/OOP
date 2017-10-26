package Problem3;

public class Employee extends Person{
	private double salary;
	private int year;
	private String insuranceNumber;
	
	public Employee() {
		super();
		this.salary = 0.0;
		this.year = 0;
		this.insuranceNumber = "16WXXXX";
	}
	
	
	public Employee(String name, double salary, int year,String insuranceNumber) {
		super(name);
		this.salary = salary;
		this.year = year;
		this.insuranceNumber = insuranceNumber;
	}
	
	
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	
	
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	
	
	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	public String getInsuranceNumber() {
		return insuranceNumber;
	}
	
	
	public boolean equals(Employee E) {
		if(E.salary == this.salary && E.insuranceNumber.equals(this.insuranceNumber) && E.year == this.year && super.equal(E)) {
			return true;
		}
		return  false;
	}
	
	
	public String toString() {
		return super.toString() + "\nSalary: " + this.salary + "\nYear: "+this.year+"\nInsuranceNumber: "+ this.insuranceNumber;
	}

	
}
