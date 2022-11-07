package com.akojimsg.msff;


public class App 
{
    public static void main( String[] args ) {
        Person p = (Person) TimestampLoggingProxy.getProxyFor(new PersonImpl());
        p.greet();
        p.salut();
        p.saludar();
    }
}
