<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
  String reguser = request.getParameter("reguser");
    request.setAttribute("reguser",reguser);
%>
<html>
  <head>
    <title>图书后台管理登录界面</title>
  </head>
  <body>
  <center>
    <h1>登录 | <a href="/regist.do">注册</a></h1>
    <form action="/login.do" method="post">
      <table width="350px" cellspacing="0px" cellpadding="0px" border="1px">
        <tr>
          <td>用户名</td>
          <c:choose>
            <c:when test="${reguser!=null}">
              <td><input type="text" name="username" value="${reguser}" ></td>
            </c:when>
              <c:otherwise>
                <td><input type="text" name="username" placeholder="用户名为3-12位字母数字或下划线组合" ></td>
              </c:otherwise>
          </c:choose>

        </tr>
        <tr>
          <td>密&nbsp;码</td>
          <td><input type="password" name="password" placeholder="长度为6-12位的纯数字" ></td>
        </tr>
        <tr>
          <td colspan="2" style="text-align:center">
            <input type="submit" value="登录">
            <input type="reset" value="取消">
          </td>
        </tr>
      </table>
    </form>
  </center>
  </body>
</html>