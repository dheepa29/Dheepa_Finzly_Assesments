package studentmanagement;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private double studentID;
	private String studentName;
	static int totalStudents;
	
	
	
	public Student(double studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		totalStudents++;
	}
	public double getStudentID() {
		return studentID;
	}
	public void setStudentID(double studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public static int getTotalStudents() {
		return totalStudents;
	}
	
	
	public static void updateStudentCount(int noOfStudents) {
		totalStudents = noOfStudents;
	}
	public static void enrollStudent(int noOfStudents) {
		totalStudents += noOfStudents;
	}
	public static void dropStudnet(int noOfStudents) {
		totalStudents -= noOfStudents;
	}
	
	

}
