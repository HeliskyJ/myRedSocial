<%-- 
    Document   : register
    Created on : 03-dic-2018, 14:02:03
    Author     : hely
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
    </head>
    <body>
          <h1>Ingresar usuario</h1>
        <form action="/myRed/s" method="post">
            <div class="uno">
            <label> user:</label> 
            <input type="text" name="u" placeholder="Ingresa tu usuario" >
            <br> <br>
            <label> password:</label>
            <input type="password" name="pas" placeholder="Ingresa tu password" >
            <br> <br>
            <label> first name:</label> 
            <input type="text" name="fir" placeholder="Ingresa tu nombre" >
            <br> <br>
            <label> last name:</label> 
            <input type="text" name="las" placeholder="Ingresa tu apellido" >
            <br> <br> </div>
            <button class="but" > <a href=""> Regresar </a></button>
            <button class="button"> Enviar </button> 
            
        </form>
    </body>
</html>
