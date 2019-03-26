<%-- 
    Document   : noUser
    Created on : 03-dic-2018, 16:06:54
    Author     : hely
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/style.css" type="text/css">
    </head>
    <body>
        <h1>Usuario o contrasenia incorrecta.</h1>
          <form action="/myRed/lo" method="post">
                <label>usuario</label>
                <input type="text" id="un" name="u" placeholder="type usurio"/> <br> <br> 
                <br><br>
                <label>Contrasenia:</label>
                 <input type="password" id="cont" name="con" placeholder="type password"/> <br> <br>
                <br><br>
                <button class="but" > <a href="index.jsp"> Regresar </a></button>
                <button> iniciar Sesion</button>
            </form>
    </body>
</html>
