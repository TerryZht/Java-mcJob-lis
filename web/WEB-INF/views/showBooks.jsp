<%--
  Created by IntelliJ IDEA.
  User: byit02
  Date: 2018/2/28
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书查询</title>
    <script type="text/javascript" src="/resources/js/jquery-1.4.2.js"></script>
</head>
<body>
<center>
    <h1>图书查询</h1>
    <p>
        图书ID：<input type="text" name="bookID">
        图书名：<input type="text" name="bookName">
        分类：<input type="text" name="catgoryName">
        <input type="submit" value="查询" id="search">
    </p>
    <hr>
    <table width="800px" cellspacing="0px" cellpadding="0px" border="1px">
        <thead>
        <tr>
            <th>图书ID</th>
            <th>书名</th>
            <th>分类</th>
            <th>价格</th>
            <th>描述</th>
        </tr>
        </thead>
        <tbody id="cont">

        <tr>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
        </tr>

        </tbody>
    </table>
</center>

</body>
</html>
