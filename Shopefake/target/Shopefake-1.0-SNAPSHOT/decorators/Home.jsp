
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/Comons/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title><dec:title default="Home" /></title>
    <link hrefl="<c:url value='/Template/Home/assets/favicon.ico'/>"/>
    <link href="<c:url value='/Template/Home/bootstrap/css/bootstrap.min.css' />" rel="stylesheet" type="text/css" media="all"/>
    <link href="<c:url value='/Template/Home/css/style.css' />" rel="stylesheet" type="text/css" media="all"/>
    
</head>
<body>
	<!-- header -->
    <%@ include file="/Comons/Home/Header.jsp" %>
    <!-- header -->
    
    <div class="container">
    	<dec:body/>
    </div>

	<!-- footer -->
	<%@ include file="/Comons/Home/Footer.jsp" %>
	<!-- footer -->
	
    <script type="text/javascript" src="<c:url value='/Template/Home/js/scripts.js' />"></script>
    <script type="text/javascript" src="<c:url value='/Template/Home/bootstrap/js/bootstrap.bundle.min.js' />"></script>
	
</body>
</html>
