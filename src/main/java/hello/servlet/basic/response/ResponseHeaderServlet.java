package hello.servlet.basic.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatusCode;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "responseHeaderServlet",urlPatterns = "/response-header")
public class ResponseHeaderServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        //[status-line]
        res.setStatus(HttpServletResponse.SC_BAD_REQUEST);

        //[response-headers]
        res.setHeader("Cache-Control", "no-cache,no-store, must-revalidate");
        res.setHeader("Pragma","no-cache");
        res.setHeader("my-header", "hello");

        content(res);
        redirect(res);

        PrintWriter writer = res.getWriter();
        writer.println("OK");
    }

    private void content(HttpServletResponse res) {
        res.setContentType("text/plain");
        res.setCharacterEncoding("utf-8");
    }

    private void cookie(HttpServletResponse res) {
        Cookie cookie = new Cookie("cookie", "good");
        cookie.setMaxAge(600);
        res.addCookie(cookie);
    }

    private void redirect(HttpServletResponse res) throws IOException {
//        res.setStatus(HttpServletResponse.SC_FOUND);
//        res.setHeader("Location", "/basic/hello-form.html");
        res.sendRedirect("/hello-form.html");
    }
}
