package org.bihar.gov.fisheries.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil
{
	
	static
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConnection() throws SQLException
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fisheries","root","brajesh");
		return con;
		
	}
	
	public static void cleanUp(Statement st,Connection con) throws SQLException
	{
		if(st!=null)st.close();
		if(con!=null)con.close();
		
	}
	
	public static void cleanUp(ResultSet rs,Statement st,Connection con) throws SQLException
	{
		if(rs!=null)st.close();
		if(st!=null)st.close();
		if(con!=null)con.close();
		
	}

}
