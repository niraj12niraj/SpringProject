
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ page import="com.my.spring.fb.FbConnection"%>
<%
 FbConnection fbConnection = new FbConnection();
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="navbar.jsp" />

	<h2>Welcome FaceBook Success</h2>
	<div>
	<form action="/SpringProject/fbhome/fb" method="POST">
	<input type="submit" value="Get Info">
	</form>
	<div>
<c:if test="${!empty fbProfileData}">
<table class="data">
<tr>
   <th>Id</th>
	<th>Name</th>
	<th>Mobile</th>
	<th>Address</th>
    <th>&amp;nbsp;</th>
</tr>

<c:forEach  items="${fbProfileData}" var="u">
<td>${u}</td>
   <tr><td>${u.id}</td>
	<td>${u.name}</td>
	<td>${u.mobile}</td>
	<td>${u.address}</td>
    </tr>
</c:forEach>

</table>
</c:if>
	</div>
	</div>
</body>
</html>