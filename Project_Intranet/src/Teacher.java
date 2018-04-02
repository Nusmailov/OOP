import java.io.Serializable;
import java.util.Vector;

public class Teacher extends User implements Serializable{
	Vector<Group> groups = new Vector<Group>();
	Vector<Course> course = new Vector<Course>();
	public Teacher() {
		super();
	}
	void ListOfCourses() {
		for(int i=0; i<this.course.size(); i++) {
			String num=Integer.toString(i+1);
			String course=this.course.get(i).toString();
			System.out.println(num+") "+course);
		}
	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString();
//	}
	public void listOfGroup() {
		for (int i=0; i<this.groups.size(); i++) {
			String num=Integer.toString(i+1);
			String group=this.groups.get(i).id +" Course:" + this.groups.get(i).course.name;
			System.out.println(num+") "+group);
		}
		
	}

}
