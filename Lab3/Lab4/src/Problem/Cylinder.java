package Problem;

public class Cylinder implements Shapes{
	private int radius = 0,height = 0;
	Cylinder(int radius, int height){
		this.radius = radius;
		this.height = height;
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	@Override
	public double volume() {
		return (Math.PI * Math.pow(radius,2) * height); 
	}

	@Override
	public double surfaceArea() {
		return 2*(Math.PI*radius*radius) + height*(2*Math.PI*radius);
	}
	
	public String toString() {
		return "volume: "+ this.volume() + "\nArea: " + this.surfaceArea();
	}
}
