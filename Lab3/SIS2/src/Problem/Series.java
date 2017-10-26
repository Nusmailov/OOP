package Problem;

public class Series extends Circuit{

	Circuit a,b;
	public Series(Circuit a, Circuit b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public double getResistance() {
		return a.getResistance()+b.getResistance();
	}

	@Override
	public double getPotentialDiff() {
		return a.getPotentialDiff() + b.getPotentialDiff();
	}

	@Override
	public void applyPotentialDiff(double V) {
		double I = V/ getResistance();
		a.applyPotentialDiff(I * a.getResistance());
		b.applyPotentialDiff(I * b.getResistance());
	}
}
