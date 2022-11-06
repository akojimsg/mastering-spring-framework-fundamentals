package com.akojimsg.msff;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Simple spring application
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
        MyService bean = ctx.getBean(MyService.class);
        bean.doSomething();
    }
}
