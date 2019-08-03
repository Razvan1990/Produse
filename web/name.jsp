<%--
  Created by IntelliJ IDEA.
  User: Razvan&Elena
  Date: 0003. 3 august. 2019
  Time: 12:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!--toate datele din hello,jsx se va duce in html hello-->
<!--locul in care se afla action e hello-->
<!--submit stie ca trebuie sa efectueze actiunea-->
    <form method ="post" action ="hello">
        Name: <input type ="text" name ="name"> <br>
        <input type ="submit" value ="Send">

    </form>
</body>
</html>
