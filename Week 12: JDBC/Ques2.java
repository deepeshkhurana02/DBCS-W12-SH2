package databaseW12SH2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Ques2 {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/e";
		String uName = "root";
		String pass = "DeepeshKhurana@1234";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uName, pass);
		Statement st = con.createStatement();
		st = con.createStatement();
		String query = "Insert Into employees values (001,'Sparsh', 'Goel', 90000, 50, 'spgoel@gmail.com', 'Yamunanager')";
		st.executeUpdate(query);
		query = "Insert Into employees values (002,'Rohit', 'Kumar', 10000, 30, 'rohit@gmail.com', 'Chandigarh')";
		st.executeUpdate(query);
		query = "Insert Into employees values (003,'Mohit', 'Sharma', 80000, 10, 'mohits@gmail.com','Chandigarh')";
		st.executeUpdate(query);
		query = "Insert Into employees values (004,'Kapil', 'Verma', 70000, 20, 'kapil12@gmail.com', 'Delhi')";
		st.executeUpdate(query);
		query = "Insert Into employees values (005,'Aayan', 'Singh', 100000, 50, 'aayan@gmail.com', 'Mumbai')";
		st.executeUpdate(query);
		query = "Insert Into employees values (006,'Deepesh', 'Khurana', 90000, 20, 'deepeshk@gmail.com','Mumbai')";
		st.executeUpdate(query);
		query = "Insert Into employees values (007,'Anshul', 'Gupta', 70000, 50, 'anshulg@gmail.com','Kolkata')";
		st.executeUpdate(query);
		query = "Insert Into employees values (008,'Gopal', 'Garg', 80000, 20, 'gopalg@gmail.com', 'Delhi')";
		st.executeUpdate(query);
		query = "Insert Into employees values (009,'Komal', 'Sharma', 85000, 10, 'komals@gmail.com','Delhi')";
		st.executeUpdate(query);
		query = "Insert Into employees values (010,'Kamal', 'Prakash', 90000, 50, 'kamalp@gmail.com','Yamunanagar')";
		st.executeUpdate(query);

		st.close();
		con.close();
	}
}
