package org.example.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    private static final ApplicationContext context = new AnnotationConfigApplicationContext("org.example"); //Paquete raiz

    public static ApplicationContext getContext() {
        return context;
    }

}