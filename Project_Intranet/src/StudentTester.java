import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class StudentTester {

	public static void studentMode(Student student) throws IOException, ClassNotFoundException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome "+student.name);
		System.out.println("List of actions");
		System.out.println("1) List of course");
		System.out.println("2) View my marks");
		System.out.println("3) View my attestatin");
		System.out.println("4) View my attendance");
		System.out.println("5) View my transcript");
		System.out.println("6) Exit");
		int mode=Integer.parseInt(reader.readLine());
		if (mode==1) {
			Vector<Course> courses=new Vector<Course>();
			courses=student.courses;
			System.out.println(courses);
			System.out.println("------------------");
			StudentTester.studentMode(student);
		}
		if (mode==2) {
			System.out.println(student.marks);
			System.out.println("------------------");
			StudentTester.studentMode(student);
		}
		if (mode==5) {
			for (int i=0; i<student.courses.size(); i++) {
				System.out.println(student.courses.get(i)+ " 30/" + student.marks.get(student.courses.get(i)).points);
			}
			System.out.println("------------------");
			StudentTester.studentMode(student);
		}
		if (mode==6) {
			Tester.mainTester();
		}
	}

}
