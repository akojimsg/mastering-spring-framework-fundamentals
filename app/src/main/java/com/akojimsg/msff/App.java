package com.akojimsg.msff;


import org.springframework.aop.framework.ProxyFactoryBean;

public class App
{
    public static void main( String[] args ) {
        ProxyFactoryBean pfb = new ProxyFactoryBean();
        pfb.setTarget(new Person());
        Object personProxy = pfb.getObject();
        IPerson bean = (IPerson) personProxy;
        bean.greet();
    }
}
