<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: still
  Date: 25.08.2020
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <link href="<c:url value="/resources/css/styles.css"/>" rel="stylesheet" type="text/css">
    <title>Регистрация пользователя</title>
</head>
<body>

<div class="form-style-2">
    <div class="form-style-2-heading">
        Please Sign Up!
    </div>
    <form action="${pageContext.request.contextPath}/UserRegisterForm/SignIn" method="post">
    <table>

        <tr>
            <td><label for="nickname">Nickname</label></td>
            <td><input class="input-field" type="text" name="nickname" id="nickname"></td>
        </tr>
        <tr>
            <td><label for="firstName">First name</label></td>
            <td><input class="input-field" type="text" name="firstName" id="firstName"></td>
        </tr>
        <tr>
            <td><label for="lastName">Last name</label></td>
            <td><input class="input-field" type="text" name="lastName" id="lastName"></td>
        </tr>
        <tr>
            <td><label for="email">Email</label></td>
            <td><input class="input-field" type="email" name="email" id="email"></td>
        </tr>
        <tr>
            <td><label for="password">Password</label></td>
            <td><input class="input-field" type="password" name="password" id="password"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Add user!"></td>
        </tr>

    </table>
    </form>
  </div>


<div class="form-style-2">
    Already have an account? Log in!
    <form action="/login-page" method="get"><input class="form-style-2" type="submit" value="Log in" ></form>
</div>

<div class="form-style-2">
    <div class="form-style-2-heading">
        Already in System!
    </div>
    <table>
        <tr class="form-style-2">
            <th>First Name</th>
            <th>Last Name</th>
            <th>Nickname</th>
        </tr>
        <c:forEach items="${UsersFromServer}" var="user">
            <tr>
                <td>${user.firstName}</td>
                <td>${user.lastName}</td>
                <td>${user.nickname}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
