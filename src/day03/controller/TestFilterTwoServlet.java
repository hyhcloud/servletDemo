package day03.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Title TestFilterTwoServlet
 * @Decription TODO
 * @Data 2019/9/5 13:38
 * @Author cloud
 * @Version 1.0
 **/
@WebServlet("/day03/testFilterTwo")
public class TestFilterTwoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        重定向会重新进入Filter过滤器，是客户端再次请求服务端
//        resp.sendRedirect("../day03/testFilterOne");
//        请求转发不会重新触发过滤器，是服务端之间的传输
        req.getRequestDispatcher("../day03/testFilterOne").forward(req, resp);
    }
}
