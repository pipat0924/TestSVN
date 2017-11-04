<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>  
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title><tiles:insertAttribute name="title" ignore="true" /></title>
<tiles:insertTemplate template="include.jsp" />

 
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" id="mainNav">
	    <a class="navbar-brand" href="index.html">Start Bootstrap</a>
	    <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
	      <span class="navbar-toggler-icon"></span>
	    </button>
	    <div class="collapse navbar-collapse" id="navbarResponsive">
	<!-- menu -->
			<tiles:insertAttribute name="menu" />  
	<!-- header -->

			<tiles:insertAttribute name="header"/>
		</div>
    </nav>
    		<br/>
			<br/>
			<br/>
	 <div class="content-wrapper">
	  	<div><tiles:insertAttribute name="body" /></div>
   	 </div>
	
<%--     <div style="clear:both"><tiles:insertAttribute name="footer" /></div>  --%>
 </body>   

</html>
