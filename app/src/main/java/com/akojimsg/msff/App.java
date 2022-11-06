package com.akojimsg.msff;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Simple spring application
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
        MyService beanOne = ctx.getBean(MyService.class);
        MyService beanTwo = ctx.getBean(MyService.class);
        MyService beanThree = ctx.getBean(MyService.class);
    }
}
