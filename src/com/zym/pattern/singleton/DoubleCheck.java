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
        //TODO: synchronized或lock在释放前都会将变量刷新到主存，这与volatile的作用是一致的，是否应该使用volatile存疑？？
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
