<%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
<%@ page import="org.example.services.MessageService" %>
<%@ page import="org.example.app.Application" %>
<%@ page import="org.example.services.HelloService" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<%
    //HelloService helloService = (HelloService) Application.getContext().getBean("helloService");
    MessageService messageService = (MessageService) Application.getContext().getBean("messageService");

    out.println("<ul>");
    for(String message : messageService.getMessages()){
        out.println( "<li> " + message + "</li>");
    }
    out.println("</ul>");
%>

<form action="messageServlet" method="post">
    <input type="text" name="message">
    <input type="submit">
</form>

</body>
</html>
