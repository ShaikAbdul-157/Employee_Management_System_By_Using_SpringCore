package com.te.learnspringcoreproject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.te.learnspringcore.config.BeanConfiguration;

public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext ApplicationContext= new  AnnotationConfigApplicationContext(BeanConfiguration.class);
        		
        		
    }
}
