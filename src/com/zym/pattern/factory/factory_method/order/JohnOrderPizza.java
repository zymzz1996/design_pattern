package com.zym.pattern.factory.factory_method.order;

import com.zym.pattern.factory.factory_method.pizza.*;

/**
 * @author zhouyumeng
 * @date 2021/12/10
 **/
public class JohnOrderPizza extends OrderPizza{
    public JohnOrderPizza() {
        super.order();
    }

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
