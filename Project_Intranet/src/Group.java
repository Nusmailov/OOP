import java.io.Serializable;
import java.util.Vector;

public class Group implements Serializable{
	String id;
	Vector<Student> students= new Vector<Student>();
	Teacher teacher;
	Course course;
	int size=24;
	@Override
	public String toString() {
		return "id=" + id + ", students=" + students + ", teacher=" + teacher.name + ", course=" + course.name + ", size="
				+ size;
	}
	
	
}
