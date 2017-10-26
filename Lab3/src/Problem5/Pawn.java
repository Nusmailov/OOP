package Problem5;

public abstract class Pawn extends Piece{
	public boolean isLegalMove(Position b){
		return (((b.y-a.y)==1) || (a.y==2) && (b.y-a.y)==2);

	}
}
