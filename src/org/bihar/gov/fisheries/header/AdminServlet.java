package org.bihar.gov.fisheries.header;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;

@WebServlet(name="admin",urlPatterns={"/admin.fish"})
public class AdminServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		HttpSession ses=req.getSession();
		System.out.println("ses-----"+ses);
		RequestDispatcher rd=req.getRequestDispatcher("/HTML/adminLogin.jsp");
		rd.forward(req, res);
	}

}
