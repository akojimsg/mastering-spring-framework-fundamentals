package com.akojimsg.msff;

import com.akojimsg.msff.business.AnotherServiceImpl;
import com.akojimsg.msff.business.MyService;
import com.akojimsg.msff.business.MyServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Simple spring application
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("com.akojimsg.msff");

        MyService service1 = ctx.getBean(MyServiceImpl.class);
        service1.doBussinessLogic();

        MyService service2 = ctx.getBean(AnotherServiceImpl.class);
        service2.doBussinessLogic();

    }
}
