package day02.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Title LogoutServlet
 * @Decription TODO
 * @Data 2019/9/3 17:28
 * @Author cloud
 * @Version 1.0
 **/
public class LogoutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Cookie[] cookies = req.getCookies();
//        for (Cookie cookie : cookies) {
//            cookie.setMaxAge(0);
//            resp.addCookie(cookie);
//            System.out.println(cookie.getName());
//        }

        HttpSession session = req.getSession();
        // 删除 session 的三种方式
        // invalidate() session 无效化
//        session.invalidate();
        // 删除 session 的属性
        session.removeAttribute("us");
        // 设置最大存活时间，请求时会刷新 单位：秒
//        session.setMaxInactiveInterval(10);
        req.getRequestDispatcher("login.jsp").forward(req, resp);
    }
}
