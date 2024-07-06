package com.spring.spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.spring_core.model.Address;


public class App 
{
    public static void main( String[] args )
    {
     ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
     Address address =  ioc.getBean(Address.class,"add");
     System.out.println(address);
    }
}
