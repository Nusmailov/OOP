package Problem;

public class Crocodile extends Animal{
	private int lengthOfTail;
	public Crocodile(String name, int lengthOfTail) {
		super(name);
		this.lengthOfTail = lengthOfTail;
	}
	
	public int getLengthOfTail() {
		return lengthOfTail;
	}
	
	public void setLengthOfTail(int lengthOfTail) {
		if(lengthOfTail > 30) this.lengthOfTail = lengthOfTail;
	}
	
}
