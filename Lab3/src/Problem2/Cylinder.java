package Problem2;


public class Cylinder extends Shapes {
	int r, h;
	
	public Cylinder(){
		r=0;
		h=0;
	}
	
	public Cylinder(int r_, int h_){
		this.r=r_;
		this.h=h_;
	}
	
	public double volume(){
		return Math.PI*r*r*h;
	}
	
	public double area(){
		return 2 * Math.PI * r * r+h * 2* Math.PI*r;
	}
	
	public String toString(){
		return "\n\nr="+this.r+"\nh="+this.h+"\nV="+this.volume()+"\nA="+this.area();
	}

}
