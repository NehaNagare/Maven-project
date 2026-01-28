package project_mvn_demo;

public class Student {

	private int rollno;
	private String name;
	private String course;
	private int per;
	public Student(int rollno, String name, String course, int per) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.course = course;
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", course=" + course + ", per=" + per + "]";
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getPer() {
		return per;
	}
	public void setPer(int per) {
		this.per = per;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
