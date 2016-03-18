<%@page import="java.util.ArrayList"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="CSS/body.css">
<link rel="stylesheet" type="text/css" href="CSS/update.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>District Details</title>
</head>
<jsp:include page="navigatorjsp.jsp" />
<body>
<% Object str=request.getAttribute("data");
String[] st=(String[])str;
String[] st1={"Dist Name"," DFO Name"," Mobile Number","Landmark","Address"};
for(int i=0;i<st.length;i++)
{
%>
<table class="show" align="center">
<tr><td><strong><%=st1[i]+"  :-  " %></strong></td><td><%=st[i] %></td></tr>
</table>
<%} %>


</body>
</html>