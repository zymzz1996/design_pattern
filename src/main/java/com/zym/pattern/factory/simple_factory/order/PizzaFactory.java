package com.zym.pattern.factory.simple_factory.order;

import com.zym.pattern.factory.simple_factory.pizza.MeatPizza;
import com.zym.pattern.factory.simple_factory.pizza.Pizza;
import com.zym.pattern.factory.simple_factory.pizza.VegetablePizza;

/**
 * 应该为单例
 * @author zhouyumeng
 * @date 2021/12/08
 **/
public class PizzaFactory {

    public Pizza producingPizza(String type) {
        Pizza pizza = null;
        if ("meat".equals(type)) {
            pizza = new MeatPizza();
        } else if ("vegetable".equals(type)) {
            pizza = new VegetablePizza();
        }
        return pizza;
    }

//    public static Pizza producingPizza(String type) {
//        Pizza pizza = null;
//        if ("meat".equals(type)) {
//            pizza = new MeatPizza();
//        } else if ("vegetable".equals(type)) {
//            pizza = new VegetablePizza();
//        }
//        return pizza;
//    }

}
