package com.zym.pattern.adapter.object_adapter;

/**
 * @author zhouyumeng
 * @date 2022/01/05
 **/
public class VoltageAdapter implements Voltage5V {

    private final Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (null != voltage220V) {
            int src = voltage220V.output220V();
            dst = src / 44;
        }
        System.out.println("输出电压：" + dst + "V");
        return dst;
    }
}
