package Problem4;

public class Person implements Swim{
	String name;
	boolean swim, move;
	
	Person(boolean swim, boolean move){
		this.swim = swim;
		this.move = move;
	}
	@Override
	public boolean canSwim() {
		if(this.swim == false) {
			return false;
		}
		return true;
	}
	@Override
	public boolean canMove() {
		if(move == false) {
			return false;
		}
		else {
			return true;
		}
		
	}	
}
