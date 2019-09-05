package day03.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @Title ApplicationFilter
 * @Decription TODO
 * @Data 2019/9/5 11:44
 * @Author cloud
 * @Version 1.0
 **/
@WebFilter(urlPatterns = "/*", initParams = {
        @WebInitParam(name = "Number", value = "1")
})
public class ApplicationFilter implements Filter {

    private FilterConfig config;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter before");
        servletResponse.setContentType("text/html");
        servletResponse.setCharacterEncoding("utf-8");
        servletResponse.getWriter().print("前面" + config.getInitParameter("Number"));
        filterChain.doFilter(servletRequest, servletResponse);
        servletResponse.getWriter().print("后面");
        System.out.println("doFilter after");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.config = filterConfig;
        System.out.println("init filter");
    }

    @Override
    public void destroy() {
        System.out.println("destroy filter");
    }
}
