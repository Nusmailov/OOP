import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Vector;

public class Manager extends User implements Serializable{
	public Manager() {
		super();
	}
	Vector<Course> viewListCourse() throws IOException, ClassNotFoundException {
		Vector<Course> courses= new Vector<Course>();
		Database.desCourses();
		courses=Database.courses;
		return courses;
	}
	void AddCourse(Course course) throws IOException, ClassNotFoundException {
		Database.desCourses();
		Database.courses.addElement(course);
		Database.serCourses();
	}
	void AddCourseToStudent(Group group,Student student) throws ClassNotFoundException, IOException {
		Database.desGroups();
		Database.desStudents();
		Database.desTeachers();
		for (int i=0; i<Database.groups.size(); i++) {
			if (group.id.equals(Database.groups.get(i).id)){
//				student.marks.put(group.course, new Mark());
				Database.groups.get(i).students.addElement(student);
				System.out.println("Student added to group");
			}
		}
		for (int i=0; i<Database.students.size(); i++) {
			if (student.id.equals(Database.students.get(i).id)) {
				Database.students.get(i).courses.addElement(group.course);
				Database.students.get(i).groups.addElement(group);
				Mark m1= new Mark();
				Database.students.get(i).marks.put(group.course, m1);
				System.out.println("Group added to student");
				break;
			}
		}
		for (int i=0; i<Database.teachers.size(); i++) {
			if (group.teacher.id.equals(Database.teachers.get(i).id)) {
				for (int j=0; i<(Database.teachers.get(i).groups.size()); j++){
					if (group.id.equals(Database.teachers.get(i).groups.get(j).id)) {
//						student.marks.put(group.course, new Mark());
						Database.teachers.get(i).groups.get(j).students.addElement(student);
						break;
					}
				}
			}
		}
		Database.serGroups();
		Database.serStudents();
		Database.serTeachers();
	}
	void AddGroup(Group group) throws ClassNotFoundException, IOException {
		Database.desGroups();
		Database.desTeachers();
		for (int i=0; i<Database.teachers.size(); i++) {
			if (group.teacher.id.equals(Database.teachers.get(i).id)) {
				Database.teachers.get(i).groups.addElement(group);
				Database.teachers.get(i).course.addElement(group.course);
				System.out.println("Group added teacher");
			}
		}
		Database.groups.addElement(group);	
		Database.serTeachers();
		Database.serGroups();
	}
}
