package array;

import java.util.ArrayList;

public class Student {
	
	private int studentId;
	private String studentName;
	private ArrayList<Subject> subjectList;

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		
		Subject subject = new Subject();
		
		subject.setName(name);
		subject.setScore(score);
		
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		
		for(Subject subject : subjectList) {
			System.out.println(studentName + " 학생의 " + subject.getName() + "과목의 성적은 " + subject.getScore() + "점 입니다.");
			total += subject.getScore();
		}
		
		System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
	}
	
}
