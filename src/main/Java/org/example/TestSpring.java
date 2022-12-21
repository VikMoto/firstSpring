package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        TestBean testBeen = context.getBean("testBeen", TestBean.class);
        System.out.println(testBeen.getName());
        context.close();

    }
}
