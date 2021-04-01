<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1><%= "添加账户信息下表单" %></h1>

    <form name="acountForm" action="${pageContext.request.contextPath}/acount/save" method="post">
        账户名称:<input type="text" name="name"><br>
        账户金额:<input type="text" name="money"><br>
        <input type="submit" value="提交账户信息">
    </form>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>