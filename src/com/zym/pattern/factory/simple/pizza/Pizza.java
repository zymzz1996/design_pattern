package com.zym.pattern.factory.simple.pizza;

/**
 * @author zhouyumeng
 * @date 2021/12/08
 **/
public abstract class Pizza {

    protected String name;

    public abstract void prepare();

    public void bake() {
        System.out.println(name + "在烤");
    }

    public void cut() {
        System.out.println(name + "在切");
    }

    public void box() {
        System.out.println(name + "在打包");
    }

}
