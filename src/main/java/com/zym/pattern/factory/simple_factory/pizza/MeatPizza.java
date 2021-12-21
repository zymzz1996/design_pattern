package com.zym.pattern.factory.simple_factory.pizza;

/**
 * @author zhouyumeng
 * @date 2021/12/08
 **/
public class MeatPizza extends Pizza{

    public MeatPizza() {
        name = "肉披萨";
    }

    @Override
    public void prepare() {
        System.out.println("准备肉");
    }

}
