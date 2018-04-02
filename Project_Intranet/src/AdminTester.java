import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdminTester {

	public static void adminMode(Admin admin) throws NumberFormatException, IOException, ClassNotFoundException {
		System.out.println("Welcome Admin " + admin.name);
		System.out.println("1) Add Admin");
		System.out.println("2) Add Student");
		System.out.println("3) Add Manager");
		System.out.println("4) Add Teacher");
		System.out.println("5) Delete Teacher");
		System.out.println("6) Delete Student");
		System.out.println("7) Delete Admin");
		System.out.println("8) Delete Manager");
		System.out.println("9) Exit");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int mode = Integer.parseInt(reader.readLine());
		if (mode==1) {
			Admin admin2 = new Admin();
			System.out.println("Enter new admin name: ");
			String name=reader.readLine();
			admin2.name=name;
			System.out.println("Enter admin surname: ");
			String surname=reader.readLine();
			admin2.surname=surname;
			System.out.println("Enter admin password: ");
			String password= reader.readLine();
			admin2.password=password;
			String id = name.charAt(0)+"_" + surname;
			admin2.id=id;
			admin.addAdmin(admin2);
			System.out.println("New admin was created");
			System.out.println("---------------------");
			AdminTester.adminMode(admin);
		}
		if (mode==2) {
			Student s2 = new Student();
			System.out.println("Enter new student year of study: ");
			int year = Integer.parseInt(reader.readLine());
			s2.yearOfStudy=year;
			System.out.println("Enter new student name: ");
			String name=reader.readLine();
			s2.name=name;
			System.out.println("Enter new student surname: ");
			String surname=reader.readLine();
			s2.surname=surname;
			System.out.println("Choose degree of new student: ");
			Degree degree = null;
			System.out.println("1)Bacherlor");
			System.out.println("2)Master");
			System.out.println("3)PHD");
			int deg=Integer.parseInt(reader.readLine());
			if (deg==1) {
				s2.degree=degree.BACHELOR;
			}
			if (deg==2) {
				s2.degree=degree.MASTER;
			}
			if (deg==3) {
				s2.degree=degree.PHD;
			}
			System.out.println("Chooser faculty of new student:");
			System.out.println("1) FIT");
			System.out.println("2) KMA");
			System.out.println("3) MKM");
			System.out.println("4) ISE");
			System.out.println("4) BS");
			System.out.println("5) exit");
			Faculty faculty = null;
			int fac=Integer.parseInt(reader.readLine());
			if (fac==1) {
				s2.faculty=faculty.FIT;
			}
			if (fac==2) {
				s2.faculty=faculty.KMA;
			}
			if (fac==3) {
				s2.faculty=faculty.MKM;
			}
			if (fac==4) {
				s2.faculty=faculty.ISE;
			}
			if (fac==5) {
				s2.faculty=faculty.BS;
			}
			System.out.println("Enter student password: ");
			String password=reader.readLine();
			s2.password=password;
			System.out.println("Enter admin password: ");
			s2.id=name.charAt(0)+"_"+surname;
			admin.addStudent(s2);
			System.out.println("New student was created");
			System.out.println("-----------------------");
			AdminTester.adminMode(admin);
		}
		if (mode==3) {
			Manager manager = new Manager();
			System.out.println("Enter new manager name: ");
			String name=reader.readLine();
			manager.name=name;
			System.out.println("Enter manager surname: ");
			String surname=reader.readLine();
			manager.surname=surname;
			System.out.println("Enter manager password: ");
			String password= reader.readLine();
			manager.password=password;
			String id = name.charAt(0)+"_" + surname;
			manager.id=id;
			admin.addManager(manager);
			System.out.println("New manager was created");
			System.out.println("-----------------------");
			AdminTester.adminMode(admin);
		}
		if (mode==4) {
			Teacher teacher = new Teacher();
			System.out.println("Enter new teacher name: ");
			String name=reader.readLine();
			teacher.name=name;
			System.out.println("Enter teacher surname: ");
			String surname=reader.readLine();
			teacher.surname=surname;
			System.out.println("Enter teacher password: ");
			String password= reader.readLine();
			teacher.password=password;
			String id = name.charAt(0)+"_" + surname;
			teacher.id=id;
			admin.addTeacher(teacher);
			System.out.println("New manager was created");
			System.out.println("-----------------------");
			AdminTester.adminMode(admin);
		}
		if (mode==9) {
			Tester.mainTester();
		}
	}

}
