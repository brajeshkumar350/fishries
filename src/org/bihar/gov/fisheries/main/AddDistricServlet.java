package org.bihar.gov.fisheries.main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name="adddistric",urlPatterns={"/addDistric.fish"})
public class AddDistricServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		HttpSession ses=req.getSession();
		RequestDispatcher rd=req.getRequestDispatcher("/HTML/addDistric.jsp");
		rd.forward(req, res);	
	}

}
