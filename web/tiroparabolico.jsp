<%-- 
    Document   : tiroparabolico
    Created on : 09-mar-2020, 19:16:30
    Author     : DAW203
--%>

<%@page import="modelo.Tiro"%>
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
            Tiro mitiro = (Tiro) request.getAttribute("tiro");
            
            String velocidad, angulo, alcance, maxaltura;
            
            if(mitiro != null){
                velocidad = String.valueOf(mitiro.getVelocidadinicial());
                angulo = String.valueOf(mitiro.getAngulo());
                alcance = String.valueOf(mitiro.getMaxalcance());
                maxaltura = String.valueOf(mitiro.getMaxaltura());
            }
            else{
                velocidad = "";
                angulo = "";
                alcance = "";
                maxaltura = "";
            }
        %>
        <form action="tiroparabolico" method="post">
            <label for="velocidad">Velocidad (m/s):</label><input type="text" value="<%=velocidad%>" name="velocidad" id="velocidad"><br><br>
            <label for="angulo">Ángulo: </label>
            <select name="angulo" id="angulo">
                <% for (int i=0; i<angulos.size();i++) { 
                String anguloSelected = "";
                if(angulo.equals(angulos.get(i))){
                    anguloSelected = "selected";
                }
                %>
                <option value="<%=angulos.get(i)%>" <%=anguloSelected%>><%=angulos.get(i)%></option>
                <% } %>
            </select>
            <input type="submit" value="Lanzar">
            <% if(alcance != "") { %>
            <h2>El alcance es: <%=alcance%></h2>
            <% } %>
            <% if(maxaltura != "") { %>
            <h2>La altura máxima es: <%=maxaltura%></h2>
            <% } %>
        </form>
    </body>
</html>
