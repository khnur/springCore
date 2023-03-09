package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Dog dog = context.getBean("animal", Dog.class);
        System.out.println();
    }
}
