package com.akojimsg.msff;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("application-context.xml");
    }
}
