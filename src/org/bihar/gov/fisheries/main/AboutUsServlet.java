package org.bihar.gov.fisheries.main;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bihar.gov.fisheries.DAO.JDBCUtil;

@WebServlet(name="about",urlPatterns={"/AboutUs.fish"})
public class AboutUsServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String s=null;
		try
		{
			String sql="select about from aboutUs";
			PreparedStatement ps=JDBCUtil.getConnection().prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				s=rs.getString(1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		req.setAttribute("about", s);
		RequestDispatcher rd=req.getRequestDispatcher("/HTML/aboutUs.jsp");
		rd.forward(req, res);
		
		
	}

}
