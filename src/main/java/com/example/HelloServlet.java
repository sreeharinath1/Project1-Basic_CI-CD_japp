package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Welcome to Project1</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; background-color: #f4f4f4; text-align: center; padding-top: 50px; }");
        out.println("h1 { color: #2c3e50; }");
        out.println("p { color: #555; font-size: 18px; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>🚀 Hello from Project1 Web App!</h1>");
        out.println("<p>Your deployment was successful and this servlet is running on Tomcat.</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
