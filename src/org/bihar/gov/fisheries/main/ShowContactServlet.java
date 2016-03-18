package org.bihar.gov.fisheries.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bihar.gov.fisheries.DAO.JDBCUtil;

@WebServlet(name="showcontact",urlPatterns={"/showcontact.fish"})
public class ShowContactServlet extends HttpServlet 
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String distName=req.getParameter("dist");
		String[] str=new String[5];
		try
		{
			String sql="select * from distdata where distname='"+distName+"'";
			PreparedStatement p=JDBCUtil.getConnection().prepareStatement(sql);
			ResultSet rs=p.executeQuery();			
			if(rs.next())
			{
				str[0]=rs.getString(1);
				str[1]=rs.getString(2);
				str[2]=rs.getString(3);
				str[3]=rs.getString(4);
				str[4]=rs.getString(5);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		req.setAttribute("data", str);
		
		RequestDispatcher rd=req.getRequestDispatcher("/HTML/showDetails.jsp");
		rd.forward(req, res);
		

	
	}

}
