package project_mvn_demo;

import java.util.List;

public class StudentApp {

    public static void main(String[] args) {

        StudentController c = new StudentController();

        System.out.println("******** WELCOME TO  STUDENT MANAGEMENT SYSTEM ********");

        // 1. Display all students
        System.out.println("\n1️.All Students:");
        List<Student> allStudents = c.getAllStudent();
        allStudents.forEach(System.out::println);

        // 2. Get student by roll number
        System.out.println("\n2️.Student with Roll No 1:");
        Student s1 = c.getStudentByRollno(1);
        System.out.println(s1);

        // 3. Add new student
        System.out.println("\n3️.Add New Student:");
        Student newStudent = new Student(10, "Rahul", "Computer Engineering", 78);
        int addResult = c.addStudent(newStudent);
        System.out.println(addResult + " student inserted.... roll no is 10");
        List<Student> addedStudents = c.getAllStudent();
        addedStudents.forEach(System.out::println);

        // 4. Update percentage
        System.out.println("\n4️.Update Percentage:");
        int updateResult = c.updatePercentage(11, 85);
        System.out.println(updateResult + " student updated");

        // 5. Delete student
        System.out.println("\n5️.Delete Student:");
        int deleteResult = c.deleteStudent(10);
        System.out.println(deleteResult + " student deleted");

        // 6. Course-wise students
        System.out.println("\n6.Students from Computer Course:");
        c.getStudentsByCourse("Computer Engineering")
         .forEach(System.out::println);

        // 7. Students with percentage > 75
        System.out.println("\n7️.Students with Percentage > 75:");
        c.getStudentsAbovePer(75)
         .forEach(System.out::println);

        // 8. Count students
        System.out.println("\n8️.Total Students:");
        System.out.println(c.countStudents());

        // 9. Max percentage
        System.out.println("\n9️.Maximum Percentage:");
        System.out.println(c.getMaxPercentage());

        // 10. Min percentage
        System.out.println("\n10.Minimum Percentage:");
        System.out.println(c.getMinPercentage());
        
        System.out.println("\n11.First 3 Toppers:");
        c.getTopThreeToppers().forEach(System.out::println);
        

        System.out.println("\n******** Thank You  ********");
    }
}
