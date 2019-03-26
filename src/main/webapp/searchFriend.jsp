<%-- 
    Document   : searchFriend
    Created on : 09-dic-2018, 20:31:55
    Author     : hely
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Amagos</title>
    </head>
    <body>
        <h1>Amagator</h1>
             <div class="uno">
            <select name="amigos">
                <c:forEach items="${a}" var="aa">
                    <option id="n" value="${aa.id}"> 
                    ${aa.user_name}
                    </option>
                </c:forEach>
            </select>
             </div>
    </body>
</html>
