package com.zym.pattern.factory.abstract_factory.order;

import com.zym.pattern.factory.factory_method.pizza.DicosMeatPizza;
import com.zym.pattern.factory.factory_method.pizza.DicosVegetablePizza;
import com.zym.pattern.factory.factory_method.pizza.Pizza;

/**
 * @author zhouyumeng
 * @date 2021/12/13
 **/
public class DicosPizzaFactory extends PizzaFactory{

    @Override
    Pizza producingPizza(String type) {
        Pizza pizza = null;
        if ("meat".equals(type)) {
            pizza = new DicosMeatPizza();
        } else if ("vegetable".equals(type)) {
            pizza = new DicosVegetablePizza();
        }
        return pizza;
    }
}
