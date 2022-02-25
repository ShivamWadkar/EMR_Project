<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<% 
	String msg = (String)request.getAttribute("errormsg");
	if(msg != null){
		
		%>
		
		<font color="red"> <%=msg %></font>
		
		<%
	}
%>
<form action="verify" method="post">
<pre>
	Enter UserName : <input type="text" name="uname"/>
	
	Enter password : <input type="password" name="pass"/>
	
	<input type="submit" value="Login"/>
</pre>
</form>
</body>
</html>