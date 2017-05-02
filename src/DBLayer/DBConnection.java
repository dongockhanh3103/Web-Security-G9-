package DBLayer;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;


public class DBConnection 
{
			public static Connection createConnection() throws SQLException, ClassNotFoundException
			{
				java.sql.Connection conn = null;
				
				Class.forName("com.mysql.jdbc.Driver");
				//config database
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdatabase","root", "ngockhanh");
								
				
				return  conn;
			}
		
}
