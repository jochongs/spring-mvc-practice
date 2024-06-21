package hello.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.util.StreamUtils;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

@WebServlet(name = "requestBodyStringServe", urlPatterns = "/request-body-string")
public class RequestBodyStringServe extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");

        System.out.println("name = " + name);
//        System.out.println("===========");
//        System.out.println(req.getParameter("name"));
//
//        ServletInputStream inputStream = req.getInputStream();

//        System.out.println("===========");
//        String body = new BufferedReader(new InputStreamReader(inputStream))
//                .lines()
//                .collect(Collectors.joining("\n"));
//        System.out.println(body);

//        System.out.println("===========");
//        String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);
//        System.out.println(messageBody);
    }
}
