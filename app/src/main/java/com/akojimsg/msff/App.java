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

        MyService service = ctx.getBean(MyService.class);
        service.doBussinessLogic();

        MyRepository repository = ctx.getBean(MyRepository.class);
        repository.doQuery();
    }
}
