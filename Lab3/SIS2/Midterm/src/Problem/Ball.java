package Problem;

public class Ball {
	private float x;
	private float y;
	private float z;
	Ball(float x, float y,float z){
		this.x = x;
		this.y = y;
		this.z = z;		
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	
	public float getY() {
		return y;
	}
	public void set(float y) {
		this.y = y;
	}
	
	public float getZ() {
		return z;
	}
	public void SetZ(float z) {
		this.z = z;
	}
	public String toString() {
		return x + " " + y + " " + z;
	}
	
	public boolean equals(float x,float y,float z) {
		return this.x == x && this.y == y && this.z== z;
	}
	public float hashCode(float x,float y, float z) {
		return (x + y + z)*10;
	}
}
