package com.lifeix.dubbo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
        context.start();

        DemoService demoService = (DemoService) context.getBean("demoService");
        String res = demoService.sayHello("yingqi");

         System.out.println(res);

        System.out.println("按回车键结束");

        System.in.read();
    }
}
