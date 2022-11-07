package com.akojimsg.msff;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App
{
    public static void main( String[] args ) {
        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext("com.akojimsg.msff");
        ctx.start();
        ctx.close();
    }
}
