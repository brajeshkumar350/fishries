package org.bihar.gov.fisheries.main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name="logout",urlPatterns={"/logout.fish"})
public class LogoutServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		HttpSession ses=req.getSession();
		String page="";
		if(ses.getAttribute("t")==null)
		{			
			page="/HTML/adminLogin.jsp";
		}
		else
		{
			ses.invalidate();
			page="/HTML/adminLogin.jsp";
		}
		RequestDispatcher rd=req.getRequestDispatcher(page);
		rd.forward(req, res);
	}

}
