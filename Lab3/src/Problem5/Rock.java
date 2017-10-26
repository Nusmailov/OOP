package Problem5;

public abstract class Rock extends Piece{
	public Rock() {};
	public static boolean isLegalMove(Position a,Position b) {
		return (a.x == b.x || a.y == b.y);
	}
	public boolean isLegalMove(Position b){
		return isLegalMove(a, b);
	}
}
