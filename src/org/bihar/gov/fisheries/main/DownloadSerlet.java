package org.bihar.gov.fisheries.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bihar.gov.fisheries.DAO.JDBCUtil;

@WebServlet(name="donwload",urlPatterns={"/donload"})
public class DownloadSerlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String s=req.getParameter("filen");
		res.setContentType("text/html");  
		PrintWriter out = res.getWriter();  
		String filepath = "D:\\fileDonwload\\"; 
		try {
			PreparedStatement ps=JDBCUtil.getConnection().prepareStatement("select faddress from requirement;");
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				
				filepath=rs.getString(1);
			}
		
		res.setContentType("APPLICATION/OCTET-STREAM");   
		res.setHeader("Content-Disposition","attachment; filename=\"" + s + "\"");   

		FileInputStream fileInputStream = new FileInputStream(filepath + s);  

		int i;   
		while ((i=fileInputStream.read()) != -1) {  
		out.write(i);   
		}   
		fileInputStream.close();   
		out.close(); 
		JDBCUtil.cleanUp(rs, ps, JDBCUtil.getConnection());
		}
		catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
