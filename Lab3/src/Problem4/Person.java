package Problem4;

public class Person {
	String name;
	Person(){
		this.name = "NoName";
	}
	Person(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public String toString(){
		return "Person's name:" + this.name;
	}
}
