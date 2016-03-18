<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="CSS/body.css">
<link rel="stylesheet" type="text/css" href="CSS/login.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin</title>
</head>
<body>
<jsp:include page="headerfish.jsp" />
<jsp:include page="navigatorjsp.jsp" />
<div class="login" align="center">
<form action="login.fish" method="post" class="lform">
<div><label style= "margin-right: 20px;">Name :</label><input type="text" name="uname" value="username"/></div>
<div><label>Password :</label><input type="password" name="pwd" value=""/></div>
<div><label ></label><input style="width: 80px" type="submit" value="Login"></div>
</form>
<% String msg=null;%>
<div><% msg=(String)request.getAttribute("msg");
if(msg!=null){ %>
${msg}
<%} %>
</div>
</div> 


</body>
</html>