<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<head>
</head>
<body>
		<div id="message" style="margin-top: 10px;margin-left: 10px">
            <div class="list-group panel">
                <c:forEach var="listValue" items="${message}">
				${listValue.NAME_ST}
				</c:forEach>
            </div>
        </div>
</body>
</html>