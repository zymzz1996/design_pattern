package com.zym.pattern.adapter.class_adapter;

/**
 * @author zhouyumeng
 * @date 2022/01/05
 **/
public class VoltageAdapter extends Voltage220V implements Voltage5V{

    @Override
    public int output5V() {
        int src = output220V();
        int dst = src / 44;
        System.out.println("输出电压：" + dst + "V");
        return dst;
    }
}
