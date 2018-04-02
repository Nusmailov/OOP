import java.io.IOException;

public class Admin extends User {
	public Admin() {
		super();
	}
	void addAdmin(Admin admin) throws ClassNotFoundException, IOException {
		Database.desAdmins();
		Database.admins.addElement(admin);
		Database.serAdmins();
	}
	void addStudent(Student student) throws ClassNotFoundException, IOException {
		Database.desStudents();
		Database.students.addElement(student);
		Database.serStudents();
	}
	void addTeacher(Teacher teacher) throws ClassNotFoundException, IOException {
		Database.desTeachers();
		Database.teachers.addElement(teacher);
		Database.serTeachers();
	}
	void addManager(Manager manager) throws ClassNotFoundException, IOException {
		Database.desManagers();
		Database.managers.addElement(manager);
		Database.serManagers();
	}
}
