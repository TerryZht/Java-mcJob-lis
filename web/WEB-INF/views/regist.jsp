<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册界面</title>
</head>
<body>
<center>
    <h1>用户注册</h1>
    <form action="/mooc/RegistServlet.do" method="post" >
        <table width="400px" cellspacing="0px" cellpadding="0px" border="1px">
            <tr>
                <td>用户名</td>
                <td><input type="text" name="username" placeholder="用户名为3-12位字母数字或下划线组合" ></td>
            </tr>
            <tr>
                <td>密&nbsp;码</td>
                <td><input type="password" name="password" placeholder="密码长度为6-12位的纯数字"  id="password"></td>
            </tr>
            <tr>
                <td>确认密码</td>
                <td><input type="password" name="checkPWD" placeholder="密码长度为6-12位的纯数字" id="checkPWD"></td>
            </tr>
            <tr>
                <td>手机号码</td>
                <td><input type="text" name="phone" placeholder="请输入正确的手机号码格式" ></td>
            </tr>
            <tr>
                <td>邮箱</td>
                <td><input type="email" name="email" placeholder="请输入正确邮箱格式" required="required"></td>
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
<script>

</script>
</html>