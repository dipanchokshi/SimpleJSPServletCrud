<%-- 
    Document   : index
    Created on : Mar 10, 2015, 9:32:02 AM
    Author     : maitri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRUD Example</title>
    </head>
    <body>
        <jsp:forward page="/UserController?action=listuser" />
    </body>
</html>
