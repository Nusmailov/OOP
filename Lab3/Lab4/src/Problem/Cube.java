package Problem;

public class Cube implements Shapes{
	public int length,height,width;

	public Cube(int l, int w, int h){
		this.length = l;
		this.width = w;
		this.height = h;
	}
	@Override
	public double volume() {
		return this.length * this.width * this.height;
	}

	@Override
	public double surfaceArea() {
		return this.width*this.height*4+this.width*this.length*2;
	}

	public double getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	public String toString(){
		return "a="+this.length+"\nb="+this.width+"\nh="+this.height+"\nV="+this.volume()+"\nA="+this.surfaceArea();
	}

}
