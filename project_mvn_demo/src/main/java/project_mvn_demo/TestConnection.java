package project_mvn_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

		public static Connection getStudentDBConnection() {

			Connection con = null;

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");

				String url = "jdbc:mysql://localhost:3306/student_db";
				String user = "root";
				String pass = "root";

				con = DriverManager.getConnection(url, user, pass);

			} catch (Exception e) {
				e.printStackTrace();
			}

			return con;   
		
	}
}
	