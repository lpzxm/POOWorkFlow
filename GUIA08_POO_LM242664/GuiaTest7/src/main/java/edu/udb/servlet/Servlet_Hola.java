package edu.udb.servlet;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;


@jakarta.servlet.annotation.WebServlet(name = "Servlet_Hola", urlPatterns = {"/Servlet_Hola"})
public class Servlet_Hola extends HttpServlet {

    protected void doPost(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws jakarta.servlet.ServletException, IOException {
        ProcessRequest(request,response);
    }

    protected void doGet(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws jakarta.servlet.ServletException, IOException {
        ProcessRequest(request,response);
    }

    protected void ProcessRequest(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws jakarta.servlet.ServletException, IOException {
        try(java.io.PrintWriter out = response.getWriter()){
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet_Hola</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Resultado de Servlet_Hola</h1>");
            out.println("<p>");
            out.println("<b>Nombre de la persona: </b>" +
                    request.getParameter("nombre").toString()+"<br>");
            out.println("<b>Apellido de la persona: </b>"+request.getParameter("apellido").toString());
            out.println("</p>");
            out.println("</body>");
            out.println("</html>");

        }
    }
}