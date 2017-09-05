<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<html>
<head>
    <title> - 登录</title>
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
                <c:if test="${1>1}">
                    <div class="validateCode">
                        <label class="input-label mid" for="validateCode">验证码</label>
                        <sys:validateCode name="validateCode" inputCssStyle="margin-bottom:0;"/>
                    </div>
                </c:if>
                <a href="">忘记密码了？</a>
                <label for="rememberMe" title="下次不需要再登录"><input type="checkbox" id="rememberMe" name="rememberMe" ${rememberMe ? 'checked' : ''}/> 记住我（公共场所慎用）</label>
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
