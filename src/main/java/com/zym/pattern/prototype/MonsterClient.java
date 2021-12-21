package com.zym.pattern.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhouyumeng
 * @date 2021/12/20
 **/
public class MonsterClient {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Object bean = applicationContext.getBean("monster");
        Object bean1 = applicationContext.getBean("monster");
        System.out.println(bean);
        System.out.println(bean1);
        System.out.println(bean == bean1);
    }
}
