package com.zym.pattern.singleton;

/**
 * 饿汉式(静态代码块)
 * @author zhouyumeng
 * @date 2021-12-04
 **/
public class StaticCodeBlock {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }


    static class Singleton{

        private Singleton() {

        }

        private final static Singleton INSTANCE;

        static {
            INSTANCE = new Singleton();
        }

        public static Singleton getInstance() {
            return INSTANCE;
        }

    }

}
