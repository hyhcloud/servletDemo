package day02.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Title UserServlet
 * @Decription TODO
 * @Data 2019/9/3 16:27
 * @Author cloud
 * @Version 1.0
 **/
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Cookie[] cookies = req.getCookies();
//        for (Cookie c: cookies) {
//            if (c.getValue().equals("admin")) {
//                req.getRequestDispatcher("user.jsp").forward(req,resp);
//                return;
//            }
//        }

        HttpSession session = req.getSession();
        System.out.println(session.getAttribute("us"));
        if ("admin".equals(session.getAttribute("us"))){
            req.getRequestDispatcher("user.jsp").forward(req,resp);
            return;
        }
        resp.sendRedirect("login.jsp");
    }
}
