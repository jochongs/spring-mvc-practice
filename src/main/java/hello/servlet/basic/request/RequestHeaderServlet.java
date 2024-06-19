package hello.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "hello", urlPatterns = "/request-header")
public class RequestHeaderServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        printRequest(req);
        res.getWriter().write("response");
    }

    private static void printRequest(HttpServletRequest req) {
        System.out.println("-------- Header start ---------");
        System.out.println(req);
        String method = req.getMethod();
        System.out.println(method);

        req.getHeaderNames().asIterator().forEachRemaining(System.out::println);
        System.out.println("-------- Header end ---------");
    }
}
