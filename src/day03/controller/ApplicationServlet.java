package day03.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Title ApplicationServlet
 * @Decription TODO
 * @Data 2019/9/5 10:55
 * @Author cloud
 * @Version 1.0
 **/
@WebServlet("/day03/getAttribute")
public class ApplicationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = this.getServletContext();
        if (servletContext.getAttribute("visitNum") == null) {
            servletContext.setAttribute("visitNum", 1);
        } else {
            servletContext.setAttribute("visitNum", (int) servletContext.getAttribute("visitNum") + 1);
        }
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("w");
        resp.getWriter().print("访问量：" + servletContext.getAttribute("visitNum"));
    }
}
