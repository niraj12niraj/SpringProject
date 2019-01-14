<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style></style>
<script type="text/javascript">


</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="navbar.jsp" />
	<h2>Save User Records!</h2>
	<div class="col-sm-5" style="width:160px;align-content:center ;background-color: pink;border: 1px solid green; padding-left: 10px;">
	<form:form action="/SpringProject/saveUser" method="POST">
	<!-- <div class="col-sm-1">Id</div><div class="col-sm-3"><input type="text" name="id"></div> -->
	<div class="row"><div class="col-sm-1" style="left: -5px">Name</div><div class="col-sm-3"><input type="text" name="name" required="required"></div></div>
	<div class="col-sm-1">Mobile</div><div class="col-sm-3"><input type="text" name="mobile" required="required"></div>
	<div class="col-sm-1">Address</div><div class="col-sm-3"><input type="text" name="address" required="required"></div>
	<div class="col-sm-1">Role</div><div class="col-sm-3"><input type="text" name="role"></div>
	<div class="col-sm-1">Email</div><div class="col-sm-3"><input type="text" name="email" required="required"></div>
	<div class="col-sm-1">Password</div><div class="col-sm-3"><input type="password" name="password" required="required"></div><br>
	<div class="col-sm-1" align="center" style="padding-left:-10px;"><input type="submit" value="Sumbit"></div>
	</form:form>
	</div>
	<div class="col-sm-7" style="background-color: white; border: 1px 1px 1px 1px;"></div>
	
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>  
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>  
  
 <%--  <jsp:include page="searchUser.jsp" /> --%>
</body>
</html>
