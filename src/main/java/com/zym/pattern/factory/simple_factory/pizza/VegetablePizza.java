package com.zym.pattern.factory.simple_factory.pizza;

/**
 * @author zhouyumeng
 * @date 2021/12/08
 **/
public class VegetablePizza extends Pizza{

    public VegetablePizza() {
        name = "蔬菜披萨";
    }

    @Override
    public void prepare() {
        System.out.println("准备蔬菜");
    }
}
