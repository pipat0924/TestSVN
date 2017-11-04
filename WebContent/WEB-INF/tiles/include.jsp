<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
</head>
<body>
	 <!-- Bootstrap core CSS-->
	  <link href="<c:url value="/resources/vendor/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">
	  <!-- Custom fonts for this template-->
	  <link href="<c:url value="/resources/vendor/font-awesome/css/font-awesome.min.css" />" rel="stylesheet" type="text/css">
	  <!-- Custom styles for this template--> 
	  <link href="<c:url value="/resources/css/sb-admin.css" />" rel="stylesheet">
<!--      Bootstrap core JavaScript  -->
    <script src="<c:url value="/resources/vendor/jquery/jquery.min.js"/>"></script>
    <script src="<c:url value="/resources/vendor/popper/popper.min.js"/>"></script>
    <script src="<c:url value="/resources/vendor/bootstrap/js/bootstrap.min.js"/>"></script>
<!--     Core plugin JavaScript -->
    <script src="<c:url value="/resources/vendor/jquery-easing/jquery.easing.min.js"/>"></script>
<!--     Custom scripts for all pages -->
    <script src="<c:url value="/resources/js/sb-admin.min.js"/>"></script>
    <script src="<c:url value="/resources/js/common/dataManager.js"/>"></script>
</body>
</html>