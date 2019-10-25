package databaseW12SH2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ques7 {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/e";
		String uName = "root";
		String pass = "DeepeshKhurana@1234";


		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uName, pass);
		Statement st = con.createStatement();
		st = con.createStatement();
		String query = "select Dept_ID, avg(Salary) from employees group by(Dept_ID)";
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			double sal = rs.getDouble("avg(Salary)");
			int dept = rs.getInt("Dept_ID");

			System.out.print("Salary: " + sal+ " ");
			System.out.print("Department ID: " + dept+ " ");
			System.out.println();
		}
		rs.close();
		st.close();
		con.close();
	}
}
