package project_mvn_demo;

import java.util.List;

public class StudentService {

    StudentDao dao = new StudentDao();

    public List<Student> getAllStudent() {
        return dao.getAllStudent();
    }

    public Student getStudentByRollno(int rollno) {
        return dao.getStudentByRollno(rollno);
    }

    public int addStudent(Student s) {
        return dao.addStudent(s);
    }

    public int updatePercentage(int rollno, int per) {
        return dao.updatePercentage(rollno, per);
    }

    public int deleteStudent(int rollno) {
        return dao.deleteStudent(rollno);
    }

    public List<Student> getStudentsByCourse(String course) {
        return dao.getStudentsByCourse(course);
    }

    public List<Student> getStudentsAbovePer(int per) {
        return dao.getStudentsAbovePer(per);
    }

    public int countStudents() {
        return dao.countStudents();
    }

    public int getMaxPercentage() {
        return dao.getMaxPercentage();
    }

    public int getMinPercentage() {
        return dao.getMinPercentage();
    }

	public List<Student> getTopThreeToppers() {
		// TODO Auto-generated method stub
		return dao.getTopThreeToppers();
	}
}
