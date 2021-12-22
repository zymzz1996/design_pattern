package com.zym.pattern.prototype;

/**
 * @author zhouyumeng
 * @date 2021/12/20
 **/
public class Client {

    public static void main(String[] args) {
        WuKong wuKong = new WuKong("孙悟空", 18, "黄色", new BaJie("猪八戒"));
        WuKong wuKong1 = wuKong.clone();
        WuKong wuKong2 = wuKong.clone();
        WuKong wuKong3 = wuKong.clone();
        WuKong wuKong4 = wuKong.clone();
        //wuKong.setName("六耳猕猴");
        wuKong.getBaJie().setName("猪八戒2");
        System.out.println(wuKong + "------" + wuKong.getBaJie().hashCode());
        System.out.println(wuKong1 + "------" + wuKong1.getBaJie().hashCode());
        System.out.println(wuKong2);
        System.out.println(wuKong3);
        System.out.println(wuKong4);
    }

}
