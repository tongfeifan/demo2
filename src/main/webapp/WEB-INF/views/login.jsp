<%--
  Created by IntelliJ IDEA.
  User: tongfeifan
  Date: 16/4/6
  Time: 下午2:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<jsp:include page="header.jsp" />
<head>
    <title>login</title>

</head>
<body>
<div class="container">
    <div class="jumbotron">
    </div>
    <div class="col-md-4">

    </div>
    <div class="col-md-4 alert alert-info" style="padding: 10px;">
        <div style="padding: 5px;"><h3>请登录</h3></div>
        <form method="post">
            <div class="form-group">
                <input type="text" name="username" id="usernmae" placeholder="username" class="form-control"/>
            </div>
            <div class="form-group">
                <input type="password" name="password" id="password" placeholder="password" class="form-control" />
            </div>
            <div class="checkbox">
                <label>
                    <input type="checkbox"> 记住我
                </label>
            </div>
            <input type="submit" value="登陆" class="btn btn-primary">
            <a href="/register" >注册</a>
        </form>
    </div>
</div>

</body>
</html>
