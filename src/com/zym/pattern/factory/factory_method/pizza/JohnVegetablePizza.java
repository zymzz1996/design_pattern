package com.zym.pattern.factory.factory_method.pizza;

/**
 * @author zhouyumeng
 * @date 2021/12/08
 **/
public class JohnVegetablePizza extends Pizza {

    public JohnVegetablePizza() {
        name = "棒约翰蔬菜披萨";
    }

    @Override
    public void prepare() {
        System.out.println("准备蔬菜");
    }
}
