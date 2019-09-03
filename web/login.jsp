<%--
  Created by IntelliJ IDEA.
  User: cloud
  Date: 2019/9/3
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="assets/css/bootstrap.css">
</head>
<body>
<div class="container-fluid row  justify-content-center">
    <form class="col-4" action="login">
        <div class="form-group">
            <label class="form-text" for="">用户</label>
            <input class="form-control" name="us" type="text">
        </div>
        <div class="form-group">
            <label class="form-text" for="">密码</label>
            <input class="form-control" name="ps" type="password">
        </div>
        <div>
            <input class="btn btn-primary" type="submit" value="提交">
        </div>
    </form>
</div>
</body>
</html>
