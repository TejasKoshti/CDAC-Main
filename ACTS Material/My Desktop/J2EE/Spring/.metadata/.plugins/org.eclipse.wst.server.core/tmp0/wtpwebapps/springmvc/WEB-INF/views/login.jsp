<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>

    <h1><spring:message code="lbl.title"/></h1>
    
    <!-- Spring form for user login -->
    <form:form action="authenticate" method="post" modelAttribute="objuser">
        <div>
            <label for="userName"><spring:message code="lbl.username"/></label>
            <form:input path="userName" id="userName" />
        </div>
        <div>
            <label for="password"><spring:message code="lbl.password"/></label>
            <form:password path="password" id="password" />
        </div>
        <div>
            <form:button type="submit"><spring:message code="lbl.submit"/></form:button>
        </div>
    </form:form>

</body>
</html>
