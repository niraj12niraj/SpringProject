<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
 $("#search-form").submit(function() {
	  var action = $("#selectsearch").val() == "Id" ? "Name" : "content";
	  $("#search-form").setAttribute("action", "/selectsearch/" + action);
	}); 
	
 var myaction=document.querySelector('action');

</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <jsp:include page="navbar.jsp" />
	<h2>Search User Details!</h2>
	<div>
	<form id="search-form" class="search-form" action="/SpringProject/searchUser" method="post">
	<select id="selectsearch" class="form-select" name="selectsearch" >
	<option value="" >Search User</option>
	<option value="id">Search User By Id</option>
	<!-- <option value="name" >Search User By Name</option>
	<option value="mobile">Search User By Mobile</option> -->
	</select>
	<input type="text" value="" name="id" class="form-text">
	<input type="submit" value="Search">
	</form>
	</div>
	<div>
	<c:if test="{not empty user}">
	<table class="data">
	<thead>
	<tr><th>ID</th>
	<th>Name</th>
	<th>Mobile</th>
	<th>Role</th>
	<th>Email</th>
	<th>&amp;nbsp;</th>
	</tr>
	</thead>
	<tr>
	<%-- <c:forEach items="${us}" var="user"> --%>
	<td>{user.id}</td>
	<td>{user.name}</td>
	<td>{user.mobile}</td>
	<td>{user.role}</td>
	<td>{user.email}</td>
	<%-- </c:forEach> --%>
	</tr>
	</table>
	</c:if>
	</div>
</body>
</html>
 
