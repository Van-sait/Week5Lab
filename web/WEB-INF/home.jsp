<%-- 
    Document   : home
    Created on : Oct 11, 2020, 10:38:42 PM
    Author     : 798382
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <form action="home" method="get">
            Hello ${user.username}.
 
        </form>
              <a href="login?logout">Log out</a> 
              
    </body>
</html>
