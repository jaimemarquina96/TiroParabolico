<%-- 
    Document   : tiroparabolico
    Created on : 09-mar-2020, 19:16:30
    Author     : DAW203
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Tiro Parabólico</h1>
        <%
            ArrayList<String> angulos = (ArrayList<String>) request.getAttribute("angulos");
        %>
        <form action="tiroparabolico" method="post">
            <label for="velocidad">Velocidad (m/s):</label><input type="text" name="velocidad" id="velocidad"><br><br>
            <label for="angulo">Ángulo: </label>
            <select name="angulo" id="angulo">
                <% for (int i=0; i<angulos.size();i++) { 
                String anguloSelected = "";
                %>
                <option value="<%=angulos.get(i)%>"><%=angulos.get(i)%></option>
                <% } %>
            </select>
            <input type="submit" value="Lanzar">
        </form>
    </body>
</html>
