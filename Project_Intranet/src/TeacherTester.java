import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeacherTester {

	public static void teacherMode(Teacher teacher) throws NumberFormatException, IOException, ClassNotFoundException {
		System.out.println("Welcome Teacher "+ teacher.name);
		System.out.println("1) List Course");
		System.out.println("2) List my Group");
		System.out.println("3) Put Mark");
		System.out.println("4) Put Attendance");
		System.out.println("5) exit");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int mode = Integer.parseInt(reader.readLine());
		if (mode==1) {
			teacher.ListOfCourses();
			System.out.println("-------------------");
			TeacherTester.teacherMode(teacher);
		}
		if (mode==2) {
			teacher.listOfGroup();
			System.out.println("-------------------");
			TeacherTester.teacherMode(teacher);
		}
		if (mode==3) {
			System.out.println("Choose group");
			teacher.listOfGroup();
			Database.desGroups();
			Database.desStudents();
			int numGroup = Integer.parseInt(reader.readLine());
			System.out.println("Choose student");
			Database.groups.get(numGroup-1);
			System.out.println("Students: ");
			for (int i=0; i<Database.groups.get(numGroup-1).students.size(); i++) {
				for (int j=0; j<Database.groups.get(i).students.size(); j++) {
					System.out.println(j+1+") " + Database.groups.get(numGroup-1).students.get(i).id+" " + Database.groups.get(i).students.get(i).name + ", " );
				}
			}
			int numStudent = Integer.parseInt(reader.readLine());
			for (int i=0; i<Database.students.size(); i++) {
				if (Database.groups.get(numGroup-1).students.get(numStudent-1).id.equals(Database.students.get(i).id)) {
					for (int j=0; j<Database.students.get(i).courses.size(); j++) {
						if (Database.students.get(i).courses.get(j).name.equals(Database.groups.get(numGroup-1).course.name)) {
							System.out.println("How many points do you add?");
							int point=Integer.parseInt(reader.readLine());
							System.out.println(Database.groups.get(numGroup-1).course);
							System.out.println(Database.students.get(i).marks.get(Database.students.get(i).courses.get(j)));
							Database.students.get(i).marks.get(Database.students.get(i).courses.get(j)).points=Database.students.get(i).marks.get(Database.students.get(i).courses.get(j)).points+point;
							System.out.println("Done");
							System.out.println(Database.students.get(i).marks.get(Database.students.get(i).courses.get(j)));
						}
					}
				


				}
			}
			Database.serGroups();
			Database.serStudents();
//			System.out.println("How many points do you add?");
//			int point=Integer.parseInt(reader.readLine());
//			System.out.println(Database.groups.get(numGroup-1).course);
//			System.out.println(Database.groups.get(numGroup-1).students.get(numStudent-1).marks.get(Database.groups.get(numGroup-1).course));
//			System.out.println("Done");
			System.out.println("-------------------");
			TeacherTester.teacherMode(teacher);
		}
		if (mode==5) {
			Tester.mainTester();
		}
	}

}
