<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
   <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:if test="${not empty mesg}">
    <c:out value="${mesg}"></c:out>
</c:if>
<c:if test="${not empty error}">
    <c:out value="${error}"></c:out>
</c:if>
   <h1>Hello user, <c:out value="${user.getEmailid()}" ></c:out>   </h1>
</body>
</html>