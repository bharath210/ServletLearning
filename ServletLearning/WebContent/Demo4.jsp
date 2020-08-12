<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Function Tags</title>
</head>
<body>
 <c:set var="str" value="Bharath Kumar is learning java by watching youtube videos"/>
 	${fn:length(str)}<br>
 	${fn:contains(str, java)}<br>
 	<br>
 	<c:forEach items="${fn:split(str, ' ') }" var="s">
 		${s} <br>
 	</c:forEach><br>
 	<c:if test="${fn:contains(str,'java') }">
 	 java is here
 	</c:if><br>
 	${fn:indexOf(str,"java") }
 	
</body>
</html>