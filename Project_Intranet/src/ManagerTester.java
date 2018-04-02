import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class ManagerTester {


	public static void managerMode(Manager manager) throws NumberFormatException, IOException, ClassNotFoundException {
		System.out.println("Welcome Manager " + manager.name);
		System.out.println("1) List Courses");
		System.out.println("2) Add course");
		System.out.println("3) Registration Student to course");
		System.out.println("4) Create group");
		System.out.println("5) List of groups");
		System.out.println("6) exit");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int mode = Integer.parseInt(reader.readLine());
		if (mode==1) {
			Vector<Course> listCourse=new Vector<Course>();
			listCourse=manager.viewListCourse();
			for(int i=0; i<listCourse.size(); i++) {
				String num=Integer.toString(i+1);
				String course=listCourse.get(i).toString();
				System.out.println(num+") "+course);
			}
			System.out.println("-------------------");
			ManagerTester.managerMode(manager);
		}
		if (mode==2) {
			Course c1 = new Course();
			System.out.println("Print name:");
			String courseName=reader.readLine();
			c1.name=courseName;
			manager.AddCourse(c1);
			System.out.println("-------------------");
			ManagerTester.managerMode(manager);
		}
		if (mode==3) {
			Student student= new Student();
			Group group = new Group();
			System.out.println("Print id of student:");
			String nameStudent= reader.readLine();
			Database.desStudents();
			for (int i=0; i<Database.students.size(); i++) {
				if (Database.students.get(i).id.equals(nameStudent)) {
					student=Database.students.get(i);
					System.out.println("Found");
					break;
				}
			}
			System.out.println("Choose group and course");
			Database.desGroups();
			for (int i=0; i<Database.groups.size(); i++) {
				String num=Integer.toString(i+1);
				String groups=Database.groups.get(i).toString();
				System.out.println(num+") "+groups);
			}
			int GroupNum=Integer.parseInt(reader.readLine());
			group=Database.groups.get(GroupNum-1);
			manager.AddCourseToStudent(group, student);
			System.out.println("-------------------");
			ManagerTester.managerMode(manager);
		}
		if (mode==4) {
			Group g1 = new Group();
			Course c1 = new Course();
			Teacher t1 = new Teacher();
			System.out.println("Choose course of group");
			Database.desCourses();
			for(int i=0; i<Database.courses.size(); i++) {
				String num=Integer.toString(i+1);
				String course=Database.courses.get(i).toString();
				System.out.println(num+") "+course);
			}
			int courseNum=Integer.parseInt(reader.readLine());
			c1=Database.courses.get(courseNum-1);
			System.out.println("Choose teacher for group");
			Database.desTeachers();
			for (int i=0; i<Database.teachers.size(); i++) {
				String num=Integer.toString(i+1);
				String teacher=Database.teachers.get(i).name;
				System.out.println(num+") "+teacher);
			}
			int teacherNum=Integer.parseInt(reader.readLine());
			t1=Database.teachers.get(teacherNum-1);
			g1.course=c1;
			g1.teacher=t1;
			Database.desGroups();
			g1.id="group"+Integer.toString(Database.groups.size()+1);
			manager.AddGroup(g1);
			System.out.println("Done");
			System.out.println("-------------------");
			ManagerTester.managerMode(manager);
		}
		if (mode==5) {
			Database.desGroups();
			for (int i=0; i<Database.groups.size(); i++) {
				String num=Integer.toString(i+1);
				String group=Database.groups.get(i).id +" Course:" + Database.groups.get(i).course.name +" Teacher:" + Database.groups.get(i).teacher.name;
				System.out.println(num+") "+group);
				System.out.print("Students: ");
				for (int j=0; j<Database.groups.get(i).students.size(); j++) {
					System.out.print(j+1+") " + Database.groups.get(i).students.get(j).id+" " + Database.groups.get(i).students.get(j).name + ", " );
				}
				System.out.println();
			}
			System.out.println("-------------------");
			ManagerTester.managerMode(manager);
		}
		if (mode==6) {
			Tester.mainTester();
		}
	}

}
