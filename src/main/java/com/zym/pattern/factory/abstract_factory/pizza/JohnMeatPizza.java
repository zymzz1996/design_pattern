package com.zym.pattern.factory.abstract_factory.pizza;

/**
 * @author zhouyumeng
 * @date 2021/12/08
 **/
public class JohnMeatPizza extends Pizza {

    public JohnMeatPizza() {
        name = "棒约翰肉披萨";
    }

    @Override
    public void prepare() {
        System.out.println("准备肉");
    }

}
