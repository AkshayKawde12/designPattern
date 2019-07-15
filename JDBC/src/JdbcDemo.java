import java.sql.*;
public class JdbcDemo
{
	public static void main(String[] args) throws Exception
	{
		String Url="jdbc:mysql://localhost:3306/Bridgelabz";
		String UserName="root";
		String pass="root";
		String Query="select * from login";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(Url,UserName,pass);
		Statement statement=con.createStatement();
		ResultSet resultSet=statement.executeQuery(Query);
		resultSet.next();
		System.out.println(resultSet.getString(1));
		System.out.println(resultSet.getString(2));
		System.out.println(resultSet.getString(3));
	}
}
