package com.zym.pattern.factory.factory_method.pizza;

/**
 * @author zhouyumeng
 * @date 2021/12/08
 **/
public class DicosVegetablePizza extends Pizza {

    public DicosVegetablePizza() {
        name = "德克士蔬菜披萨";
    }

    @Override
    public void prepare() {
        System.out.println("准备蔬菜");
    }
}
