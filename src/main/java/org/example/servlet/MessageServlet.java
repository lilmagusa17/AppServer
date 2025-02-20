package org.example.servlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.app.Application;
import org.example.services.MessageService;

@WebServlet("/messageServlet")
public class MessageServlet extends HttpServlet {

    MessageService messageService;

    @Override
    public void init() {
        messageService = (MessageService) Application.getContext().getBean("messageService");
        System.out.println("message service:" + messageService);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String newMessage = req.getParameter("message"); //obtenemos el mensaje
        if (newMessage != null && !newMessage.trim().isEmpty()) { //validamos
            messageService.addMessage(newMessage); //añadimos - enviamos el mensaje
        }
        resp.sendRedirect("./");
    }

}
