package com.zym.pattern.factory.factory_method.order;

import com.zym.pattern.factory.factory_method.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zhouyumeng
 * @date 2021/12/08
 **/
public abstract class OrderPizza {

    abstract Pizza producingPizza(String type);

    public void order() {
        do {
            Pizza pizza = producingPizza(getType());
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
        //new DicosOrderPizza();
        new JohnOrderPizza();
    }

}
