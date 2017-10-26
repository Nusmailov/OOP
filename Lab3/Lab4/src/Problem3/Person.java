package Problem3;

public class Person {
	private String name;
	
	public Person() {
		name = "NoNameYet";
	}
	public Person(String name) {
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public boolean equals(Person p) {
		return this.name.equals(p.name);
	}
	
	public String toString() {
		return "Name: " + name;
	}
}
