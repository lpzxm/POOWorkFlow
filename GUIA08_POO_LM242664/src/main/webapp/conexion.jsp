<%--
  Created by IntelliJ IDEA.
  User: usuario
  Date: 28/03/2025
  Time: 7:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Connection conexion = null;
    //private Statement s =null;
    ResultSet rs = null;
    PreparedStatement st = null;
    Class.forName("com.mysql.jdbc.Driver");
// Se obtiene una conexión con la base de datos.
    conexion =
            DriverManager.getConnection("jdbc:mysql://localhost:3308/personabddg8", "root", "");
    String valor;
%>
