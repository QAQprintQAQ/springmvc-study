<%--
  Created by IntelliJ IDEA.
  User: imliw
  Date: 2020/10/7
  Time: 22:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

    <form action="/helloworld" method="post">
<%--      这里的/helloworld是浏览器的地址栏,理论上可以是任何的名字,它作用就是显示在地址栏的helloworld--%>

      <input type="text" name="method">
      <input type="submit">
    </form>
  </body>
</html>
