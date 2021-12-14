package com.zym.pattern.factory.abstract_factory.order;

import com.zym.pattern.factory.factory_method.pizza.Pizza;

/**
 * @author zhouyumeng
 * @date 2021/12/13
 **/
public abstract class PizzaFactory {

    abstract Pizza producingPizza(String type);

}
