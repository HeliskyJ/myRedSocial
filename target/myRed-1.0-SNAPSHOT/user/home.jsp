<%-- 
    Document   : home
    Created on : 03-dic-2018, 14:27:33
    Author     : hely
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
	<link rel="stylesheet" href="https://necolas.github.io/normalize.css/3.0.2/normalize.css">
	<title>Lista de Tareas</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/estilon.css" type="text/css">
         
          
    </head>
    <body>
        <nav>
            <ul class="navi">
                <li><b><a href="/myRed/search"> Friend<a></b></li>
                <li><a><b>SearchFriend</b></a></li>
                <li><a><b>FriendRequest</b></a></li>
                <li><b><a href="/myRed/out"> Logout </a></b></li>
            </ul>           
        </nav>
        <div class="principal">
            <div class="caja">
            <form class="formulario"  onsubmit="return validate()" method="post" action="/myRed/new"> 
                <input id="tareaInput" name="postform"> 
                <input type="button" class="boton" id="btn-agregar" value="POST!">
            </form>
            </div>
        </div>
        <hr><hr><hr>
            <div class="tareas">
                <div class="caja">
                <ul id="lista2" class="lista2">
          <c:forEach items="${usu}" var="pot">
                  <li> ${pot.user.id}</li>
                  <li> ${pot.user.user_name}</li>
                  <li> ${pot.user.first_name}</li>
                  <li> ${pot.user.last_name}</li>
                  <li> ${pot.id}</li>
                   <li>${pot.message}</li>
                   <li>${pot.post_date}</li>
                   <br><br>
                </ul>
            </c:forEach>
            </div>
         </div>
    </div>
        
        
        <script type="text/javascript">
            function validate() {
                var text = document.getElementById("in");
                if (text.value !== "") {
                  return true;
                } 
                alert("ops! No puedes enviar texto en blanco");
                return false;
            }   
        </script>   
        <script>            
            var sec = documento.createElement("div");
            var no =  document.createElemnt(in);
            sec.appendChild(no);
            
            var parent = document.getElementById("todo");
            
            parent.appendChild(ul);
           </script>
           

<script type="text/javascript">
  function actualizar(){location.reload(true);}
//Función para actualizar cada 4 segundos(4000 milisegundos)
  setInterval("actualizar()",9000);
</script>
           <script src="js/main.js"></script>
    </body>
</html>
