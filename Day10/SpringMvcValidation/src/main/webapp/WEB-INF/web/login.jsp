<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
</head>
<body>

    <form:form action="login" modelAttribute="objUser" method="post">
        <div>
            <label for="userName">Username: </label>
            <form:input path="userName" id="userName" />
            <form:errors path="userName" cssStyle="color:red;" />
        </div>
        <br>

        <div>
            <label for="password">Password: </label>
            <form:input path="password" id="password" />
            <form:errors path="password" cssStyle="color:red;" />
        </div>
        <br>

        <div>
            <button type="submit">Login</button>
        </div>
    </form:form>

</body>
</html>
