package org.bihar.gov.fisheries.main;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class FileImportServlet
 */
@WebServlet(name="fileupload",urlPatterns={"/import.data"})
@MultipartConfig(location="D:/upload",fileSizeThreshold=1024*1024*10, maxFileSize= 1024*1024*50)
public class FileImportServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Collection<Part> parts=request.getParts();
		for (Part part : parts) {
			String header=part.getHeader("content-disposition");
			String[] fnames=header.split("\"");
			String fname=fnames[fnames.length-1];
			part.write(fname);
		}
		RequestDispatcher rd=request.getRequestDispatcher("HTML/addDistric.jsp");
		rd.forward(request, response);
		
		
	}

}
