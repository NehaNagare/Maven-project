package project_mvn_demo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

  

	// 1. Get all students
    public List<Student> getAllStudent() {
        List<Student> list = new ArrayList<>();
        try {
            Connection con = TestConnection.getStudentDBConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM student");

            while (rs.next()) {
                Student s = new Student();
                s.setRollno(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setCourse(rs.getString(3));
                s.setPer(rs.getInt(4));
                list.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    // 2. Get student by rollno
    public Student getStudentByRollno(int rollno) {
        Student s = null;
        try {
            Connection con = TestConnection.getStudentDBConnection();
            PreparedStatement ps =
                    con.prepareStatement("SELECT * FROM student WHERE rollno=?");

            ps.setInt(1, rollno);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                s = new Student();
                s.setRollno(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setCourse(rs.getString(3));
                s.setPer(rs.getInt(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return s;
    }

    // 3. Add student
    public int addStudent(Student s) {
        int i = 0;
        try {
            Connection con = TestConnection.getStudentDBConnection();
            PreparedStatement ps =
                    con.prepareStatement("INSERT INTO student VALUES (?,?,?,?)");

            ps.setInt(1, s.getRollno());
            ps.setString(2, s.getName());
            ps.setString(3, s.getCourse());
            ps.setInt(4, s.getPer());

            i = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    // 4. Update percentage
    public int updatePercentage(int rollno, int per) {
        int i = 0;
        try {
            Connection con = TestConnection.getStudentDBConnection();
            PreparedStatement ps =
                    con.prepareStatement("UPDATE student SET per=? WHERE rollno=?");

            ps.setInt(1, per);
            ps.setInt(2, rollno);
            i = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    // 5. Delete student
    public int deleteStudent(int rollno) {
        int i = 0;
        try {
            Connection con = TestConnection.getStudentDBConnection();
            PreparedStatement ps =
                    con.prepareStatement("DELETE FROM student WHERE rollno=?");

            ps.setInt(1, rollno);
            i = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    // 6. Course wise students
    public List<Student> getStudentsByCourse(String course) {
        List<Student> list = new ArrayList<>();
        try {
            Connection con = TestConnection.getStudentDBConnection();
            PreparedStatement ps =
                    con.prepareStatement("SELECT * FROM student WHERE course=?");

            ps.setString(1, course);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Student s = new Student();
                s.setRollno(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setCourse(rs.getString(3));
                s.setPer(rs.getInt(4));
                list.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    // 7. Students with percentage > value
    public List<Student> getStudentsAbovePer(int per) {
        List<Student> list = new ArrayList<>();
        try {
            Connection con = TestConnection.getStudentDBConnection();
            PreparedStatement ps =
                    con.prepareStatement("SELECT * FROM student WHERE per > ?");

            ps.setInt(1, per);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Student s = new Student();
                s.setRollno(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setCourse(rs.getString(3));
                s.setPer(rs.getInt(4));
                list.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    // 8. Count students
    public int countStudents() {
        int count = 0;
        try {
            Connection con = TestConnection.getStudentDBConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM student");
            if (rs.next()) count = rs.getInt(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    // 9. Max percentage
    public int getMaxPercentage() {
        int max = 0;
        try {
            Connection con = TestConnection.getStudentDBConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT MAX(per) FROM student");
            if (rs.next()) max = rs.getInt(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return max;
    }

    // 10. Min percentage
    public int getMinPercentage() {
        int min = 0;
        try {
            Connection con = TestConnection.getStudentDBConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT MIN(per) FROM student");
            if (rs.next()) min = rs.getInt(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return min;
    }
    
    public List<Student> getTopThreeToppers(){
    	      List<Student> list=new ArrayList<>();
    	      try {
    	            Connection con = TestConnection.getStudentDBConnection();
    	            Statement st = con.createStatement();
    	            ResultSet rs = st.executeQuery("SELECT * FROM student ORDER BY per DESC LIMIT 3");
    	            while(rs.next()) {
    	            	   Student s=new Student();
    	            	   s.setRollno(rs.getInt(1));
    	            	   s.setName(rs.getString(2));
    	            	   s.setCourse(rs.getString(3));
    	            	   s.setPer(rs.getInt(4));
    	            	   list.add(s);
    	            	   
    	            }
    	        } catch (SQLException e) {
    	            e.printStackTrace();
    	        }
    	        return list;
    	    }
    }

