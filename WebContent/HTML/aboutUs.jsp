<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="CSS/body.css">
<link rel="stylesheet" type="text/css" href="CSS/update.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>About Us</title>
</head>
<body>
	<jsp:include page="headerfish.jsp" />
	<jsp:include page="navigatorjsp.jsp" />
	<div class="aboutusmain">
		<div class="aboutus">
			<div class="aboutusheader" align="center">
				<strong>AboutUs</strong>
			</div>
			<div class="aContent">
				<%=request.getAttribute("about")%>
			</div>
		</div>
		<div class="secertory">
			<div class="secertoryheader" align="center">
				<strong>AboutUs</strong>
			</div>
			<div class="secContent">
				<div class="lsec"></div>
				<div class="rsec"><%=request.getAttribute("about")%></div>
			</div>

		</div>
		<div class="director">
			<div class="directorheader" align="center">
				<strong>AboutUs</strong>
			</div>
			<div class="dirContent">
				<div class="ldir"></div>
				<div class="rdir"><%=request.getAttribute("about")%></div>

			</div>
		</div>
	</div>
</body>
</html>