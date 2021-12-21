package com.zym.pattern.factory.abstract_factory.order;

import com.zym.pattern.factory.factory_method.pizza.JohnMeatPizza;
import com.zym.pattern.factory.factory_method.pizza.JohnVegetablePizza;
import com.zym.pattern.factory.factory_method.pizza.Pizza;

/**
 * @author zhouyumeng
 * @date 2021/12/13
 **/
public class JohnPizzaFactory extends PizzaFactory{

    @Override
    Pizza producingPizza(String type) {
        Pizza pizza = null;
        if ("meat".equals(type)) {
            pizza = new JohnMeatPizza();
        } else if ("vegetable".equals(type)) {
            pizza = new JohnVegetablePizza();
        }
        return pizza;
    }
}
