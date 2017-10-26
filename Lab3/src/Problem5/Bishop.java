package Problem5;

public abstract class Bishop extends Piece{
	public Bishop() {};
	public static boolean isLegalMove(Position a, Position b) {
		return ((Math.abs(a.x - b.x) == Math.abs(a.y - b.y)));
	}
	
	public boolean isLegalMove(Position b){
		return isLegalMove(a,b);
	}
}
