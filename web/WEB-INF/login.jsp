<%-- 
    Document   : login
    Created on : Oct 11, 2020, 10:38:03 PM
    Author     : 798382
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="login" method="post">
            Username: <input type="text" name ="username"><br>
            Password: <input type="password" name="password"><br>
            <input type="submit" name="action" value="Log in">
            
        </form>
    </body>
</html>
