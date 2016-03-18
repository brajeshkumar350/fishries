package org.bihar.gov.fisheries.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginCredentail 
{
	public static String getFieldValue(String filedName) throws SQLException
	{
		String username=null;
		PreparedStatement ps=JDBCUtil.getConnection().prepareStatement("select "+filedName+" from user");
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			username=rs.getString(1);
		}
		
		return username;

	}
	

}
