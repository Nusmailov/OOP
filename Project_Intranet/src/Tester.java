import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

public class Tester implements Serializable {
	static void mainTester() throws ClassNotFoundException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		Student s1= new Student();
//		s1.id="16BD21";
//		s1.name="Askhat";
//		s1.password="123";
//		Database.students.addElement(s1);
//		Database.serStudents();
//		Manager m1= new Manager();
//		m1.id="15M00";
//		m1.name="Borys";
//		Database.managers.addElement(m1);
//		Database.serManagers();
//		Teacher t1= new Teacher();
//		t1.id="15PHD";
//		t1.name="Pakita";
//		Database.teachers.addElement(t1);
//		Database.serTeachers();
//		Database.serGroups();
//		Admin admin= new Admin();
//		admin.id="admin";
//		admin.password="123";
//		admin.name="Adlet";
//		admin.surname="Balzhanov";
//		Database.admins.addElement(admin);
//		Database.serAdmins();
		System.out.println("Welcome to our Intranet!");
		System.out.println("Choose your mode");
		System.out.println("1)Admin");
		System.out.println("2)Student");
		System.out.println("3)Manager");
		System.out.println("4)Teacher");
		String ans = reader.readLine();
		int mode=Integer.parseInt(ans);
		if (mode==1) {
			Database.desAdmins();
			System.out.println("Print id:");
			String adminId=reader.readLine();
			System.out.println("Print password: ");
			String password= reader.readLine();
			for (int i=0; i<Database.admins.size(); i++) {
				if (adminId.equals(Database.admins.get(i).id)) {
					AdminTester.adminMode(Database.admins.get(i));
				}
			}
		}
		if (mode==2) {
			Database.desStudents();
			System.out.println("Print id:");
			String studentId=reader.readLine();
			System.out.println("Print password: ");
			String password= reader.readLine();
			for (int i=0; i<Database.students.size(); i++) {
				if (studentId.equals(Database.students.get(i).id)) {
					StudentTester.studentMode(Database.students.get(i));
				}
			}
			
		}
		if (mode==3) {
			Database.desManagers();
			System.out.println("Print id:");
			String managerId=reader.readLine();
			System.out.println("Print password: ");
			String password= reader.readLine();
			for (int i=0; i<Database.managers.size(); i++) {
				if (managerId.equals(Database.managers.get(i).id)) {
					ManagerTester.managerMode(Database.managers.get(i));
				}
			
		     }
        }
		if (mode==4) {
			Database.desTeachers();
			System.out.println("Print id:");
			String teacherId=reader.readLine();
			System.out.println("Print password: ");
			String password= reader.readLine();
			for (int i=0; i<Database.teachers.size(); i++) {
				if (teacherId.equals(Database.teachers.get(i).id)) {
					TeacherTester.teacherMode(Database.teachers.get(i));
				}
		}
		
	}
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Tester.mainTester();
	}
}
