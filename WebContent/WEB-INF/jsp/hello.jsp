<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">
var ajax = new asyncAjax();
	function onClickGot(){
		 var dat = ajax.ajaxElement();
		console.log("data===="+dat.text);
		$("#gif").val(dat);
		$("#ms1").val("");

// 		window.location.href="${pageContext.servletContext.contextPath}/got/gotinclude.html";
	}
</script>
</head>
<body>
<br/>
<br/>
<p/>
	<div style="text-align:center">
		<h2>
		
		<input id="ms1" value="${message4}"/>
		</h2>
		<input type="button" value="submit" onclick="onClickGot();">
		<input type="label" id="gif"/>
	</div>
</body>
</html>