package Problem5;

public class Position {
	public int x, y;
	
	public Position(){
		x = 0;
		y = 0;
	}

	public Position(int x, int y){
		if(x > 0 && x < 9 && y < 9 && y > 0){
			this.x = x;
			this.y = y;
		}
	}
}
