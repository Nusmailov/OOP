package Problem;

public class Animal {
	private String name;
	private int age;
	public Animal() {}
	public Animal(String name, int age) {
		this.age = age;
		this.name = name;
	}
	public Animal(String name) {
		this.name = name;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
}
