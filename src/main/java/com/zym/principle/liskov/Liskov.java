package com.zym.principle.liskov;

/**
 * @author zhouyumeng
 * @date 2021/11/26
 **/
public class Liskov {

    static abstract class Base{
        abstract int method1(int a, int b);
    }

    static class A extends Base {
        @Override
        int method1(int a, int b) {
            return a - b;
        }
    }

    /**
     * 原本B直接继承A，重写了方法method1
     * 将B直接提升，与A共同继承一个更基础的类Base，如果B类中需要用到A的method1，可以进行组合
     */
    static class B extends Base {
        private final A a = new A();

        @Override
        int method1(int a, int b) {
            return a + b;
        }

        int method2(int a, int b) {
            return this.a.method1(a, b);
        }
    }
}
