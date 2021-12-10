package com.zym.pattern.factory.factory_method.pizza;

/**
 * @author zhouyumeng
 * @date 2021/12/08
 **/
public class DicosMeatPizza extends Pizza {

    public DicosMeatPizza() {
        name = "德克士肉披萨";
    }

    @Override
    public void prepare() {
        System.out.println("准备肉");
    }

}
