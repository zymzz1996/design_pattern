package com.zym.pattern.prototype;

/**
 * @author zhouyumeng
 * @date 2021/12/20
 **/
public class Client {

    public static void main(String[] args) {
        WuKong wuKong = new WuKong("孙悟空", 18, "黄色");
        WuKong wuKong1 = (WuKong) wuKong.clone();
        WuKong wuKong2 = (WuKong) wuKong.clone();
        WuKong wuKong3 = (WuKong) wuKong.clone();
        WuKong wuKong4 = (WuKong) wuKong.clone();
        System.out.println(wuKong);
        System.out.println(wuKong1);
        System.out.println(wuKong2);
        System.out.println(wuKong3);
        System.out.println(wuKong4);
    }

}
