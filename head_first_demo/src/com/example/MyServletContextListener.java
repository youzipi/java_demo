package com.example;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * project_name:java_demo
 * package_name:PACKAGE_NAME
 * user: youzipi
 * date: 2014/9/1
 */
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent event) {
        ServletContext sc = event.getServletContext();
        String dogType = sc.getInitParameter("type");
        Dog dog = new Dog(dogType);
        sc.setAttribute("dog", dog);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
