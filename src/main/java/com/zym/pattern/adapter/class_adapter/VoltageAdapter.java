package com.zym.pattern.adapter.class_adapter;

/**
 * @author zhouyumeng
 * @date 2022/01/05
 **/
public class VoltageAdapter implements Voltage5V{

    @Override
    public int output5V(Voltage220V voltage220V) {
        int src = voltage220V.output220V();
        int dst = src / 44;
        System.out.println("输出电压：" + dst + "V");
        return dst;
    }
}
