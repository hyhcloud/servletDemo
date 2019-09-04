<%@ page import="java.io.IOException" %>
<%@ page import="java.util.*" %><%--
  Created by IntelliJ IDEA.
  User: cloud
  Date: 2019/9/4
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //    输出头信息
    Enumeration<String> headerNames = request.getHeaderNames();
    while (headerNames.hasMoreElements()) {
        String element = headerNames.nextElement();
        out.print(element + " : " + request.getHeader(element));
        out.print("<br>");
    }
%>
<!-- request有关信息 start -->
<%
    out.print("---------------------------------------------------------------------------");
    out.print("<br>");
    out.print("upgrade-insecure-requests : " + request.getIntHeader("upgrade-insecure-requests"));
    out.print("<br>");
%>
<%
    out.print("<br>");
    out.print("request.getProtocol() : " + request.getProtocol());
    out.print("<br>");
%>
<%
    // 输出项目的虚拟目录
    out.print("<br>");
    out.print("request.getContextPath() : " + request.getContextPath());
    out.print("<br>");
%>
<%
    // 输出pathname
    out.print("<br>");
    out.print("request.getRequestURI() : " + request.getRequestURI());
    out.print("<br>");
%>
<%
    // 输出全路径
    out.print("<br>");
    out.print("request.getRequestURL() : " + request.getRequestURL());
    out.print("<br>");
%>
<%
    // 输出项目的servlet的相对路径，除通配符以外
    out.print("<br>");
    out.print("request.getServletPath() : " + request.getServletPath());
    out.print("<br>");
%>
<%
    // 输出 servlet 端口号
    out.print("<br>");
    out.print("request.getServerPort() : " + request.getServerPort());
    out.print("<br>");
%>
<%
    // 输出 servlet 通配信息
    out.print("<br>");
    out.print("request.getPathInfo() : " + request.getPathInfo());
    out.print("<br>");
%>
<%
    // 输出 servlet search 信息
    out.print("<br>");
    out.print("request.getQueryString() : " + request.getQueryString());
    out.print("<br>");
%>
<%
    // 输出 request 请求方法
    out.print("<br>");
    out.print("request.getMethod() : " + request.getMethod());
    out.print("<br>");
%>
<!-- request有关信息 end -->

<!-- request 重点信息 start -->
<%
    // 获取指定名称的参数值
    out.print("---------------------------------------------------------------------------");
    out.print("<br>");
    out.print("request.getParameter(\"us\") : " + request.getParameter("us"));
    out.print("<br>");
%>
<%
    // 获取指定名称的多个参数值
    out.print("<br>");
    String[] us = request.getParameterValues("us");
    if (us != null) {
        for (String u : us) {
            out.print("request.getParameterValues() : " + u);
            out.print("<br>");
        }
    }
%>
<%
    // 获取指定名称的参数值
    out.print("<br>");
    Map<String, String[]> parameterMap = request.getParameterMap();
    out.print("request.getParameterMap() : ");
    out.print("<br>");
    if (parameterMap != null) {
//        parameterMap.forEach((str,index) -> {
//            try {
//                out.print(index.toString() + "request.getParameterMap() : ");
//                out.print("<br>");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        });

        Set<String> strings = parameterMap.keySet();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            out.print(next + " : " + Arrays.toString(parameterMap.get(next)));
            out.print("<br>");
        }
    }
%>

<!-- request 重点信息 end -->

<!-- request相关用户信息 start -->
<%
    out.print("---------------------------------------------------------------------------");
    // 输出地址
    out.print("<br>");
    out.print("request.getRemoteUser() : " + request.getRemoteUser());
    out.print("<br>");
%>
<%
    // 输出地址
    out.print("<br>");
    out.print("request.getRemoteAddr() : " + request.getRemoteAddr());
    out.print("<br>");
%>
<!-- request相关用户信息 end -->


</body>
</html>
