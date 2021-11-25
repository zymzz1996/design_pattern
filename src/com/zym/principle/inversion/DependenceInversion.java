package com.zym.principle.inversion;

/**
 * 依赖倒转原则
 * @author zhouyumeng
 * @date 2021/11/25
 **/
public class DependenceInversion {

    interface TV {
        void display();
    }

    interface IOpenAndClose1{
        void open(TV tv);
    }

    /**
     * 通过接口传递
     */
    static class OpenAndClose1 implements IOpenAndClose1{
        @Override
        public void open(TV tv) {
            tv.display();
        }
    }

    interface IOpenAndClose2{
        void open();
    }

    /**
     * 通过构造传递
     */
    static class OpenAndClose2 implements IOpenAndClose2{

        TV tv;

        public OpenAndClose2(TV tv) {
            this.tv = tv;
        }

        @Override
        public void open() {
            tv.display();
        }
    }

    interface IOpenAndClose3{
        void open();
    }

    /**
     * 通过Setter传递
     */
    static class OpenAndClose3 implements IOpenAndClose3{

        TV tv;

        public void setTv(TV tv) {
            this.tv = tv;
        }

        @Override
        public void open() {
            tv.display();
        }
    }
}
