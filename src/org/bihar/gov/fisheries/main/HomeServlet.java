package org.bihar.gov.fisheries.main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="home",urlPatterns={"/home.fish"})
public class HomeServlet  extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {


		RequestDispatcher rd=req.getRequestDispatcher("/HTML/home.jsp");
		rd.forward(req, res);
	}

}
