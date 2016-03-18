<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="CSS/body.css">
<link rel="stylesheet" type="text/css" href="CSS/maincss.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<jsp:include page="headerfish.jsp" />
<jsp:include page="navigatorjsp.jsp" />
<div class="contact" align="center">
<form action="showcontact.fish" method="post">
<select name="dist">
<% Object l=request.getAttribute("namelist");
List<String> o=(ArrayList<String>)l;
for(String s:o){
%>
<option value="<%=s%>"><%=s%></option>
<%} %>
</select>
<input type="submit" value="Details">

</form>

</div>
<jsp:include page="footerfish.jsp" />
</body>
</html>