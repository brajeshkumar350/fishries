package org.bihar.gov.fisheries.main;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bihar.gov.fisheries.DAO.JDBCUtil;

@WebServlet(name="contact",urlPatterns={"/Contact.fish"})
public class ContactDetailsServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String sql="select distname from distdata";
		List<String> namelist=new ArrayList<>();
		try
		{
			PreparedStatement p=JDBCUtil.getConnection().prepareStatement(sql);
			ResultSet rs=p.executeQuery();
			while(rs.next())
			{
				namelist.add(rs.getString(1));
			}
			req.setAttribute("namelist", namelist);
			
		}
		catch(Exception e)
		{
			
		}
		RequestDispatcher rd=req.getRequestDispatcher("/HTML/contact.jsp");
		rd.forward(req, res);
	}

}
