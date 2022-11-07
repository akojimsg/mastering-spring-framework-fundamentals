package com.akojimsg.msff;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args ) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService service = ctx.getBean(OrderService.class);
        service.placeOrder();
    }
}
