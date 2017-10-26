package Problem2;

public class Cube extends Shapes{
	private int length, width, height;
	
	public Cube(){
		length=0;
		width=0;
		height=0;
	}
	public Cube(int l, int w, int h){
		this.length = l;
		this.width = w;
		this.height = h;
	}
	
	public double volume(){
		return this.length*this.width*this.height;
	}
	
	public double area(){
		return this.width*this.height*4+this.width*this.length*2;
	}
	
	public String toString(){
		return "a="+this.length+"\nb="+this.width+"\nh="+this.height+"\nV="+this.volume()+"\nA="+this.area();
	}
}
