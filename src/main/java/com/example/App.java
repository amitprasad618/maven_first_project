package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println("Before GET Bean called...");
        Alien obj = (Alien) context.getBean("alien");
        // if you don't want to typeCast then you can use below one..
        Alien obj1 = context.getBean("alien", Alien.class);
        obj.code();
        System.out.println("#################################################");
        obj1.code();

    }
}
