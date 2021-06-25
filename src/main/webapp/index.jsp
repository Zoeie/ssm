<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/12/2
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
        System.out.println("basePath:"+basePath);
    %>
    <base href="<%=basePath%>">
</head>
<body>
    <h2>SSM</h2>
    <a href="user/list">查找所有</a><br/>
    <form action="user/saveUser" method="post">
        姓名：<input type="text" name="userName"/><br/>
        <input type="submit" value="提交"><br/>
    </form>
    <br/>
    <form action="user/findUserById" method="post">
        id：<input type="text" name="id"/><br/>
        <input type="submit" value="提交"><br/>
    </form>
</body>
</html>
