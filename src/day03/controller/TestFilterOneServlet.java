package day03.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Title TestFilterOneServlet
 * @Decription TODO
 * @Data 2019/9/5 11:50
 * @Author cloud
 * @Version 1.0
 **/
@WebServlet("/day03/testFilterOne")
public class TestFilterOneServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print("servlet");
        System.out.println("servlet");
    }
}
