<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Spring MVC Tutorial by Crunchify - Hello World Spring MVC
	Example</title>
<style type="text/css">
body {
	background-image: url('http://crunchify.com/bg.png');
}
</style>
</head>
<body>${message}

	<br>
	<br>
	<div style="font-family: verdana; padding: 10px; border-radius: 10px; font-size: 12px; text-align:center;">
 
		Spring MCV Tutorial by <a href="http://crunchify.com">Crunchify</a>.
		Click <a
			href="http://crunchify.com/category/java-web-development-tutorial/"
			target="_blank">here</a> for all Java and <a
			href='http://crunchify.com/category/spring-mvc/' target='_blank'>here</a>
		for all Spring MVC, Web Development examples.<br>
		<br>
		<br>
		<input type="label" value="${message}"/>
		<c:if test="${not empty message}">
			<ul>
				<c:forEach var="listValue" items="${message}">
					<li>${listValue.ID_ST}</li>
					<li>${listValue.NAME_ST}</li>
				</c:forEach>
			</ul>
		</c:if>
	</div>

</body>
</html>