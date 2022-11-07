package com.akojimsg.msff;

import com.akojimsg.msff.config.DevelopmentConfig;
import com.akojimsg.msff.config.ProductionConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Simple spring application
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(DevelopmentConfig.class, ProductionConfig.class);

        MyService service = ctx.getBean(MyService.class);
        service.doBussinessLogic();
    }
}
