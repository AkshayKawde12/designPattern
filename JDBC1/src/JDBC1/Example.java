package JDBC1;
import java.sql.*;
public class Example 
{	
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
				String Url="jdbc:mysql://localhost:3306/mobile"; //database name=mobile
				String Username="root";
				String Password="root";
				String Query="insert into type values('mi',2000,'blue')"; //table name=type
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(Url,Username,Password);
			Statement st=con.createStatement();
			int count=st.executeUpdate(Query);
			 
			System.out.println(count +"row/s affected");

	}
}
