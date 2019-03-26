<%-- 
    Document   : login
    Created on : 03-dic-2018, 14:21:10
    Author     : hely
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" href="css/style.css" type="text/css">
    </head>
    <body>
      <h1> Iniciar sesion</h1>
        <div>
            <form action="/myRed/lo" method="post">
                <label>usuario</label> <br>
                <input type="text" id="un" name="u" placeholder="type usurio"/> <br> <br> 
                <br><br>
                <label>Contrasenia:</label><br>
                 <input type="password" id="cont" name="con" placeholder="type password"/> <br> <br>
                <br><br>
                <button class="but" > <a href="/myRed/register.jsp"> Registrarme</a></button>
                <button class="bu" > Iniciar Sesion</button>
            </form>
        </div>
    </body>
</html>
