<%--
  Created by IntelliJ IDEA.
  User: cloud
  Date: 2019/9/3
  Time: 17:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="assets/css/bootstrap.css">
</head>
<body>
    <%
        out.print("session-us:" + session.getAttribute("us"));
    %>
</body>
</html>
