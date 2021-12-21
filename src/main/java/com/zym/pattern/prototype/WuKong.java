package com.zym.pattern.prototype;

import lombok.Data;

/**
 * @author zhouyumeng
 * @date 2021/12/20
 **/
@Data
public class WuKong implements Cloneable{

    private final String name;
    private final Integer age;
    private final String color;

    public WuKong(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "WuKong{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    protected Object clone() {
        WuKong wuKong = null;
        try {
            wuKong = (WuKong) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return wuKong;
    }
}
