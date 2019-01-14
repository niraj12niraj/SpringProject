<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #584;
}

li {
  float: left;
   border-right: 1px 1px 1px 1px solid #485;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover {
  background-color: #7896;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<ul>
  <li><a class="active" href="#home">Home</a></li>
  <li><a href="<c:url value="/welcome/"/>">Welcome</a></li>
  <li><a href="<c:url value="/registration/"/>">Registration</a></li>
   <li><a href="<c:url value="/records/"/>">User List</a></li>
  <li style="float:right"><a href="#about">About</a></li>
</ul>
	
	
	<div>
	 <%-- <table>
    <tr>
  
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
</table>  --%>
<table width="50%">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Email</th>
		<th>Phone</th>
	</tr>
	<c:forEach items="${user.userob}" var="us" varStatus="status">
		<tr>
			<td>${us.id}</td>
			<td>${us.name}</td>
			<td>${us.email}</td>
			<td>${us.mobile}</td>
		</tr>
	</c:forEach>
</table>

	</div>
	
</body>
</html>
