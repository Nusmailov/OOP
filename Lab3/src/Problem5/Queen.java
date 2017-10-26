package Problem5;

public abstract class Queen extends Piece{
	public Queen() {};
	public boolean isLegalMove(Position a,Position b){
		return Bishop.isLegalMove(a, b) || Rock.isLegalMove(a, b);
	}
}