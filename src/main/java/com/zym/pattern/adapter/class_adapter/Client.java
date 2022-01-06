package com.zym.pattern.adapter.class_adapter;

/**
 * @author zhouyumeng
 * @date 2022/01/05
 **/
public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }

}
