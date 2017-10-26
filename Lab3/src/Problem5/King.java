package Problem5;

public abstract class King extends Piece{
	public King() {};
	public boolean isLegalMove(Position b){
		return (Math.abs(a.x - b.x)==1 || a.x - b.x==0) && (Math.abs(a.y - b.y)==1 || a.y - b.y == 0);
	}
}
