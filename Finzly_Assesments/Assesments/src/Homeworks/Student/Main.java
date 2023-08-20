package student;

public class Main {

	public static void main(String[] args) {
		Student defaultStudent = new Student();
		Student ageStudent = new Student("Mithulbhalaji");
		Student nameAgeStudent = new Student("Mithul",22);
		Student nameAgeIdStudent = new Student("Bhalaji",23,"STU"+12);
		
		Student[] students = new Student[4];
		students[0] = defaultStudent;
		students[1] = ageStudent;
		students[2] = nameAgeStudent;
		students[3] = nameAgeIdStudent;
		
		for(Student s : students) {
			System.out.println(s);
		}
				

	}
}
