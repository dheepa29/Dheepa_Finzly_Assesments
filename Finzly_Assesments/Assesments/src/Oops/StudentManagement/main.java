package studentmanagement;

public class main {

	public static void main(String[] args) {
		Student st1 = new Student(101,"Mithul");
		Student st2 = new Student(101,"Bhalaji");
		Student st3 = new Student(101,"Ponnuvel");
		
		System.out.println(Student.getTotalStudents());
		Student.enrollStudent(100);
		
	}
}
