<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

/* String name= (String) request.getAttribute("name");

Integer id=(Integer) request.getAttribute("id");

List<String> friends = (List<String>) request.getAttribute("f"); */

%>

<h1> Hello My name is
<%-- <%= name %> --%>


  ${name }
  </h1>
  
  
  
  <h1>
  
  my rollnumber is 
  <%-- <%=rollnumber %> --%>
  ${rollnumber }
  
  
  
  
  </h1>
  
 

</body>
</html>