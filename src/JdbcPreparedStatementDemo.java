import java.util.*;
import java.sql.*;

public class JdbcPreparedStatementDemo {
	public static void main(String[] args) throws SQLException {
		Connection con=null;
		PreparedStatement st =null;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Employee Number");
		int eno = s.nextInt();
		System.out.println("Enter Employee Name");
		String ename = s.next();
		System.out.println("Enter Employee Salary");
		float salary = s.nextFloat();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.getConnection("jdbc:mysql://localhost:3306/java13", "root", "root");
			con.prepareStatement("insert into employee values (?,?,?)");
			st.setInt(1, eno);
			st.setString(2, ename);
			st.setFloat(3, salary);
			st.executeUpdate();
			System.out.println("Inserted");
			
/*
		con.prepareStatement ("insert into employee values ("+eno+", "+ename+", "+salary+")");
st.executeUpdate();
*/
System.out.println("Inserted");
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			
			st.close();
			con.close();
		}
	}
}