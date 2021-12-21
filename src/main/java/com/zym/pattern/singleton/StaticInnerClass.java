package com.zym.pattern.singleton;

/**
 * @author zhouyumeng
 * @date 2021/12/07
 **/
public class StaticInnerClass {

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

        private static class InnerSingleton{
            private static final Singleton INSTANCE = new Singleton();
        }

        public static Singleton getInstance() {
            return InnerSingleton.INSTANCE;
        }

    }
}
