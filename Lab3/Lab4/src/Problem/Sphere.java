package Problem;

public class Sphere implements Shapes{
	private int radius;
	public Sphere(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public double volume() {
		return 4/3*Math.PI*Math.pow(radius, 3);
	}

	@Override
	public double surfaceArea() {
		return 	4*Math.PI*Math.pow(radius,4);
	}

}
