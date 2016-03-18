package org.bihar.gov.fisheries.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="requirement",urlPatterns={"/Requirement.fish"})
public class RequirementServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{

		/*res.setContentType("text/html");  
		PrintWriter out = res.getWriter();  
		String filename = "test.txt";   
		String filepath = "D:\\";   
		res.setContentType("APPLICATION/OCTET-STREAM");   
		res.setHeader("Content-Disposition","attachment; filename=\"" + filename + "\"");   

		FileInputStream fileInputStream = new FileInputStream(filepath + filename);  

		int i;   
		while ((i=fileInputStream.read()) != -1) {  
		out.write(i);   
		}   
		fileInputStream.close();   
		out.close();   */

		List<String> l=new ArrayList<>();

		File folder = new File("D:\\fileDonwload");
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				l.add(listOfFiles[i].getName());
			} 
		}

		req.setAttribute("file", l);

		RequestDispatcher rd=req.getRequestDispatcher("HTML/requirment.jsp");
		rd.forward(req, res);
	}
}


