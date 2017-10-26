package Problem;

public class Resistor extends Circuit {
	
	private double resistor;
	private double potentialDiff;
	
	public Resistor(double resistor) {
		this.resistor = resistor;
	}	
		
	@Override
	public double getResistance() {
		return resistor;
	}

	@Override
	public double getPotentialDiff() {
		return potentialDiff;
	}

	@Override
	public void applyPotentialDiff(double V) {
		potentialDiff = V;
	}

}
