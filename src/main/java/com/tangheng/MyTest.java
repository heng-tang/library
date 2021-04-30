package com.tangheng;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String args[]){
        System.out.println("==================");
        String config = "spring.xml";
        ApplicationContext as = new ClassPathXmlApplicationContext(config);
        String names[] =  as.getBeanDefinitionNames();
        for(String na :names){
            System.out.println("容器中的对象"+na);
        }
    }


}
