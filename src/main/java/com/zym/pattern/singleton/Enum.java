package com.zym.pattern.singleton;

/**
 * @author zhouyumeng
 * @date 2021/12/07
 **/
public class Enum {

    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }

    enum Singleton{
        INSTANCE;
    }

}
