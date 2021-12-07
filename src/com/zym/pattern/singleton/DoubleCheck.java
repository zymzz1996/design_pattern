package com.zym.pattern.singleton;

/**
 * 双重检查
 * @author zhouyumeng
 * @date 2021/12/06
 **/
public class DoubleCheck {

    public static void main(String[] args) {

    }

    static class Singleton{

        private static volatile Singleton INSTANCE;

        private Singleton() {

        }

        public static Singleton getInstance() {
            if (null == INSTANCE) {
                synchronized (Singleton.class){
                    if (null == INSTANCE) {
                        INSTANCE = new Singleton();
                    }
                }
            }
            return INSTANCE;
        }

    }

}
