package com.zym.pattern.adapter.object_adapter;

/**
 * @author zhouyumeng
 * @date 2022/01/05
 **/
public class Phone {

    public void charging(Voltage5V voltage5V) {
        int dst = voltage5V.output5V();
        if (dst == 5) {
            System.out.println("充电成功");
        } else {
            System.out.println("充电失败");
        }
    }

}
