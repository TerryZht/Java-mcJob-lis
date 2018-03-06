<%--
  Created by IntelliJ IDEA.
  User: byit02
  Date: 2018/2/25
  Time: 22:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加菜品</title>
    <style type="text/css">
    </style>
</head>
<body>
<center>
    <h1>菜品添加</h1>
    <form action="/mooc_food/FoodAddServlet" method="post" >
        <table border="1px" width="400px" cellspacing="0px" cellpadding="0px">
            <tr>
                <td>菜品&nbsp;ID</td>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <td>菜&nbsp;&nbsp;名</td>
                <td><input type="text" name="foodName"></td>
            </tr>

            <tr>
                <td>菜品图片</td>
                <td><input type="file" name="foodImage"></td>
            </tr>
            <tr>
                <td>价&nbsp;&nbsp;格</td>
                <td><input type="text" name="price"></td>
            </tr>
            <tr>
                <td>菜品描述</td>
                <td>
                    <textarea name="description"></textarea>
                </td>
            </tr>
            <tr   style="text-align:center;width:20px">
                <td colspan="2">
                    <input type="submit" value="添加">
                    <input type="reset" value="重置">
                </td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
