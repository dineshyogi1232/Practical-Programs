package com.Collection;

/**
 * @author	Dinesh Yogi
 * @desc	Comparable interface example
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
		int highestMarks = 0;
		Student student1 = new Student("Tom", 98);
		Student student2 = new Student("Jerry", 88);
		highestMarks = student1.compareTo(student2);

		if (highestMarks == 1) {
			System.out.println("Tom having highest marks...");
		} else if (highestMarks == -1) {
			System.out.println("Jerry having highest marks...");
		} else {
			System.out.println("Same");
		}

	}

}
