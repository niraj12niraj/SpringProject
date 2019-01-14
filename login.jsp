<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="navbar.jsp" />

	<h2 style="color: graytext;">User Login!</h2>
	<div>
	<form action="/SpringProject/loginController/logon" method="POST">
	<!-- <div class="col-sm-1">Id</div><div class="col-sm-3"><input type="text" name="id"></div> -->
	<div class="col-sm-1">Email</div><div class="col-sm-3"><input type="text" name="email"></div>
	<div class="col-sm-1">Password</div><div class="col-sm-3"><input type="password" name="pass"></div>
	<div class="col-sm-1" align="left"><input type="submit" value="Login"></div>
	</form>
	</div>
	
</body>
</html>
