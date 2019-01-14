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
	<h2>User Details!</h2>
	
	<div class="col-sm-6" style="width:200px;align-content:center ;background-color: #4744;border: 1px solid green; padding-left: 10px;">
	<form action="/SpringProject/records/">
	 <table>
    <tr>
  <%-- <a href="<c:url value="/records/"/>">User List</a> --%>
        <td>ID</td>
        <td>${id}</td>
    </tr>
    <tr>
        <td>Name</td>
        <td>${name}</td>
    </tr>
    <tr>
        <td>Address</td>
        <td>${address}</td>
    </tr>
    <tr>
        <td>Mobile</td>
        <td>${mobile}</td>
    </tr>
    <tr>
        <td>Role</td>
        <td>${role}</td>
    </tr><tr>
        <td>Email</td>
        <td>${email}</td>
    </tr>
    <tr>
        <td>Password</td>
        <td>${password}</td>
    </tr>
</table>  </form>
	</div>
	<div>
	<br><br>
	<%-- <a href="<c:url value="/registration/"/>">Go For Registration</a> --%>
	</div>
</body>
</html>
