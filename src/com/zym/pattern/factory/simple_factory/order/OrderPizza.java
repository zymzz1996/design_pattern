package com.zym.pattern.factory.simple_factory.order;

import com.zym.pattern.factory.simple_factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zhouyumeng
 * @date 2021/12/08
 **/
public class OrderPizza {

    private final PizzaFactory pizzaFactory;

    public OrderPizza(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public void order() {
        do {
            Pizza pizza = pizzaFactory.producingPizza(getType());
            if (null != pizza) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
              break;
            }
        } while (true);
    }

    private String getType() {
        String type = "";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            type = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return type;
    }

    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza(new PizzaFactory());
        orderPizza.order();
    }

}
