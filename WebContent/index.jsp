<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pipat Pratume Index</title>
<script type="text/javascript">
	function onTest(){
		window.location.href="${pageContext.servletContext.contextPath}/index.html?PAGE=hello";
	}
</script>
</head>
<body>
	<div style="text-align:center">
		<h2>
			Pipat Pratumwan <br/>
		</h2>
		<input type="button" value="submit" onclick="onTest();">
	</div>
	<br/>
	<a href="welcome2.html">Hello Spring</a>
</body>
</html>