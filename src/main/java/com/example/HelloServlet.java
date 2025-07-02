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
        out.println("body { margin: 0; padding: 0; overflow: hidden; font-family: 'Segoe UI', sans-serif; color: white; background-color: #000; }");
        out.println("canvas { position: fixed; top: 0; left: 0; z-index: -1; }");
        out.println("header { background-color: rgba(0,0,0,0.7); padding: 20px 0; text-align: center; }");
        out.println("main { padding: 60px 20px; text-align: center; }");
        out.println("h1 { font-size: 40px; margin-bottom: 20px; }");
        out.println("p { font-size: 20px; margin: 10px 0; }");
        out.println(".about-me { background-color: rgba(255,255,255,0.1); padding: 30px; border-radius: 12px; display: inline-block; margin-top: 40px; }");
        out.println("a { color: #ffd700; text-decoration: none; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<canvas id='stars'></canvas>");
        out.println("<header>");
        out.println("<h1>🚀 Project1 Java Web App</h1>");
        out.println("</header>");
        out.println("<main>");
        out.println("<h1>Hello, Jenkins + Tomcat Deployment was Successful! 🎉</h1>");
        out.println("<p>This servlet is deployed and running inside Tomcat on your CI/CD pipeline.</p>");
        out.println("<div class='about-me'>");
        out.println("<h2>👨‍💻 About Me: Sreeharinath Peetla</h2>");
        out.println("<p>DevOps & Automation Enthusiast from Bengaluru 🇮🇳</p>");
        out.println("<p>3+ years of experience in Production Support, CI/CD, Monitoring, and Scripting.</p>");
        out.println("<p>Skilled in Jenkins, Ansible, AWS, Kubernetes, Git, and Shell/Python.</p>");
        out.println("<p>Email: <a href='mailto:sreeharinathp@gmail.com'>sreeharinathp@gmail.com</a></p>");
        out.println("</div>");

        // ❤️ Conditional Love Message Block
        String message = request.getParameter("msg");
        if (message != null && message.toLowerCase().contains("continent")) {
            out.println("<div style='margin-top:40px; font-size:32px; color:#ff69b4;'>");
            out.println("❤️ Love You, Sreeharinath! 🌍🌹💖");
            out.println("</div>");
        }

        out.println("</main>");

        // JavaScript for animated stars
        out.println("<script>");
        out.println("const canvas = document.getElementById('stars');");
        out.println("const ctx = canvas.getContext('2d');");
        out.println("let stars = [];");
        out.println("function resize() { canvas.width = window.innerWidth; canvas.height = window.innerHeight; }");
        out.println("window.addEventListener('resize', resize); resize();");
        out.println("for (let i = 0; i < 150; i++) { stars.push({ x: Math.random() * canvas.width, y: Math.random() * canvas.height, r: Math.random() * 1.5, d: Math.random() * 0.5 }); }");
        out.println("function draw() { ctx.clearRect(0, 0, canvas.width, canvas.height); ctx.fillStyle = 'white'; ctx.beginPath(); for (let i = 0; i < stars.length; i++) { let s = stars[i]; ctx.moveTo(s.x, s.y); ctx.arc(s.x, s.y, s.r, 0, Math.PI * 2, true); } ctx.fill(); update(); }");
        out.println("function update() { for (let i = 0; i < stars.length; i++) { let s = stars[i]; s.y += s.d; if (s.y > canvas.height) { s.y = 0; s.x = Math.random() * canvas.width; } } }");
        out.println("function animate() { draw(); requestAnimationFrame(animate); } animate();");
        out.println("</script>");

        out.println("</body>");
        out.println("</html>");
    }
}

