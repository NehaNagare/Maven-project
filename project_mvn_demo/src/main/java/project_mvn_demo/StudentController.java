package project_mvn_demo;

import java.util.List;

public class StudentController {

    StudentService service = new StudentService();

    public List<Student> getAllStudent() {
        return service.getAllStudent();
    }

    public Student getStudentByRollno(int rollno) {
        return service.getStudentByRollno(rollno);
    }

    public int addStudent(Student s) {
        return service.addStudent(s);
    }

    public int updatePercentage(int rollno, int per) {
        return service.updatePercentage(rollno, per);
    }

    public int deleteStudent(int rollno) {
        return service.deleteStudent(rollno);
    }

    public List<Student> getStudentsByCourse(String course) {
        return service.getStudentsByCourse(course);
    }

    public List<Student> getStudentsAbovePer(int per) {
        return service.getStudentsAbovePer(per);
    }

    public int countStudents() {
        return service.countStudents();
    }

    public int getMaxPercentage() {
        return service.getMaxPercentage();
    }

    public int getMinPercentage() {
        return service.getMinPercentage();
    }
    
    public List<Student> getTopThreeToppers(){
    	return service.getTopThreeToppers();
    }
}
