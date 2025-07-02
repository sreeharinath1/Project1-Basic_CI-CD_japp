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
        out.println("<title>Project1 - Sree CI/CD</title>");
        out.println("<style>");
        out.println("body { margin: 0; padding: 0; font-family: 'Segoe UI', sans-serif; background-color: #000; color: white; overflow-x: hidden; }");
        out.println("canvas { position: fixed; top: 0; left: 0; z-index: -1; }");
        out.println("header { background: rgba(0, 0, 0, 0.8); padding: 20px 0; text-align: center; font-size: 24px; }");
        out.println("main { text-align: center; padding: 50px 20px; }");
        out.println(".about-me { background: rgba(255,255,255,0.1); padding: 30px; border-radius: 12px; margin-top: 30px; display: inline-block; }");
        out.println("a { color: #ffcc00; text-decoration: none; }");

        // 💖 Like Button Style
        out.println(".like-btn { margin-top: 40px; padding: 15px 40px; font-size: 18px; font-weight: bold;");
        out.println("background: linear-gradient(145deg, #ff5f6d, #ffc371); color: white; border: none; border-radius: 30px;");
        out.println("box-shadow: 0 10px 20px rgba(255, 99, 132, 0.5); transition: transform 0.2s ease; cursor: pointer; }");
        out.println(".like-btn:hover { transform: scale(1.05); background: linear-gradient(145deg, #ff416c, #ff4b2b); }");

        // 💬 Love Message Animation
        out.println("#loveMsg { display: none; position: fixed; top: 50%; left: 50%; transform: translate(-50%, -50%);");
        out.println("background: rgba(255, 255, 255, 0.1); padding: 40px 60px; border-radius: 20px;");
        out.println("color: #ff69b4; font-size: 32px; font-weight: bold; text-align: center;");
        out.println("box-shadow: 0 0 40px rgba(255, 105, 180, 0.6); animation: fadeIn 1s ease-out; z-index: 9999; }");

        // 💥 Animation
        out.println("@keyframes fadeIn { from {opacity: 0; transform: scale(0.8);} to {opacity: 1; transform: scale(1);} }");

        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<canvas id='stars'></canvas>");

        out.println("<header>Jenkins + Tomcat Web App Deployed Successfully</header>");
        out.println("<main>");
        out.println("<h1>Welcome to Project1!</h1>");
        out.println("<p>This servlet is running inside Tomcat with CI/CD from Jenkins.</p>");

        out.println("<div class='about-me'>");
        out.println("<h2>‍About Me: Sreeharinath lover of nihi </h2>");
        out.println("<p>DevOps Engineer | Bengaluru 🇮🇳</p>");
        out.println("<p>CI/CD • Kubernetes • Jenkins • Ansible • AWS • Tools</p>");
        out.println("<p>Email: <a href='mailto:sreeharinathp@gmail.com'>sreeharinathp@gmail.com</a></p>");
        out.println("</div>");

        out.println("<br><button class='like-btn' onclick='showLove()'>❤️ Like</button>");
        out.println("<div id='loveMsg'>Love You from Sree...thanks for like </div>");
        out.println("</main>");

        // 🌌 Stars Background
        out.println("<script>");
        out.println("const canvas = document.getElementById('stars'); const ctx = canvas.getContext('2d'); let stars = [];");
        out.println("function resize() { canvas.width = window.innerWidth; canvas.height = window.innerHeight; }");
        out.println("window.addEventListener('resize', resize); resize();");
        out.println("for (let i = 0; i < 150; i++) { stars.push({ x: Math.random()*canvas.width, y: Math.random()*canvas.height, r: Math.random()*1.5, d: Math.random()*0.5 }); }");
        out.println("function draw() { ctx.clearRect(0, 0, canvas.width, canvas.height); ctx.fillStyle='white'; ctx.beginPath(); stars.forEach(s => { ctx.moveTo(s.x, s.y); ctx.arc(s.x, s.y, s.r, 0, Math.PI * 2); }); ctx.fill(); update(); }");
        out.println("function update() { stars.forEach(s => { s.y += s.d; if (s.y > canvas.height) { s.y = 0; s.x = Math.random() * canvas.width; } }); }");
        out.println("function animate() { draw(); requestAnimationFrame(animate); } animate();");
        out.println("</script>");

        // ❤️ JS to Show Message
        out.println("<script>");
        out.println("function showLove() { const msg = document.getElementById('loveMsg'); msg.style.display = 'block'; msg.style.animation = 'fadeIn 0.8s ease'; }");
        out.println("</script>");

        out.println("</body>");
        out.println("</html>");
    }
}

