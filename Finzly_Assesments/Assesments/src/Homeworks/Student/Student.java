package student;

public class Student {
	private String name;
	private int age;
	private String studentId;
	private static int id;
	
	Student(){
		this("Unknown");
	}
	
	Student(String name){
		this(name,0);
	}
	
	Student(String name, int age){
		this(name,age,"STU"+id);
		id++;
	}
	
	Student(String name, int age, String studentId){
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", studentId=" + studentId + "]";
	}
	
	
}
