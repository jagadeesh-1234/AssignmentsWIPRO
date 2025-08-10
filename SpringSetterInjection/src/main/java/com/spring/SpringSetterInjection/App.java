package com.spring.SpringSetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Order order = applicationContext.getBean("orderBean",Order.class);
        order.showOrderDetails();
    }
}
