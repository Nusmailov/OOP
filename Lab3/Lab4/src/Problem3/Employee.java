package Problem3;

import java.util.Date;

public class Employee extends Person implements Comparable,Cloneable{
	private double salary;
	private int year;
	private String insuranceNumber;
	
	Date hireDate;
	
	public Employee() {
		super();
		this.salary = 0.0;
		this.insuranceNumber = "16WXXXX";
	}
	
	public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
		super(name);
		this.salary = salary;
		this.hireDate = hireDate;
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
		if(E.salary == this.salary && E.insuranceNumber.equals(this.insuranceNumber) && E.year == this.year && super.equals(E)) {
			return true;
		}
		return  false;
	}
	
	public String toString() {
		return super.toString() + "\nSalary: " + this.salary + "\nYear: "+this.year+"\nInsuranceNumber: "+ this.insuranceNumber;
	}
	
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	@Override
	public int compareTo(Object a) {
		Employee b = (Employee)a;
		if(this.salary == b.salary) {
			return 0;
		}
		if(b.salary > this.salary) {
			return -1;
		}
		return -1;
	}
	
}
