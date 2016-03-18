package org.bihar.gov.fisheries.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.bihar.gov.fisheries.DAO.LoginCredentail;

@WebServlet(name="login",urlPatterns={"/login.fish"})
public class LoginServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		
		String uname=req.getParameter("uname");
		String pass=req.getParameter("pwd");
		String username=null;
		String password=null;
		try {
			username=LoginCredentail.getFieldValue("name");
			password=LoginCredentail.getFieldValue("password");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean u=false;
		boolean p=false;
		if(uname!=null && uname.length()!=0)
		{
			if(uname.equals(username))
			{
				u=true;
			}
		}
		if(pass!=null && pass.length()!=0)
		{
			if(pass.equals(password))
			{
				p=true;
			}
		}
		String page="";		
		if(u==true && p==true)
		{
			page="/HTML/updateData.jsp";
		}
		else
		{
			req.setAttribute("msg", "please enter correct username or passord");
			page="/HTML/adminLogin.jsp";
		}
		
		HttpSession ses=req.getSession();
		
		ses.setAttribute("t", "t");
		
		RequestDispatcher rd=req.getRequestDispatcher(page);
		rd.forward(req, res);
		
		
	}
	

}
