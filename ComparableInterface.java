package com.collection;

import com.oopsconcepts.CallingLogger;

/**
 * @author	Dinesh Yogi
 * @desc	Comparable Interface Example
 */
class Student implements Comparable<Student> {

	private String studentName = null;
	private int marks = 0;

	public Student(String studentName, int marks) {
		super();
		this.studentName = studentName;
		this.marks = marks;
	}

	public String getStudentName() {
		return studentName;
	}

	public int getMarks() {
		return marks;
	}

	@Override
	public int compareTo(Student student) {
		if (marks == student.marks) {
			return 0;
		} else {
			return marks > student.marks ? 1 : -1;
		}
	}
}

public class ComparableInterface {

	public static void main(String[] args) {
		String className = "ComparableInterface";
		Student student1 = new Student("Tom", 98);
		Student studentObj2 = new Student("Jerry", 88);
		int highestMarks = student1.compareTo(studentObj2);

		if (highestMarks > 0) {
			CallingLogger.getInfoLoggerFrom(className, "Tom having highest marks...");
		} else if (highestMarks < 0) {
			CallingLogger.getInfoLoggerFrom(className, "Jerry having highest marks...");
		} else {
			CallingLogger.getInfoLoggerFrom(className, "Both having same marks...");
		}

	}

}