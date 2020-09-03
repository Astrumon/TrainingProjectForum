<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <title>Сообщения</title>
</head>
<body>

<div class="form-style-2">
    <div class="form-style-2-heading">
        Messages List by user ID.
        <c:set var="messagesType" scope="page" value="${messagesType}"/>
        <c:set var="userName" scope="page" value="${userName}"/>
        <c:if test="${messagesType.length()!=0}"><p>${messagesType} messages of ${userName}. </p> ></c:if>
    </div>
    <form:form modelAttribute="messageViewForm" action="${pageContext.request.contextPath}/MessagesPage/withForm" method="post">
        <table>
            <tr>
                <td><form:label path="userId">User id</form:label></td>
                <td><form:input class="input-field" type="text" path="userId" id="userId"/></td>
            </tr>
            <tr>
                <form:select class="form-style-2" size="3" required="true" path="messageType" id="messageType">
                    <form:option value="ALL">ALL</form:option>
                    <form:option value="SENT">SENT</form:option>
                    <form:option value="RECEIVED">RECEIVED</form:option>
                </form:select>
            </tr>
            <tr>
                <td><input type="submit" value="Find user`s messages."/></td>
            </tr>
        </table>
    </form:form>
</div>


<div class="form-style-2">
    <h2>Founded messages.</h2>
    <table class="form-style-2">
        <c:forEach items="${messages}" var="message">
        <th>
            <div>
        <td>

            <h2>From: ${message.userId}</h2>
            <h2>To: ${message.sendToId}</h2>
            <p><strong>=${message.title}</strong></p>
            <br>
            <h3>${message.message}</h3>
            <br>
            <h4><em>${message.date}</em></h4>
        </td>
</div>

</th>
</c:forEach>

</tablxe>
</div>

</body>
</html>
