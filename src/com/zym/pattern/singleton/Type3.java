package com.zym.pattern.singleton;

/**
 * 懒汉式(线程安全)
 * @author: zhouyumeng
 * @date: 2021-12-04
 **/
public class Type3 {

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

        private static Singleton INSTANCE;

        public synchronized static Singleton getInstance() {
            if (null == INSTANCE) {
                INSTANCE = new Singleton();
            }
            return INSTANCE;
        }

    }

}
