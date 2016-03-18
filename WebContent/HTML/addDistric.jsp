<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="CSS/body.css">
<link rel="stylesheet" type="text/css" href="CSS/update.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%if(session.getAttribute("t")==null)
	{%>
<jsp:forward page="adminLogin.jsp"></jsp:forward>
<%} else{%>

<div align="center">
<h2 >Enter District Data</h2>
<jsp:include page="navigatorjsp.jsp" />
<div class="importdata">
<form action="import.data" method="post" enctype="multipart/form-data">
<input type="file" name="file" size="50">
<input type="submit" value="upload file">
</form>
</div>
<form action="addData.fish"  class="adddata" method="post">
<div ><label><strong>District Name : </strong></label><input type="text" name="distName"></div>
<div ><label><strong>DFO Name : </strong></label><input type="text" name="dfoName" style="margin-left: 13px;"></div>
<div ><label><strong>Mobile :</strong> </label><input type="text" name="mobile" style="margin-left: 50px;"></div>
<div ><label><strong>LandMark :</strong> </label><input type="text" name="landmark" style="margin-left: 38px;"></div>
<div ><label><strong>Office Address : </strong></label><textarea name="address" rows="6" cols="20"></textarea></div>
<div><strong><input type="submit" value="Enter" style="width: 100px;background-color:green;"></strong></div>
</form>
</div>
<%} %>
</body>
</html>