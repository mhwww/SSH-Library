<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册页面</title>
</head>
<body>
<center>
<form action="${ pageContext.request.contextPath}/register" method="post">
		<table>
			<tr>
				<td>账号</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="password" name="pwd" /></td>
			</tr>
		</table>
		<input type="submit" value="注册">&nbsp;&nbsp;<a href="/login.jsp">登录</a>
	</form>
</body>
</html>