package Problem;

public class Parallel extends Circuit{

	private Circuit a,b;
	public Parallel(Circuit a, Circuit b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public double getResistance() {
		return 1.0 / (1.0/a.getResistance() + 1.0/b.getResistance());
	}

	@Override
	public double getPotentialDiff() {
		return a.getPotentialDiff();
	}

	@Override
	public void applyPotentialDiff(double V) {
		a.applyPotentialDiff(V);
		b.applyPotentialDiff(V);
	}
}
