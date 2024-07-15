import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class jdbcStatementDemo {

	public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java13","root", "root");

		Statement st=con.createStatement();
	/*	st.execute("create table employee (eno int(3), ename varchar(10), salary float(4))");
		System.out.println("Table Created");
		st.close();
		*/
		/*
		st.execute("insert into employee value(111,'Raj',8000)");
		st.execute("insert into employee value(121,'Rajan',4000)");
		st.execute("insert into employee value(122,'Rajam',6000)");
	*/
		
		//int n = st.executeUpdate("update employee set salary=7000");
		//int n = st.executeUpdate("delete from employee");
		//System.out.println(n+ "Record deleted");
		ResultSet rs =st.executeQuery("select * from employee");
		while(rs.next())
		{
			System.out.println(rs.getInt("eno")+""+rs.getString("ename")+" "+rs.getFloat(3));
		}
		st.close();
		con.close();
	} catch(Exception e)
	{
		System.out.println(e);
	}
	

	}

}
