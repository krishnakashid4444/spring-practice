<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

    String name=(String) request.getAttribute("name");
    Integer rollnumber = (Integer) request.getAttribute("rollnumber");
   
%>

<h1>

Hello My name is <%= name %> </h1>

<h1> This is help page </h1>

<h1>  my rollnumber is  <%= rollnumber %></h1>

<h1> Hello My name is krishna</h1>
<h1> This is help page</h1>

</body>
</html>