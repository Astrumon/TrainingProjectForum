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
    <title>Записки пользователей</title>
</head>
<body>

<div class="form-style-2">
    <div class="form-style-2-heading">
        Notes List by user ID.
    </div>
    <form action="${pageContext.request.contextPath}/NoteList" method="get">
        <table>

            <tr>
                <td><label for="userId">User id</label></td>
                <td><input class="input-field" type="text" name="userId" id="userId"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Find user`s notes"></td>
            </tr>
        </table>
    </form>
</div>


<div class="form-style-2">
    <h2>Founded notes.</h2>
    <table class="form-style-2">
    <c:forEach items="${notesList}" var="note">
        <th>
            <div>
        <td>
            <p>User id: ${note.user.id}</p>
            <p>
            <h2>${note.title}</h2></p>
            <p>
            <h3>${note.text}</h3></p>
            <p><em>${note.creationDate}</em></p>
        </td>
        </div>
        </th>
    </c:forEach>

</table>
</div>

</body>
</html>
