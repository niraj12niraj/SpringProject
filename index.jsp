<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
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
  <li><a href="<c:url value="/login/"/>">Login</a></li>
  <li><a href="<c:url value="/fblogin/"/>">LoginByFacebook</a></li>
  <li style="float:right"><a href="#about">About</a></li>
</ul>
<%-- <h2>Hello World!</h2>
<a href="<c:url value="/welcome/"/>">welcome</a>
<br><br>
<a href="<c:url value="/registration/"/>">Click For Registration</a> --%>
</body>
</html>
