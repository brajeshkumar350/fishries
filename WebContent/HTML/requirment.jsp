<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="CSS/donwload.css">
<link rel="stylesheet" type="text/css" href="CSS/login.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Requirement</title>
</head>
<body>
<jsp:include page="headerfish.jsp" />
<jsp:include page="navigatorjsp.jsp" />
<div class="requirement" align="center">
<h4>Requirement OF the Months</h4>
<%
Object o=request.getAttribute("file");
ArrayList<String> a=(ArrayList<String>)o;
for(int i=0;i<a.size();i++)
{
%>
<div><a href="donload?filen=<%=a.get(i)%>" target="_blank"><%=a.get(i)%></a></div>
<%
}
%>

</div>

</body>
</html>