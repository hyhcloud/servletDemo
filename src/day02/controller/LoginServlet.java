package day02.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Title LoginServlet
 * @Decription TODO
 * @Data 2019/9/3 16:17
 * @Author cloud
 * @Version 1.0
 **/
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String us = req.getParameter("us");
        String ps = req.getParameter("ps");
        HttpSession session = req.getSession();

//        if ("admin".equals(us) && ps.equals("admin")) {
//            Cookie cookie = new Cookie("us", us);
//            resp.addCookie(cookie);
//            resp.sendRedirect("user");
//        }

        System.out.println(us + "---" + ps);
        if ("admin".equals(us) && ps.equals("admin")) {
            session.setAttribute("us",us);
            resp.sendRedirect("./user");
        }

    }
}
