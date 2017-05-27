<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
    <title> - 登录</title>
    <link rel="shortcut icon" href="${ctxStatic}/img/favicon.ico">
    <link href="${ctxStatic}/css/bootstrap.min.css" rel="stylesheet">
    <link href="${ctxStatic}/css/font-awesome.css?v=4.4.0" rel="stylesheet">
    <link href="${ctxStatic}/css/animate.css" rel="stylesheet">
    <link href="${ctxStatic}/css/style.css" rel="stylesheet">
    <link href="${ctxStatic}/css/login.css" rel="stylesheet">
</head>
<body class="signin">
<div class="signinpanel">
    <div class="row">
        <div>${error}</div>
        <div class="col-sm-12">
            <form action="/netServer/login" method="post">
                <h4 class="no-margins">登录：</h4>
                <p class="m-t-md">登录到H+后台主题UI框架</p>
                <input type="text" name="username" class="form-control uname" placeholder="用户名" />
                <input type="password" name="password" class="form-control pword m-b" placeholder="密码" />
                <a href="">忘记密码了？</a>
                <button class="btn btn-success btn-block">登录</button>
            </form>
        </div>
    </div>
    <div class="signup-footer">
        <div class="pull-left">
            &copy; hAdmin
        </div>
    </div>
</div>
</body>
</html>
