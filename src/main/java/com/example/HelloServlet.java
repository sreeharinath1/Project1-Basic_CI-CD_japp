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
        out.println("body { margin: 0; padding: 0; font-family: 'Segoe UI', sans-serif; background-color: #000; color: white; }");
        out.println("canvas { position: fixed; top: 0; left: 0; z-index: -1; }");
        out.println("header { background-color: rgba(0,0,0,0.7); padding: 20px; text-align: center; }");
        out.println("main { padding: 40px 20px; text-align: center; }");
        out.println(".about-me { background-color: rgba(255,255,255,0.1); padding: 30px; border-radius: 12px; display: inline-block; margin-top: 40px; }");
        out.println("button.like-btn { margin-top: 30px; padding: 15px 30px; font-size: 18px; border: none; border-radius: 8px; background-color: #ff4081; color: white; cursor: pointer; transition: 0.3s; }");
        out.println("button.like-btn:hover { background-color: #e91e63; }");
        out.println(".love-message { display: none; position: fixed; top: 50%; left: 50%; transform: translate(-50%, -50%);");
        out.println("background-color: rgba(0, 0, 0, 0.7); padding: 40px; border-radius: 15px; color: #ff69b4; font-size: 30px; text-align: center; z-index: 1000; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<canvas id='stars'></canvas>");

        out.println("<header><h1>🚀 Project1 Java Web App</h1></header>");
        out.println("<main>");
        out.println("<h1>Hello, Jenkins + Tomcat Deployment was Successful! 🎉</h1>");
        out.println("<p>This servlet is deployed and running inside Tomcat on your CI/CD pipeline.</p>");
        out.println("<div class='about-me'>");
        out.println("<h2>👨‍💻 About Me: Sreeharinath Peetla</h2>");
        out.println("<p>DevOps & Automation Enthusiast from Bengaluru 🇮🇳</p>");
        out.println("<p>3+ years in Production Support, CI/CD, Monitoring, Scripting</p>");
        out.println("<p>Skilled in Jenkins, Ansible, AWS, Kubernetes, Git, and Shell/Python</p>");
        out.println("<p>Email: <a href='mailto:sreeharinathp@gmail.com'>sreeharinathp@gmail.com</a></p>");
        out.println("</div>");

        // Like button
        out.println("<button class='like-btn' onclick='showLove()'>❤️ Like</button>");

        // Love message overlay
        out.println("<div class='love-message' id='loveMsg'>❤️ Love You from Sree 💖</div>");

        out.println("</main>");

        // Stars background
        out.println("<script>");
        out.println("const canvas = document.getElementById('stars');");
        out.println("const ctx = canvas.getContext('2d');");
        out.println("let stars = [];");
        out.println("function resize() { canvas.width = window.innerWidth; canvas.height = window.innerHeight; }");
        out.println("window.addEventListener('resize', resize); resize();");
        out.println("for (let i = 0; i < 150; i++) { stars.push({ x: Math.random() * canvas.width, y: Math.random() * canvas.height, r: Math.random() * 1.5, d: Math.random() * 0.5 }); }");
        out.println("function draw() { ctx.clearRect(0, 0, canvas.width, canvas.height); ctx.fillStyle = 'white'; ctx.beginPath(); for (let i = 0; i < stars.length; i++) { let s = stars[i]; ctx.moveTo(s.x, s.y); ctx.arc(s.x, s.y, s.r, 0, Math.PI * 2); } ctx.fill(); update(); }");
        out.println("function update() { for (let i = 0; i < stars.length; i++) { let s = stars[i]; s.y += s.d; if (s.y > canvas.height) { s.y = 0; s.x = Math.random() * canvas.width; } } }");
        out.println("function animate() { draw(); requestAnimationFrame(animate); } animate();");
        out.println("</script>");

        // JS for Love Message
        out.println("<script>");
        out.println("function showLove() { document.getElementById('loveMsg').style.display = 'block'; }");
        out.println("</script>");

        out.println("</body>");
        out.println("</html>");
    }
}

