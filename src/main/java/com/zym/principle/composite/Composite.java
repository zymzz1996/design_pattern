package com.zym.principle.composite;

/**
 * @author zhouyumeng
 * @date 2021/11/29
 **/
public class Composite {

    static class A {

        public void operation1() {

        }

        public void operation2() {

        }
    }

    /**
     * 组合方式
     */
    static class B {
        private final A a = new A();
    }

    /**
     * 聚合方式
     */
    static class C {
        private A a;

        public void setA(A a) {
            this.a = a;
        }
    }
}
