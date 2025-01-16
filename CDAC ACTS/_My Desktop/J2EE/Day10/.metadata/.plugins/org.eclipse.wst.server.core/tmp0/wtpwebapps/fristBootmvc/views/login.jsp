<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
    <form:form action="authenticate" modelAttribute="objuser">
        UName: <form:input path="userName"/><br/>
        Pwd: <form:password path="password"/><br/>
        <form:button>Login</form:button>
    </form:form>
</body>
</html>
