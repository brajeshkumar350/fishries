package org.bihar.gov.fisheries.main;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bihar.gov.fisheries.DAO.JDBCUtil;

@WebServlet(name="adddata",urlPatterns={"/addData.fish"})
public class AddDistData extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		try {
		
		String distName=req.getParameter("distName");
		String dfoName=req.getParameter("dfoName");
		String mobile=req.getParameter("mobile");
		long mobile1=Long.parseLong(mobile);
		System.out.println(mobile1);
		String landmark=req.getParameter("landmark");
		String address=req.getParameter("address");
		String sql="insert into distdata values('"+distName+"','"+dfoName+"',"+mobile1+",'"+landmark+"','"+address+"')";
		
			PreparedStatement p=JDBCUtil.getConnection().prepareStatement(sql);
			int r=p.executeUpdate();
			if(r==1)
			{
				RequestDispatcher rd=req.getRequestDispatcher("/HTML/addDistric.jsp");
				rd.forward(req, res);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			RequestDispatcher rd=req.getRequestDispatcher("/HTML/addDistric.jsp");
			rd.forward(req, res);
			e.printStackTrace();
		}
		
		
	}

}
