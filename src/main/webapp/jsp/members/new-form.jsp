<%--
  Created by IntelliJ IDEA.
  User: jochong
  Date: 6/23/24
  Time: 4:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>가입하기</title>
</head>
<body>
    <form action="/jsp/members/save.jsp" method="post">
        username: <input type="text" name="username" />
        age:      <input type="text" name="age" />
        <button type="submit">전송</button>
    </form>
</body>
</html>
